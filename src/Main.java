public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        double rate = 9.99;
        int term = 12;
        double payment = service.calculate(amount, rate, term);
        System.out.println(payment);
    }
}
