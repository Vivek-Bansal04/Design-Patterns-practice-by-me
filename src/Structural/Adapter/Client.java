package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorPaymentGatewayAdapter());
        flipkart.makePaymentViaCC("12312312",234,343,3243);
    }
}
