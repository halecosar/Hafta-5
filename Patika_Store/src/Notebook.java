public class Notebook extends Product{
    private String storage;

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Notebook(int productType,int productId, String productName, String price, String discountRate, String ram, String screenSize, String stock, String storage) {
        super(productType,productId, productName, price, discountRate, ram, screenSize, stock);
        this.storage=storage;
    }
}
