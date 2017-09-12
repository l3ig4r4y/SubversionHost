package taxes;

public class TaxCalculator 
{
	String 	empName 		= null;
	boolean isIndian 	= false;
	double 	empSal 		= 0.0;
	
	@SuppressWarnings("finally")
	public double calculateTax()
	{	
		double tax = 0.0;
		try 
		{
			if		(empName == null || empName.equalsIgnoreCase(""))
			{
				throw new EmployeeNameInvalidException();
		}
			else if	(isIndian == false)
			{
				throw new CountryNotValidException();
			}
			else if	(empSal > 100000) 
			{	
				tax		=	empSal * 0.08;
			}
			else if	(empSal > 50000) 
			{
				tax		=	empSal * 0.06;
			}
			else if	(empSal > 30000) 
			{
				tax		=	empSal * 0.05;
			}
			else if	(empSal > 10000) 
			{
				tax		=	empSal * 0.04;
			}
			else throw new TaxNotEligibleException();
		}
		
		catch(CountryNotValidException e)		{}
		catch(EmployeeNameInvalidException e)	{}	
		catch(TaxNotEligibleException e)			{}
		
		finally
		{
			return tax;
		}	
	}
}
