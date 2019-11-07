// Autor: David Murillo Benitez
// Algoritmo: SortSelection
// Fecha: 15 de agosto 2019
// Matricula: 9474
// Carrera: Software

import java.util.*;

public class MainOrdenamientoBurbuja {
    static Scanner leer= new Scanner(System.in);
    static Scanner leerString= new Scanner(System.in);

    public static ArrayList<Double> generarAleatorio(){
        Random rnd=new Random();
        int randLimit=rnd.nextInt(100);
        System.out.println(randLimit);
        ArrayList<Double> num=new ArrayList<Double>();
        int cont=0;

        for(int i=0; i<randLimit;i++){
            num.add(rnd.nextDouble()*100);
        }
        return num;

    }
    public static ArrayList<Double> leerDeUsuario(ArrayList<Double> num){
        double a;
        String resp;
        while(true) {
            System.out.println("Ingrese numero");
            a=leer.nextDouble();
            num.add(a);
            System.out.println("Seguir?");
            resp=leerString.nextLine();
            if(resp.contains("n")){
                break;
            }
        }
        return num;
    }

    public static Burbuja ui(ArrayList<Double> num,Burbuja b){
        int opc;
        System.out.println("Bienvenido a Ordenamiento de Burbuja\nIngrese una opcion:\n 1.Leer de usuario" +
                "\n 2.Generar array aleatorio \n3.Leer de un archivo");
        opc=leer.nextInt();
        switch(opc){
            case 1: num =leerDeUsuario(num);
                b.setNumerosDeArrayList(num);
                break;
            case 2: num=generarAleatorio();
                b.setNumerosDeArrayList(num);
                break;
            case 3:
                break;
        }

        return b;
    }

    public static void main(String[] args) {
        String resp;
        Burbuja b=new Burbuja();
        ArrayList<Double> num=new ArrayList<Double>();
        b=ui(num,b);
        System.out.println("Ascendente o Descendente");
        resp=leerString.nextLine();
        try{
        if(resp.contains("a")|| resp.contains("A")){
            b.ordenarAscendente();
        }else{
            b.ordenarDescendente();
        }}catch(Exception e){
            System.out.println("");
        }
    }
}
