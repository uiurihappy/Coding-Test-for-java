package NextToss;
import java.util.*;

public class NextTest1 {

        public String[] solution(String[] merchantNames) {
            HashMap<String, String> merchantMap = new HashMap<>();

            for (String name: merchantNames) {
                String cleanedName = cleanName(name);
                String businessName = getBusinessNumber(cleanedName);

                if (!merchantMap.containsKey(businessName)) {
                    merchantMap.put(businessName, name);
                } else {
                    String existName = merchantMap.get(businessName);
                    if (cleanedName.length() > existName.length()) {
                        merchantMap.put(businessName, cleanedName);
                    }
                }

            }
            System.out.println(merchantMap);

            return merchantMap.keySet().toArray(new String[0]);
        }

        private String cleanName(String name) {
            // 1. 정규표현식
            String cleanedName = name.replaceAll("[^\\p{L}\\p{N}&(),.-]", "");
            // w. trim 사용하여 공백 제거
            cleanedName = cleanedName.trim();

            return cleanedName;
        }

        private String getBusinessNumber(String name) {
            String[] nameParts = name.split("\\s+");
            return nameParts[nameParts.length - 1];
        }

    public static void main(String[] args) {
        NextTest1 T = new NextTest1();
        String[] merchantNames = {
                "비바리퍼블리",
                "토스커피사일로 베이커리",
                "비바리퍼블리카 식당",
                "토스커피사일",
                "토스커피사일로 베이커",
                "비바리퍼블리카식",
                "토스커피사일로 베이",
                "토스커피사일로&베이커리"
        };
        String[] result = T.solution(merchantNames);
        System.out.println(Arrays.toString(result));
    }
}
