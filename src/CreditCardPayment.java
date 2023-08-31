public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "EGB using Credit Card ending in " + cardNumber);
    }

}
