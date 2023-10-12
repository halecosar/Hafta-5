public class Product {
    private int productId;
    private String productName;
    private String price;
    private String discountRate;
    private String ram;
    private String screenSize;
    private String stock;
    private int productType;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Product(int productType, String productName, String price, String discountRate, String ram, String screenSize, String stock) {
        this.productType= productType;
        this.productName = productName;
        this.price = price;
        this.discountRate = discountRate;
        this.ram=ram;
        this.screenSize = screenSize;
        this.stock = stock;
    }

}
