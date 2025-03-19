import java.util.Scanner;

public class Test{
public static void main(String [] ar){
double total=0;
int quant=0;
System.out.println("***************Hello Welcome to indian Basic Resto**********************");
System.out.println("Give your order");
boolean exit=false;
System.out.println("***************Menu*************");
System.out.println("press 1.idely Rs 50");
System.out.println("press 2.Dal chawal RS 20");
System.out.println("press 3. poha RS 10");
System.out.println("press 10. for Total bill");
Scanner sc=new Scanner(System.in);
while(!exit){
switch (sc.nextInt()){
case 1:
	System.out.println(" you pressed 1 for idely");
	System.out.println("Enter Quantity");
	quant=sc.nextInt();
	quant=quant*50;
	total=total+quant;
	System.out.println("Order more press item number and for Bill  press 5 ");
	break;
case 2:
	System.out.println(" you pressed 2 for Dal Chawal");
	System.out.println("Enter Quantity");
	quant=sc.nextInt();
	quant=quant*20;
	total=total+quant;
	quant=0;
	System.out.println("Order more press item number and for Bill  press 5 ");
	break;
case 3:
	System.out.println(" you pressed 3 for poha");
	System.out.println("Enter Quantity");
	quant=sc.nextInt();
	quant=quant*10;
	total=total+quant;
	quant=0;
	System.out.println("Order more press item number and for Bill  press 5 ");
	break;
default:
	System.out.println("Your Total bill : "+ total);
	exit=true;
	break;

}

}

sc.close();
}


}


