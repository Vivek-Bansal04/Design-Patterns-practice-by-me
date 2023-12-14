package Structural.Adapter;

import Structural.Adapter.razorPay.RazorPayGateway;

public class RazorPaymentGatewayAdapter implements PaymentGateway{
    private RazorPayGateway razorPayGateway = new RazorPayGateway();
    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiry = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String ans = razorPayGateway.payByCreditCard(cardNumber,cvvString,expiry);
        return Long.parseLong(ans);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorPayGateway.checkPaymentStatus(String.valueOf(id));
        if(status == true){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
