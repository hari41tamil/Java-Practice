import java.util.Scanner;
public class Leader{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int leader=arr[n];
        for(int i=n-2;i<leader;i--){
             arr[i]= sc.nextInt();
            }
            for (int i =1;i<n;i++) {
                if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

}