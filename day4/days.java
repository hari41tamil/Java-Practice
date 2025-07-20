import java.util.Scanner;

public class days{
    public boolean isLeap(int year) { 
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int sYear = 2000, eYear = 2025;
        int totalYear = eYear - sYear + 1;
        int lpyear = 0;

        days obj = new days();

        for (int i = sYear; i <= eYear; i++) {
            if (obj.isLeap(i)) {
                lpyear++;
            }
        }

        int nonLp = totalYear - lpyear;
        int oddDays = (lpyear * 2) + (nonLp * 1);
        int mod = oddDays % 7;

        String[] str = {"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"};
        System.out.println("Total Leap Years: " + lpyear);
        System.out.println("Total Non-Leap Years: " + nonLp);
        System.out.println("Odd Days: " + oddDays);
        System.out.println("Day of the week for Jan 1, " + sYear + " + " + totalYear + " years is: " + str[mod]);
    }
}
