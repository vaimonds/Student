package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basicPrice;
    private int discountPercent;

    public DiscountedProduct(String productName, int basicPrice, int discountPercent) {
        super(productName);
        this.basicPrice = basicPrice;
        this.discountPercent = discountPercent;
    }


    @Override
    public int getProductPrice() {
        basicPrice = basicPrice - discountPercent;
        return basicPrice;
    }

    @Override
    public String toString() {
        return super.getProductName() + " со скидкой: " + getProductPrice() + " (<" + discountPercent + ">%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
