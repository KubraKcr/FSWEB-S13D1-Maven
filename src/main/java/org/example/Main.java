package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        Scanner scanner = new Scanner(System.in);
        System.out.println("genişlik girin: ");
        double width = scanner.nextDouble();

        System.out.println("yukseklik girin: ");
       double height = scanner.nextDouble();

        double sonuc = area(width,height);

        if(sonuc == -1){
            System.out.println("sonuc negatif olamaz");
        }else {
            System.out.println("Dikdortgen alanı : " + sonuc);
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("lutfen yarıcap degerini giriniz: ");
        double radius= scanner1.nextDouble();
        double sonucDaire = radius*radius*Math.PI;
        System.out.println(area(5.0));

        if(sonucDaire == -1 ){
            System.out.println("sonuc negatif ");
        }else{
            System.out.println("daire alanı : " + sonucDaire);
        }
    }



    public static boolean shouldWakeUp(boolean isBarking, int clock) {
     if(isBarking && (clock >= 20 || clock <8) ) {
        return true;
     }
         return false;


    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge <= 19 && firstAge >= 13) ||
                (secondAge <= 19 && secondAge >= 13)||
                (thirdAge <= 19 && thirdAge >= 13)){
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
       if(isSummer &&  (temp >= 25 && temp<= 35)){
        return true;}

        if(!isSummer && (temp >= 35 && temp <= 45)){
           return true;
       }
    return false;

    }

    public static double area(double width, double height) {
      if(width >=0 && height >=0 ){
          return width*height;
      }
        return -1;
    }

    public static double area(double radius) {
     if(radius >= 0){
         return radius*radius*Math.PI;
     }
        return -1;
    }
}
