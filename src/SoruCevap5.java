
public class SoruCevap5 {

//**Soru5:** A�a��daki g�r�nt�y� konsol ekran�na yazd�ran algoritmay� tasarlay�n�z.
//	*
//	**
//	***
//	****
//	*****
	
	public static void main(String[] args) {
		int max=6;
		for (int satir = 0;satir < max; satir++) {
			System.out.print(" ");
			
			for (int sutun = 0; sutun < satir; sutun++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
