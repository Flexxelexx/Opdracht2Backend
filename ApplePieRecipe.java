public class ApplePieRecipe {

    Ingredient boter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient suiker = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalsuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "eetlepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

//    Ingredient[0] = new Ingredient(200, "gram", "ongezouten roomboter");
//    Ingredient[1] = new Ingredient(200, "gram", "witte bastard suiker");
//    Ingredient[2] = new Ingredient(400, "gram", "zelfrijzend bakmeel");
//    Ingredient[3] = new Ingredient(1, "stuk(s)", "ei");
//    Ingredient[4] = new Ingredient(8, "gram", "vanillesuiker");
//    Ingredient[5] = new Ingredient(1, "snuf", "zout");
//    Ingredient[6] = new Ingredient(1.5, "kilo", "zoetzure appels");
//    Ingredient[7] = new Ingredient(75, "gram", "kristal suiker");
//    Ingredient[8] = new Ingredient(3, "eetlepels", "kaneel");
//    Ingredient[9] = new Ingredient(15, "gram", "paneermeel");

    public void verwarmOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }

    public void klopEi() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mengAlles() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void schilAppels() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void vetSpringvorm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void vulEneHelft() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void vulAndereHelft() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void rolEnSnij() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void decoreerTaart() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void bakTaart() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printIngredient() {
        System.out.println(boter.getAmount() + " " + boter.getUnit() + " " + boter.getName());
        System.out.println(suiker.getAmount() + " " + suiker.getUnit());
    }


//    @Override
//    public static String toString() {
//        verwarmOven();
//        klopEi();
//        mengAlles();
//        schilAppels();
//        vetSpringvorm();
//        vulEneHelft();
//        vulAndereHelft();
//        rolEnSnij();
//        decoreerTaart();
//        bakTaart();
//        return toString();
//    }

}