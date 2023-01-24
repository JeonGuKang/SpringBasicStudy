package com.example.core2;

import com.example.core2.discount.DiscountPolicy;
import com.example.core2.discount.FixDiscountPolicy;
import com.example.core2.discount.RateDiscountPolicy;
import com.example.core2.member.MemberRepository;
import com.example.core2.member.MemberService;
import com.example.core2.member.MemberServiceImpl;
import com.example.core2.member.MemoryMemberRepository;
import com.example.core2.order.OrderService;
import com.example.core2.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean //스프링 컨테이너에 등록됨
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
//        return new RateDiscountPolicy();
    }
}
