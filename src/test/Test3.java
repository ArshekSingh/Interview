package test;

//Input :- I love my India
//        Output :- IndIA my lOvE I
//
//        Input:- Save tree for life.
//        Output:- LIfE fOr trEE sAvE

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String args[]) {
        String str = "I love my India";
        char arr[] = {'a', 'e', 'i', 'o', 'u'};
        String vowels = "a,e,i,o,u";
        String[] s = str.split(" ");
        String a = new String();
        for (int i = s.length - 1; i >= 0; i--) {
            a = a + s[i] + " ";
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (a.contains(vowels)) {

            }
        }
        System.out.println(a);
//        for(int i=s.length-1;i>=0;i--) {
//            System.out.print(s[i] + " ");
//        }
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubledNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        for (Integer i : doubledNumbers) {
            System.out.println(i);
        }
        List<String> words = Arrays.asList("cat", "dog", "elephant", "bird", "lion");
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        for (Map.Entry<Integer, List<String>> group : groupedByLength.entrySet()) {
            System.out.println("length " + group.getKey() + " value" + group.getValue());
        }

    }
}
