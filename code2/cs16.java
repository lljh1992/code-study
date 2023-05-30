import java.util.Scanner;

public class cs16 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextInt();
    
    if (a%4==0){    // a를 4로 나눈 후 나머지가 0가 같다면 
      if (a%400==0) System.out.println("1");      // a를 400으로 나눈 후 나머지가 0과 같다면 1출력
      else if (a%100==0) System.out.println("0"); // a를 100으로 나눈 후 나머지가 0과 같다면 0출력
      else System.out.println("1");

      
    }
    else System.out.println("0");

  }
}

// % 두수를 나눈 후 그 나머지를 반환한다
// == 피연산자들의 값이 같다