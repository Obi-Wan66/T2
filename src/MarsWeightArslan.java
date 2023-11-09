// tum degiskenleri tanimla
public class MarsWeightArslan {
    // İlk değişkenler float tipinde olmali
    float earthWeightArslan = 70.0f; // Dünyadaki kg
    float marsGravityArslan = 0.38f; // Marsın yerçekimi
    // Sonucu saklamak için yeni bir degisken, bu sefer double tipinde
    double marsWeightArslan;
    // Sonucu donusturmek icin yeni bir degisken, int tipinde
    int marsWeightIntArslan;
    // Sonucu donusturmek icin yeni bir degisken, char tipinde
    char marsWeightCharArslan;
    // Hesaplamak için yeni bir degisken, int tipinde
    int marsWeightMathArslan;

    public static void main(String[] args) {
        // Nesne oluşturduk
        MarsWeightArslan mw = new MarsWeightArslan();
        // Marstaki agirligi hesaplayip, Dünyadaki agirligi yercekimi faktoruyle carptik
        mw.marsWeightArslan = mw.earthWeightArslan * mw.marsGravityArslan;
        // Sonucu konsola yazdir, uzunlugunu 4 ondalık basamağa sınırla
        System.out.printf("Mars'taki ağırlığınız %.4f kg%n", mw.marsWeightArslan);
        // Sonucu int tipine donustur ve yeni bir degiskene ata
        mw.marsWeightIntArslan = (int) mw.marsWeightArslan;
        // Sonucu konsola yazdır
        System.out.println("Mars'taki ağırlığınız int olarak " + mw.marsWeightIntArslan);
        // Sonucu char tipine donustur ve yeni bir degiskene ata
        mw.marsWeightCharArslan = (char) mw.marsWeightIntArslan;
        // Sonucu konsola yazdır
        System.out.println("Mars'taki ağırlığınız char olarak " + mw.marsWeightCharArslan);
        // Char tipindeki degisken üzerinde herhangi bir matematik islemi yap ve sonucu yeni bir degiskene ata
        // ornegin, char değerine 10 ekle
        mw.marsWeightMathArslan = mw.marsWeightCharArslan + 10;
        // Sonucu konsola yazdır
        System.out.println("Mars'taki ağırlığınız char olarak 10 arttırıldığında " + mw.marsWeightMathArslan);

        //Sınıfın başında tüm değişkenleri tanımlar.
        //Değişkenler, Dünya’daki ağırlığınız, Mars’ın yerçekimi,Mars’taki ağırlığınız ve bunların farklı veri tiplerine dönüştürülmüş halleridir.
        //Soy adınızı değişkenlerin sonuna eklemek, kodunuzu daha anlaşılır ve takip edilebilir kılar.

        //main metodu içinde, sınıftan bir nesne oluşturur. Bu nesne, sınıfın değişkenlerine ve metodlarına erişmenizi sağlar.

        //Mars’taki ağırlığınızı hesaplamak için, Dünya’daki ağırlığınızı Mars’ın yerçekimiyle çarparsınız.
        // Bu işlemi yapmak için, float tipindeki değişkenleri kullanırsınız.
        // Sonucu, double tipindeki bir değişkene atarsınız. Double tipi, float tipinden daha fazla ondalık basamak tutabilir.

        //Sonucu konsola yazdırmak için, printf metodu kullanırsınız.
        //Bu metod, sonucun uzunluğunu 4 ondalık basamağa sınırlamanızı sağlar. Ayrıca, sonucun yanına “kg” yazarak, birimini belirtirsiniz.

        //Sonucu int tipine dönüştürmek için, cast işlemi yaparsınız.
        //Cast işlemi, bir veri tipini başka bir veri tipine çevirmenizi sağlar.
        //Bu işlem sırasında, ondalık kısım kaybolur. Örneğin, 26.6 sayısını int tipine dönüştürürseniz, 26 elde edersiniz.
        //Sonucu, int tipindeki bir değişkene atarsınız. Sonucu konsola yazdırmak için, println metodu kullanırsınız.
        //Bu metod, sonucun yanına bir satır sonu karakteri ekler.

        //Sonucu char tipine dönüştürmek için, yine cast işlemi yaparsınız. Char tipi, tek bir karakter tutabilen bir veri tipidir.
        //Bu işlem sırasında, int değerinin karşılık geldiği ASCII karakteri elde edersiniz.
        //Örneğin, 65 sayısını char tipine dönüştürürseniz, ‘A’ karakterini elde edersiniz. Sonucu, char tipindeki bir değişkene atarsınız.
        //Sonucu konsola yazdırmak için, yine println metodu kullanırsınız.

        //Char tipindeki değişken üzerinde herhangi bir matematik işlemi yaparsınız. Örneğin, char değerine 10 eklersiniz.
        //Bu işlem sırasında, char değeri int değerine dönüştürülür ve işlem yapılır. Sonucu, int tipindeki bir değişkene atarsınız.
        //Sonucu konsola yazdırmak için, yine println metodu kullanırsınız.
    }
}

