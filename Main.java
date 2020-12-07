import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

//        Integer array[] = { 12, 34, 34, 11, 5 };
//        System.out.println(secondValue(array));

//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "dasdasd");
//        map.put(4, "asdasd");
//        map.put(4, "asdasd");
//        map.put(2, "asdasd");
//        map.put(10, "asdas");
//        map.put(10, "asdas");
//        map.put(10, "asdas");
//        System.out.println(secondValueHashMap(map));

//        int array2[] = { 12, 34, 34, 5, 5 };
//        System.out.println(Arrays.toString(deleteAllDuplicates(array2)));

//        String text = "kajak";
//        System.out.println(isPalindrom(text));

//        String text = "aaaaaaaaaaaaaa";
//        System.out.println(vowels(text));

//        System.out.println(factorial(20));

        System.out.println(nFibonacci(7));


    }

    public static int secondValue(Integer[] input) throws Exception {
        if (input == null) {
            throw new Exception();
        }
        Set<Integer> inputSet = new TreeSet<>();
        inputSet.addAll(Arrays.asList(input));
        if (inputSet.size() < 2) {
            throw new Exception();
        }
        Integer[] outPut = new Integer[inputSet.size()];
        inputSet.toArray(outPut);
        return outPut[outPut.length - 2];
    }

    public static int secondValueHashMap(HashMap<Integer, String> map) throws Exception {
        if (map == null){
            throw new Exception();
        }
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        if (sortedMap.size() < 2) {
            throw new Exception();
        }
        return (int) sortedMap.keySet().toArray()[sortedMap.size() - 2];
    }

    public static int[] deleteAllDuplicates(int[] input) throws Exception {
        if (input == null) {
            throw new Exception();
        }
        Set<Integer> setList = new HashSet<>();
        for (int i : input) {
            setList.add(i);
        }

        int[] output = new int[setList.size()];
        int k = 0;
        for (Integer i : setList) {
            output[k] = i;
            k++;
        }
        return output;
    }

    public static boolean isPalindrom (String text) {
        String reversedWord = new StringBuilder(text).reverse().toString();
        return reversedWord.equals(text);

    }

    public static boolean isAnagram (String text1, String text2) {
        return text1.length() == text2.length();
    }

    public static int vowels (String text){
        char[] chars = text.toCharArray();
        int count = 0;
        for (char i : chars) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'y') {
                count++;
            }
        }
        return count;
    }

    public static long factorial (int input) throws Exception{
        if (input <= 0) {
            throw new Exception();
        }
        long output = 1;
        for (int i = 1; i <= input; i++) {
            output *= i;
        }
        return output;
    }

    public static int nFibonacci (int input) throws Exception{
        if (input < 0) {
            throw new Exception();
        }
        if (input == 0 || input == 1) {
            return 1;
        } else {
            int n1 = 0; //for 0
            int n2 = 1; //for 1 - Fibonacci number
            int output = 0;
            for (int i = 2; i <= input; i++) {
                output = n1 + n2;
                n1 = n2;
                n2 = output;
            }
            return output;
        }
    }
}
