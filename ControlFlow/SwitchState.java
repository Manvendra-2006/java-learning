import java.util.*;
public class SwitchState{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age){
            case 1 :
                System.out.print("Age is 45");
            break;
            case 2 : 
            System.out.print("Age is 56");
            break;
            default :
            System.out.print("Age is none");
        }
    }
}