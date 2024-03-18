package hello.core.springcore.discount;

import hello.core.springcore.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 금액
     */
    int discount(Member member, int itemPrice);
}
