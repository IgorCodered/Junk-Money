import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExpenseTrackerMenu
{
    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<Double> expenseve = new ArrayList<>();
    private HashMap<ArrayList<String>, ArrayList<Double>> allExpensive = new HashMap<>();

    public ExpenseTrackerMenu() {
        TrackerMenu();
    }

    void TrackerMenu() {
        displayMenuExpCat();

        selectMenu();
    }



    void displayMenuExpCat() {

    }

    void displayAllCat() {
        for (String ex : categories) {
            int i = 1;
            System.out.println(i + " " + ex);
        }
    }
    void addExpCat() {
        System.out.println("Введите новую категорию расходов");
        Scanner scanner = new Scanner(System.in);
        String ex = scanner.nextLine();
        categories.add(ex);
        System.out.println("Отлично, вы добавили новую категорию расходов \"" + ex + "\"" );
    }
    void selectMenu() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                break;
            case 2:

            case 4:
                break;
        }
    }
}





