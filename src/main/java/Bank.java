public class Bank {
    private final int FULL_PERCENT = 100;

    public int monthlyPayment(int sum, int month) {
        return sum / month;
    }

    public double fullAmount(int percent, int sum) {
        return (double) (FULL_PERCENT + percent) * sum / FULL_PERCENT;
    }

    public double overpayment(int percent, int sum) {
        return (double) percent * sum / FULL_PERCENT;
    }

}
