
import java.util.Random;
import java.util.Scanner;

public class Ödev8 {
    public static void main(String[] args) {
        
        
        
           //   Taş-Kağıt-Makas oyunu
            /*
             Scanner input = new Scanner(System.in);
             String kisi,pc = " ";
             Random rnd=new Random();
             
             String[] secenekler = {"tas","kagit","makas"};
             pc = secenekler[rnd.nextInt(3)];
                  
                     
                 System.out.println("Lutfen seciminizi giriniz...");
                 kisi = input.nextLine();
       
              
             System.out.println("Oyuncunun secimi = "+kisi+"    bilgisayarın secimi = "+pc);
             
             if ((kisi.equals("kagit") && pc.equals("tas")) || (kisi.equals("makas") && pc.equals("kagit"))||(kisi.equals("tas")&&pc.equals("makas"))) {
                 System.out.println("Oyuncu kazandı");
             }
             else if (kisi.equals(pc)) {
                 System.out.println("Beraberlik");
             }
             else
               System.out.println("Bilgisayar kazandı...");
             */
             
           
            
             //  KLAVYEDEN KÜÇÜK HARFLERLE GİRİLEN KELİMEYİ RASTGELE BÜYÜKLÜKTE YAZDIRMA
           /*
            Scanner input = new Scanner(System.in);
          System.out.print("Cümle Giriniz: ");
          String text = input.nextLine();
        
          Random r = new Random();
        
          for (int i = 0; i < text.length(); i++) {
            int rs = r.nextInt(10);       
              if (rs%2==0) {
                System.out.print(text.toUpperCase().charAt(i));
              }
              else {
                System.out.print(text.toLowerCase().charAt(i));
              }
          }
           System.out.println();
           */
           
           
           
           
           
           //   GİRİLEN KELİMENİN BÜYÜKLÜKLERİNİ DEĞİŞTİRME
           /*
           Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= 65) && (text.charAt(i) <= 90)) {
                System.out.print((char)(text.charAt(i) + 32));
            } 
            else {
                System.out.print((char)(text.charAt(i) - 32));
            }
        }
           System.out.println();
           */
           
           
           
           
           
           
             // KÜÇÜK GİRİLEN KELİMENİN İKİ BÜYÜK İKİ KÜÇÜK YAZDIRMA
           /*
            Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine();
        int r =0;
        int s =0;
        
        for (int i = 0; i < text.length(); i++) {
            r = s % 4;
            s = s + 1;
            if (r < 2) {
                System.out.print(text.toUpperCase().charAt(i));
            } 
            else {
                System.out.print(text.toLowerCase().charAt(i));
            }
        }
            System.out.println();  
           */
           
           
           
           
           // SESLİ HARFLERİ K1 SESSİZ HARFLERİ K2 KELİMESİ OLUSTUARN PROGRAM
           /*
           Scanner input = new Scanner(System.in);
        System.out.print("Cumle Gir: ");
        String text = input.nextLine();

        char dizi[] = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};

        String k1 = "", k2 = "";
        boolean durum;
        for (int i = 0; i < text.length(); i++) {
            durum = false;
            for (int j = 0; j < dizi.length; j++) {
                if (text.charAt(i) == dizi[j]) {
                    durum = true;
                    break;
                }
            }
            if (durum) {
                k1 += text.charAt(i);
            } 
           else {
                k2 += text.charAt(i);
            }
        }
        System.out.println(k1 + "\n" + k2);
           */
           
         
           
           //KELİMEYİ ORTADAN İKİYE BÖLEREK ORTADAN İLERİ VE BİRİNCİ PARCADAN GERİ DPGRU BİRER KARAKTER OLARAK YAZDIRAN PROGRAM
          /* 
            Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine();
        int n = text.length() / 2;

        for (int i = 0; i < n; i++) {
            System.out.print(text.charAt(n + i));
            System.out.print(text.charAt(n - 1 - i));
        }
        System.out.println();
          */
          
          
         
          
          
          // HER HARFİ ALFABETİK SIRASINA KADAR "*" KOYAN PROGRAM 
          /*
           Scanner input = new Scanner(System.in);
        System.out.print("Cümle Giriniz: ");
        String text = input.nextLine().toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " -> ");
            for (int j = 0; j < text.charAt(i) - 64; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
          */
          
          
          
          
          // ORTADAN BÖLEREK HER PARÇASINI TERSTEN YAZDIRAN PROGRAM
          /*
          Scanner input = new Scanner(System.in);
        System.out.print("Cümle Gir: ");
        String cumle = input.nextLine();
        int n = cumle.length();

        for (int i = n / 2; i > 0; i--) {
            System.out.print(cumle.charAt(i - 1));
        }
        for (int i = 1; i < (n / 2 + 1); i++) {
            System.out.print(cumle.charAt(n - i));
        }
          System.out.println();
          */
          
   }
}