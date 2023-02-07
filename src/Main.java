import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner user_input = new Scanner(System.in);

                String name;
                String class_Level;

                double mark;

                System.out.println("**********?******************************?******");
                System.out.println(" SIMPLE UCC GRADING SYSTEM ");
                System.out.println("**********?******************************?********");
                System.out.println("");
                System.out.print(" PLEASE ENTER YOUR NAME : ");
                name = user_input.nextLine();
                System.out.println("");
                System.out.print(" PLEASE ENTER YOUR LEVEL : ");
                class_Level = user_input.nextLine();
                System.out.println("");
                System.out.println(" Welcome " + name.toUpperCase() + "," + " you are a level " + class_Level  + " student.");
                System.out.println(" This is a simple Java program that ");
                System.out.println(" provides the Grade and interpretation of");
                System.out.println(" any given examination numerical marks");
                System.out.println("");
                System.out.println(" **PRESS ZERO TO EXIT");
                System.out.println("==========?==============================?==============================?===");

                do {

                    System.out.print(" PLEASE ENTER EXAMINATION SCORE : ");
                    mark = user_input.nextDouble();

                    if (mark >= 80 && mark <= 100) {
                        System.out.println(" GRADE A");
                        System.out.println(" INTERPRETATION : EXCELLENT ");
                        System.out.println("");

                    } else if (mark >= 75 && mark <= 79.9) {
                        System.out.println(" GRADE B+");
                        System.out.println(" INTERPRETATION : VERY GOOD ");
                        System.out.println("");

                    } else if (mark >= 70 && mark <= 74.9) {
                        System.out.println(" GRADE B");
                        System.out.println(" INTERPRETATION : GOOD ");
                        System.out.println("");

                    } else if (mark >= 65 && mark <= 69.9) {
                        System.out.println(" GRADE C+");
                        System.out.println(" INTERPRETATION : ABOVE AVERAGE ");
                        System.out.println("");

                    } else if (mark >= 60 && mark <= 64.9) {
                        System.out.println(" GRADE C");
                        System.out.println(" INTERPRETATION : AVERAGE ");
                        System.out.println("");

                    } else if (mark >= 55 && mark <= 59.9) {
                        System.out.println(" GRADE D+");
                        System.out.println(" INTERPRETATION : PASS ");
                        System.out.println("");

                    } else if (mark >= 50 && mark <= 54.9) {
                        System.out.println(" GRADE D");
                        System.out.println(" INTERPRETATION : FAIL ");
                        System.out.println("");

                    } else if (mark >= 40 && mark <= 49.9) {
                        System.out.println(" GRADE E");
                        System.out.println(" INTERPRETATION : FAIL ");
                        System.out.println("Hello,"+ name.toUpperCase()+ " be prepared to resit the paper");
                        System.out.println("");

                    } else if (mark < 30.9) {
                        System.out.println(" GRADE E");
                        System.out.println(" INTERPRETATION : FAIL ");
                        System.out.println("Prepare to resit the paper");
                        System.out.println("");
                    } else {
                        System.out.println(" INAPPROPRIATE INPUT");

                    }

                } while (mark > 0);

            }
        }