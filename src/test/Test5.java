package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test5 {
//Need to print the character based on there frequency in desc order.
    public static void main(String[] args) {
        String[] input = {"a", "a", "b", "c", "c", "c", "d", "d", "d", "d"};

        List<String> inputList = Arrays.asList(input);

//        List<String> result = inputList.stream()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        System.out.println(result);

        List<String> collect = inputList.stream().collect(Collectors.groupingBy(o -> o, Collectors.counting())).entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }
}
