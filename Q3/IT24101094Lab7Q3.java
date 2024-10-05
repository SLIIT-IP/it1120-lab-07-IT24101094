        import java.util.Scanner;
        public class IT24101094Lab7Q3{
        public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
        int cus =1,totalbill,count=1;
	double discount,amount_to_be_paid;
	char mode;
	
	while ( cus <= 5){
	System.out.print("Customer "+cus);
	System.out.print("Enter total bill amount :");
	totalbill = input.nextInt();
	
	System.out.print("Enter mode of payment ( C for cash, o for other): ");
	mode = input.next().charAt(0);
	
	if ( mode == 'C' || mode == 'c') {
	discount = totalbill*0.5;
	System.out.print("Discount is :"+discount);
	amount_to_be_paid = totalbill - discount;
	System.out.println("Amount to be paid :"+amount_to_be_paid);}
	
	else if ( mode == 'O' || mode == 'o') {
	discount = totalbill*0.5;
	System.out.print("Discount is :"+discount);
	amount_to_be_paid = totalbill - discount;
	System.out.print("Amount to be paid :"+amount_to_be_paid);}

	else 
	System.out.println("Payment mode not valid");
		


	System.out.println();
	cus++;}	
	

	


}
}