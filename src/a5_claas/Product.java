package a5_claas;

public class Product {
   //필드
    String productId;
    String getProductName;
    double price; //계산의 편의성을 위해 int가 아닌 double를 사용함
    int stock;

    //생성자
    public Product() {}
    public Product(String productId, String getProductName, double price, int stock) {
        this.productId = productId;
        this.getProductName = getProductName;
        this.price = price;
        this.stock = stock;
    }

    //메서드
    //#1 가격설정
    public double setPrice(double newPrice){
        this.price = newPrice;
        return  this.price;
    }
    //#2 재고설정
    public int setStock(int newStock){
        this.stock = newStock;
        return this.stock;
    }
}

