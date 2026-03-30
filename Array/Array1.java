import java.util.*;
public class Array1{
    public static void main(String args[]){
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int number[]  = {1,2,3,4,5};
        for(int i=0;i<5;i++){
            if(number[i] == x){
                System.out.println("The index is : "+i);
                break;
            }
        }
        
    }
};