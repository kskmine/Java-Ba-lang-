import java.util.Scanner;

//**Soru1:** String tipinde sabit bir �ifre de�i�keni olu�turun. 
//�rne�in: String password = "12345"; gibi. 
//Ard�ndan, kullan�c�dan klavyeden bir �ifre girmesini isteyin.
//Girilen �ifre ile de�i�kende tuttu�unuz de�eri k�yaslay�n. 
//E�er, iki de�er birbirine e�itse ekrana "Giri� Ba�ar�l�!", 
//de�ilse "Giri� Ba�ar�s�z" yazd�r�n.

public class SoruCevap {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String anasifre="223345";
		
		String sifre;
		System.out.println("�ifrenizi giriniz:");
		sifre=input.next();
		
		if ( anasifre.equals(sifre))
		{
			System.out.println ("Giris Basarili!");
		}
		else 
		{
			System.out.println ("Giri� Basarisiz! L�tfen kontrol ederek tekarar deneyiniz.");
		}
		}
}
