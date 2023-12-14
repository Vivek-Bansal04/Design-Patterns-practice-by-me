package Structural.Adapter;

import Structural.Adapter.payU.PayUEnum;
import Structural.Adapter.payU.PayUGateway;

public class PayUPaymentGatewayAdapter implements PaymentGateway{
    PayUGateway payUGateway = new PayUGateway();
    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiry = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String ans = payUGateway.makeCCPayment(cardNumber,cvvString,expiry);
        return Long.parseLong(ans);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        PayUEnum status = payUGateway.checkPaymentStatus(String.valueOf(id));
        if(status == PayUEnum.SUCCESS){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
