import java.util.InputMismatchException;
import java.util.Scanner;

//**Soru2:** Kullan�c�n�n konsol ekrandan 4 temel matematiksel i�lemi yapabildi�i bir program yazman�z bekleniyor.
//Program a�a��daki �zellikleri sa�lamal�d�r.

//- Yap�labilecek temel i�lemler: Toplama, ��karma, �arpma, B�lme
//- Kullan�c�ya 4 i�lemden birini se�ece�i men�y� konsol ekrana yazd�r�n. �rne�in: 1-Toplama, 2-��karma vb...
//- Ard�ndan kullan�c�dan 2 adet tamsay� tipinde say� girmesini isteyin. Bu girilen iki say�y� de�i�kenlerde saklay�n.
//- Se�ilen i�lem tipine g�re matematiksel i�lemi yap�n ve konsol ekran�na yazd�r�n.

public class SoruCevap2 {
	  
		   
	public static void main(String[] args) {
		 System.out.println("---------------------------------- \n" + "Hesap Makinesine Hosgeldiniz \n" + "----------------------------------");
	      
		  System.out.println("Asa��dakilerle islem yapabilirsiniz : \n" + "1. Toplama  \n" + "2. Cikarma  \n" + "3. Carpma   \n" + "4. B�lme    \n");

		  Scanner scanner = new Scanner(System.in);
	       
          System.out.println("Bir islem seciniz:  ");
          int islem = scanner.next().charAt(0);
	      
          if (!(islem == '1' || islem == '2' || islem == '3' || islem == '4')) {
              System.err.println("Hatali bir tuslama yapt�n�z. L�tfen 1-2-3 ya da 4 e bas�n");
          }

          System.out.println("Ilk sayiyi giriniz: ");
          int num1 = scanner.nextInt();

          System.out.println("Ikinci sayiyi giriniz: ");
          int num2 = scanner.nextInt();
          
          SoruCevap2 hesapMakinem = new SoruCevap2();
          
          if (islem == '1') {
              System.out.println(num1 + " + " + num2 + " = "+ hesapMakinem.add(num1,num2));
          } else if (islem == '2') {
              System.out.println(num1 + " - " + num2 + " = "+hesapMakinem.subtract(num1,num2) );
          } else if (islem == '3') {
              System.out.println(num1 + " x " + num2 + " = " + hesapMakinem.multiply(num1,num2));
          } else if (islem == '4') {
              System.out.println(num1 + " / " + num2 + " = " + hesapMakinem.divide(num1,num2) );
          } else {
              System.err.println("Tan�mlanmayan islem.");
          }
          
          if(islem > 0 && islem < 5) {
              System.out.println("L�tfen 1 ile 4 aras�nda bir say� giriniz");
              
          }
  	 }
	
	 public SoruCevap2() {}

	 public int add(int a, int b) {
	   return a + b;
	 }

	 public int subtract(int a, int b) {
	   return a - b;
	 }

	 public int multiply(int a, int b) {
	   return a * b;
	 }

	 public int divide(int a, int b) {
	   if (b == 0) {
	     System.out.println("Hata!ikinci sayiniz 0 olamaz");
	   return 0;
	   }
	 else { 
	   return a / b;
	 }
 }	
	
}
		