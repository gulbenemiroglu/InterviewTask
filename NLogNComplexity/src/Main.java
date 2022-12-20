import java.util.ArrayList;
import java.util.Arrays;


public class Main {
  public static void main(String[] args) {
    int[] arr1 = new int[] {1, 3, 5, 7, 8, 15};
    int[] arr2 = new int[] {3, 7, 8, 15, 17, 25, 30};
    ArrayList<Integer> arr3 = new ArrayList<Integer>();

    // Sorting arr1 and arr2
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    // Finding common elements
    int i = 0;
    int j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        arr3.add(arr1[i]);
        i++;
        j++;
      } 
      else if (arr1[i] < arr2[j]) {
        i++;
      }
      else {
        j++;
      }
    }
    
    // Display arr3's elements
    for(int x: arr3) {
    	System.out.println(x);
    }
  }
}
