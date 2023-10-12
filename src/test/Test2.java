package test;

//Given a string s, find the length of the longest substring without repeating characters.
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//        TC - O(N)
//        SC - O(N) extra space can be used

import java.util.HashSet;

public class Test2 {
    public static void main(String args[]) {

        HashSet<Character> strings = new HashSet<>();
        String str = "abcabcbb";
        int length = 0;
        for(int i=0;i<str.length();i++) {
            if(!strings.contains(str.charAt(i))) {
                strings.add(str.charAt(i));
            }
            if(strings.contains(str.charAt(i))) {
                
            }
        } length = strings.size();
    }

}
