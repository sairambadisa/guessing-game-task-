import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup sg=new StudentGroup(10);

	Date d=new Date(1996,11,20);
	Student s1=new Student(22,"xyz",d,82.0);

                sg.addFirst(s1);

              System.out.println(sg.getStudent(0).getId());







	}

}
