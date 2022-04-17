import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class testBank {

    private static int i = 1;

    @BeforeEach
    public void startEach() {
        System.out.println("Начало теста № " + i);
    }

    @AfterEach
    public void finishEach() {
        System.out.println("Конец теста № " + i++);
    }

    @BeforeAll
    public static void startAll() {
        System.out.println("Тестирование началось");
    }

    @AfterAll
    public static void finishAll() {
        System.out.println("Тестирование завершено");
    }

    @Test
    public void testMonthlyPayment() {
        Bank bank = new Bank();
        int month = 12;
        int sum = 20000;
        int result = sum / month;
        int realResult = bank.monthlyPayment(sum, month);
        assertEquals(result, realResult);
    }

    @Test
    public void testFullAmount() {
        Bank bank = new Bank();
        int fullPercent = 100;
        int percent = 16;
        int sum = 20000;
        double result = (double) (fullPercent + percent) * sum / fullPercent;
        double realResult = bank.fullAmount(percent, sum);
        assertEquals(result, realResult);
    }

    @Test
    public void testOverpayment() {
        Bank bank = new Bank();
        int fullPercent = 100;
        int percent = 16;
        int sum = 20000;
        double result = (double) percent * sum / fullPercent;
        double realResult = bank.overpayment(percent, sum);
        assertEquals(result, realResult);
    }

}
