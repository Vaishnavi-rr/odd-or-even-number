import java.util.*;
public class Main{
public static void main (String arg[]){
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
String result=(num%2==0)?"even":"odd";
System.out.println(result);
}
}
