package DSA.RECURSION;

public class removeDuplicate {
    public static void removeDuplicate(String str, int index, StringBuilder newstr, boolean map[]) {


        if(index == str.length()){
            System.out.println(newstr);
            return ;
        }


        char current = str.charAt(index);

        if(map[current-'a']==true){
            removeDuplicate(str, index+1, newstr, map);
        }
        else{
            map[current-'a']=true;
            removeDuplicate(str, index+1, newstr.append(current), map);
        }
    }

    public static void main(String[] args) {

        String str = "apnacollege";
        removeDuplicate(str , 0, new StringBuilder(""), new boolean[26]);

    }

}
