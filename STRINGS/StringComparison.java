package DSA.STRINGS;

public class StringComparison {
    public static void main(String[] args) {
        

        String s1="tony";
        String s2="tony";
        String s3=new String("tony");

        if(s1==s2){
            System.out.println("String are equal to each other");
        }
        else{
            System.out.println("String are not  equal to each other");
        }

        if(s1.equals(s3)){
            System.out.println("String are equal to each other");
        }
        else{
            System.out.println("String are not  equal to each other");
        }
    }
    
}
