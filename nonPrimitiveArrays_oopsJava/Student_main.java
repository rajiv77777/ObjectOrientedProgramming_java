package nonPrimitiveArray;

public class Student_main {
	
	public static void main(String[] args)
	{
		StudentsDetails stu[]=new StudentsDetails[3];
		stu[0] = new StudentsDetails(19,222,"rajiv");
		
		stu[1] = new StudentsDetails(21,221,"ram");
		
		stu[2] = new StudentsDetails(19,225,"ramki");
		
		Calculate_students.isPresent(stu);
		Calculate_students.getNum(stu,"rajiv");
		Calculate_students.getNumberOfStudents(stu, 19);
		System.out.println("Successfully Updated");
		
	}
}
