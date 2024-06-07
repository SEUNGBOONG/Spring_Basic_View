package Discount;

import model.Grade;
import model.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int percent;

    @Override
    public int discount(final Member member, final int price) {
        if (member.getGrade() == Grade.VIP) {
            int discount = 10;
            return (price * discount) / percent;
        } else {
            return 0;
        }
    }
}
