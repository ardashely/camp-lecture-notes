public class Product {

    private int ID;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;

    public Product() {
    }

    public Product(int ID, String name, double unitPrice, String detail, double discount) {

        super();
        this.ID = ID;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceDiscountAfter() {
        return this.unitPrice-(this.unitPrice * this.discount) / 100;
    }


}