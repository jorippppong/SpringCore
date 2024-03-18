package hello.core.springcore;

import hello.core.springcore.discount.DiscountPolicy;
import hello.core.springcore.discount.FixDiscountPolicy;
import hello.core.springcore.discount.RateDiscountPolicy;
import hello.core.springcore.member.MemberRepository;
import hello.core.springcore.member.MemberService;
import hello.core.springcore.member.MemberServiceImpl;
import hello.core.springcore.member.MemoryMemberRepository;
import hello.core.springcore.order.OrderService;
import hello.core.springcore.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
