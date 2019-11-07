import java.awt.color.ICC_Profile;

public class QuickSort
{


    static int [] array;
    public static int partition(int low,int high){
        int pivot=array[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(array[j]<=pivot){
                i++;
                swap(i,j);

            }
        }
        swap(i+1,high);
        return i+1;



    }


    public static void  quickStort(int low, int high){

        if(low<high) {
            int pi = partition(low, high);

            quickStort(low,pi-1);
            quickStort(pi+1,high);


        }
    }
    public static void swap(int i,int j){
        int aux=array[i];
        array[i]=array[j];
        array[j]=aux;



    }


    public static void main(String[] args) {
        array=new int[]{10,40,1221,120,50,90,80,70,98};

        quickStort(0,array.length-1);
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);

        }


    }





    }



