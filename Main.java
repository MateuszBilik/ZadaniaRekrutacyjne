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
return reversedWord.equals(text)

    }



}
