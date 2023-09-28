package Letcode;

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        int age, km, flightchoice;
        double price = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yolculuk mesafenizi km türünden giriniz.");
        km = sc.nextInt();
        System.out.println("Lütfen Yaşınızı giriniz");
        age = sc.nextInt();

        System.out.println("Lütfen Yolculuk Tipini seçiniz.\n1-Tek Yön\n2-Gidiş Dönüş");
        flightchoice = sc.nextInt();
        if (age < 0 || km < 0 || flightchoice != 1 && flightchoice != 2) {
            System.out.println("Hatalı Veri Girdiniz");

        } else {
            price = km * (0.10);

            if (age < 12) {
                price -= price*(0.50);
            } else if (age > 12 && age < 24) {

                price -= price*(0.10);
            } else if (age > 65) {
                price -= price*(0.30);
            }

            if (flightchoice == 2) {
                price*=2;
                price -= price*(0.20);
            }
        }
        System.out.println("Toplam Bilet Tutarı: "+price+" TL");
    }
}
