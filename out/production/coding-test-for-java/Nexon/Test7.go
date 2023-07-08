package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)


/*
 * Complete the 'Server' function below and missing types and global variables.
 *
 * The function is void.
 */

var serverChan = make(chan in, 5000)

type in struct {
    arr int32
    resp chan int32
}

func Server() {
    for {
        select {
        case input := <-serverChan:
            result := input.arr * 2
            input.resp <- result
        }
    }
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 16 * 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 16 * 1024 * 1024)

    arrCount, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
    checkError(err)

    var arr []int32

    for i := 0; i < int(arrCount); i++ {
        arrItemTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
        checkError(err)
        arrItem := int32(arrItemTemp)
        arr = append(arr, arrItem)
    }

    go Server()
    respChans := make([]chan int32, len(arr))
    for idx := 0; idx < len(arr); idx++ {
        i := idx
        respChans[i] = make(chan int32)
        serverChan <- in{arr[i], respChans[i]}
    }
    for i := range respChans {
        arr[i] = <- respChans[i]
    }

    for i, resultItem := range arr {
        fmt.Fprintf(writer, "%d", resultItem)

        if i != len(arr) - 1 {
            fmt.Fprintf(writer, "\n")
        }
    }

    fmt.Fprintf(writer, "\n")

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}
