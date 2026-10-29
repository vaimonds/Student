package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final int  FIX_PRICE = 200;

    public FixPriceProduct(String productName, int productPrice) {
        super(productName);
    }

    @Override
    public int getProductPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return super.getProductName() + " с фиксированной ценой: " + "Фиксированная цена <" + getProductPrice() + ">" ;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

}
