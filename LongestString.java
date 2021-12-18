import java.util.*; 
import java.io.*;

public class LongestString {
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a Words");
  String str=sc.nextLine();
  str +=" ";
  String word="",lword="";
  int len=str.length();
  for(int i=0;i<len;i++){
    char ch=str.charAt(i);
    if(ch==' '){
      if(word.length()>lword.length())
      lword=word;
      word="";
    }
    else {
      word +=ch;
    }
  }
  System.out.println("The Longest Word:"+lword);
 
  }

}