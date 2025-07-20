public class DuplicateInFor {
    public static void main(String[] args){
        String str = "Training";
        String dup = "";
        char[] arr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(dup.indexOf(arr[i]) == 1){
                dup += arr[i];
            }
        }
        System.out.println(dup);
    }
}
