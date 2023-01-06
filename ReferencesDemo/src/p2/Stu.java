package p2;
import java.util.Scanner;
import p1.*;
public class Stu {

	public static void main(String[] args) {
		Student st = new Student(new TechSkills());
		st.SetData(new Scanner(System.in));
		st.getdata();
	}

}
