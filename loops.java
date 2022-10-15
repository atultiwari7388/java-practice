import java.util.Scanner;

public class loops {

  public static void main(String[] args) {

    // print 100 times hello world
    // counter++ => counter+1
    for (int counter = 0; counter < 100; counter++) {
      System.out.println(counter);
    }

    // // using while loop
    int i = 0;
    while (i < 100) {
      System.out.println(i);
      i++;

      // }

      // // using do while loop
      int j = 0;
      do {
        System.out.println(j);
        j++;
      } while (j < 100);

      // let's checkout while do-while condition using true or false condition.

      int k = 12;
      while (k < 11) {
        System.out.println("Hello Flane");

        // }

        do {
          System.out.println("kas ho Flane");
        } while (k < 11);

        // Q1. Print the sum of First n Natural Numbers.

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // // sum = sum + i;
        // sum += i;
        // }
        // System.out.println(sum);

        // Q. Print the table of a number input by the user.

        try (Scanner sc = new Scanner(System.in)) {
          int n = sc.nextInt();

          for (int l = 1; i < 11; l++) {
            System.out.println(n * l);

          }
        }
      }
    }
  }
}
