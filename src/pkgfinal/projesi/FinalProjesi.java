
package pkgfinal.projesi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FinalProjesi {
    

    public static void main(String[] args) throws IOException   {
        
        Scanner scan = new Scanner(System.in);
        Scanner Ad =new Scanner(System.in);
        
        int a=0;
        int b=0;
               
       int[] ÖğrenciNo=new int[1000];
       String[] AdSoyad = new String[1000];
       int AşıTercihi =0;
       String[] AşıSonuc = new String[1000];
       String[] AşıTarihi=new String[1000];
       

     while (true) {
            
         
        System.out.println("            MENÜ             ");
        System.out.println("_____________________________");
        
        System.out.println("Yeni kayıt için             1:");
        System.out.println("Randevu almak için          2:");
        System.out.println("Randevuları listelemek için 3:");
        System.out.println("Çıkış için                  0:");
        System.out.println("");
        System.out.print("LÜTFEN SEÇİMİNİZİ GİRİNİZ      :");
        int girilen=scan.nextInt();
       
        switch (girilen){
            
            case(1):
                System.out.print("Öğrenci No: ");
                 ÖğrenciNo[a] =scan.nextInt();
                System.out.print("Adı ve soyadı: ");
                 AdSoyad[a]=Ad.nextLine();
                 a=a+1;
                 
                System.out.println("Kaydınız başarılı bir şekilde yapılmıştır...");
                break;
            
            case(2):
                System.out.print("Öğrenci No: ");
                int num=scan.nextInt();
                for (int i = 0; i < a+1; i++) 
                {
                    if (ÖğrenciNo[i]==num) 
                    {
                        System.out.println(AdSoyad[i]); 
                        b=i;
                    }
                    
                }
                
                System.out.println("AŞI TERCİHİ");
                System.out.println("____________");
                System.out.println("Biontech :1");
                System.out.println("Sinovac  :2");
                System.out.println("Sputnik  :3");
                 AşıTercihi=scan.nextInt();
                
                if (AşıTercihi==1) 
                {
                    AşıSonuc[b]="Biontech";
                }
                if (AşıTercihi==2)
                {
                    AşıSonuc[b]="Sinovac";
                }
                if (AşıTercihi==3)
                {
                    AşıSonuc[b]="Sputnik";
                }
                
                System.out.println("Aşı tarihini giriniz :");
                
                 AşıTarihi[b]=scan.next();
                System.out.println("Randevunuz oluşturulmuştur...");
                break;
                    
            case(3):
                int SıraNo=1;
               
                System.out.println("Sıra No  Öğrenci Numarası   Ad Soyad    Aşı Firması    Tarih");
                System.out.println("_____________________________________________________________");
                for (int i = 0; i < a; i++) {
                    if (AşıSonuc[b]!=null) 
                    {
                     System.out.println(" "+SıraNo+"          "+ÖğrenciNo[i]+"   "+AdSoyad[i]+"    "+AşıSonuc[i]+"   "+AşıTarihi[i]);
                     
                     String DosyaYolu="D:/Java Projeler/Final Projesi/AsiListesi.txt";
            File dosyaAdi = new File(DosyaYolu);
            
            FileWriter yazici = new FileWriter(dosyaAdi,true);
            
               if (AşıSonuc!=null) 
               {
                   
              yazici.write(ÖğrenciNo[i]+","+AdSoyad[i]+","+AşıSonuc[i]+","+AşıTarihi[i]+"\n");
              }
            else 
            {
                yazici.write(ÖğrenciNo[i]+","+AdSoyad[i]+"\n");
            }
            yazici.close(); 
                     SıraNo=SıraNo+1;
                    }
                }
                SıraNo=1;
                break;                               
        }    
             if (girilen==0) 
            {
             break;                    
            }
        }
    }   
}
