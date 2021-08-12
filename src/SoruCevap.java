import java.util.Scanner;

//**Soru1:** String tipinde sabit bir þifre deðiþkeni oluþturun. 
//Örneðin: String password = "12345"; gibi. 
//Ardýndan, kullanýcýdan klavyeden bir þifre girmesini isteyin.
//Girilen þifre ile deðiþkende tuttuðunuz deðeri kýyaslayýn. 
//Eðer, iki deðer birbirine eþitse ekrana "Giriþ Baþarýlý!", 
//deðilse "Giriþ Baþarýsýz" yazdýrýn.

public class SoruCevap {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String anasifre="223345";
		
		String sifre;
		System.out.println("Þifrenizi giriniz:");
		sifre=input.next();
		
		if ( anasifre.equals(sifre))
		{
			System.out.println ("Giris Basarili!");
		}
		else 
		{
			System.out.println ("Giriþ Basarisiz! Lütfen kontrol ederek tekarar deneyiniz.");
		}
		}
}
