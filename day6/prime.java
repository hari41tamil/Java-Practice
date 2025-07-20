//import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7};
        for(int num : arr){
            boolean check = num > 1;
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(num);
        }
    }
        

    }
}
