Patika - Collection ile Kitap Sıralama Pratiği  / Hafta5

HashMap kullanarak çözebilirsiniz. 

İpucu 1: Öncelikle, metni kelimelere ayırmanız gerekecek. Bu işlemi yapmak için `String` sınıfının `split` metodunu kullanabilirsiniz.

İpucu 2: Kelimeleri saymak için bir veri yapısı kullanmanız gerekiyor. `HashMap` bunun için iyi bir seçenek olabilir. HashMap, key-value çiftlerini saklar. Burada key kelimeler, value ise o kelimenin metinde kaç kere geçtiği olabilir.

İpucu 3: Kelimeleri döngüyle tek tek dolaşıp her birini `HashMap`'e ekleyin. Eğer kelime `HashMap`'de zaten varsa, count'u bir artırın. Eğer yoksa, kelimeyi `HashMap`'e ekleyip count'u 1 olarak belirleyin.

İpucu 4: Son olarak, `HashMap`'i dolaşıp en yüksek count değerine sahip kelimeyi bulun. Bu kelime metinde en çok geçen kelime olacaktır.

