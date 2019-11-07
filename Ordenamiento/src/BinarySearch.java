import java.util.*;

public class BinarySearch

{
    static int[] array;

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        array=new int[]{1,4,6,8,9,10,20,56,78,90,100,101,102};

        int num;
        int limMax=array.length;
        int limMin=0;
        int cont=(int)Math.floor((array.length-1)/2);
        boolean existente=false;
        System.out.println("Seleccione un numero a buscar");
        num=leer.nextInt();
        int control=0;
        while(control<array.length){
            if(array[cont]>num){
                limMax=cont;
                cont=(int)Math.floor(limMax/2);
                control++;
            }else if(array[cont]<num){
                limMin=cont;
                cont=cont+((int)Math.ceil(limMax-limMin)/2);
                control++;
            }else if(array[cont]==num){
                existente=true;
                break;
            }else{
            }
        }
        if(existente){
            System.out.println("El numero se encuentra en el array");
        }else{
            System.out.println("No se encontro el numero");
        }
    }
}
