public class triangulo {
    public static void main(String[] args) {

        String asteriscos="*****";
        int cont=asteriscos.length();
        for(int i=0; i<4;i++){
            if(i==0){
                System.out.println("* * * * ");
            }else if(i==1){
                System.out.println(" * * * ");
            }else if(i==2){
                System.out.println("  * *  ");
            }else{
                System.out.println("   *   ");
            }
        }
    }
}
