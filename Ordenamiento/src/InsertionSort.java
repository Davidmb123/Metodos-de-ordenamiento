public class InsertionSort {

    public static void main(String[] args) {
        int[] array={5,1,4,8,4,2};
        insertionSort(array);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
    public static void swap(int[] array, int j, int i){
        int aux;
        aux=array[i];
        array[i]=array[j];
        array[j]=aux;
    }
    static void insertionSort(int[] array) {
    int i,j;

    for(i=1; i<array.length; i++)
    {
        j=i;
        while((j>0) && (array[j]<array[j-1])){
        swap(array, j,j-1);
        j=j-1;
    }

    }
    }
}
