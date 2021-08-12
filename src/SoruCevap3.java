import java.util.Random;

//**Soru3:** Rastgele sayýlardan oluþmuþ 100 elemanlýk tamsayý dizisindeki tüm elemanlarýn ortalamasýný alacak programý geliþtirin. 
//Programý yazarken aþaðýdaki özelliklere uygun yazýnýz

public class SoruCevap3 {
public static void main(String[] args) {
		
	int[] tamsayýlar =new int[10];
      
		for (int i=0;i<10;i++){
			Random r = new Random();
			int sayi=r.nextInt(100);
			tamsayýlar[i]=sayi;
		}
		
		double ort = ortalamabul(tamsayýlar);	
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

