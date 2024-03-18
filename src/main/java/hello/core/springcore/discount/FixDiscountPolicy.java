package hello.core.springcore.discount;

import hello.core.springcore.member.Grade;
import hello.core.springcore.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private static final int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int itemPrice) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        else{
            return 0;
        }
    }
}
