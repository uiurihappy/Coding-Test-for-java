function countSubstrings(input_str) {
    const mapping = {
        "a": 1, "b": 1,
        "c": 2, "d": 2, "e": 2,
        "f": 3, "g": 3, "h": 3,
        "i": 4, "j": 4, "k": 4,
        "l": 5, "m": 5, "n": 5,
        "o": 6, "p": 6, "q": 6,
        "r": 7, "s": 7, "t": 7,
        "u": 8, "v": 8, "w": 8,
        "x": 9, "y": 9, "z": 9
    };

    let count = 0;
    const subStr = input_str.split("");

    for (let i = 0; i < subStr.length; i++) {
        let sum = 0;
        let length = 0;

        for (let j = i; j < subStr.length; j++) {
            const letter = subStr[j];

            sum += mapping[letter];
            length++;

            if (sum % length === 0) {
                count++;
            }
        }
    }

    return count;
}