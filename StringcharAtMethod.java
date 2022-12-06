import java.util.*;
public class StringcharAtMethod {
    public static void printletters(String str) {
       for(int i=0; i<str.length(); i++){
    System.out.print(str.charAt(i)+" ");
       } 
    }
    public static void main(String args[]) {
        String fristname = "Vaibhav";
        String lastname = "Gendewad";
        String fullname = fristname + " " + lastname;
        printletters(fullname);
    }
}