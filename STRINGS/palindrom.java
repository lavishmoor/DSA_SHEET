package DSA.STRINGS;

public class palindrom {
    public static boolean palindrom(String str){

        int n=str.length();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        

        String str ="noonnn";
        System.out.println(palindrom(str));

    }
    
}
