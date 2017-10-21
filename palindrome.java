/*
 String Palindrome by two string
 string as="appa","madam","radar"
 o/p:string is palindrome
 string as="hari","flag"
 o/p:string is not a palindrome
*/
import java.io.*;
class palindrome
{
 public static void main(String arg[])throws Exception
 {
  String str1,str2="";
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter a String");
  str1=br.readLine();
  int length=str1.length();
  for(int i=length-1;i>=0;i--)
  str2=str2+str1.charAt(i);
  if(str1.equals(str2))
  System.out.println("Given string is palindrome");
  else
  System.out.println("Given string is not a  palindrome");
   
 }
}