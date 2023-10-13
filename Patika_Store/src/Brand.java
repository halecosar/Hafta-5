import java.util.*;

public class Brand implements Comparable<Brand> {
    private int id;
    private String name;
    private static TreeSet<Brand> brands = new TreeSet<>();

    static {
        brandCreate();
    }

    public static void brandCreate() {
        brands.add(new Brand(1, "Apple"));
        brands.add(new Brand(2, "Samsung"));
        brands.add(new Brand(3, "Lenovo"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void printBrands() {
        System.out.println("Markalar ");
        for (Brand brand : brands) {
            System.out.println(brand.id + " " + brand.getName());
        }
        System.out.println("----------------------------");
    }

    public static Brand getBrand(int id) {
        for (Brand b : brands) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public int compareTo(Brand o) {
        return new String(this.getName()).compareTo(o.getName());
    }
}



