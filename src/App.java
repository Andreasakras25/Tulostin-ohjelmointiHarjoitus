public class App {
    public static void main(String[] args) throws Exception {

        // Printtaa ohjelman "Hei olen Tulostin-ohjelma ja ohjelman tekijän"
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä: ");
 
        // Määritetään String value "opiskelija" ja printataan kyseinen value
        String tekijä = "opiskelija";
        System.out.println(tekijä);
        
        // Doublen avulla saadaan luvut desimaalin tarkkuudelle
        double luku1 = 5;
        double luku2 = 2;
 
        // Määritetään muuttuja "tulo", kertoo luku1 ja luku2
        double tulo;
        tulo = luku1*luku2;
 
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);
        
        // Printtaa "tulo" muuttujasta saadun tuloksen
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);

        // Määritetään summa, jako ja erotus muuttujat (eivät ole käytössä)
        double summa = luku1 + luku2;
        double jako = luku1/luku2;
        double erotus = luku1-luku2;
    }
}