import java.util.ArrayList;

public  class Brand implements Comparable <Brand>{
private int id;
private String name;
private ArrayList<Product> products;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
        this.products = new ArrayList<>();
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

    public ArrayList<Product> get_product() {
        return products;
    }

    public void set_product(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    @Override
    public int compareTo(Brand o) {
        return new String(this.getName()).compareTo(o.getName());
    }
}
