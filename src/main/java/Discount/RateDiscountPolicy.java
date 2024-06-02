package Discount;

import model.Grade;
import model.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private final int discount = 10;
    private final int percent = 100;

    @Override
    public int discount(final Member member, final int price) {
        if (member.getGrade() == Grade.VIP) {
            return (price * discount) / percent;
        } else {
            return 0;
        }
    }
}
