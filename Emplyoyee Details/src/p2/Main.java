package p2;
import p1.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee(sc.nextLine(),sc.nextLine(), 
			Float.parseFloat(sc.nextLine()));
		
		Address ad = new Address(sc.nextLine(), sc.nextLine(),
						sc.nextLine(), sc.nextInt());
		e.getData();
		ad.getData();
		sc.close();
		e =null; ad =null;
	}

}
