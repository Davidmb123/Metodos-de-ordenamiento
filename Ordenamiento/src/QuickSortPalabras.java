import java.util.*;

public class QuickSortPalabras {



    public static void swap(ArrayList<String> array, int i,int j){
        String aux=array.get(i);
        array.set(i,array.get(j));
        array.set(j,aux);
    }
    public static int partition(ArrayList<String> array,int low, int high){
        String pivot=array.get(high);
        int i=low-1;
        for(int j=low; j<=high-1;j++){
            if(array.get(j).compareTo(pivot)<=0){
                i++;
                swap(array,i,j);

            }

        }
        swap(array,i+1,high);
        return i+1;

    }

    public static void quickSort(ArrayList<String> array,int low, int high ){
        if(low<high){
            int pi=partition(array, low, high);
                quickSort(array,low,pi-1);
                quickSort(array,pi+1,high);
        }

    }

    public static ArrayList<String> generarLista(int n){
        ArrayList<String> array=new ArrayList<String>();
        Random rnd=new Random();
        int cont=0;
        int cont2=0;
        int letra;
        String palabra="";
        int cantP;
        while(cont<n){

            cantP=rnd.nextInt(7)+2;
            palabra="";
            while(cont2<cantP){

                letra=rnd.nextInt(26)+97;

                palabra+=(char)letra;

                cont2++;
            }
            array.add(palabra);
            cont++;
            cont2=0;


        }
        return array;
    }
    public static void main(String[] args) {
        ArrayList<String> array=generarLista(1000000);
        quickSort(array,0,array.size()-1);
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }


    }
}
