
import java.util.Random;
import java.util.Scanner;


public class Ödev10 {
    
    
    
     public static void Kareleri_Toplami(int a){
        int kareleritoplami=0;
        
        for (int i = 1; i <=a; i++) {
            int karesi = i*i;
            kareleritoplami += karesi;
        }
        System.out.println("Kareleri toplamı = "+kareleritoplami);
        
    }
    
    public static void Asal_Mi(int sayi){
        
        int sayac =0;
        for (int i = 2; i <sayi; i++) {
            if (sayi%i == 0) {
                 sayac ++;
            }
        }
            if (sayac==0) {
                System.out.println("Bu sayı bir asal sayıdır..."); 
            }
            else{
                System.out.println("Bu sayı bir asal sayı deildir...");
            }  
    }
    
    public static int[] Kucukten_Buguge(){
        Scanner scan = new Scanner(System.in);
        int gecici;
        int [] dizi = {10,15,5,72,3,16};
         
        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
        for(int i = 0; i < 5; i++)
        {
            for(int j = i+1; j < 6; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        for(int i = 0; i < 6; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
        }
       return dizi;  
    } 
    
    
    
    public static int [][] Dizi_Dondurme(int ust_sinir){
        Random rst = new Random();
        int [][] dizi = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dizi[i][j] = rst.nextInt(ust_sinir);
            }
        }
          for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(dizi[i][j]+" ");
            }
              System.out.println();
        }
          
         return dizi; 
    }
        
    
    
       
      public static int []Dizi_toplami(int sayi){
          Random rst = new Random();
          
          int[][] dizi1 = new int[sayi][sayi];
          int[][] dizi2 = new int[sayi][sayi];
          int [] toplama_dizisi = new int [2]; 
          
          int dizi1_toplami = 0;
          int dizi2_toplami = 0;
          
          
          for (int i = 0; i < sayi; i++) {
              for (int j = 0; j < sayi; j++) {
                 dizi1[i][j] =  rst.nextInt(5);
                 dizi2[i][j] =  rst.nextInt(5);
                 dizi1_toplami += dizi1[i][j];
                 dizi2_toplami += dizi2[i][j];
              }
          }
          toplama_dizisi[0] = dizi1_toplami;
          toplama_dizisi[1] = dizi2_toplami;
  
          System.out.println("1.Dizinin Toplamı = "+toplama_dizisi[0]+"\n"
                           + "2.Dizinin Toplamı = "+toplama_dizisi[1]);
         return toplama_dizisi; 
      }   
       
      public static void Dik_Ucgen(int satir){
    
           for (int i = 1; i <=satir; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print("* ");
             }System.out.println();
           }
      }
    
    public static void main(String[] args) {
        
         // O SAYIYA KADAR OLAN SAYILARIN KARELERİ TOPLAMINI VEREN METHOD
        Kareleri_Toplami(5);
        
        System.out.println("***********************");
      // İÇİNE YAZILAN SAYININ ASAL OLUP OLMADIĞINI GÖSTEREN METHOD
        Asal_Mi(18);
        
        System.out.println("***********************");
        
        // DİZİYİ KÜÇÜKTEN BÜYÜĞE SIRALAYAN METHOD
        // dizi = {10,15,5,72,3,16}; için 
        Kucukten_Buguge();
        
        System.out.println("***********************");
        
        // 5X5 BİR MATRİS TE ÜST SINIRI GİRİLEN BİR MATRİSİ GÖSTERME
        Dizi_Dondurme(6);
        
        System.out.println("***********************");
        
        // SATIR VE SUTUN SAYILARI AYNI OLAN MATRİSİN KAÇ TANE SATİR/SÜTUN OLDUĞU GİRİLİP RASTGELE SAILAR ATAYIP TOPLAYAN METHOD (RASTGELE SAYILAR 0 İLE 5 ARASINDADIR...) 
        Dizi_toplami(5);
        
        System.out.println("***********************");
        
        // KAÇ SATIR OLDUĞU GİRİLEN ÜÇGENİ DİK ÜÇGEN ŞEKLİNDE ÇİZEN METHOD
        Dik_Ucgen(5);
        
        
        
        
        
        
        
    }
    
    
    
}
