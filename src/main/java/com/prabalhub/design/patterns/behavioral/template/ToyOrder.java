package com.prabalhub.design.patterns.behavioral.template;


public class ToyOrder extends OrderTemplate {

    public ToyOrder(){
        setGift(false);
    }
    
    public ToyOrder(boolean gift){
        setGift(gift);
    }
    @Override
    public void doCheckout() {
        System.out.println("Checked out the toy order.");
    }

    @Override
    public void doPayment() {
        System.out.println("Payed for the toy.");
    }

    @Override
    public void doReceipt() {
        System.out.println("Receipt is genrated for the toy");
    }

}
