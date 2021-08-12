import java.util.InputMismatchException;
import java.util.Scanner;

//**Soru2:** Kullanýcýnýn konsol ekrandan 4 temel matematiksel iþlemi yapabildiði bir program yazmanýz bekleniyor.
//Program aþaðýdaki özellikleri saðlamalýdýr.

//- Yapýlabilecek temel iþlemler: Toplama, Çýkarma, Çarpma, Bölme
//- Kullanýcýya 4 iþlemden birini seçeceði menüyü konsol ekrana yazdýrýn. Örneðin: 1-Toplama, 2-Çýkarma vb...
//- Ardýndan kullanýcýdan 2 adet tamsayý tipinde sayý girmesini isteyin. Bu girilen iki sayýyý deðiþkenlerde saklayýn.
//- Seçilen iþlem tipine göre matematiksel iþlemi yapýn ve konsol ekranýna yazdýrýn.

public class SoruCevap2 {
	  
		   
	public static void main(String[] args) {
		 System.out.println("---------------------------------- \n" + "Hesap Makinesine Hosgeldiniz \n" + "----------------------------------");
	      
		  System.out.println("Asaðýdakilerle islem yapabilirsiniz : \n" + "1. Toplama  \n" + "2. Cikarma  \n" + "3. Carpma   \n" + "4. Bölme    \n");

		  Scanner scanner = new Scanner(System.in);
	       
          System.out.println("Bir islem seciniz:  ");
          int islem = scanner.next().charAt(0);
	      
          if (!(islem == '1' || islem == '2' || islem == '3' || islem == '4')) {
              System.err.println("Hatali bir tuslama yaptýnýz. Lütfen 1-2-3 ya da 4 e basýn");
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
              System.err.println("Tanýmlanmayan islem.");
          }
          
          if(islem > 0 && islem < 5) {
              System.out.println("Lütfen 1 ile 4 arasýnda bir sayý giriniz");
              
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
		