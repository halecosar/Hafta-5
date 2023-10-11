import java.util.*;


public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen metin giriniz");
        String text = scan.nextLine();
        String[] spl = text.split(" ");

        //Kelimeler döngüyle tek tek dolaşılıp her biri Hashmap'e eklendi. Kelime daha önce eklenmişse value değeri 1 artırıldı.
        for (String i : spl) {
            if (wordCounter.containsKey(i)) {
                int value = wordCounter.get(i);
                wordCounter.put(i, value + 1);
            } else {
                wordCounter.put(i, 1);
            }
        }

        int v = 0;
        String k = "";
        // foreach ile wordCounter dönüldü en çok tekrar edilen kelime bulundu.
        for (Map.Entry<String, Integer> set : wordCounter.entrySet()) {
            if (v < set.getValue()) {
                v = set.getValue();
                k = set.getKey();
            }
        }

        System.out.println();
        System.out.println("Girdiğiniz metin içerisinde en çok tekrar eden kelime : " + k);


    }


}