
public class SoruCevap5 {

//**Soru5:** Aþaðýdaki görüntüyü konsol ekranýna yazdýran algoritmayý tasarlayýnýz.
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
