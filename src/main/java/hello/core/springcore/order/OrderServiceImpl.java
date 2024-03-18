package hello.core.springcore.order;

import hello.core.springcore.discount.DiscountPolicy;
import hello.core.springcore.discount.FixDiscountPolicy;
import hello.core.springcore.member.Member;
import hello.core.springcore.member.MemberRepository;
import hello.core.springcore.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
