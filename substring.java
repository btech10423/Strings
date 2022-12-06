import java.util.*;
public class substring{
    public static String findsubstring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.print(str.substring(0,5));
        //System.out.print(findsubstring(str,0,5));
    }
}