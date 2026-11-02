package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basicPrice;
    private int discountPercent;

    public DiscountedProduct(String productName, int basicPrice, int discountPercent) {
        super(productName);
        if (basicPrice > 0 && (discountPercent >= 0 && discountPercent <= 100)) {
            this.basicPrice = basicPrice;
            this.discountPercent = discountPercent;
        } else {
            throw new IllegalArgumentException("Базовая цена или процент скидки не соответствуют условию");
        }

    }


    @Override
    public int getProductPrice() {
        basicPrice = basicPrice - basicPrice * discountPercent / 100;
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
