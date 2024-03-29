import java.util.ArrayList;

public class Course
{
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>(100);
	
	public Course(String courseName) 
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student) 
	{
		students.add(student);
	}

	public String getCourseName() 
	{
		return courseName;
	}

	// JA: You should not change the contract of the method
	public ArrayList<String> getStudents() 
	{
		return students;
	}

	public int getNumberOfStudents() 
	{
		return students.size();
	}
	
	public void dropStudent(String student) 
	{
		students.remove(student);
	}
		
}

