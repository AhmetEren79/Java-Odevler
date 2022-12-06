
import java.util.Scanner;
import jdk.nashorn.tools.ShellFunctions;


public class Ödev2 {
    
    
    public static void main(String[] args) {
        
        /* 
        
                  // SAYININ POZİTİF Mİ NEGATİF Mİ OLDUĞUNU BULMA      ÖDEV 2.1    
        
        Scanner input = new Scanner(System.in);
            
            System.out.println("lütfen bir sayı giriniz.");
            
            int a = input.nextInt();
         
           if(a>0){
            
            System.err.println("a = pozitiftir...");
             }
        
           else if(a==0){
            
               System.out.println("a = sıfıra eşittir");   
            }
             
           else{
               
               System.out.println("a = negatiftir...");
           }
        
             */
        
             
        
        /*
                  //  HAFTANIN GÜNLERİ    ÖDEV 2.2
        
              Scanner input = new Scanner(System.in);
              
              System.out.println("Lütfen bir 1 ile 7 arasında bir sayı giriniz..."); 
              int gün = input.nextInt();
              
              System.out.println("********************************");
              
              if (gün==1 ) { 
                  System.out.println("Bugün Pazartesi...");
               }
              else if (gün==2){
                  
                  System.out.println("Bugün Salı...");
              }
        
              else if (gün==3){
                  
                  System.out.println("Bugün Çarşamba...");
              }
                
              else if (gün==4){
               
                  System.out.println("Bugün Perşembe....");
              }
              
              else if (gün==5){
                  
                  System.out.println("Bugün Cuma");            
              }
                   
              else if (gün==6){
                  
                  System.out.println("Bugün Cumartesi");
              }
        
              else if (gün==7){
                  
                  System.out.println("Bugün Pazar");
              }
        
              else {
                  
                  System.out.println("Lütfen geçerli bir sayı giriniz...");
              }
        
                 */
        
        
        
               /*
                   // EŞKENAR ÇEŞİTKENAR İKİZKENAR      ÖDEV 2.3
        
             Scanner input = new Scanner(System.in);
             
               System.out.println("lütfen bütün kenarları giriniz");
               
               int kenar1 = input.nextInt();
               int kenar2 = input.nextInt();
               int kenar3 = input.nextInt();
               
        
               if (kenar1==kenar2 || kenar2==kenar3 || kenar3==kenar1) {
                   System.out.println("Bu Üçgen bir İKİZKENARDIR...");
                 }
        
               else if (kenar1==kenar3 && kenar2==kenar3) { 
                   System.out.println("Bu Üçgen bir EŞKENARDIR...");
            
              }
        
               else{
                   System.out.println("Bu Üçgen bir ÇEŞİTKENARDIR...");
               }
        
               */
        
             
               /*
                   //    FAKTÖRİYEL HESABI     ÖDEV 2.4
               
               Scanner input = new Scanner(System.in);
               
               System.out.println("Bir sayı giriniz...");
               int sayi = input.nextInt();
               
               int toplam = 1;
             
               while(sayi>0){
                   
                   toplam =toplam*sayi;
                   
                    sayi--;
               }
               
               System.out.println("Toplam = "+toplam);
                 */
        
               
               
               //     GİRİLEN SAYIYA KADAR OLAN TEK SAYILARIN TOPLAMI   ÖDEV 2.5
                  /*
               
                   Scanner input = new Scanner(System.in);
                   System.out.println("Lutfen bir sayi giriniz...");
                 int sayi = input.nextInt();
                 int toplam = 0;
                 
                for (int i = 1; i <= sayi;i++) {
                   if (i%2 == 1) {
                      toplam = toplam+i;
                   }
                } System.out.println("Toplam = "+toplam);
 
                        */
             
                  //   GİRİLEN SAYIYA KADAR OLAN SAYILARIN TOPLAMI      ÖDEV 2.6
                /*  
                   Scanner input = new Scanner(System.in);
              System.out.println("Lütfen bir sayı giriniz.");
              int sayi = input.nextInt();
              int karelerintoplami = 0;
              int a = 0 ;
               while(a<=sayi){
                 int karesi = a*a;
                karelerintoplami += karesi;
                 a= a + 1;
              }
             System.out.println("kareler toplamı = "+karelerintoplami);
                        */

                
                
                
                    // ÇARPMA İŞLEMİNİ FARKLI BİR ŞEKİLDE YAPMA     ÖDEV 2.7
                  /*
                    Scanner input = new Scanner(System.in);
                 System.out.println("Lütfen ilk sayıyı giriniz.");
                 int sayi1=input.nextInt();
                 System.out.println("Lütfen ikinci sayıyı giriniz.");
                 int sayi2 = input.nextInt();
                 int carpim = 0;
                 
                  while(sayi2>0){
                   carpim = carpim + sayi1;
                   sayi2 -= 1;
                  }
                 System.out.println("Carpma islemi = "+carpim);   
                        */
                  
                  
                  
                  
               
               
               
               
               
               
               
               
               
        
    }
}
