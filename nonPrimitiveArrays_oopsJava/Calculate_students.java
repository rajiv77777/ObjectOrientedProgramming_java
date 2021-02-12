package nonPrimitiveArray;

public class Calculate_students {
	
	public static void isPresent(StudentsDetails[] c)
	{
		for(StudentsDetails itr:c)
		{
			if(itr.getName().equals("ramki"))
			{
				System.out.println("Ramki is present");
			}
		}
	}
	
	public static void getNum(StudentsDetails[] c1,String name)
	{
		for(StudentsDetails itr1: c1)
		{
			if(itr1.getName().equals(name))
			{
				int res=itr1.getRollno();
				System.out.println(name + " " +"index number is"+res);
			}
		}
	}
	
	public static void getNumberOfStudents(StudentsDetails[] c2,int age)
	{
		for(StudentsDetails itr2:c2)
		{
			if(itr2.getAge() == 19)
			{
				String na=itr2.getName();
				System.out.println("The name with age 13 are "+na);
			}
		}
	}
	
}
