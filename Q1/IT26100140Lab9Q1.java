import java.util.Scanner;
public class IT26100140Lab9Q1{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter value a:");
double a = sc.nextInt();
System.out.print("Enter value b:");
double b = sc.nextInt();
System.out.print("Enter value c:");
double c = sc.nextInt();
double d = discriminant (a,b,c);
double r1 = root1(a,b,d);
double r2 = root2(a,b,d);
System.out.println("Root 1 =" + r1);
System.out.print("Root 2 =" + r2);
}
public static double discriminant (double a,double b,double c){
	return Math.pow(b,2)-(4*a*c);
}
public static double root1(double a,double b,double d){
	return (-b+Math.sqrt(d))/(2*a);
}
public static double root2(double a,double b,double d){
	return (-b-Math.sqrt(d))/(2*a);
}
}


