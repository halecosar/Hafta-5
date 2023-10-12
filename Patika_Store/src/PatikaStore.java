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
            System.out.println("- " + brand.getName());
        }
        System.out.println();
    }

    private int lastID = 0;

    public void addProduct(String brandName, Product product) {
        Brand brand = brandCrud.getBrand(brandName);
        if (brand != null) {
            product.setProductId(lastID++);
            brand.addProduct(product);
        }
    }

    public void listProducts(int productType) {
        TreeSet<Brand> brands = brandCrud.getBrandlist();

        for (Brand brand : brands) {
            for (Product product : brand.get_product()) {
                if (product.getProductType() == productType)
                    System.out.println(product.getProductName());
            }
        }

    }


}
