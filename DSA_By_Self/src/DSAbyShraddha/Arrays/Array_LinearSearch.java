package DSAbyShraddha.Arrays;

public class Array_LinearSearch {

    // Linear Search Method
    public int search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element found: " + key + " at index " + i);
                return i; // return index of element
            }
        }
        System.out.println("Element not found");
        return -1; // if not found
    }

    public static void main(String[] args) {
        int array[] = {34, 45, 56, 56, 67, 67, 5, 4, 44};

        Array_LinearSearch obj = new Array_LinearSearch();

        // Test search
        obj.search(array, 67);  // found
        obj.search(array, 100); // not found
    }
}
