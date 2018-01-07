


import java.util.HashMap;

public class sasa {


    public static void main(String[] args) {
        HashMap<String,String> yeniHasmap = new HashMap<>();
        
        //isEmpty() 
        //Hashmap in içinin boş olup olmadığını kontrol eder
        //Hashmap boş ise true değer dönderir.
        System.out.println(yeniHasmap.isEmpty());
        
        //put(key,value)
        //Hashmape yeni değer eklemek için kullanılır
        //key,value anahtar ve değeri ilişkilendirerek ekleme yapar
        //anahtar değerleri benzersiz olmalıdır
        //aynı anahtar ile ikini bir kayıt yapılırsa son yapılan değeri görür
        yeniHasmap.put("isim", "Emre");
        yeniHasmap.put("soyisim", "KAYA");
        yeniHasmap.put("yas", "25");
        yeniHasmap.put("yas", "29");
        
       
        //get(key)
        //Hashmap te anahtar ile eşleşen değeri dönderir;
        //anahtar ile eşleşen deer yoksa null dönderir.         
        String isim=yeniHasmap.get("isim");
        String yas = yeniHasmap.get("yas");
        String memleket=yeniHasmap.get("memleket");
        
        System.out.println(isim);
        System.out.println(yas);
        System.out.println(memleket);
        
        //keySet()
        //HashMapin içinde bulunan anahtar değerlerini dizi olarak dönderir
        System.out.println(yeniHasmap.keySet());
        
        //entrySet()
        //anahtar ve değer eşleşmelerinin hepsisini dizi olarak dönderir
        System.out.println(yeniHasmap.entrySet());
        
        //size()
        //HashMapdeki ekli olan eleman sayısını dönderir
        int ElemanSayisi=yeniHasmap.size();
        System.out.println("Eleman Sayısı : " + ElemanSayisi);
        
        
        
        HashMap<Integer,String> isimler = new HashMap<>();
        isimler.put(1, "Emre");
        isimler.put(2, "Ali");
        isimler.put(3, "Leyla");
        isimler.put(6, "Ayşe");
        isimler.put(150, "Kamil");
        
         
        //Hashmapden değer silme 
        //remove(key)
        //belirtilen anahtarda değer varsa onu siler
        isimler.remove(3);
        isimler.remove(85);
        System.out.println("İsimler : " + isimler.entrySet());
        
        //remove(kay,value)
        //belirtilen anahtar ve değer uyuşuyorsa siler 
        isimler.remove(149, "Kamil");
        isimler.remove(1,"Ahmet");
        isimler.remove(6,"Ayşe");
        System.out.println("İsimler : " + isimler.entrySet());
        
        //HashMap Komple Silme
        //clear()
        isimler.clear();
        System.out.println("İsimler : " + isimler.entrySet());
        
        
        //HashMap de anahtar daha önce girilmiş mi?
        //containsKey(key);
        HashMap<String,String> kisi = new HashMap<>();
        kisi.put("isim", "Ali");
        kisi.put("soyisim", "Bilirim");
        System.out.println(kisi.containsKey("isim"));
        System.out.println(kisi.containsKey("yas"));
        
        //Hashmap daha önce böyle bir değer girilmiş mi
        //containsValue(value);
        System.out.println(kisi.containsValue("Emre"));
        System.out.println(kisi.containsValue("Ali"));
        
        
        
        
    }
}
