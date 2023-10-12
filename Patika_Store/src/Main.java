import java.util.*;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PatikaStore patikaStore = new PatikaStore();
        DataCreate dataCreate = new DataCreate(patikaStore);
        PatikaStoreSystem patikaStoreSystem = new PatikaStoreSystem(patikaStore);
        patikaStoreSystem.startShopping();
    }


}