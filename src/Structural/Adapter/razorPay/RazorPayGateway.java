package Structural.Adapter.razorPay;

public class RazorPayGateway {
    public String payByCreditCard(String creditCard,String cvv,String expiry){
        System.out.println("payment done");
        return "123";
    }

    public boolean checkPaymentStatus(String id){
        return false;
    }
}
