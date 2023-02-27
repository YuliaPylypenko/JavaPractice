import java.util.Arrays;

public class SmallTasks2 {
    public static void main(String[] args) {
        sumOfDigits(655);
    }

    public static String covfefe(String tweet) {
        String newS = "";
        if (tweet.contains("coverage")) {
            newS = tweet.replaceAll("coverage", "covfefe");
        } else newS = tweet.concat("covfefe");
        return newS;
    }

    // Write a program that outputs the largest n elements from a list.

    public static int[] largest(int n, int[] arr) {
        int[] result = new int[n];
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        System.arraycopy(sortedArr, sortedArr.length - n, result, 0, n);
        return result;
    }

    //takes positive integer to calculate sum of its digits

    public static int sumOfDigits(int n) {
        int sum = 0;
        String numbers = String.join(" ", String.valueOf(n).split(""));
        String[] masNumbers = numbers.split(" ");
        int res = 0;
        for (String s : masNumbers) {
            res += Integer.parseInt(s);
        }
        return res; //return Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    // function that turns a string into a Mexican Wave.
    public static String[] wave(String str) {
        String[] array = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                str = str.toLowerCase();
                array[i] = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                System.out.print(array[i] + ", ");
            }
        }
        return array;
    }

}





