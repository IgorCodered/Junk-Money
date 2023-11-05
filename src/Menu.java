import java.util.Objects;
import java.util.Scanner;

public class Menu
{
    Savings sav = new Savings();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(sav, menu.sav);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sav);
    }

    public Menu() {
        displayMenu();
    }

    void displayMenu() {
        System.out.println("Введите нужнукю цифру из меню для выбора действия: ");
        System.out.println("1. Внести расход.");
        System.out.println("2. Внести доход.");
        System.out.println("3. Посмотреть расходы по категориям");
        System.out.println("4. Положить деньги в копилку");
        System.out.println("5. Посмотреть доходы за месяц");
        System.out.println("6. Выход");
        System.out.println("6. Выход");
        System.out.println("6. Тестовая менюшка для коммита");
        mainMenuSelecter();
    }
    void displayMenuExpensive() {
        System.out.println("Введите нужную цифру из меню для выбора действия: ");
        System.out.println("1. Добавить расход в уже существующую категорию.");
        System.out.println("2. Добавить новую категорию расхода.");
        System.out.println("3. Назад.");
        expenseMenuSelecter();
    }
    void displayMenuSavings() {
        System.out.println("Введите нужнукю цифру из меню для выбора действия: \n" +
                "\n Если у вас ещё нет накопительного счёта, то вам нужно его создать " +
                "\n для этого введите цифру 4 и нажмите Enter");
        System.out.println();
        System.out.println("1. Выбрать в какой накопительный счёт положить деньги");
        System.out.println("2. Посмотреть общий баланс копилки");
        System.out.println("3. Посмотреть баланс копилок по отдельным счетам");
        System.out.println("4. Создать накопительный счёт");
        System.out.println("5. Назад.");
        System.out.println("Ещё одна тест строка");
        savingMenuSelecter();
    }
    void displayMenuSavingsOne() {
        System.out.println("");
    }
    void mainMenuSelecter() { //TODO ДОделать кейсы
        Scanner scanner = new Scanner(System.in);
        int ex = scanner.nextInt();
        switch (ex) {
            case 1:
                displayMenuExpensive();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMenuSavings();
                break;
            case 5:
                displayMenuSavings();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Введите ту цифру которая есть в списке.");
                System.out.println();
                displayMenu();
                break;
        }
    }
    void expenseMenuSelecter() { //TODO Доделать кейсы
        Scanner scanner = new Scanner(System.in);
        int ex = scanner.nextInt();
        switch (ex) {
            case 1:
                displayMenuExpensive();
                break;
            case 2:
                break;
            case 3:
                displayMenu();
            case 4:
                break;
            default:
                System.out.println("Введите ту цифру которая есть в списке.");
                System.out.println();
                displayMenuExpensive();
                break;
        }

    }
    void savingMenuSelecter() { //TODO Доделать кейсы
        Scanner scanner = new Scanner(System.in);
        int ex = scanner.nextInt();
        switch (ex) {
            case 1:
                System.out.println("Введите Пример 6");
                Savings.addSaveRuble(sav.getSavings());
                break;
            case 2:
                break;
            case 3:
                sav.viewAllSaving();
                returnMain();
                break;
            case 4:
                sav.addSavingCheck();
                displayMenuSavings();
                Savings.saveSavingHash(sav.getSavings(), "output.txt");
                break;
            default:
                System.out.println("Введите ту цифру которая есть в списке.");
                System.out.println();
                displayMenuSavings();
        }
    }
    void returnMain() {
        System.out.println(" Введите цифру 1 что бы вернуться в главное меню, или цифру 2 что бы завершить программу.");
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();

        if (one == 1) {
            displayMenu();
        } else if (one == 2) {
            System.exit(1);
        } else error();
    }
    void error() {
        System.out.println("Вы ввели не верную цифру");
    }
}
