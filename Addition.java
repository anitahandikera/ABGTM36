package Constructor;// constructor overloading developing multiple constructor with name same as class 
//but variation in argumenst list

public class Addition{
	Addition(int a, int b)// constructor method always non static 
	{
		int sum=a+b;
		System.out.println(sum);
	}
	Addition(int a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
}
	Addition()
	{
		int a=10;
	
	System.out.println(a);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Addition(1,2); // constructor called at time of object creation

		new Addition(1,2.3);
	new Addition();
		//System.out.println(a);
	}

}
