package p1;
import java.util.*;
public class Student {
	TechSkills ob = null;
	String Name,Branch;
	long rollno;
	public Student(TechSkills ob)
	{
		this.ob = ob;
	}
	public void SetData(Scanner sc)
	{
		Name = sc.nextLine().toUpperCase();
		Branch = sc.nextLine().toUpperCase();
		rollno = Long.parseLong(sc.nextLine());
		ob.lang = sc.nextLine().toUpperCase();
		ob.tools = sc.nextLine().toUpperCase();
		ob.scr_langs = sc.nextLine().toUpperCase();
	}
	public void getdata()
	{
		int i=1;
		StringTokenizer st =null;
		System.out.println("Name "+Name);
		System.out.println("Branch: "+Branch);
		System.out.println("Roll no: "+rollno);
		st = new StringTokenizer(ob.lang,",");
		System.out.println("Programming Languges:");
		while(st.hasMoreElements())
		{
			System.out.println(i+++"."+st.nextToken());
		}
		st = new StringTokenizer(ob.tools,",");
		i=1;
		System.out.println("Tools: ");
		while(st.hasMoreElements())
		{
			System.out.println(i+++"."+st.nextToken());
		}
		st = new StringTokenizer(ob.scr_langs,",");
		i=1;
		System.out.println("Scripting Languages: ");
		while(st.hasMoreElements())
		{
			System.out.println(i+++"."+st.nextToken());
		}
	}
}
