package Structural.Adapter.payU;

public class PayUGateway {
    public String makeCCPayment(String creditCard,String cvv,String expiry){
        System.out.println("payment done");
        return "123";
    }

    public PayUEnum checkPaymentStatus(String id){
        return PayUEnum.SUCCESS;
    }
}
