/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel3;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Lisa
 */
public class JavaStreamsTester {

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

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        return null;
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
