

public class Lista {

    private Nodo cabeza;
    private int longitud=0;

    private class Nodo{
        public Libro libro;
        public Nodo siguiente=null;

        public Nodo(Libro libro) {
            this.libro=libro;
        }
    }


    public void insertarPrincipio(Libro libro){
        Nodo nodo=new Nodo(libro);
        nodo.siguiente=cabeza;
        cabeza=nodo;
        longitud++;
    }

    public void insertarFinal(Libro libro){
        Nodo nodo= new Nodo(libro);
        Nodo puntero=cabeza;
        while(puntero.siguiente!=null){
            puntero=puntero.siguiente;

        }
        puntero.siguiente=nodo;
        longitud++;
    }

    public void insertarDespues(int n,Libro libro){
        Nodo nodo=new Nodo(libro);
        if(cabeza==null){
            cabeza=nodo;

        }else{
            Nodo puntero=cabeza;
            int cont=0;
            while(cont<n&& puntero.siguiente!=null){
                puntero=puntero.siguiente;
                cont++;
            }
            nodo.siguiente=puntero.siguiente;
            puntero.siguiente=nodo;
        }
        longitud++;
    }

    public Libro obtener(int n){
        if(cabeza==null){
            return null;
        }else{
            Nodo puntero=cabeza;
            int cont=0;
            while(cont<n&& puntero.siguiente!=null){
                puntero=puntero.siguiente;
                cont++;
            }
            if(cont != n){
                return null;
            }else{
                return puntero.libro;
            }
        }
    }

    public int contar(){
        return longitud;

    }
    public boolean estaVacia(){
        return cabeza==null;

    }

    public void eliminarPrincipio(){
       if(cabeza!=null){
        Nodo primero= cabeza;
        cabeza=cabeza.siguiente;
        primero.siguiente=null;
        longitud--;
    }}

    public void eliminarUltimo(){
        if(cabeza!=null){
            if(cabeza.siguiente==null){
                cabeza=null;
            }else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }
        }
    }

    public void eliminarLibro(int n){
        if(cabeza!=null){
            if(n==0) {
                Nodo primer=cabeza;
                cabeza=cabeza.siguiente;
                primer.siguiente=null;
                longitud--;

            }else{
                Nodo puntero = cabeza;
                int cont = 0;
                while (cont < (n - 1)) {
                    puntero = puntero.siguiente;
                    cont++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }


        }
    }
}
