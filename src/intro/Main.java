package intro;

public class Main {
    public static void main(String[] args) {
        String internetSubeButonu ="İnternet Şubeye Gir";

        int vade = 36;
        double dolarDun = 8.15;
        double dolarBugun = 8.18;
        boolean dustuMu = true;

        System.out.println(internetSubeButonu);
        System.out.println("--------------------------");

        if(dolarBugun<dolarDun){
            System.out.println("Dolar Düşük Resmi");
        }

        String[] krediler = {"İhtiyaç Kredisi","Konut Kredisi","Taşıt Kredisi"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        System.out.println("--------------------------");

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println(sayi1);
        System.out.println("--------------------------");

        int[] sayilar1 = {1,2,3,4};
        int[] sayilar2 = {10,20,30,40};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);



    }

}

