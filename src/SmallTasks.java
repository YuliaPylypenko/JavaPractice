import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.lang.String.valueOf;

public class SmallTasks {
    public static void main(String[] args) {
        String S = "Codewars@codewars123.com";
        Kata2.Solve(S);
    }

    //Create a function with two arguments that will return an array of the first n multiples of x.
//
//Assume both the given number and the number of times to count will be positive numbers greater than 0.
    public static int[] countBy(int x, int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = x;
            x += x;
        }
        return array;
    }

    //The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.
//
//Examples(Operator, value1, value2) --> output
    public static Integer basicMath(String op, int v1, int v2) {
        int result = switch (op) {
            case "/" -> v1 / v2;
            case "*" -> v1 * v2;
            case "-" -> v1 - v2;
            case "+" -> v1 + v2;
            default -> 0;
        };
        return result;
    }

    //Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
    class MixedSum {

        public int sum(List<?> mixed) {

            int sum = 0;
            for (Object s : mixed) {
                sum += Integer.parseInt(valueOf(s));
            }

            return sum;
        }
    }

    //Given a year, return the century it is in.
    class Solution {
        public static int century(int number) {
            if (number / 100 == 0) {
                number = number / 100;
            } else {
                number = number / 100 + 1;
            }
            return number;
        }
    }

    public static double sum(double[] numbers) {
        double total;
        if (numbers.length == 0) {
            return 0;
        } else {
            total = DoubleStream.of(numbers).sum();
        }
        return total;
    }

//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

    class Kata {
        public static int[] digitize(long n) {

            int[] reversedDigits = Arrays.stream(new StringBuilder().append(n).reverse().toString().split(""))
                    .mapToInt(Integer::parseInt).toArray();
            return reversedDigits;
        }
    }

    class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {
            int min = Arrays.stream(args).min().getAsInt();
            return min;
        }
    }

    //In this Kata, you will be given a string and your task will be
    // to return a list of ints detailing the count of uppercase letters, lowercase,
    // numbers and special characters, as follows.
    static class Kata2 {

        public static void Solve(String word) {
            int countNumbers = 0;
            int countLowerCase = 0;
            int countUpperCase = 0;
            int countChar = 0;
            int[] list = new int[4];
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    countNumbers++;
                } else if (Character.isLowerCase(word.charAt(i))) {
                    countLowerCase++;
                } else if (Character.isUpperCase(word.charAt(i))) {
                    countUpperCase++;
                } else countChar++;

                list[0] = countUpperCase;
                list[1] = countLowerCase;
                list[2] = countNumbers;
                list[3] = countChar;
            }
            System.out.println(Arrays.toString(Arrays.stream(list).toArray()));
        }
    }

    public int GetSum(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;

        }
    }

    class Metro {

        public static int countPassengers(ArrayList<int[]> stops) {

            int pas = 0;
            for (int i = 0; i < stops.size(); i++) {
                int[] mas = Arrays.stream(stops.get(i)).toArray();
                pas = pas + mas[0] - mas[1];
            }
            return pas;
        }

        //Capitalize String
        class JadenCase {

            public String toJadenCase(String phrase) {
                if (phrase == null) return null;
                if (phrase == "") return "";
                else {
                    String[] words = phrase.split("\\s");
                    String capitalizeWord = "";
                    for (String w : words) {
                        String first = w.substring(0, 1);
                        String afterfirst = w.substring(1);
                        capitalizeWord += first.toUpperCase() + afterfirst + " ";
                    }
                    return capitalizeWord.trim();
                }
            }

            public String capitalizeString(String phrase) {
                if ((phrase == null) || (phrase.equals(""))) return null;

                char[] array = phrase.toCharArray();
                for (int i = 0; i < array.length; i++) {
                    if (i == 0 || (array[i - 1] == ' ')) {
                        array[i] = Character.toUpperCase(array[i]);
                    }
                }
                return new String(array);
            }

            //Your are given a string. You must replace any occurence of the
// sequence coverage by covfefe, however, if you don't find the word coverage in
// the string, you must add covfefe at the end of the string with a leading space.
            public class Covfefe {
                public static void covfefe(String tweet) {
                    String[] words = tweet.split("//s");
                    boolean find = false;
                    if (Arrays.stream(words).anyMatch(s -> s.equals("coverage"))) {
                        find = true;
                        for (String w : words) {
                            if (w.equals("coverage")) w = "covfefe";
                        }
                    } else Arrays.stream(words).collect(Collectors.joining()).concat("covfefe");
                    System.out.println(Arrays.stream(words).collect(Collectors.joining()));
                }
            }
        }
    }
}


