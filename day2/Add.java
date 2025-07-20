package day2;

public class Add {
    public static void main(String[] args) {
        int sum = 0;
        for(String arg : args){
            sum += Integer.parseInt(arg);

        }
        System.out.println("Sum: "+sum);
    }
}
// In this Program is runs on the Terminal