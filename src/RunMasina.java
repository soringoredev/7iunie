public class RunMasina {
    public static void main(String[] args) {

        Masina masina1 = new Masina();
        Masina masina2 = new Masina();

        masina1.marca       = "KIA";
        masina1.culoare     = "Neagra";
        masina1.anProducere = 2010;
        masina1.kilometraj  = 175000;

        masina2.marca       = "BMW";
        masina2.culoare     = "Rosie";
        masina2.anProducere = 2011;
        masina2.kilometraj  = 17500;

        masina1.accelereaza();
        masina1.franeaza();


        masina2.accelereaza();
        masina2.franeaza();

    }
}
