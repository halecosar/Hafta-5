import java.util.Scanner;

public class PatikaStoreSystem {
    PatikaStore patikaStore;
    Scanner scan;

    public PatikaStoreSystem(PatikaStore patikaStore) {
        this.patikaStore = patikaStore;
        scan = new Scanner(System.in);
    }

    public void startShopping() {
        System.out.println("PatikaStore Ürün Yönetim Paneli:\n" +
                "1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele \n" +
                "0 - Çıkış Yap");

        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();
        switch (select) {
            case 1:
                noteBook();
                break;
            case 2:
                phone();
                break;
            case 3:
                patikaStore.listBrands();
                break;

        }

    }

    public void noteBook() {
        System.out.println("Notebook Yönetim Paneli:\n" +
                "1 - Notebook Listeleme\n" +
                "2 - Notebook ekleme\n" +
                "3 - Notebook Silme \n" +
                "4 - Notebook Filtreleme \n" +
                "0 - Ana menüye dön");

        int select = scan.nextInt();
        switch (select) {
            case 1:
                patikaStore.listProducts(1);
                break;
            case 2:
                addNotebook();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                break;
            case 0:
                startShopping();
                break;
            default:
                startShopping();

        }


    }

    public void phone() {
        System.out.println("Telefon Yönetim Paneli:\n" +
                "1 - Telefon Listeleme\n" +
                "2 - Telefon ekleme\n" +
                "3 - Telefon Silme \n" +
                "4 - Telefon Filtreleme \n" +
                "0 - Ana menüye dön");

        int select = scan.nextInt();
        switch (select) {
            case 1:
                patikaStore.listProducts(2);
                break;
            case 2:
                addPhone();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                break;
            case 0:
                startShopping();
                break;
            default:
                startShopping();

        }

    }

    public void addPhone() {
        String brandName = "";

        while (brandName == "") {
            System.out.println("Ürün markasını seçiniz :");
            patikaStore.listBrands();
            int selectedBrand = scan.nextInt();
            brandName = patikaStore.getBrandbyID(selectedBrand);
        }


        System.out.println("Ürün adını giriniz :");
        String productName = scan.nextLine();
        scan.nextLine();
        System.out.println("Ürün fiyatını giriniz :");
        String productPrice = scan.nextLine();
        System.out.println("Ürünün indirim oranını giriniz :");
        String productDis = scan.nextLine();
        System.out.println("Ürün RAM'ini giriniz :");
        String productRam = scan.nextLine();
        System.out.println("Ürünün ekran boyutunu giriniz :");
        String productSize = scan.nextLine();
        System.out.println("Ürünün stok bilgisini giriniz :");
        String productStok = scan.nextLine();
        System.out.println("Ürünün rengini giriniz :");
        String productColor = scan.nextLine();
        System.out.println("Ürünün hafızasını giriniz :");
        String productMemory = scan.nextLine();
        System.out.println("Ürünün pil gücünü giriniz :");
        String productBattery = scan.nextLine();


        Phone phone = new Phone(2, productName, productPrice, productDis, productRam, productSize, productStok, productMemory, productBattery, productColor);
        patikaStore.addProduct(brandName, phone);
        System.out.println("Ürün eklenmiştir önceki menüye yönlendiriliyorsunuz.");
        phone();

    }

    public void addNotebook() {
        String brandName = "";

        while (brandName == "") {
            System.out.println("Ürün markasını seçiniz :");
            patikaStore.listBrands();
            int selectedBrand = scan.nextInt();
            brandName = patikaStore.getBrandbyID(selectedBrand);
        }


        System.out.println("Ürün adını giriniz :");
        String productName = scan.nextLine();
        scan.nextLine();
        System.out.println("Ürün fiyatını giriniz :");
        String productPrice = scan.nextLine();
        System.out.println("Ürünün indirim oranını giriniz :");
        String productDis = scan.nextLine();
        System.out.println("Ürün RAM'ini giriniz :");
        String productRam = scan.nextLine();
        System.out.println("Ürünün ekran boyutunu giriniz :");
        String productSize = scan.nextLine();
        System.out.println("Ürünün stok bilgisini giriniz :");
        String productStok = scan.nextLine();
        System.out.println("Ürünün rengini giriniz :");
        String productStorage = scan.nextLine();


        Notebook notebook = new Notebook(2, productName, productPrice, productDis, productRam, productSize, productStok, productStorage);
        patikaStore.addProduct(brandName, notebook);
        System.out.println("Ürün eklenmiştir önceki menüye yönlendiriliyorsunuz.");
        noteBook();

    }

    public void deleteProduct() {
        String brandName = "";

        while (brandName == "") {
            System.out.println("Ürün markasını seçiniz :");
            patikaStore.listBrands();
            int selectedBrand = scan.nextInt();
            brandName = patikaStore.getBrandbyID(selectedBrand);
        }


        System.out.println("Silinecek ürünün ID'sini giriniz :");
        int productId = scan.nextInt();
        patikaStore.remove(brandName, productId);
    }

}
