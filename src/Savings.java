import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Savings
{
    private HashMap<String, Double> savings = new HashMap<>();

    public HashMap<String, Double> getSavings() {
        return savings;
    }

    public void setSavings(HashMap<String, Double> savings) {
        this.savings = savings;
    }

    void addSavings() {
        System.out.println("Введите какую сумму хотите положить в копилку?");
        Scanner scanner = new Scanner(System.in);
        double ex = scanner.nextDouble();
    }

    public static void saveSavingHash(HashMap<String, Double> hashMap, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            for (Map.Entry<String, Double> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                writer.write(key + " : " + value + " \n ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void addSavingCheck() {
        System.out.println("Введите название накопительного счёта");
        Scanner scanner = new Scanner(System.in);
        String ex = scanner.nextLine();
        System.out.println("Отлично, накопительный счёт \"" + ex + "\" создан, вы можете начинать копить");
        System.out.println("Какую сумму вы хотите туда внести?");
        Double ex1 = scanner.nextDouble();
        System.out.println("Вы внесли + " + ex1 + " .");
        savings.put(ex, ex1);
    }
    void viewAllSaving() {
        for (Map.Entry<String, Double> entry : savings.entrySet()) {
             String key = entry.getKey();
             Double value = entry.getValue();
            System.out.println("Название накопления - " + key + ", доступная сумма: " + value + " рублей.");
        }
    }
    static void addSaveRuble(HashMap<String, Double> hashMap) {
        Scanner scanner = new Scanner(System.in);
        String ex = scanner.nextLine();
        double addValue = scanner.nextDouble();
        if (hashMap.containsKey(ex)) {
            double current = hashMap.get(ex);
            hashMap.put(ex, current + addValue);
        }
    }
}







