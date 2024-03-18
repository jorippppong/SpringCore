package hello.core.springcore.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
