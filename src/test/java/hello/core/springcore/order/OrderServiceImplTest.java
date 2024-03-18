package hello.core.springcore.order;

import hello.core.springcore.AppConfig;
import hello.core.springcore.member.Grade;
import hello.core.springcore.member.Member;
import hello.core.springcore.member.MemberService;
import hello.core.springcore.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

class OrderServiceImplTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
    OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

    @Test
    void createOrder() {
        //given
        long memberId = 1L;
        Member member = new Member(memberId, "abc", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(memberId, "item1", 10000);

        //then
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}