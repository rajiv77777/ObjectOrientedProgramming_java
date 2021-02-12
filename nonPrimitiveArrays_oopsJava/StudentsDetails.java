package nonPrimitiveArray;

public class StudentsDetails {
	private int age;
	private int rollno;
	private String name;
	
	public StudentsDetails(int age, int rollno, String name) {
		super();
		this.age=age;
		this.rollno=rollno;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
