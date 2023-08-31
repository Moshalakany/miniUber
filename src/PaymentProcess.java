import java .util.Scanner;
public class PaymentProcess {
     static Scanner input2=new Scanner(System.in);

    static void payAmount(double amount)
    {
        PaymentStrategy payment;
        PaymentContext context ;
        System.out.println("press 1 to pay with cash");
        System.out.println("press 2 to pay with paypal");
        System.out.println("press 3 to pay with credit card");
        String choice=input2.next();
        switch (choice) {
            case "1": {
                payment=new CashPayment();
                context=new PaymentContext(payment);
                context.processPayment(amount);
                break;
            }
            case "2":{
                System.out.println("enter your paypal email");
                String Email=input2.next();
                payment=new PayPalPayment(Email);
                context=new PaymentContext(payment);
                context.processPayment(amount);
                break;
        }
            case "3":{
                System.out.println("enter your credit card number");
                String cardNum=input2.next();
                System.out.println("enter cvv");
                String cvv=input2.next();
                System.out.println("enter expiry date");
                String expiryDate =input2.next();
                payment=new CreditCardPayment(cardNum,expiryDate,cvv);
                context=new PaymentContext(payment);
                context.processPayment(amount);
                break;
            }
    }
}
}
