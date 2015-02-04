public class MySelectionSort {
 
    public static void main(String a[]){
    	int[] arr1 = randomArrayGen(100);
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.println(i + ". ");
        }
    }
     
    public static int[] doSelectionSort(int[] arr) {
        int i, j, minIndex, temp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
              minIndex = i;
              for (j = i + 1; j < n; j++)
                    if (arr[j] < arr[minIndex])
                          minIndex = j;
              if (minIndex != i) {
                    temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
              }
        }
		
        return arr;    
    }
        
    public static int[] randomArrayGen(int length){
    	int arr[] = new int[length];
    	
    	for (int j=0; j < length; j++){
    		int m = (int)(Math.random() * 10000);
    		arr[j] = m;
    		
    	}
    	return arr;
    }
}
