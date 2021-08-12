import java.util.Random;
import java.util.Scanner;

//**Soru5:** Rastgele sayýlardan oluþan 100 elemanlýk tamsayý dizisi oluþturun. 
//Ardýndan tek ve çift sayýlarý bulan bir program yazýn.

public class SoruCevap4 {
 public static void main(String[] args) {
		 
		 int j=0,k=0,n;
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Dizinizin eleman sayýsýný giriniz:");
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
	        System.out.println("Dizideki Tek Sayýlar:");
	        if (j>1)
	        {
	            for (int i=0;i<j-1;i++){
	                System.out.print(tek[i]+",");
	            }
	            System.out.print(tek[j-1]);

	        }
	        else {
	            System.out.println("Sayý yok.");
	        }
	        System.out.println(" ");
	        System.out.print("\n");
	        System.out.println("Dizideki Cift Sayýlar :");
	      //  System.out.println("Odd Array");
	        if (k>1)
	        {
	            for (int i=0;i<k-1;i++){
	                System.out.print(cift[i]+",");
	            }
	            System.out.print(cift[k-1]);

	        }
	        else {
	            System.out.println("Sayý yok.");
	        }
  }


}

