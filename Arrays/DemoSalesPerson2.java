

/*Author:		Peter Eugene Mbanda
*Purpose:		Create main method to execute class sales person
*Date:			4/20/2015
*/
public class DemoSalesPerson2
{
	//create the class fields 
	public static int x;
	public static final int NUMBER_SALES_PERSON = 10;
	public static SalesPerson [] employeeSales = new SalesPerson[NUMBER_SALES_PERSON];
	public static int startingID = 111 ;
	public static double initialSaleValue = 25000.00;

	public static void main(String[] args) 
	{
		//use of the for loop to iterate over the array 
		for ( x = 0 ; x < NUMBER_SALES_PERSON  ; ++x ) 
		{
			employeeSales[x] = new SalesPerson( startingID + x , initialSaleValue );
			initialSaleValue += 5000;//increment by 5000 and assign to the variable
		}
		//call the method to display the values in the array 
		displayArray();

	}
	//create a void method to display the results in the array 
	public static void displayArray()
	{
		for ( int x = 0 ; x < NUMBER_SALES_PERSON  ; ++x ) 
		{
			System.out.println("Employee " + ( x + 1 ) + " has an ID number " + employeeSales[x].getIdNumber() 
				+ " and salary amount of $" + employeeSales[x].getSalesAmount() );
		}
	}
}