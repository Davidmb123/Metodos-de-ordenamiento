import java.util.Arrays;

public class QuickSort2 {


    public static int partition(float[] array, int low, int high) {
        float pivot = array[high];
        int i = low - 1;

        for (int j = low; j <= high-1; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);

            }
        }

        swap(array, i + 1, high);
        return i+1;
    }

    public static void swap(float[] array,int low, int high){
        float aux=array[low];
        array[low]=array[high];
        array[high]=aux;

    }

    public static void quickSort(float[] array, int low, int high){
        if(low<high){
            int pi=partition(array,low,high);
                quickSort(array,low,pi-1);
                quickSort(array,pi+1,high);

        }
    }


    public static void main(String[] args) {
        float [] array={7,5,9,6,1,3,2,8,35,4.3f,99};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
