package taxes;

public class CalculatorSimulator 
{

	public static void main(String[] args) 
	{
		final String out = "Tax amount is ";
		double tax;
		
		TaxCalculator mycal = new TaxCalculator();

		mycal.empName 	= 	"Ron";
		mycal.isIndian 	= 	false;
		mycal.empSal 	= 	34000;
		tax				=	mycal.calculateTax();
		
		if(tax > 0)
		{
			System.out.println(out+tax);
		}

		mycal.empName 	= 	"Tim";
		mycal.isIndian 	= 	true;
		mycal.empSal 	= 	1000;
		tax				=	mycal.calculateTax();
		
		if(tax > 0)
		{
			System.out.println(out+tax);
		}
	
		mycal.empName	= 	"Jack";
		mycal.isIndian 	= 	true;
		mycal.empSal 	= 	55000;
		tax				=	mycal.calculateTax();
		
		if(tax > 0)
		{
			System.out.println(out+tax);
		}
		mycal.empName 	= 	"";
		mycal.isIndian 	= 	true;
		mycal.empSal 	= 	30000;
		tax				=	mycal.calculateTax();
		
		if(tax > 0)
		{
			System.out.println(out+tax);
		}
	}

}
