// Autor: David Murillo Benitez
// Algoritmo: SortSelection
// Fecha: 15 de agosto 2019
// Matricula: 9474
// Carrera: Software

import java.util.*;

public class Burbuja {
    Double[] numeros;
    public Burbuja(){

    }


    public void setNumeros(Double[] num){
        this.numeros=num;
    }
    public void setNumerosDeArrayList(ArrayList<Double> num){
        this.numeros=new Double[num.size()];
        numeros=num.toArray(numeros);

    }
    public void print(){
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
    public void ordenarAscendente(){
        double aux;
        for(int i=0; i<numeros.length;i++){
            for(int j=0; j<numeros.length-1;j++) {
            if(numeros[j]>numeros[j+1]){
                aux=numeros[j];
                numeros[j]=numeros[j+1];
                numeros[j+1]=aux;

            }


        }
        }
        print();
    }

    public void ordenarDescendente(){
        double aux;
        for(int i=0; i<numeros.length-1;i++){
            for(int j=0; j<numeros.length-1;j++){
                if(numeros[j]<numeros[j+1]){
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                }
            }
        }
        print();
    }

    public static void main(String[] args) {

    }

}
