
import java.util.Scanner;


public class Ödev5 {
    public static void main(String[] args) {
        
        //       ASAL ÇARPANLARINI BULMA
        /*
         Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz..."); 
        int sayi = input.nextInt();
        int b = 2;
        
        while (sayi>1) {            
            if (sayi%b ==0) {
                System.out.println("sayi = "+b);
                sayi /= b; 
            }
             b++;
        }
            */
        
        
        
        
                  //   CHEN ASALI
                 /* 
                 Scanner input = new Scanner(System.in);
               System.out.println("Bir sayi giriniz...");
               int sayi = input.nextInt();
               int sayac = 0;
               
               for (int i = 2; i < sayi; i++) {
                   if (sayi%i == 0) {  // Sayi asallaigi kontrol edilir
                       sayac++;
                   }
               }
               for (int i = 2; i < sayi; i++) {
                   if ((sayi+2)%i== 0) { // Sayinin 2 fazlasının asalligi kontrol edilir
                     sayac++;
                   }
               }
                 if (sayac == 0) {
                   System.out.println("Bu sayi bir Chen Asalidir...");
                 }
                       */
                 
                 
                 
                 
                 
               //   DOST SAYILAR
          /*
            Scanner input = new Scanner(System.in);
           System.err.println("Birinci sayiyi giriniz..."); 
           int sayi1 = input.nextInt();
           System.out.println("İkinci sayiyi giriniz...");
           int sayi2 = input.nextInt();
           
           int tsayi1 = 0;
           int tsayi2 = 0;
           
              for (int i = 1; i < sayi1-1; i++) {
                  if (sayi1%i == 0 ) {  
                      tsayi1 = tsayi1+i;
                  }
              }
               for (int j = 1; j < sayi2-1; j++) {
                     if (sayi2%j == 0) {
                         tsayi2 = tsayi2+j;
                     }
               }
                if (tsayi1 == sayi2 && tsayi2 == sayi1) {  // Esitlik kontrol edilir
                    System.out.println("Sayilar bir dost sayidir...");
                } 
                else {
                    System.out.println("Sayilar bir dost sayisi deildir...");
                }
                   */
        
          
          
          
                   // ARİFMETİK SAYİ OLDÜĞÜNÜ BULMA
                  /*
                 Scanner input = new Scanner(System.in);
                System.out.println("Bir sayi giriniz...");
                int sayi = input.nextInt();
                int sayac = 0;
                int toplam = 0;
                
                for (int i = 1; i <= sayi; i++) {
                    if (sayi%i ==0) {
                      toplam += i;
                      sayac++;
                    }
                }
                  if (toplam%sayac == 0) {
                      System.out.println("Bu sayi bir Arifmetik Sayidir...");
                  }
                  else{
                      System.out.println("Bu sayi Arifmetik Sayi deildir...");
                  }
                       */
        
        
          
          
          
          
          
          
          
          
          
          
          
    }
}
