package com.prabalhub.design.patterns.behavioral.template;


public abstract class OrderTemplate {
    protected boolean gift;
    public final void processOrder(){
        doCheckout();
        doPayment();
        if(isGift()){
            wrapGift();
        }
        doReceipt();
    }
    public final void wrapGift() {
       System.out.println("Gift wrap.");
    }
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    
    public boolean isGift() {
        return gift;
    }
    
    public void setGift(boolean gift) {
        this.gift = gift;
    }
}
