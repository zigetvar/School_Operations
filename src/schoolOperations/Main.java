package schoolOperations;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Altun","Kerim","454384",1478,90);
		Student[] students = new Student[] {student1};
		StudentManager studentManager = new StudentManager();
		
		Instructor ınstructor1 = new Instructor(2, "Demiroğ", "Engin", "88545","Yazılım Geliştirme");
		InstructorManager ınstructorManager = new InstructorManager();
		Instructor[] ınstructors = new Instructor[] {ınstructor1};
		
		for (Student student : students) {
			System.out.println(student.getFirstName()+student.getLastName());
			studentManager.chooseInstructor(ınstructor1.getFirstName(),ınstructor1.getLastName() );
			
			
			
		}
		for (Instructor instructor : ınstructors) {
			System.out.println(instructor.getFirstName()+instructor.getLastName());
			ınstructorManager.studentsWhoChose(student1.getFirstName(),student1.getLastName());
		}
		
		
		

	}

}
