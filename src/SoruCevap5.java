
public class SoruCevap5 {

//**Soru5:** Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.
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
