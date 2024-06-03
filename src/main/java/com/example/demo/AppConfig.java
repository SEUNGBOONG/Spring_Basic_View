package com.example.demo;

import Discount.FixDiscountPolicy;
import com.example.demo.order.OrderService;
import com.example.demo.order.OrderServiceImpl;

import model.MemberService;
import model.MemberServiceImpl;
import model.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), new FixDiscountPolicy());
    }
}
