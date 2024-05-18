import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        // Test case 1
        Integer[] arr1 = {12, 4, 7, 3, 9, 2, 5};
        Merge.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // Test case 2
        String[] arr2 = {"banana", "apple", "orange", "grape", "kiwi"};
        Merge.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
