import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallTasks3 {
    public static void main(String[] args) {
        //   multiplicationTable(5);
//        String[] words = new String[4];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[2] = "four";
//        formatWords(words);
//
//        IntStream fibStream = Utility.generatefibSupplier();
//        fibStream.limit(10).forEach(System.out::println);
//        String [] words1 = new String []{"", "", "three"};
//        System.out.println(formatWords(words1));
        System.out.println(DRoot.digital_root(528));
    }

    // to create N×N multiplication table, of size provided in parameter.
    public static int[][] multiplicationTable(int n) {
        int[][] table = new int[n][n];
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    //Format words into a sentence
    public static String formatWords(String[] words) {
        String res = Arrays.asList(words)
                .stream()
                .filter(word -> !(word == null))
                .filter(word -> !word.equals(""))
                .collect(Collectors.joining(","));
        if (!res.contains(","))
            return res;

        int indexOfLastComma = res.lastIndexOf(",");

        String resultuntilLastWord = res.substring(0, indexOfLastComma);
        String lastWord = res.substring(indexOfLastComma + 1);

        res = resultuntilLastWord + " and " + lastWord;
        return res;
    }

    //Given an array describing the color of each glove, return the number of
    // pairs you can constitute, assuming that only gloves of the same color can form pairs.
    class Kata {
        public static int numberOfPairs(String[] gloves) {
            Map<String, Integer> colorCount = new HashMap<>();
            int pairs = 0;

            for (int i = 0; i < gloves.length; i++) {
                String color = gloves[i];
                colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            }

            for (int count : colorCount.values()) {
                pairs += count / 2;
            }

            return pairs;
        }
    }
    //static int numberOfPairs(String[] gloves) {
    //    return (int) of(gloves).collect(groupingBy(identity(), counting())).values().stream().mapToLong(n -> n / 2).sum();

    public static class Utility {

        public static IntStream generatefibSupplier() {
            IntSupplier fibSupplier = new IntSupplier() {
                private int prev = 0;
                private int curr = 1;

                @Override
                public int getAsInt() {
                    int next = prev + curr;
                    prev = curr;
                    curr = next;
                    return prev;
                }
            };

            return IntStream.generate(fibSupplier);
        }
//return Stream.iterate(new Integer[]{1, 1}, p -> new Integer[]{p[1], p[0] + p[1]})
//                .mapToInt(integers -> integers[0]);
//    }
    }

    public class Kata5 {

        /*Complete the method so that it formats the words into a
        single comma separated value. The last word should be separated
        y the word 'and' instead of a comma. The method takes in an array
         of strings and returns a single formatted string.

Note:

Empty string values should be ignored.
Empty arrays or null/nil/None values being passed into the method
should result in an empty string being returned.*/

        public static String formatWords(String[] words) {
            if (words == null || words.length == 0) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            int count = 0;

            for (String word : words) {
                if (word != null && !word.isEmpty()) {
                    count++;

                    if (sb.length() > 0) {
                        if (count < words.length) {
                            sb.append(", ");
                        } else {
                            sb.append(" and ");
                        }
                    }

                    sb.append(word);
                }
            }

            return sb.toString();

        }
    }
    //Given n, take the sum of the digits of n. If that value has more
    // than one digit, continue reducing in this way until a single-digit number is
    // produced. The input will be a non-negative integer.

    public class DRoot {
        public static int digital_root(int n) {
            int summ = 0;
            String numbers = String.join(" ", String.valueOf(n).split(""));
            String [] masNumbers = numbers.split(" ");
            for (String s: masNumbers) {
                summ+=Integer.parseInt(s);
            }
            if (summ>9) return digital_root(summ); //using recursion!
            return summ;
        }
        /* public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 9) {
            return digital_root(sum); // using recursion!
        }
        return sum;
    }
}*/
    }
}



