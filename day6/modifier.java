class Access {
    
        int x=10;
        public  int a=20;
        private int b=30;
        protected int c=40;
        
void accessmodify(){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class modifier{
    public static void main(String[]args){
        Access obj=new Access();
    
        System.out.println(obj.x);
        System.out.println(obj.a);
        // System.out.println(obj.b);
        System.out.println(obj.c);
        
        obj.accessmodify();
    }
}