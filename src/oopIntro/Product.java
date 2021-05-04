package oopIntro;

public class Product {

    //encapsulation
    private int id;
    private String name;
    private int unitePrice;
    private String detail;
    private int discount;

    public Product() {

    }

    public Product(int id,String name, int unitePrice, String detail, int discount, int unitPriceAfterDiscount){
        this();
        this.id = id;
        this.name = name;
        this.unitePrice = unitePrice;
        this.detail = detail;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(int unitePrice) {
        this.unitePrice = unitePrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getUnitPriceAfterDiscount() {
        return unitePrice - (unitePrice * discount / 100);
    }



}
