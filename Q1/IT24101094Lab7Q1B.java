import java.util.Scanner;
public class IT24101094Lab7Q1B{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int mark1,mark2,mark3,mark4;
	int l=1;
	double avg,sum;
	
        while(l<4){
        System.out.println("Student"+l);
        l++;
	System.out.print("Enter marks : ");
	mark1 = input.nextInt();
	mark2 = input.nextInt();
	mark3 = input.nextInt();
	mark4 = input.nextInt();
	sum = mark1 + mark2 + mark3 + mark4;
	avg = sum/4;
	System.out.println("Average is :"+avg);
	if ( avg >= 75 && avg <=100) {
	System.out.println("Overall Grade is : Distinction");
	System.out.println(" ");
}
	
	else if ( avg >= 50 && avg <75){
	System.out.println("Overall Grade is : Credit");}
	else 
	System.out.println("Overall Grade is : Fail");

}
}
}