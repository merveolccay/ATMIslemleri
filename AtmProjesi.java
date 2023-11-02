package java101;
import java.util.Scanner;

public class AtmProjesi {

    public static void main(String[] args) {
        String kullaniciAdi , parola;
        Scanner inp = new Scanner(System.in);
        int GirisHakki = 3;
        int HesaptakiPara = 1500;
        int secim;

        while(GirisHakki > 0){
            System.out.print("Kullanıcı adını giriniz: ");
            kullaniciAdi = inp.nextLine();
            System.out.print("Parolayı giriniz: ");
            parola = inp.nextLine();

            if (kullaniciAdi.equals("patika") && parola.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                secim = inp.nextInt();
                switch(secim){
                    case 1:
                        System.out.println("Eklenecek tutarı giriniz: ");
                        int eklenecekPara = inp.nextInt();
                        HesaptakiPara += eklenecekPara;
                        System.out.println("Yeni Bakiyeniz: "+ HesaptakiPara );
                        break;
                    case 2:
                        System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                        int CekilecekPara = inp.nextInt();
                        if(CekilecekPara > HesaptakiPara){
                            System.out.println("Bakiyeniz yetersiz." );
                        }else{
                            HesaptakiPara -= CekilecekPara;
                            System.out.println("Kalan bakiyeniz: " + HesaptakiPara );
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + HesaptakiPara);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Geçersiz işlem seçimi yaptınız..");
                }
                break;
            }else {
                GirisHakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(GirisHakki == 0){
                    System.out.println("Hesabınız bloke olmuştur. Bankanız ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan Hakkınız : " + GirisHakki);
                }
            }

        }
    }


}
