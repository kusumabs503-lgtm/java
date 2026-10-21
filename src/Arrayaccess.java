public class Arrayaccess {
    public static void main(String[] args) {

        // declares an array of integers
        int[] arr;
        // allocating memory for 5 integers
        arr = new int[5];
        // initialize the first element
        arr[0] = 10;
        // initialize the second element
        arr[1] = 20;
        // initialize the remaining elements
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // accessing the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
