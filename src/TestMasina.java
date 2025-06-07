public class TestMasina {
    String marca;
    String culoare;
    int anProducere;
    int kilometraj;

    public static void main(String[] args) {

        TestMasina masina1 = new TestMasina();
        TestMasina masina2 = new TestMasina();

        masina1.marca       = "KIA";
        masina1.culoare     = "Neagra";
        masina1.anProducere = 2010;
        masina1.kilometraj  = 175000;

        masina2.marca       = "BMW";
        masina2.culoare     = "Rosie";
        masina2.anProducere = 2011;
        masina2.kilometraj  = 17500;
        System.out.println(masina1.anProducere);

    }

}
