import java.util.Scanner;


public class cs9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    // int d = (a+b)%c;
    // int e = ((a%c)+(b%c))%c;
    // int f = (a*b)%c;
    // int g = ((a%c)*(b%c))%c;

    System.out.println((a+b)%c);
    System.out.println(((a%c)+(b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c)*(b%c)));
  }
  
}
