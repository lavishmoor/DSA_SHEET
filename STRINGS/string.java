package DSA.STRINGS;

public class string {


    public static void print(String str){

        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String fullname="lavish moor";
        System.out.println(fullname.length()+" "+fullname);
        
        print(fullname);
    }

   
    
    
}
