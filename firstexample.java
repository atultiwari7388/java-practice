import java.util.Scanner;

class FirstExample {

  // Take 2 variables 'a' & 'b' and print their sum

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a + b;
      System.out.println(sum);
    }

  }

}