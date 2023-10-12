public class DataCreate {
    PatikaStore patikaStore;

    public DataCreate(PatikaStore patikaStore) {
        this.patikaStore= patikaStore;
        patikaStore.addBrand("Apple");
        patikaStore.addBrand("Samsung");
        patikaStore.addBrand("Lenovo");
        patikaStore.addBrand("Huawei");
        patikaStore.addBrand("Casper");
        patikaStore.addBrand("HP");
        patikaStore.addBrand("Xiaomi");
        patikaStore.addBrand("Monster");
//protype 1= notebook, 2= phone
        Phone phone = new Phone(2,"SAMSUNG GALAXY A51","3199.0 TL","%10","6","6.5","10 Adet","128 GB","4000.0","Siyah"   );
        patikaStore.addProduct("Samsung",phone);

        Notebook notebook = new Notebook(1,"HUAWEI Matebook 14","7000.0 TL","%5","16","14,0","3","512");
        patikaStore.addProduct("Huawei",notebook);

    }

}