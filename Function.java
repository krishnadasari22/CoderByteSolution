import java.util.*; 
import java.io.*;

public class Function {

  public String RunLength(String str) {
   String str2=" ";
   int contador=1;
   char c=str.charAt(0);
   for(int i=1;i<str.length();i++){
     if(str.charAt(i)==c){
       contador++;
     }
     else {
       str2 +=contador+""+c;
       c=str.charAt(i);
       contador=1;
     }
   }
   str2 +=contador+""+c;
   return str2;

  }

  public static void main (String[] args) {      
    Scanner s = new Scanner(System.in);
    Function m=new Function();
    System.out.print(m.RunLength(s.nextLine())); 
  }
}