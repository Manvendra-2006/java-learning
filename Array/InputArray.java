import java.util.*;
public class InputArray{
    public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(number[i]);
        }
    }
};