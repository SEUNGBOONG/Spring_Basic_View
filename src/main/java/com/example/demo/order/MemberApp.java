package com.example.demo.order;

import com.example.demo.AppConfig;
import model.Grade;
import model.MemberService;
import model.Member;


public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member" + member.getName());
        System.out.println("find member" + findMember.getName());
    }
}
