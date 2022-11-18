import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1,n2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayiyi Girin: ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayiyi Girin: ");
        n2 = input.nextDouble();

        System.out.print("Toplam 1\nÇıkarma 2\nÇarpma 3\nBölme 4\n");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select){

            case 1:
                double toplam;
                toplam = (n1+n2);
                System.out.print("Sonuç: "+ toplam);
                break;

            case 2:
                double cikarma;
                cikarma = (n1-n2);
                System.out.println("Sonuç: "+ cikarma);
                break;

            case 3:
                double carpma;
                carpma = (n1*n2);
                System.out.println("Sonuç: "+ carpma);
                break;

            case 4:
                double bolme;
                bolme = (n1/n2);
                System.out.println("Sonuç: "+ bolme);
                break;

            default:
                System.out.println("Yanlış Bir Seçim Yaptınız");
                break;
        }


    }
}