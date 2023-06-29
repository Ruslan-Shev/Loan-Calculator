public class CreditPaymentService {
    public double calculate(double amount, double rate, int term) {
        double i = rate / 12 / 100;
        double k = i * Math.pow(1 + i, term) / (Math.pow(1 + i, term) - 1);
        double payment = k * amount;
        return payment;
    }
}
