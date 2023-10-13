import java.util.HashSet;
import java.util.Scanner;

public abstract class Product {
    static HashSet<Brand> brands = new HashSet<>(); //marka listesi için HashSet yapıldı.
    public Scanner scan = new Scanner(System.in);
    private int id;
    private String name;
    private int price;
    private int discountRate;
    private int stock;
    private Brand brand;
    private String screenSize;
    private int ram;
    private String memory;

    public abstract void productMenu();

    public abstract void addProduct();

    public abstract void getProducts();

    public abstract void deleteProduct();

    public Product(int id, String name, int price, int discountRate, int stock,
                   Brand brand, String screenSize, int ram, String memory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
        this.memory = memory;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

}
