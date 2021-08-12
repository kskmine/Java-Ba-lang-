import java.util.Random;
import java.util.Scanner;

//**Soru5:** Rastgele say�lardan olu�an 100 elemanl�k tamsay� dizisi olu�turun. 
//Ard�ndan tek ve �ift say�lar� bulan bir program yaz�n.

public class SoruCevap4 {
 public static void main(String[] args) {
		 
		 int j=0,k=0,n;
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Dizinizin eleman say�s�n� giriniz:");
	         n = scanner.nextInt();
	        int rndizi[] = new int[n];
	        Random random = new Random();
	        
	        for (int i=0;i<n;i++){
	        	rndizi[i] = random.nextInt(100);
	        	 System.out.print("["+rndizi[i]+"]");
	        }
	        System.out.print("\n");
	        
	        int cift[] = new int[n];
	        int tek[] = new int[n];
	        
	        for (int i=0;i<n;i++){
	            if (rndizi[i] % 2 != 0){
	                tek[j] = rndizi[i];
	                j++;
	            }
	            else{
	                cift[k] = rndizi[i];
	                k++;
	            }
	        }
	        System.out.print("\n");
	        System.out.println("Dizideki Tek Say�lar:");
	        if (j>1)
	        {
	            for (int i=0;i<j-1;i++){
	                System.out.print(tek[i]+",");
	            }
	            System.out.print(tek[j-1]);

	        }
	        else {
	            System.out.println("Say� yok.");
	        }
	        System.out.println(" ");
	        System.out.print("\n");
	        System.out.println("Dizideki Cift Say�lar :");
	      //  System.out.println("Odd Array");
	        if (k>1)
	        {
	            for (int i=0;i<k-1;i++){
	                System.out.print(cift[i]+",");
	            }
	            System.out.print(cift[k-1]);

	        }
	        else {
	            System.out.println("Say� yok.");
	        }
  }


}

