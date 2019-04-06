
public class CourseTest 
{

	public static void main(String[] args)
	{
		Course science = new Course("science");
		science.addStudent("Jack");
		science.addStudent("Tanner");
		science.addStudent("Tim");
		science.dropStudent("Tim");
		
		System.out.println("Students: ");
		String[] st = science.getStudents();
		for (int i = 0; i < science.getNumberOfStudents(); i++)
		{
			System.out.println(st[i]);
		}
	}

}
