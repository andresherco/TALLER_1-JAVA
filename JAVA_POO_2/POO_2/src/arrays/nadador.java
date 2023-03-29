package arrays;

import java.util.Scanner;

public class nadador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of competitors: ");
    int numCompetitors = scanner.nextInt();

    String[] names = new String[numCompetitors];
    double[] times = new double[numCompetitors];

    for (int i = 0; i < numCompetitors; i++) {
      System.out.print("Enter the name of competitor " + (i + 1) + ": ");
      names[i] = scanner.next();
      System.out.print("Enter the time of competitor " + (i + 1) + ": ");
      times[i] = scanner.nextDouble();
    }

    // Display the results
    for (int i = 0; i < numCompetitors; i++) {
      System.out.println(names[i] + ": " + times[i] + " seconds");
    }

    // Determine the winner
    int winnerIndex = 0;
    double fastestTime = times[0];
    for (int i = 1; i < numCompetitors; i++) {
      if (times[i] < fastestTime) {
        fastestTime = times[i];
        winnerIndex = i;
      }
    }

    System.out.println(
        "The winner is " + names[winnerIndex] + " with a time of " + times[winnerIndex] + " seconds.");

    scanner.close();
  }
}
