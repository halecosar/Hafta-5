import java.util.Scanner;

public class PatikaStoreSystem {
    PatikaStore patikaStore;

    public PatikaStoreSystem(PatikaStore patikaStore) {
        this.patikaStore = patikaStore;
    }

    public void startShopping() {
        System.out.println("PatikaStore Ürün Yönetim Paneli ! 1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele \n" +
                "0 - Çıkış Yap");

        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();
        switch (select) {
            case 1:
                patikaStore.listProducts(1);
                break;
            case 2:
                patikaStore.listProducts(2);
                break;
            case 3:
                patikaStore.listBrands();
                break;

        }

    }

}
