import java.util.HashSet;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int[] arr1 = new int[] {1, 3, 5, 7, 8, 15,25};
    int[] arr2 = new int[] {3, 7, 8, 15, 17, 25, 30};
    ArrayList<Integer> arr3 = new ArrayList<Integer>();

    // Converting arr1 and arr2 to HashSet as set1 and set2
    HashSet<Integer> set1 = new HashSet<>();
    for (int i : arr1) {
      set1.add(i);
    }
    HashSet<Integer> set2 = new HashSet<>();
    for (int i : arr2) {
      set2.add(i);
    }

    // Finding common elements
    set1.retainAll(set2);
    for (int i : set1) {
    	arr3.add(i);
    }
    
    // Display arr3's elements
    for(int i: arr3) {
    	System.out.println(i);
    }
  }
}
