
public class Course 
{
	private String courseName;
	private String[] students = new String[30];
	private int numberOfStudents;
	
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		students[numberOfStudents] = student;
		numberOfStudents++;
		if (students[students.length - 1] != null)
		{
			String[] students1 = new String[students.length + 4];
			for (int i = 0; i < students.length; i++)
			{
				students1[i] = students[i];
				
			}
		}
	}

	public String getCourseName()
	{
		return courseName;
	}

	public String[] getStudents() 
	{
		return students;
	}

	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}
	
	public void dropStudent(String student)
	{
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}

	public void clear()
	{
		for (int i = 0; i < students.length; i++)
		{
			students[i] = null;
		}
	}

}