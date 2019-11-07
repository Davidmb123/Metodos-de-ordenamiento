import java.util.ArrayList;

public class FindSumInArray {


    public static void main(String[] args) {
    int [] array={1,7,3,2,4,4};
    findSum(array);



    }

    public static void findSum(int [] array){
        int j=array.length-1;
        int i=1;
        int sum=0;

        while(!(j<i)){
             sum=array[i]+array[j];
            if(sum==8){
                System.out.println(sum);
                break;
            }else if(sum<8){
                if(i<8&&j>8){
                    i++;
                }else{
                    j--;
                }

            }else{
                if(i>8&&j<8){
                    j--;
                }else{
                    i++;
                }            }
        }



    }




}

