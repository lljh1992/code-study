import java.util.Scanner;

public class cs24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      x = x - (a * b);
    }

    if (x == 0) System.out.println("Yes");
    else System.out.println("No");

  }
}

