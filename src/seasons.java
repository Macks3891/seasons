import java.util.Scanner;

public class seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (от 1 до 12): ");
        int monthNumber = scanner.nextInt();

        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "некорректный номер месяца";
                break;
        }

        System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season);

        scanner.close();
    }
}