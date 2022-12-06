import java.util.Random;
import java.util.Scanner;


public class Ödev6 {
    
    
    public static void main(String[] args) {
        
        
        
                   //     Maclaurin Serisi    ********             6.69
            /*
          Scanner input = new Scanner(System.in);
        System.out.println("Lutfen aci degerini giriniz...");
        double aci = input.nextInt();
        System.out.println("Lutfen bir terim sayisi giriniz");
        int terim = input.nextInt();
        
        double T =1;
        int is = 1;
        double X = Math.toRadians(aci);
          for (int i = 0; i < terim-1; i++) {
            double F =1;
              for (int j = 0; j < 2*i; j++) {
                  F*=j;
                  is*=-1;
                  T =T +is*Math.pow(X,2*i);     
              }        
          }
             System.out.println("Seri acilimi ile hazırlanan deger "+T);
             System.out.println("Komutla hazırlanan deger "+Math.cos(X));
               */
            
            
            
            
                    //  Sayı Tahmin etme (1 ile 100) arası           6.72
            /*
              Scanner input = new Scanner(System.in);
              Random rastgele = new Random();
            System.out.println("Tahmin ettiginiz sayiyi giriniz...");
            int tahmin = rastgele.nextInt(100)+1;
            int sayac = 0;
            int Tahmin;
            do{
                sayac++;
                 Tahmin = input.nextInt();
                if (Tahmin < tahmin) {
                    System.out.println("Daha buyuk bir sayi giriniz...");
                }
                else if (Tahmin > tahmin) {
                    System.out.println("Daha kucuk bir sayi giriniz...");
                }
                else {
                    System.out.println(sayac+" denemede "+tahmin+" sayısını dogru tahmin ettiniz...");
                 break;
                }
                
            }while (Tahmin>0 && Tahmin<100);           
              */
            
            
            
            
                      /*     //    ALTIN ORAN                     6.83
                    Scanner input = new Scanner(System.in);
                  System.out.println("Bir uzunluk giriniz...");  
                  double ab = input.nextInt();
                  double cb;
                  double ac;
                  
                  cb = 2*ab/(1+Math.sqrt(5));
                  ac = ab-cb;
                  
                  System.out.println(ac+" "+cb);
                  */
                  
                      
                      
                      
                  //       ALTIN ÜÇGEN                            6.84
                    /*
                   Scanner input = new Scanner(System.in);
                 System.out.println("Kisa kenari girinizi...");
                 int kisa = input.nextInt();
                 int b;
                 
                 b= kisa*(1+5^(1/2)/2);
                  
                  System.out.println(kisa+"\n"
                                     +b+"\n"
                                     +b);
                  */
                          
                    
                    
                    
                    //*******************************************************
                     /*   // GİRİLEN SAYIYA KADAR ASAL BAKMA       6.86
                    Scanner input = new Scanner (System.in);
                  System.out.println("Bir sayi giriniz...");  
                  int sayi = input.nextInt();
                  
                     for (int i = 2; i<= sayi; i++) {
                        int sayac  = 0;
                         for (int j = 1; j <=i ; j++) {
                            if ( i % j == 0) {
                                 sayac++;
                             }
                             if (sayac == 2) {
                                 System.out.println("Sayilar = "+i);
                             }   
                         }       
                     }
                     */
                     
                     
                     
                     
                               // İKİ BASAMAKLI) İKİ SAYISI DA ASAL SAYI OLAN SAYILAR   6.87
                    /* 
                    for (int i = 2; i <= 7; i++) {
                        for (int j = 2; j <= 7; j++) {
                            if ( (i == 2 || i == 3 || i == 5 || i == 7) && 
                                 (j == 2 || j == 3 || j == 5 || j == 7)) {
                                System.out.println("Sayı = "+(10*i+j));  
                            }
                        }
                    }
                     */
                    
                    
                    
                                // GİRİLEN SAYININ ASAL ÇARPANLARINI BULMA    6.88
                          /*   *****************************************
                           Scanner input = new Scanner(System.in);
                        System.out.println("Bir sayi giriniz...");
                        int sayi = input.nextInt();
                        
                        
                        for (int i = 2; i <=sayi; i++) {
                            if (sayi%i == 0) {
                                System.out.println("Asal sayi = "+i);
                               sayi /= i;
                            }
                        }**********************************************
                        */
                        
                        
                        //   İKİZ ASALLAR
                          
                        
                        
                        
                        
                        //  MÜKEMMEL(KUSURSUZ)SAYI             6.91
                    /*      
                      Scanner input = new Scanner(System.in);
                    System.out.println("Bir sayi giriniz...");
                    int sayi = input.nextInt();
                    int sayac = 0;
                    
                     for (int i = 1; i < sayi; i++) {
                         if (sayi%i == 0) {
                             sayac+=i;
                         }
                     }
                      if (sayac == sayi) {
                          System.out.println("Bu sayi bir mukemmel sayidir...");
                      }
                      else{
                          System.out.println("Bu sayi bir mukemmel sayi deildir...");
                      }    
                          */
                          
                          
                       //    MÜKEMMEL SAYI   
                          
                          
                       
                          
                       //  CULLEN SAYISI         6.93
                     /*   
                       Scanner input = new Scanner(System.in);
                      System.out.println("Bir sayi giriniz..."); 
                      int sayi = input.nextInt();
                      
                       for (double i = 1; i <= sayi; i++) {
                            i = (i*Math.pow(2, i))+1;
                            System.out.println("Sayi = "+i);
                       }
                           */
                        
                     
                     
                        
                        // FERMAT SAYISI   
                     /*
                     Scanner input = new Scanner(System.in);
                    System.out.println("Bir sayi giriniz..."); 
                    int sayi = input.nextInt();
                    
                     for (int i = 0; i <= sayi; i++) {
                       double a =  Math.pow(2, Math.pow(2, i))+1;
                               System.out.println("Sayi = "+a);
                     }
                         */    
                    
                    
                    
                    
                     
                       //     LEYLAND SAYISI     
                     /*
                     Scanner input = new Scanner(System.in);
                    System.out.println("Birinci sayiyi giriniz...."); 
                    int sayi1 = input.nextInt();
                    System.out.println("İkinci sayiyi giriniz..."); 
                    int sayi2 = input.nextInt();
                    double t=0;
                    
                    for (int i = 2; i <= sayi1; i++) {
                        for (int j = 2; j <= sayi2; j++) {
                           t = Math.pow(j, i)+Math.pow(i, j);
                            System.out.println("Sayilar = "+t);
                        }
                    }
                         */
                     
                     
                     
                     
                     
                        //  HİLBERT SAYISI       6.96
                    /* 
                     Scanner input = new Scanner(System.in);
                   System.out.println("Bir sayi giriniz... "); 
                   int sayi = input.nextInt();
                     
                    for (int i = 0; i <=sayi; i++) {
                          if (sayi == (4*i)+1) {
                              System.out.println(sayi+" Bir Hilbert Sayisidir..."); 
                              break;
                          }
                    }
                           */
                     
                     
                    
                      //  ARMSTRONG SAYİSİ       6.98
                    /*
                    Scanner input = new Scanner(System.in);
                  System.out.println("Lütfen sayıyı giriniz...");
                  int sayi = input.nextInt();
                  System.out.println("Basamak sayısını giriniz...");
                  int basamak_sayisi = input.nextInt();
                    
                    int toplam = 0;
                    int gecici = sayi;
                    
                    do { 
                       int kalan = gecici%10;
                      toplam += Math.pow(kalan, basamak_sayisi);
                      gecici = gecici/10;
                    } while (gecici>0);
                                       
                    if (sayi == toplam) {
                        
                        System.out.println("Bu sayı bir Armstrong sayıdır...");
                
                     }
                    else{
                        System.out.println("Bu sayı Armstrong sayı değildir...");
                    }
                         */
                    
                    
                    
                    
                      //   BAĞDAŞIK SAYİLAR        6.99
                  /*  
                   Scanner input = new Scanner(System.in);
                 System.out.println("Lutfen İKİ BASAMAKLİ birinci sayiyi giriniz..."); 
                 int sayi1 = input.nextInt();
                 System.out.println("Lutfen İKİ BASAMAKLİ ikinci sayiyi giriniz...");
                 int sayi2 = input.nextInt();
                 
                   int sayi1_ilk_basamak = sayi1%10;
                   int sayi1_ikinci_basamak = sayi1/10;
                   int sayi2_ilk_basamak = sayi2%10;
                   int sayi2_ikinci_basamak = sayi2/10;
                   
                  if ((sayi1_ikinci_basamak == sayi2_ikinci_basamak) && (sayi1_ilk_basamak + sayi2_ilk_basamak == 10)) {
                        System.out.println(sayi1+" ve "+sayi2+" Bir Bagdasik Sayidir...");
                  }
                  else{
                      System.out.println(sayi1+" ve "+sayi2+" Bir Bagdasik Sayi deildir...");
                  }
                    */
                    
                  
                  
                  
                  
                                //   EKSİK SAYİ                     6.100
                    /*
                   Scanner input = new Scanner(System.in);
                 System.out.println("Lutfen bir sayi giriniz..."); 
                 int sayi = input.nextInt();
                 int sayac = 0;
                 
                    for (int i = 1; i <= sayi; i++) {
                        if (sayi%i == 0) {
                            sayac +=i;
                        }
                    }
                      if (sayac < 2*sayi) {
                          System.out.println("Bu sayi bir Eksik Sayidir..."); 
                      }
                      else{
                          System.out.println("Bu sayi bir Eksik Sayi deildir...");
                      }
                           */
                  
                  
                    
                    
                               //  HETEROMETRİK SAYİ
                       /*        
                      Scanner input = new Scanner(System.in);
                    System.out.println("Bir sayi giriniz..."); 
                    int sayi = input.nextInt();
                    
                    for (int i = 1; i <=sayi; i++) {
                        if (sayi == i*(i+1)) {
                            System.out.println("Bu sayi bir Heterometrik Sayidir...");
                        }
                    }
                        */
                       
                       
                     
                              //   ORE SAYİSİ ***************************** 
                       /*       
                      Scanner input = new Scanner(System.in);
                     System.out.println("Bir sayi giriniz...");
                     int sayi = input.nextInt();
                     int sayac = 0;
                     int toplam = 0;
              
                       for (int i = 1; i <= sayi; i++) {
                          if (sayi%i ==0) {
                            toplam += 1/i;
                            sayac++;
                          }
                       }
                          if (sayac%toplam == 0) {
                              System.out.println("Bu sayi bir Ore Sayisidir...");   
                          }      
                          else{
                              System.out.println("Bu sayi bir Ore Sayisi deildir...");
                          }    
                             */ 
                              
                              
                              
                              
                              //    MARKOV SAYİLARİ
                            /* 
                          Scanner input = new Scanner(System.in);
                        for (int x = 1; x <= 50; x++) {
                            for (int y = 1; y <= 50; y++) {
                                for (int z = 1; z <= 50; z++) {
                                    if (Math.pow(x, x)+Math.pow(y, y)+Math.pow(z, z) == 3*z*x*y) {
                                        System.out.println("Sayi = ("+x+", "+y+", "+z+")"); 
                                    }
                                }
                            }
                        }
                                */
                        
                          
                          
                    
                             //   POLİNDROM SAYİ
                         /*    
                        for (int x = 1; x <= 9;x++ ) {
                            for (int y = 0; y <= 9;y++ ) {
                                System.out.println("Sayi = "+(100*x+10*y+x));
                            }
                        }
                        for (int x = 1; x <= 9; x++) {
                            for (int y = 0; y <= 9; y++) {
                                System.out.println("Sayi = "+(1000*x+100*y+10*y+x));
                            }
                        }
                               */
                         
                         
                         
                         
                             //   KLAVYEDEN GİRİLEN BASAMAK SAYISINA GÖRE POLİNDROM SAYISININ TOPLAMI
                         /* 
                         Scanner input = new Scanner(System.in);
                       System.out.println("Basamak degerini giriniz...");  
                       int bs = input.nextInt();
                       double sonuc;
                       
                       sonuc = Math.pow(90, ((bs-1/2)));
                         System.out.println("Sonuc = "+sonuc);
                            */
                         
                         
                         
                         //     EULERİAN SAYİSİ
                         
                         
                         
                         
                         // ÜÇGENSEL SAYİ 
                      /*   
                       Scanner input = new Scanner(System.in);
                     System.out.println("Bir sayi giriniz...");
                     int sayi = input.nextInt();
                     
                      for (int i = 1; i <= sayi; i++) {
                           int u = i*(i+1)/2;
                           System.out.println("Sayi = "+u);
                      }
                              */
                         
                      
                      
                         
                         //  KARE ÜÇGENSEL SAYI
                     /*    
                     Scanner input = new Scanner(System.in);
                    System.out.println("Bir sayi giriniz...");   
                    int sayi = input.nextInt();
                    int k0 = 0;
                    int k1 = 1;
                     System.out.println(k1); 
                     
                      for (int i = 0; i < sayi-1; i++) {
                          int k2 = 34*k1-k0+2;
                          System.out.println(k2);
                          k0=k1;
                          k1=k2;
                      }
                           */
                     
                     
                     
                     
                     
                       //  FİBONACCİ SAYİSİ
                     /*  
                    Scanner input = new Scanner(System.in);
                  System.out.println("Bir sayi giriniz...");  
                  int sayi = input.nextInt();
                  int a = 1;
                  int b = 1;
                  int c = 0;

                     for (int i = 0; i <= sayi-1; i++) {
                         c = b+a;
                         System.out.println(a);
                         a=b;
                         b=c; 
                     }  
                       */
                     
                     
                     
                     
                     
                     
                     // BASAMAKTOPLAMI FİBONAACCİ OLAN 0-99 ARASI TAMSAYİLAR  
                     /*  
                    for (int i = 0; i < 9; i++) {
                          for (int j = 0; j < 9; j++) {
                            int s = i+j;
                              if (s==1 || s==2 || s==3 || s==5 || s==8 || s==13 ) {
                                  System.out.println("Sayi = "+(10*i+j));
                              }
                          }
                    }
                           */
                     
                     
                     
                     
                     
                        // GİRİLEN TERİN SAYISINA GÖRE FİBONACCİ ASALLARINI BULMA  
                        /*      
                       Scanner input = new Scanner(System.in);
                      System.out.println("Bir sayi giriniz..."); 
                      int sayi = input.nextInt();
                      int f1 = 1;
                      int f2 = 1;
                      int s2 = 0;
                      
                      do { 
                          int f3 = f1+f2;
                            f1=f2;
                            f2=f3;
                          int s1 =0;
                          
                           for (int i = 2; i < f3-1; i++) {
                               if (f3%i==0) {
                                   s1++;
                               }
                           }
                             if (s1==0) {
                                s2++;
                                 System.out.println("Sayi = "+f3);
                             }
                           
                         } while (s2<sayi);
                                  */
                     
                        
                        
                        
                        
                        
                       // NEGAFİBONACCİ SAYILARI
                     /*  
                     Scanner input = new Scanner(System.in);
                    System.out.println("Bir sayi giriniz...");
                    int sayi = input.nextInt();
                    int f1 = 1;
                    int f2= -1;
                    System.out.println(f1);
                    System.out.println(f2); 
                     for (int i = 1; i <=sayi-2; i++) {
                            int f3 = f1-f2;
                            System.out.println(f3);
                            f1=f2;
                            f2=f3;
                     }
                         */
                     
                     
                     
                     
                     
                         //  TRİBONACCİ SAYİSİ,
                       /*  
                       Scanner input = new Scanner(System.in);
                     System.out.println("Bir sayi giriiniz...");
                     int sayi = input.nextInt();
                     int t1 = 1;
                     int t2 = 1;
                     int t3 = 2;
                     System.out.println(t1);
                     System.out.println(t2);
                     System.out.println(t3);
                     
                      for (int i = 1; i <= sayi-3; i++) {
                          int t4 = t1+t2+t3;
                          System.out.println(t4);
                          t1 = t2;
                          t2 = t3;
                          t3 = t4;
                      }
                         */
                       
                       
                         
                     //  6.116    
                         
                     
                        
                        
                     // 6.117
                     
                     
                     // 6.118
                     
                     
                     
                     
                     //  PİSAGOR ÜÇLEMESİ  ************************************
                     /*
                    Scanner input = new Scanner(System.in);
                   System.out.println("Lutfen bir sayi giriniz...");
                   int sayi = input.nextInt();
                   
                    for (int i = 1; i <= sayi-1; i++) {
                        for (int j =i+1 ; j <= sayi-i; j++) {
                             int c = sayi-(i+j);
                             if (Math.pow(i, 2)+Math.pow(j, 2) == Math.pow(c, 2)) {
                                 System.out.println(i);
                                 System.out.println(j);
                                 System.out.println(c);
                                 System.out.println(i*j*c);
                             }
                        }
                    }
                           */
                     
          }  
     }           
  

