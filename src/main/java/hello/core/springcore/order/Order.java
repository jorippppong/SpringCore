package hello.core.springcore.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public int calculatePrice(){
        return itemPrice - discountPrice;
    }

    @Override
    public String toString(){
        return "Order{"+
                "memberId= "+ memberId +
                ", itemName= " + itemName +
                ", itemPrice= " +itemPrice +
                ", discountPrice= " + discountPrice + "}";
    }
}
