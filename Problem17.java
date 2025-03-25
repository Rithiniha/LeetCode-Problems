package problem17;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        String[] phoneMap = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        result.add(""); 

        for (char digit : digits.toCharArray()) {
            String letters = phoneMap[digit - '0'];
            List<String> temp = new ArrayList<>();
            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    temp.add(combination + letter);
                }
            }
            result = temp; 
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23")); 
        System.out.println(letterCombinations(""));   
        System.out.println(letterCombinations("2"));  
    }
}
