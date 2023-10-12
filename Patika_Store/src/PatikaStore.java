import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.*;

public class PatikaStore {
    private BrandCrud brandCrud;

    public PatikaStore() {
        brandCrud = new BrandCrud();
    }

    public BrandCrud getBrandCrud() {
        return brandCrud;
    }

    public void setBrandCrud(BrandCrud brandCrud) {
        this.brandCrud = brandCrud;
    }

    public void addBrand(String brandName) {
        brandCrud.addBrand(brandName);
    }

    public void listBrands() {
        TreeSet<Brand> brands = brandCrud.getBrandlist();
        System.out.println(" Markalar ");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println(brand.getId() + " - " + brand.getName());
        }
        System.out.println();
    }

    public String getBrandbyID(int id) {
        Brand brand = brandCrud.getBrandbyID(id);
        if (brand != null) {
            return brand.getName();
        }
        return "";
    }

    private int ID = 1;

    public void addProduct(String brandName, Product product) {
        Brand brand = brandCrud.getBrand(brandName);
        if (brand != null) {
            product.setProductId(ID++);
            brand.addProduct(product);
        }
    }

    public void listProducts(int productType) {
        TreeSet<Brand> brands = brandCrud.getBrandlist();

        for (Brand brand : brands) {
            for (Product product : brand.get_product()) {
                if (product.getProductType() == productType) {
                    System.out.format("| " + String.valueOf(product.getProductId()) + " | ");
                    System.out.format(product.getProductName() + " | ");

                }
            }
        }

    }


}
