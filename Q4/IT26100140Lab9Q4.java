import java.util.Scanner;
public class IT26100140Lab9Q4{
public static void main(String [] Args){
	String [] name = new String [5];
	double [] finalMark = new double [5];
	char [] grade = new char [5]; 
	Scanner sc =  new Scanner (System.in);
	for ( int i=0;i<5;i++){
		System.out.print("\nEnter the Student name:");
		name [i] = sc.next();
	    System.out.print("Enter the assignmnet mark:");
		double assignmentMark = sc.nextDouble();
		System.out.print("Enter the exam paper mark:");
		double examPaperMark = sc.nextDouble ();
		finalMark [i] = calcFinalMark(assignmentMark, examPaperMark);
		grade [i] = findGrades(finalMark[i]);

	}
	printDetails(name, finalMark, grade);
	
		
}

public static double calcFinalMark(  double assignmentMark , double examPaperMark){
	double finalMark = assignmentMark*0.3 + examPaperMark*0.7;
	return finalMark;
}
public static char findGrades( double finalMark){
	if ( finalMark >=75){
		return 'A';
	}
	else if (finalMark>=60){
		return'B';
	}
	else if ( finalMark >=50){
		return'C';
	}
	else {
		return 'F';
	}
}
 public static void printDetails(String[] name, double[] finalMark, char[] grade) {
        System.out.println("Name\tFinal Mark\tGrade");

       
    for (int i = 0; i < 5; i++) {
		System.out.println(name[i] + "\t" + finalMark[i] + "\t" + grade[i]);
		}
	
	

}
}