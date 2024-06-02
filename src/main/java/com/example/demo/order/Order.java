package com.example.demo.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public int calcualatePrice() {
        return itemPrice - discountPrice;
    }

    public void setMemberId(final Long memberId) {
        this.memberId = memberId;
    }

    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(final int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setDiscountPrice(final int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public Order(final Long memberId, final String itemName, final int itemPrice, final int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
