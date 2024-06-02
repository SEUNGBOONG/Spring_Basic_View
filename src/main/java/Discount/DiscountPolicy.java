package Discount;


import model.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
