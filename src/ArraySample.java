import java.util.ArrayList;
import java.util.Random;

//N boyutunda 0-10 aras� rastgele say�lardan olu�an bir dizi tan�mlay�n�z.
//Bu dizi i�inde m�kerrer olan elemanlar� ekrana yazd�ran algoritmay� tasarlay�n�z.

//�rnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 }

//�rnek ��kt�: 2 5
public class ArraySample {
	 public static void main(String[] args) {
	 
		 int[] dizi = { 1, 2, 5, 5, 5, 8, 9, 11, 12, 1 };

		 boolean[] kontrol = new boolean[dizi.length];

		 for (int i = 0; i < dizi.length; i++)
		 {
		     if(kontrol[i]) continue;

		     boolean tekrarli = false;
		     for (int j = i + 1; j < dizi.length; j++)
		     {
		         if (dizi[i] == dizi[j])
		         {
		        	 tekrarli = kontrol[j] = true;
		         }
		     }
		     if(tekrarli) 
		         System.out.print(dizi[i] + " ");
		 }
		 
		 /////////////////////////////////////////////////////////////////////
		 
		/* int sayac=0;
		    int num ;
		    Random r = new Random();
		    
		    ArrayList<Integer> listem = new ArrayList<Integer>();

		    		    
		    while (sayac<10) {        
		        num = r.nextInt(21);  
		        System.out.print(num+" ");
		        if(!listem.contains(num) ) {
		            listem.add(num);
		            sayac++;
		        }
		    }
		    System.out.print("\n");
		   
		    for(int j=0;j<10;j++){
		    	System.out.print(listem.get(j)+" ");
		  }*/      
		}    
}	 
		 
		 		