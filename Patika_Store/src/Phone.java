public class Phone extends Product{
//renk ve hafıza seçimi metodu eklenecek
    private String memory;
    private String battery;
    private String color;

    public Phone(int productType, String productName, String price, String discountRate, String ram, String screenSize, String stock,String memory,String battery, String color) {
        super(productType, productName, price, discountRate, ram, screenSize, stock);
        this.memory = memory;
        this.battery =battery;
        this.color=color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}
