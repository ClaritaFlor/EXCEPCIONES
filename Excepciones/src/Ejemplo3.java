import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     int n1, n2;
	     try {
	            System.out.print("Introduce un número: ");
	            n1 = sc.nextInt();
	            try {
	                    System.out.print("Introduce otro número: ");
	                    n2 = sc.nextInt();
	                    System.out.println(n1 + " / " + n2 + " = " + n1/(double)n2);
	            }catch (InputMismatchException e) {
	                       sc.nextLine();
	                       n2 = 0;
	                       System.out.println("Debe introducir un número");
	            }catch (ArithmeticException e) {
	                       sc.nextLine();
	                       n2 = 0;
	                       System.out.println("No se puede dividir por cero");
	            }
	     }catch (InputMismatchException e) {
	                sc.nextLine();
	                n1 = 0;
	                System.out.println("Debe introducir un número");
	     }
	}

}
