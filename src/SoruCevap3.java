import java.util.Random;

//**Soru3:** Rastgele say�lardan olu�mu� 100 elemanl�k tamsay� dizisindeki t�m elemanlar�n ortalamas�n� alacak program� geli�tirin. 
//Program� yazarken a�a��daki �zelliklere uygun yaz�n�z

public class SoruCevap3 {
public static void main(String[] args) {
		
	int[] tamsay�lar =new int[10];
      
		for (int i=0;i<10;i++){
			Random r = new Random();
			int sayi=r.nextInt(100);
			tamsay�lar[i]=sayi;
		}
		
		double ort = ortalamabul(tamsay�lar);	
	    System.out.println("Dizinin ortalamasi = "+ort);
	}


	public static double ortalamabul(int dizi[]){
		double toplam=0;
		
		 for (int i=0;i<10;i++){
			 
			 toplam=toplam+dizi[i];
			}
		 return toplam/100;
   }
}

