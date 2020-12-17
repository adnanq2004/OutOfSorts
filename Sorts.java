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

 public static void selectionSort(int[] data) {
   int limit = 0;
   int temp = 0;
   int currentlowest = 0;
   int lowestval = 0;
   while (limit < data.length) {
     currentlowest = data[limit];
     lowestval = limit;
     for (int i = limit; i < data.length; i++) {
       if (data[i] < currentlowest) {
         currentlowest = data[i];
         lowestval = i;
       }
     }
     temp = currentlowest;
     data[lowestval] = data[limit];
     data[limit] = temp;
     limit++;
   }
 }

 public static void insertionSort(int[] data) {
   int iterate = 0;
   int tempiterate = 0;
   int currentval = 0;
   int temp = 0;
   for (int i = 1; i < data.length; i++) {
     iterate = i;
     tempiterate = iterate;
     currentval = data[i];
     while (tempiterate > 0 && data[i] < data[i-1]) {
       temp = data[i];
       data[i] = data[i-1];
       data[i-1] = temp;
       tempiterate--;
     }
   }
 }

}
