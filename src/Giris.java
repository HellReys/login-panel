
import java.util.Scanner;

public class Giris {
   public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
            String kullanici_adi1 = "Berk";
            String kullanici_sifresi1 = "112233";
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");   
            String kullanici_adi2 = scanner.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz:");    
            String kullanici_sifresi2 = scanner.nextLine();
        if(kullanici_adi1.equals(kullanici_adi2)&& kullanici_sifresi1.equals(kullanici_sifresi2)){
            String bildirim = "Giriş Başarılı\n"+"Hoşgeldiniz";
            System.out.println(bildirim);
            return;
        }    
        else if(kullanici_adi1.equals(kullanici_adi2)&& !kullanici_sifresi1.equals(kullanici_sifresi2))  {
            String bildirim2 = "Girmiş olduğunuz şifre hatalı.";
            System.out.println(bildirim2);
            return;
        
        }
        else if(!kullanici_adi1.equals(kullanici_adi2)&& kullanici_sifresi1.equals(kullanici_sifresi2)){
            String bildirim3 = "Girmiş Olduğunuz kullanıcı adı hatalı";
            System.out.println(bildirim3);
            return;
            
        }
        else{
             String bildirim4 = "Girmiş olduğunuz kullanıcı adı ve şifre hatalı.";
             System.out.println(bildirim4);
             return;
        }
                     
       
       
       
}
    
}
