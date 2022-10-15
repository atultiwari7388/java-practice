import java.util.Scanner;

public class conditions {

  public static void main(String[] args) {

    // check number is odd or even

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    if (x % 2 == 0) {
      // print even number
      System.out.println(x + " is Even Number");
    } else {
      // print odd number
      System.out.println(x + " is Odd Number");
    }

    // check if age == 18 => Adult || not Adult
    int age = sc.nextInt();

    if (age > 18) {
      System.out.println("Adult");
    } else {
      System.out.println("Not Adult");

    }

    // take 2 input from user and check a==b -> print('equal') && a>b -> print("a
    // is
    // greater") && a<b -> print(" a is lesser").

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a == b) {
      System.out.println(a + " is Equal");
    } else if (a > b) {
      System.out.println(a + " is Greater");
    } else {
      System.out.println(a + " is Lesser");
    }

    int button = sc.nextInt();

    switch (button) {
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namaste");
        break;
      case 3:
        System.out.println("Varakkam");
        break;

      default:
        System.out.println("Invalid Button");
        break;
    }

  }

}
