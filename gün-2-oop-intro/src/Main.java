public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Lenovo V14", 15.000, "16 GM Ram", 10); // Refarence - Intence


        Product product2 = new Product();
        product2.setID(2);
        product2.setName("Lenovo v15");
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

     // System.out.println(product2.getUnitPriceDiscountAfter());

        Category category1 = new Category();
        category1.setID(1);
        category1.setName("İçecek");

        System.out.println(category1.getName());

    }
}
