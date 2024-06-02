package Discount;

import model.Grade;

import java.lang.reflect.Member;


public class FixDiscountPolicy implements DiscountPolicy {

    private final int discountFixAmount = 1000;

    @Override
    public int discount(final model.Member member, final int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else
            return 0;
    }
}
