
public class Student {
	int rollnos;
	String name;
	int marks;
	private void input(int r, String n, int m) {
		rollnos= r;
		name= n;
		marks= m;
	}	
	private void display() {	
		System.out.println("Roll nos:"+rollnos+" Name:"+name+" Marks:"+marks);				
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.input(1,"Ashish", 45);
		s1.display();
		Student s2 = new Student();
		s2.input(2,"Bharath", 25);
		s2.display();
		Student s3 = new Student();
		s2.input(3,"Catherine", 65);
		s2.display();	
	}
}


