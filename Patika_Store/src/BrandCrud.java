import java.util.TreeSet;

public class BrandCrud {
    TreeSet<Brand> brn; // constructor injection uygulandı.

    public BrandCrud() {
        this.brn = new TreeSet<>();
    }

    public Brand addBrand(String name) {
        int id = brn.size();
        Brand resultBrand = new Brand(id, name);
        brn.add(resultBrand);
        return resultBrand;
    }

    public TreeSet<Brand> getBrandlist() {
        return this.brn;
    }

    public Brand getBrand(String name) {
        for (Brand b : this.brn) {
            if (b.getName().equals(name)) {
                return b;
            }
        }

        return null;
    }

    public Brand getBrandbyID(int id) {
        for (Brand b : this.brn) {
            if (b.getId() == id) {
                return b;
            }
        }

        return null;
    }
}
