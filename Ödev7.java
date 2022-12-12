
import java.util.Scanner;


public class Ödev7 {
    
    public static void main(String[] args) {
        
        
            //  Klavyeden girilen N elemanlı  A ve B kumelerinin skaler carpımını bulma
                 /*
                  Scanner input = new Scanner(System.in);
                 System.out.println("Lutfen bir N degeri giriniz...");
                 int N = input.nextInt();
                 
                 int[] A = new int[N];
                 int[] B = new int[N];
                 
                 for (int i = 0; i < (N); i++) {
                     System.out.println("A("+i+") degerini giriniz...");
                      A[i] = input.nextInt();
                     System.out.println("B("+i+") degerini giriniz..."); 
                      B[i] = input.nextInt();
                     System.out.println("************************"); 
                 }
                   int SC = 0;
                 
                  for (int i = 0; i < (N); i++) {
                      SC = SC + (A[i]*B[i]);     
                  }
                 System.out.println("Sonuc = "+SC);
                    */
              
                  
                 
                 
                  
     // Girilen eleman sayısına gore Arifmetik, Geometrik, Harmonik, Kontraharmonik Ortalamasını hesaplayan kod
               /*
                 Scanner input = new Scanner(System.in);
               System.out.println("Lutfen bir eleman sayisi giriniz...");
               int eleman = input.nextInt();
               
               int[] a = new int[eleman];
               
               double Toplamı = 0;
               double Carpmımı = 1;
               double Toplama2 = 0;
               double HarmonikToplama = 0;
               
               for (int i = 0; i < eleman; i++) {
                   a[i] = input.nextInt();
               }
                for (int i = 0; i < eleman; i++) {
                      Toplamı += a[i];
                      Toplama2 += Math.pow(a[i], 2);
                      Carpmımı *= a[i];
                      HarmonikToplama += (1/a[i]);
                }
               
                System.out.println("Arifmetik Ortalama = "+(Toplamı/eleman)
                                 +"\nGeometrik Ortalama = "+(Math.pow(Carpmımı,1/eleman))
                                 +"\nHarmonik Ortalama = "+(eleman/HarmonikToplama)
                                 +"\nKontraharmonik Ortalama = "+(Toplama2/Toplamı));
                           */
               
               
               
               
               
             // Katsayi girilen bir y(x) denkleminin x = b degerini hesaplayan program
                  /*
                  Scanner input = new Scanner(System.in);
                System.out.println("Dereceyi giriniz...");
                int n = input.nextInt();
                System.out.println("X'i giriniz...");
                int b = input.nextInt();
                
                   int[] A = new int[n];
                
                    for (int i = 1; i < n; i++) {
                       A[i] = input.nextInt();
                    }
                      int t = A[1];
                
                    for (int i = 2; i < n; i++) {
                         t += Math.pow((A[i]*b), i-1);
                    }
                     System.out.println("Sonuc = "+t);
                        */
                
                  
                  
              
                  
         //  Klavyeden N elemanli bir a dizisini pozitiflerini b negatiflerinin c dizisine atma
                   /*
                    Scanner input = new Scanner(System.in);
                   System.out.println("Lutfen eleman sayisini giriniz...");
                   int eleman = input.nextInt();
                   
                   int[] a = new int[eleman];
                   int[] b = new int[eleman+1];
                   int[] c = new int [eleman+1];
                   
                     for (int i = 0; i < eleman; i++) {
                         a[i] = input.nextInt();
                     }                  
                      int x = 0;
                      int y = 0;
                      
                      for (int i = 0; i < eleman; i++) {
                          if (a[i] == 0) {
                              continue;
                          }
                          if (a[i] >0) {
                              x++;
                            b[x] = a[i]; 
                              System.out.println("Pozitif değereler = "+b[x]); 
                          }
                          else{
                              y++;
                             c[y] = a[i]; 
                              System.out.println("Negatif degerler = "+c[y]);
                          }
                      }
                       */        
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
              
    }
}
