public class duplicate {
    public static void main(String[] args){
        String s1 = "Harini";
        String dup = "";
        //char[] str = s1.toCharArray();
        for(char ch : s1.toCharArray()){
            if(dup.indexOf(ch) == -1){
                dup += ch; 
            }

        } 
        System.out.println(dup);
    }
}
