
import java.util.Scanner;


public class Ödev3 {
    
    
    public static void main(String[] args) {
        
        
                 // METREYİ DİĞER CİNSLERDE YAZMA         ÖDEV 3.1
       /*         
         Scanner input = new Scanner(System.in);
        
        String degerler = "1.İşlem = Milimetre\n"
                        + "2.İşlem = Santimetre\n"
                        + "3.İşlem = Dekametre\n"
                        + "4.İşlem = Kilometre\n";
        
          System.out.println("***************************");
          System.out.println(degerler);
          System.out.println("***************************");
          
          System.out.println("Lütfen bir işlem seçiniz...");
          int secenek = input.nextInt();
          System.out.println("Lütfen bir sayı giriniz...( METRE CİNSİNDEN )");
          int sayi = input.nextInt();
          int yeni_deger = 0;
          while (true) {
              
              if (secenek == 1) {
                  yeni_deger = sayi*1000;
                  System.out.println(sayi+" Metre = "+yeni_deger+" Milimetredir...");
                 break;
                 }
              else if (secenek == 2) {
                  yeni_deger = sayi*100;
                  System.out.println(sayi+" Metre = "+yeni_deger+" Santimetredir...");
                 break;
              }
              else if (secenek == 3) {
                  yeni_deger = sayi*10;
                  System.out.println(sayi+" Metre = "+yeni_deger+" Dekametredir...");
                 break;
              } 
              else if (secenek == 4) {
                  yeni_deger = sayi/1000;
                  System.out.println(sayi+" Metre = "+yeni_deger+" Kilometredir...");
                 break;
              }
              else{
                  System.out.println("Geçersiz işlem...");
                 break;
               }
              
            }
                */
        
          
          
          
                  // GİRİLEN SAYININ TERSİNİ YAZMA       ÖDEV 3.2
            /*
              Scanner input = new Scanner(System.in);
              
              System.out.println("Lütfen bir sayı giriniz...");
              int a = input.nextInt();
              int b = 0;
              int k = 0;
              while (true) {   
                  
                  if (a>0) {
                     k = a%10;
                     b = b*10+k;
                     a=a/10; 
                  continue;
                  }
               System.out.println("Sayınız = "+b);
               break;
              }
               */
          
           
               
                      // HANGİ SAYILARA BÖLÜNÜYOR BULMA     ÖDEV 3.3     
                /*     
                 Scanner input = new Scanner(System.in);
                 
                 System.out.println("Lütfen bir sayı giriniz...");
                 int sayi = input.nextInt();
             
                  for (int i = 1; i<=sayi ; i++) {
                    
                      if (sayi %i == 0 ) {
                          
                          System.out.println("Bölenler = "+i);
                           }
                         }
                           */
          
                           
         // GİRİLEN SAYINI TEK,ÇİFT VE BÜTÜN SAYILARININ TOPLAMINI GÖSTERE PROGRAM   ÖDEV 3.4
                  /*
                    Scanner input = new Scanner(System.in);
                    
                   System.out.println("Lütfen bir sayı giriniz...");   
                   int sayi = input.nextInt();
                    
                    int tek_toplam = 0;
                    int cift_toplam = 0;
                    
                    for (int i = 0; sayi>=i ; i++) {
                     
                        if (i%2 ==0) {
                            
                            cift_toplam = cift_toplam+i;
                        }
                        else{
                            tek_toplam = tek_toplam+i;
                        }
                   } 
                         System.out.println("Çiftlerin toplamı = "+cift_toplam);
                         System.out.println("Teklerin toplamı = "+tek_toplam);
                         System.out.println("Bütün sayıların toplamı = "+(tek_toplam+cift_toplam));         
                      */
                      
                      
                     
                      
                      
                      
                      
                      
                      
                      
          
              }
           }
