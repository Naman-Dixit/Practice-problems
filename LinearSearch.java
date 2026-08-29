//find a specific target number in an unsorted 
//list of numbers and return its index position
import java.util.*;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Removed the extra ;{ here

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter elements of array: ");
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target number to search: ");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }   
        
        sc.close(); // Recommended to close the scanner
    } // Added missing brace to close main method
} // Added missing brace to close LinearSearch class
