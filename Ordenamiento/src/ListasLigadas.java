public class ListasLigadas {
    private static Nodo inicio;
    private static int tamaño;

    public ListasLigadas(){
        inicio=null;
    }

    public static void agregarAlFinal(int valor){
        Nodo nodo= new Nodo(valor);
        Nodo puntero=inicio;
        if(puntero==null){
            inicio=nodo;
        }else {
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;

            }
            puntero.siguiente = nodo;
            tamaño++;


        }
    }

    public int buscar(int valor){
        if(inicio==null){
            return 0;
        }else{
            Nodo puntero=inicio;
            int cont=0;
            while(cont<valor&&puntero.siguiente!=null){
                puntero=puntero.siguiente;
                cont++;
            }
            if(cont!=valor){
             return 0;
            }else{
                return puntero.identificador;
            }
        }
    }


    public static void imprimirLista(){
        Nodo puntero=inicio;
        if(puntero.siguiente==null) {
            System.out.println(puntero.identificador);
        }
        int cont=0;
        while(cont<=tamaño){
            System.out.println(puntero.identificador);
            puntero=puntero.siguiente;
            cont++;
        }
    }

    public static void main(String[] args) {

        agregarAlFinal(654);
        agregarAlFinal(6);
        agregarAlFinal(84394);
        agregarAlFinal(4332);

        imprimirLista();

    }
}
