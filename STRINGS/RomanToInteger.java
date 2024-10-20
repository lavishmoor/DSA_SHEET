package DSA.STRINGS;

public class RomanToInteger {

    public static int roman(String s){
        
        int result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                result=result+1;
            }else  if(s.charAt(i)=='V'){
                result=result+5;
            }
            else  if(s.charAt(i)=='X'){
                result=result+10;
            }
            else  if(s.charAt(i)=='L'){
                result=result+50;
            }
            else  if(s.charAt(i)=='C'){
                result=result+100;
            }else  if(s.charAt(i)=='D'){
                result=result+500;
            }else  if(s.charAt(i)=='M'){
                result=result+1000;
            }else{
                continue;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {

        String s = "III";
        System.out.println(roman(s));
        // "LVIII"  
        // Symbol       Value
        // I             1
        // V             5
        // X             10
        // L             50
        // C             100
        // D             500
        // M             1000


    }
}