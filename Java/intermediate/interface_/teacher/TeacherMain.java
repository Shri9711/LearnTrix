package interface_.teacher;

public class TeacherMain {
	public static void main(String[] args) {
		Teacher mTeacher = new MathTeacher();
		
		mTeacher.teach();
	}
}
