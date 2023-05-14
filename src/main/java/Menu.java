import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        printMenu();
    }

    static void printMenu(){
        System.out.println("Enter difficulty");
        String difficulty = new Scanner(System.in).next();
        System.out.println(difficulty);
    }
}
