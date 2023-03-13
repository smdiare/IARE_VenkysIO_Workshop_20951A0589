import java.util.*;
public class string_reversal{
public static void main(String[] args){
    System.out.println("enter string:");
    Scanner sc=new Scanner(System.in);
    int i=0,j;
    String s,k="",z="";
    s=sc.nextLine();
    j=s.length()-1;
    while(i<j){
        k=k+s.charAt(j);
        z=s.charAt(i)+z;
        i++;
        j--;
    }
    if(s.length()%2==1)
    System.out.println(k+s.charAt(i)+z);
    else
    System.out.println(k+z);

}
}