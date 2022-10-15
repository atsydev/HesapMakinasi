package Uygulamalar;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int sayi1,sayi2,islem;

        Scanner scan=new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1=scan.nextInt();
        System.out.print("Ikinci sayıyı giriniz: ");
        sayi2= scan.nextInt();
        System.out.println("1-Carpma\n2-Bolme\n3-Toplama\n4-Cıkarma");
        System.out.print("Yapmak istediğiniz islemi giriniz: ");
        islem= scan.nextInt();

        switch (islem){
            case 1:
                System.out.println("SONUC: "+ (sayi1*sayi2));
                break;
            case 2:
                switch (sayi2){
                    case 0:
                        System.out.println("Sayı sıfıra bolunemez");
                        break;
                    default:
                        System.out.println("SONUC: " + (sayi1/sayi2));
                }
                break;
            case 3:
                System.out.println("SONUC: "+ (sayi1+sayi2));
                break;
            case 4:
                System.out.println("SONUC: "+ (sayi1-sayi2));
                break;
            default:
                System.out.println("Hatalı Bilgi girdiniz");

        }

        /*
        if(islem==1){
            System.out.println("SONUC: "+ (sayi1*sayi2));
        } else if (islem==2){
            System.out.println("SONUC: "+ (sayi1/sayi2));
        } else if (islem==3){
            System.out.println("SONUC: "+ (sayi1+sayi2));
        } else if (islem==4){
            System.out.println("SONUC: "+ (sayi1-sayi2));
        } else {
            System.out.println("Hatalı Bilgi girdiniz");
        }

        */

    }
}

