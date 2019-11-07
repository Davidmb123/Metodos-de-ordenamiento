// Autor: David Murillo Benitez
// Algoritmo: SortSelection
// Fecha: 15 de agosto 2019
// Matricula: 9474
// Carrera: Software
public class DavidMurillo_SortSelection {
    static double[] arrayNumeros;
    public DavidMurillo_SortSelection(){

    }

    //Generar Array
    public static void generar(){
        arrayNumeros= new double[]{4, 8, 1, 6, 7, 3, 9, 80000, 9.1, 9.15, 9.115,55};
    }
    public static void print(double[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+ "   ");
            System.out.println("\n");
        }
    }

    public static void voltear(){

           double aux;
           int cont=arrayNumeros.length-1;
           for(int i=0; i<arrayNumeros.length;i++){
               if(i==cont|| cont+1==i){
                   break;
               }else{
                   aux=arrayNumeros[i];
                   arrayNumeros[i]=arrayNumeros[cont];
                   arrayNumeros[cont]=aux;
                   cont--;
               }
           }

    }
    public static void ordenarDescendente(){
        int indice;
        double aux;
        for (int i = 0; i < arrayNumeros.length - 1; i++) {
            indice = i;
            for (int j = i + 1; j < arrayNumeros.length; j++) {
                if (arrayNumeros[j] > arrayNumeros[indice]) {
                    aux = arrayNumeros[i];
                    arrayNumeros[i] = arrayNumeros[indice];
                    arrayNumeros[indice] = aux;                }
            }

            if (i != indice) {

                aux = arrayNumeros[i];
                arrayNumeros[i] = arrayNumeros[indice];
                arrayNumeros[indice] = aux;

            }
        }
    }

    public static void ordenarAscendente() {

        int indice;
        double aux;
        for (int i = 0; i < arrayNumeros.length - 1; i++) {
            indice = i;
            for (int j = i + 1; j < arrayNumeros.length; j++) {
                if (arrayNumeros[j] < arrayNumeros[indice]) {
                    aux = arrayNumeros[i];
                    arrayNumeros[i] = arrayNumeros[indice];
                    arrayNumeros[indice] = aux;
                }
            }


        }
        }



    public static void main(String[] args) {
        generar();
        ordenarDescendente();
        print(arrayNumeros);

    }
}
