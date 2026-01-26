package arrays;

public class arraySwapvalues {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        System.out.println("Array before swapping:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        swapcustom(arr, 2 , 3);
        System.out.println("\nArray after swapping:");
        for (int x: arr){
            System.out.print(x + " ");
        }

    }
    static void swapcustom(int[] arr, int index1, int index2) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

