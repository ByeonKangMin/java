package a5_claas;

import java.util.Date;

public class Order {
    //필드
    long orderId; //숫자형 아이디 가능 (이 경우 long이 주로 사용됨)
    User user;
    Product product;
    Date orderDate;
    double totalAmount;

    //생성자

    public Order() {}

    public Order(long orderId, User user, Product product, Date orderDate, double totalAmount) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    //메서드
    public double setTotalAmount(double newTotalAmount){
        this.totalAmount = newTotalAmount;
        return this.totalAmount;
    }


}
