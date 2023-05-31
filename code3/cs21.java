package code3;

public class cs21 {
  public static void main(String[] args) {
    
    int a;
    int b;

    for (a = 2; a < 10; a++) {
      System.out.print(a + "단\t");
    }
      System.out.println();
    for (b = 1; b < 10; b++) {
      for (a = 2; a < 10; a++){
        System.out.print(a + "x" + b + "=" + a * b + "\t");
        
      
      }
        System.out.println();
    }
  }
}
