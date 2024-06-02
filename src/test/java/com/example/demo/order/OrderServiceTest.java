package com.example.demo.order;

import model.Grade;
import model.Member;
import model.MemberService;
import model.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void 테스트() {

        // given
        long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        // when&then
        Assertions.assertAll(
                () -> assertEquals(order.getDiscountPrice(), 1000)
        );
    }

}