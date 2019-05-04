package conditional_statements;

public class Nested_if {

	public static void main(String[] args) {
		int x = 10;
		if (x<=10)
		{
			
			if (x<=5)
			{
				System.out.println("less than or equal to 5");
			}
			else
			{
				System.out.println("less than or equal to 10");
			}
		}
		else
		{
			System.out.println("grater than 10");
		}

	}

}
