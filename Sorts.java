public class Sorts{

  public static void bubbleSort(int[] data) {
    int n = data.length;
    while (n > 2) {
      int swaps = 0;
      for (int i = 0; i < n-1; i++) {
        int place1 = data[i];
        int place2 = data[i+1];
        if (place1 > place2) {
          int temp = place2;
          place2 = place1;
          place1 = temp;
          swaps++;
        }
      }
      if (swaps == 0) {
        break;
      }
      else {
        n--;
      }
    }
  }


}
