public class AdapterTest {
    public static void main(String[] args) {
    Dengen dengen;
    dengen = new AcAdapter();
    int denatsu = dengen.kyuuden();
    System.out.println( denatsu + "V で給電されています" );
    }
}

class Dengen { // Targetクラス
    public int kyuuden(); // request()メソッド
}

class JapaneseConsent implements Dengen { ///Adaptee
    @Override
    public int power(){
        return 100;
    }
    public int kyuuden2(){
        return (int)(power()*0.16);
    }
}


class AcAdapter extends AdapterTest { ///Adapter
    private JapaneseConsent
    public int kyuuden(){
        return JapaneseConsent.kyuuden2();
    }
}