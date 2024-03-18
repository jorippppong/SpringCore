package hello.core.springcore.discount;

import hello.core.springcore.member.Grade;
import hello.core.springcore.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private static final int discountPercent = 10;
    @Override
    public int discount(Member member, int itemPrice) {
        if(member.getGrade() == Grade.VIP){
            return itemPrice * discountPercent / 100;
        }
        else{
            return 0;
        }
    }
}
