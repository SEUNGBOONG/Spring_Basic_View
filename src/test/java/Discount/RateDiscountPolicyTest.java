package Discount;


import model.Grade;
import model.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();
    private org.assertj.core.api.Assertions Assertions;

    @Test
    @DisplayName("VIP는 10퍼 할인 들어가야한다. ")
    void 할인정책테스트() {

        // given
        Member member = new Member(1L, "VIP", Grade.VIP);

        // when
        int discount = rateDiscountPolicy.discount(member, 10000);

        // then
        assertThat(discount).isEqualTo(1000);
    }
}