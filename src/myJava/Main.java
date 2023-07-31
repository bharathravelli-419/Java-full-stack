package myJava;

//Principles of OOP

/*
 1.Abstraction :Hiding internal details and showing required features/functionality.
 2.Encapsulation :Bundling data ,methods into a class and controlling access to them using access modifiers.
 3.Inheritance (Specialization): Inheriting the properties and methods from parent class to the extending class according to the access modifiers.
 4.Polymorphism (Generalization): Having more than one form.
 
 
 */


class Subject{
	public Subject(String subId,String subName,int maxMarks) {
		this.subId = subId;
		this.subName = subName;
		this.maxMarks = maxMarks;
	}
	private String subId;
	private String subName;
	private int maxMarks;
	private int marks;
	
	public String getSubId() {
		return this.subId;
	}
	public String getSubName() {
		return subName;
	}
	public int getMaxMarks() {
		return this.maxMarks;
	}
	public int getMarks() {
		return this.marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString() {
		return ("subID:"+this.subId+"\n"+"subName:"+subName+"\n"+"MaxMarks:"+this.maxMarks+"\n"+"Marks:"+marks);
	}
}

class Student{
	public Student(String studentId,String name,String dept) {
		this.studentId=studentId;
		this.name = name;
		this.dept = dept;
		this.subjects = new Subject[3];
	}
	private String studentId;
	private String name;
	private String dept;
	private Subject[] subjects;
	private int i=0;
	
	public String getStudentId() {
		return studentId;
	}
	public void setSubject(Subject subject) {
		if(i<3) {
			subjects[i++] = subject;
			
		}else {
			System.out.println("Max. Subjects are allocated. ");
		}
	}
	public String toString() {
		String res="";
		for(int j=0;j<i;j++)
			res += subjects[j].toString()+"\n";
		
		return (
				"Student Name:"+name+"\n"+
		        "Student Id:"+studentId+"\n"+
				"Department:"+dept+"\n"+"\n"+
				"Subjects and Scores:"+ "\n"+"\n"+
				res
				);
	}
}

public class Main {
    
	public static void main(String[] args) {
       
		Subject s1 = new Subject("19IT01","C Programming",100);
		s1.setMarks(91);
	//	System.out.println(s1.toString());
		Student student1 = new Student("Ravelli Bharath","19501A1292","IT");
		student1.setSubject(s1);
		System.out.println(student1.toString());
		

	}

}
