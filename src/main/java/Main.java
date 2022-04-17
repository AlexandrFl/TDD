import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        int percent = 9;
        System.out.println("Введите сумму которую хотите получить");
        int sum = scanner.nextInt();
        System.out.println("Выберете срок кредите");
        int month = scanner.nextInt();
        System.out.println("Процент по кредиту составляет 9% годовых");
        System.out.println("*****");
        System.out.println("Выш ежемесячный платеж составляет " + bank.monthlyPayment(sum, month) + " рублей");
        System.out.println("Общая сумма кредита составляет " + bank.fullAmount(percent, sum) + " рублей");
        System.out.println("Сумма переплаты составляет " + bank.overpayment(percent, sum) + " рублей");
    }
}
