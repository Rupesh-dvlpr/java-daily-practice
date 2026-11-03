package varArgs;

public class StudentMarksCalculation {

	public static void main(String[] args) {
		IO.println("============STUDENT MARKS CALCULATION================");
		String studentName = IO.readln("Enter Student Name : ");
		
		StudentMarksCalculation studentMarksCalculation = new StudentMarksCalculation();
		studentMarksCalculation.calculateResult(studentName, 80, 60, 75, 90, 78);
	}
	
	public void calculateResult(String studentName, double ...marks) {
		double total = 0;
		for(double mark : marks) {
			total += mark;
		}
		IO.println("Student Name : "+studentName+"\ntotal marks : "+total+"\nAverage : "+(total/marks.length));
	}

}
