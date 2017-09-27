import java.io.FileReader;
import java.util.*;
public class RestaurantManagementSystem
{
 public int menu() 
 {
  int sp1=0,sp2=0,sp3=0,tsp=0,mp1=0,mp2=0,mp3=0,tmp=0,tp=0, dp1=0,dp2=0,dp3=0,tdp=0, sp11=0,sp22=0,sp33=0,tsp1=0,mp11=0,mp22=0,mp33=0,tmp1=0,tp1=0,dp11=0,dp22=0,dp33=0,tdp1=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("\n===============================\n");
  System.out.println("Customer orders food");
  System.out.println("\n==========================\n");
	 while(true)
	  {
		System.out.println("\nEnter your order or if you are satisfied enter 4");  
        int order=sc.nextInt();
		switch(order)
		{
		  case 1: System.out.println(" select your starter and quantity");
		          int so=sc.nextInt();
				  int sq=sc.nextInt();
				  System.out.println(" order-"+so+"\n quantity-"+sq);
				  if(so==1) 
					 sp1=100*sq;
				  if(so==2)
					 sp2=120*sq;
				   if(so==3)
					 sp3=150*sq;
				     break;
		  case 2: System.out.println(" select your main course and quantity");
		          int mo=sc.nextInt();
				  int mq=sc.nextInt();
				  System.out.println(" order-"+mo+"\n quantity-"+mq);
				  if(mo==1)
					mp1=200*mq;
				  if(mo==2)
					mp2=180*mq;
				  if(mo==3)
					mp3=150*mq;
				  break;
		  case 3: System.out.println(" select your Desert and quantity");
		          int ko=sc.nextInt();
				  int dq=sc.nextInt();
				  System.out.println(" order-"+ko+"\n quantity-"+dq);
				  if(ko==1)
					dp1=50*dq;
				  if(ko==2)
					dp2=60*dq;
				  if(ko==3)
					dp3=50*dq;
				     break;
		  case 4: System.out.println("SATISFIED"); 
			      tsp=sp1+sp2+sp3;
		          tmp=mp1+mp2+mp3;
		          tdp=dp1+dp2+dp3;
		          tp=tsp+tmp+tdp;
				  return tp;
		}//switch
	}//while
}//menu
public void feedback()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("\nCUSTOMER FEEDBACK");
  System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
  System.out.println("\n1.Excellent\n2.Good\n3.Average\n4.bad");
  int fd=sc.nextInt();
  switch(fd)
  {
    case 1:System.out.println("\nMANAGER:Thank you so much sir:-)");break;
	case 2:System.out.println("\nMANAGER:thank you sir ");break;
	case 3:System.out.println("\nMANAGER:thank you sir...we will improve");break;
    case 4:System.out.println("\nMANAGER:sorry sir...we will improve");break;
  }//switch
}//feedback
public static void main(String[] args) throws Exception
{
  Scanner sc=new Scanner(System.in);
  RestaurantManagementSystem rms=new  RestaurantManagementSystem();
  while(true)
  {
    System.out.println("is customer arriving 1.yes 2.no");
    int ch=sc.nextInt();
    if(ch==1)
	{
	  label:while(true)
		{
         System.out.println("Customer is for 1.Dine 2.Take away");
		 int cd=sc.nextInt();
		 if (cd==1)
		  {
	       System.out.println("\nEnter customer number ");  
           int cn=sc.nextInt();
		   System.out.println("\nCustomer "+cn+" walks in");
		   System.out.println("\n==========================\nAllot a table to the customer "+ cn);
		   int tn=sc.nextInt();
           System.out.println("\n==========================\nCustomer "+cn+" sits at table "+ tn);
		   System.out.println("\n==========================\nBus boy serves water to customer "+ cn +" at table "+ tn);
		   System.out.println("\n==========================\nManager shows the menu\n===========================\n");
		   FileReader fr= new FileReader("D:\\Test.txt");
		   int i;
		   while ((i=fr.read())!=-1)
           System.out.print((char)i);
		   fr.close();
		   int tp=rms.menu();
           System.out.println("\n==========================\nManager places order to Executive chef");
		   System.out.println("\n=======================================\n");
		   System.out.println("Executive chef gets order and instructs the line cooks to prepare the order quickly\n===================================================================================\n");
   		   System.out.println("The server serves the food to table"+ tn+"\n=========================================\n");
		   System.out.println("\nBILLING");
		   System.out.println("-*-*-*-*-\nTotal bill to be paid by the customer "+cn+" is Rs."+tp);
		   System.out.println("\n==========================================\nBill paid by the customer is Rs."+tp+"\n==========================================\n");
		   rms.feedback();
		   System.out.println("\n======================================\nPayment is registered in the cash register\n===========================================\n");
		   System.out.println("Boy cleans the table "+tn+"\n===========================================\n");
		   break label;
		  }//if(cd==1)
		 if (cd==2)
		  {
		   System.out.println("Enter customer number ");  
           int cn=sc.nextInt();
		   System.out.println("\nCustomer "+cn+" walks in");
		   System.out.println("\n==========================");
		   FileReader fr= new FileReader("D:\\Test.txt");
		   int i;
		   while ((i=fr.read())!=-1)
           System.out.print((char)i);
		   fr.close();
		   int tp=rms.menu();
		   System.out.println("\nParcel received to customer "+ cn+"\n=========================================\n");
		   System.out.println("\nBILLING\n-*-*-*-*\nTotal bill to be paid by the customer "+cn+" is Rs."+tp);
		   System.out.println("\n==========================================\nBill paid by the customer is Rs."+tp+"\n==========================================\n");
		   rms.feedback();
		   break label;
	      }//if(cd==2)
		}//while
	 }//if(ch==1)
    else System.exit(1);
  }//while
  }//main
}//class
