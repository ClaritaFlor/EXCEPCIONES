import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      int n;
	      do{
	           try{
	                 System.out.print("Introduce un número entero > 0: ");
	                 n = sc.nextInt();
	                 System.out.println("Número introducido: " + n);
	          }catch(InputMismatchException e){
	                       sc.nextLine();
	                       n = 0;
	                       System.out.println("Debe introducir un número entero " + e.toString());
	          }
	      }while(n<=0);
	}

}
