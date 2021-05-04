package oopIntro;

public class Main {
    public static void main(String[] args) {


        Product product1 = new Product(1,"LENOVO V14",14500,"16 GB RAM",10,100); //intance oluşturma

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);
        product2.setUnitePrice(16000);

        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("İçecek");

        Category category2 = new Category();
        category2.setName("Yiyecek");
        category2.setId(2);

        System.out.println(category1.getName());
        System.out.println(category2.getName());



       /* Product[] products = {product1,product2,product3};

        for (Product product : products) {
            System.out.println("----------------------");
            System.out.println("Id : " + product.id);
            System.out.println("Name : " + product.name);
            System.out.println("Unite Price : " + product.unitePrice);
            System.out.println("Detail : " + product.detail);
        }
        System.out.println("---------Product - SON----------");

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev Bahçe";

        Category [] categories = {category1,category2};
        for (Category category: categories) {
            System.out.println("----------------------");
            System.out.println("Id : " + category.id);
            System.out.println("Name : " + category.name);
        }

        ProductService productService = new ProductService();
        productService.addToCart(product2);

        */

    }
}
