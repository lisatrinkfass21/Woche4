/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Lisa
 */
public class JavaStreamsTester {

    public static void main(String[] args) {
        List<String> strings = new LinkedList<String>();
        List<Integer> numbers = new LinkedList<Integer>();

        strings.add("aaljs");
        strings.add("");
        strings.add("ashdfkdsj");
        strings.add("sdf");
        strings.add("laskdj");
        strings.add("asd");
        strings.add("sdd");
        strings.add("aaa");
        strings.add("sadflkas");
        strings.add("");
        strings.add("sss");
        strings.add("add");
        strings.add("");

        for (int i = 0; i < 15; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        System.out.println(getCountEmmptyString(strings));
        System.out.println(getCountLength3(strings));
        strings = deleteEmptyStrings(strings);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(getMergedString(strings, " ; "));
        List<Integer> squares = getSquares(numbers);
        for (Integer square : squares) {
            System.out.println(square);
        }
        System.out.println(getMax(numbers));
        System.out.println(getMin(numbers));
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));

    }

    private static int getCountEmmptyString(List<String> strings) {
        return strings.stream()
                .filter(s -> s.equals(""))
                .collect(Collectors.toList()).size();
    }

    private static int getCountLength3(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList()).size();
    }

    private static List<String> deleteEmptyStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.equals(""))
                .collect(Collectors.toList());
    }

    private static String getMergedString(List<String> strings, String separator) {
        return strings.stream()
                .reduce("", (s, x) -> s + separator + x);
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream()
                .map((n) -> n = n * n)
                .collect(Collectors.toList());
    }

    private static int getMax(List<Integer> numbers) {
        return numbers.stream()
                .max((a, b) -> a.compareTo(b)).get();
    }

    private static int getMin(List<Integer> numbers) {
        return numbers.stream()
                .min((a, b) -> a.compareTo(b)).get();
    }

    private static int getSum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }

    private static int getAverage(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a + b) / numbers.size();
    }
}
