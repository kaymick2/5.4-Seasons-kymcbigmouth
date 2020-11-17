import java.net.URL;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hi!~ This program needs a bit of context.");
    System.out
        .println("This program comes from pseudocode from the book \"Java Concepts (6th edition)\" by Cay Horstmann.");
    System.out
        .println("You might need the book to understand where this came from, but the image should be linked here ");
    System.out
        .println("https://docs.google.com/document/d/1pn9kjdWUXtbxsbl21a6pwfqtLM0ap5cw2zKngLWmC8Y/edit?usp=sharing");
    System.out.println();
    String season = null;
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter Month:");
    int month = userInput.nextInt();
    System.out.println("Enter Day:");
    int day = userInput.nextInt();
    if (month == 1) {
      season = "Winter";
    } else if (month == 2) {
      season = "Winter";
    } else if (month == 3) {
      season = "Winter";
    } else if (month == 4) {
      season = "Spring";
    } else if (month == 5) {
      season = "Spring";
    } else if (month == 6) {
      season = "Spring";
    } else if (month == 7) {
      season = "Summer";
    } else if (month == 8) {
      season = "Summer";
    } else if (month == 9) {
      season = "Summer";
    } else if (month == 10) {
      season = "Fall";
    } else if (month == 11) {
      season = "Fall";
    } else if (month == 12) {
      season = "Fall";
    }
    if ((month % 3 == 0) && (day >= 21)) {
      if (season == "Winter") {
        season = "Spring";
      } else if (season == "Spring") {
        season = "Summer";
      } else if (season == "Summer") {
        season = "Fall";
      } else {
        season = "Winter";
      }
    }
    System.out.println("It's " + season);
  }
}