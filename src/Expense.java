import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Expense
{
    private String category;
    private double sum;
    private LocalDate date;
    private HashMap<String, ArrayList<Double>> categoriesExpense;

    public ArrayList<Double> getExpense() {
        return expense;
    }

    public void setExpense(ArrayList<Double> expense) {
        this.expense = expense;
    }

    private ArrayList<Double> expense;

    public Expense(String category, double sum, LocalDate date) {
        this.category = category;
        this.sum = sum;
        this.date = date;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;

    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    void addExpense() {
        System.out.println("Введите сумму расхода");
        Scanner scanner = new Scanner(System.in);
        double ex = scanner.nextDouble();
        expense.add(ex);
        System.out.println("Выберите категорию расходов");
        for (String key : categoriesExpense.keySet()) {
            System.out.println(key);
        }
        String ex1 = scanner.nextLine();
        categoriesExpense.put(ex1, expense);
        System.out.println("Вы успешно добавили трату!");
        System.out.println("По данной категории в этом месяце вы потратили - "); //TODO Cделать счётчик от недели, от начала месяца и за дене
    }

}
