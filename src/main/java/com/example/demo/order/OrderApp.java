package com.example.demo.order;

import com.example.demo.AppConfig;
import model.Grade;
import model.Member;
import model.MemberService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order.toString());
        System.out.println("order = " + order.calcualatePrice());
    }
}

