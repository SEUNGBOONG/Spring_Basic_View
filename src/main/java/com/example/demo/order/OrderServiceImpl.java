package com.example.demo.order;

import Discount.DiscountPolicy;
import Discount.FixDiscountPolicy;
import Discount.RateDiscountPolicy;
import model.Member;
import model.MemberRepository;
import model.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    private DiscountPolicy discountPolicy; //인터페이스만 의존한다.

    @Override
    public Order createOrder(final Long memberId, final String itemName, final int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
