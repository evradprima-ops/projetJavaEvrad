public class TestVoiture {
 public static void main(String[] args) {
        Voiture V1 = new Voiture("toyota ", "bleu ", "Rav4 ", 120);
        Voiture V2 = new Voiture("lamborgini ", "rouge ","urus " , 240);
     
        V2.info(); 
        V1.accelerer(20);
        V1.info();

    }
     
}
