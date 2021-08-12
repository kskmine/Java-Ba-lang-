import java.util.InputMismatchException;
import java.util.Scanner;

public class SoruCevap2SwitchCase {
	  public static void main(String[] args) {

		  System.out.println("---------------------------------- \n" + "Hesap Makinesine Hosgeldiniz \n" + "----------------------------------");
	      
		  System.out.println("Asaðýdakilerle islem yapabilirsiniz : \n" + "1. Toplama (+) \n" + "2. Cikarma (-) \n" + "3. Carpma  (*) \n" + "4. Bölme   (/) \n"+"5. Çikis");

	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.println("Bir islem seciniz: (+  -  *  /) ");
	            char islem = scanner.next().charAt(0);

	            if (!(islem == '+' || islem == '-' || islem == '*' || islem == 'x' || islem == '/')) {
	                System.err.println("Hatali bir tuslama yaptýnýz. Lütfen + , - , * , /");
	            }

	            System.out.println("Ilk sayiyi giriniz: ");
	            int num1 = scanner.nextInt();

	            System.out.println("Ikinci sayiyi giriniz: ");
	            int num2 = scanner.nextInt();

	            SoruCevap2 hm = new SoruCevap2();
	            
	            switch (islem) {
	            case '+':
	                System.out.println(num1 + " + " + num2 + " = " + hm.add(num1, num2));
	                break;
	            case '-':
	                System.out.println(num1 + " - " + num2 + " = " + hm.subtract(num1, num2));
	                break;
	            case '*':
	                System.out.println(num1 + " x " + num2 + " = " + hm.multiply(num1 , num2));
	                break;
	            case 'x':
	                System.out.println(num1 + " x " + num2 + " = " + hm.multiply(num1 ,num2));
	                break;
	            case '/':
	                System.out.println(num1 + " / " + num2 + " = " + hm.divide(num1 , num2));
	                break;
	            default:
	                System.err.println("Tanýmlanmayan islem.");
	                break;
	            }
	        } catch (InputMismatchException exc) {
	            System.err.println(exc.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
}
