    import java.util.Scanner;
    public class IT24101094Lab7Q1A{
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter marks for four subjects:");
    
    double subjectmarks=0;
    int i=1;
    int marks;
 
    while(i<5){
    System.out.print("Enter Subject Mark " +i+ ":");
    marks=scanner.nextInt();
    i++;
    subjectmarks= subjectmarks+marks;

    }
    
    double average=subjectmarks/4.0;
    System.out.println("Average is :" +average);
    
    
    if(average>=75 && average<=100){
    System.out.println("Overall Grade is : Distinction");
    }
    else if(average>=50){
    System.out.println("Overall Grade is : Credit");
    }
    else{
    System.out.println("Overall Grade is : Fail");
    }
}
}
     

    
    
     