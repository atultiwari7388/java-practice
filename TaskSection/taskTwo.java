package TaskSection;

import java.util.Scanner;

public class taskTwo {

  public static void main(String[] args) {

    // Make a Calculator. Take 2 numbers (a & b) from the user and
    // an operation as follows :

    try (Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int operators = sc.nextInt();

      switch (operators) {
        case 1:
          System.out.println(a + b);
          break;
        case 2:
          System.out.println(a - b);
          break;
        case 3:
          System.out.println(a * b);
          break;
        case 4:
          if (b == 0) {
            System.out.println("Invalid Division");
          } else {
            System.out.println(a / b);
          }
          break;
        case 5:
          if (b == 0) {
            System.out.println("Invalid Division");
          } else {
            System.out.println(a % b);
          }
          break;

        default:
          System.out.println("Invalid Operators");

      }
    }

  }

}
