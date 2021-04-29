public class workDay1 {
    public static void main(String[] args) {

        String internetSubeButonu = "İnternet Şubesi";

        double dolarDun = 8.20;
        double dolarBugun = 8.20;

        int vade = 36;

        boolean dustuMu = false;

        System.out.println(internetSubeButonu);

        if (dolarBugun < dolarDun) {
            System.out.println("Dolar düştü resmi");
        } else if (dolarBugun > dolarDun) {
            System.out.println("Dolar yükseldi resmi");
        } else {
            System.out.println("Dolar eşittir resmi");
        }

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Emekli Kredisi";
        String kredi3 = "Konut Kredisi";
        String kredi4 = "Çiftçi Kredisi";
        String kredi5 = "MSB Kredisi";
        String kredi6 = "MEB Kredisisi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        System.out.println(kredi6);

        String[] krediler = {
                "Hızlı Kredi",
                "Emekli Kredisi",
                "Konut Kredisi",
                "Çiftçi Kredisi",
                "MSB Kredisi",
                "MEB Kredisisi"
        };

        for (String kredi : krediler) {
            System.out.println(kredi);
        }

        for (int i = 0; i < krediler.length; i ++) {
            System.out.println(krediler[i]);
        }

    }
}