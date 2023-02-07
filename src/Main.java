public class Main {
    public static void main(String[] args) {
        int[] arr = {11,22,3,42,5};
        insertionSort(arr);

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(int[] arr){

        for(int i =1; i<arr.length; i++){
            int keyToInsert = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]> keyToInsert){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]= keyToInsert;
        }
    }

}
