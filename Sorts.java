public class Sorts{

  public static void bubbleSort(int[] data) {
    int n = data.length;
    int place1 = 0;
    int place2 = 0;
    int temp = 0;
    int swaps = 0;
    while (n >= 2) {
      	swaps = 0;
	for (int i = 0; i < n-1; i++) {
        	place1 = data[i];
        	place2 = data[i+1];
        	if (place1 > place2) {
          		temp = place2;
          		data[i+1] = place1;
          		data[i] = temp;
          		swaps++;
		}
	}
      	if (swaps == 0) {
		n = 0;
      	}
      	n--;
  }

 }


}
