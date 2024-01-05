import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    Based on:   https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
                https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

    In java an object is a class instance (ex. new Dog() ) or an array (new int[]{1, 2})
    https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.3.1

 */
public class Arrayz {
    public static void main(String[] args) {
        System.out.println("--- initArray() ---");
        initArray();
        System.out.println("--- sortArray() ---");
        sortArray();
        System.out.println("--- subArrays() ---");
        subArrays();
        System.out.println("--- compareArrays() ---");
        compareArrays();
        System.out.println("--- advanced() ---");
        advancedArrays();
        System.out.println("--- misc ---");
        // convert List type collection to an array
        List<String> lst = List.of("one", "seven", "zero");
        String[] lstAsArray = lst.toArray(new String[0]);
        System.out.println(Arrays.toString(lstAsArray));
        // String to char array
        char[] strAsCharArr = "Some text...".toCharArray();
        System.out.println(Arrays.toString(strAsCharArr));
    }

    /*
        https://docs.oracle.com/javase/tutorial//reflect/special/arrayComponents.html
        https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html#getName--
     */
    private static void advancedArrays() {
        // In java an array is an object
        Object arr = new int[]{1, 2, 3};
        System.out.println("Given int" + Arrays.toString((int[])arr));
        Class<?> arrClass = arr.getClass();
        // The number of "[" characters at the beginning of the type name indicates the number of dimensions of an array
        // In this case the name "[I" implies there is one dimension. For an array int[][][], the name would be "[[[I"
        // The letter "I" after "[" indicates int primitive. For boolean "Z", for float "F", etc.
        System.out.println("Class.getName() -> " + arrClass.getName());
        System.out.println("Class.isArray() -> " + arrClass.isArray());
        System.out.println("Class.getComponentType() -> " + arrClass.getComponentType());

    }

    private static void compareArrays() {
        int[] arr1 = {1, 2 ,3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {1, 2 ,3};

        // false
        System.out.println(Arrays.equals(arr1, arr2));
        // true
        System.out.println(Arrays.equals(arr1, arr3));

        // false...
        System.out.println(arr1 == arr3);
        // ... because they are different objects (in java array is an object), which
        // means they are different copies of arrays in memory ("==" compares object references. Are both references point
        // to the same object?) -> Nope
        System.out.println("arr1 hash: " + arr1.hashCode());
        System.out.println("arr3 hash: " + arr3.hashCode());
    }

    private static void subArrays() {
        int[] intArr = new int[]{0, 1, 2, 3, 4, 5, 6};
        System.out.println("Given: " + Arrays.toString(intArr));
        System.out.println("Range 0:3 -> " + Arrays.toString(Arrays.copyOfRange(intArr, 0, 3)));
        System.out.println("Range 2:5 -> " + Arrays.toString(Arrays.copyOfRange(intArr, 2, 5)));
        System.out.println("Range 4:7 -> " + Arrays.toString(Arrays.copyOfRange(intArr, 4, 7)));
    }

    private static void sortArray() {
        Integer[] randIntArr = new Integer[]{-39, 23, 12, 0, 3, 23, 99, -3};
        Arrays.sort(randIntArr);
        System.out.println("Array to sort: " + Arrays.toString(randIntArr));
        // comparator Collections.reverseOrder() uses generics, thus using Integer[] declaration instead of int[]
        Arrays.sort(randIntArr, Collections.reverseOrder());
        System.out.println("Sorted ascending (default): " + Arrays.toString(randIntArr));
    }

    private static void initArray() {
        // 0 length array can be used to indicate an empty result (while null can be used to indicate absence of data)
        int[] arr1 = new int[0];
        int[] arr2 = new int[10];
        // shortcut for array init
        int[] arr3 = new int[]{1, 2, 3, 4, 99};

        // multidimensional arrays (a multidimensional array is an array whose components are themselves arrays)
        String[][] multiArr1 = new String[5][3];
        for (int i = 0; i < multiArr1.length; i++) {
            String[] row = multiArr1[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = "" + i + j;
            }
        }
        System.out.println(Arrays.deepToString(multiArr1));

        // multidimensional arrays (shortcut init)
        String[][] multiArr2 = {
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"},
                {"30", "31", "32"},
                {"40", "41", "42"}
        };
        System.out.println(Arrays.deepToString(multiArr2));
    }
}
