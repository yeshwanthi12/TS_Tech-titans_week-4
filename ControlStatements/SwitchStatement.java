package ControlStatements;

public class SwitchStatement {
	public static void main(String args[])
	{
		int number=7;
		String  month;
		switch(number) {
 case 1:
     month = "jan";
     break;
 case 2:
     month = "feb";
     break;	
 case 3:
	 month = "march";
	 break;	
 case 4:
	 month = "april";
	 break;	
 case 5:
	 month = "may";
	 break;	
 case 6:
	 month = "june";
	 break;
 case 7:
	 month = "july";
	 break;
 case 8:
	  month = "august";
	  break;	
case 9:
     month = "sep";
	 break;	
case 10:
	month = "october";
	break;	
case 11:
    month = "novmber";
	break;	
case 12:
	month = "december";
	break;
default:
	month = "invalid";
	break;
	}
System.out.println(month);
}
}


		 

