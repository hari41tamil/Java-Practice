package day4;
public class FindYear {
    public boolean isLeap(int year) { 
        if(((year % 4 == 0) && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        FindYear obj = new FindYear();
        int sYear = 2000, eYear = 2025;
        int totalYear = eYear - sYear;
        int lpyear = 0;
        for(int i = sYear; sYear <= eYear ; i++) {
            if(obj.isLeap(i)) {
                lpyear++;
            }
        }
        int nonLp = totalYear - lpyear;
        int oddDays = (lpyear*2)+(nonLp*1);
        int mod = oddDays % 7;
        String[] str = {"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
        System.out.println(str[mod]);
    }
}
