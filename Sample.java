package Constructor;

public class Sample {
Sample(){
	System.out.println("non para");
}
Sample(int a)
{
	System.out.println(a);
}
Sample(double d)
{
	System.out.println(d);
}
Sample(int a, double b)
{
	System.out.println(a);
}
Sample(float f)
{
	System.out.println(f);
}
Sample(String name)
{
	System.out.println(name);
}
	public static void main(String[] args) {
               new Sample();
                  new Sample(1);
                  new Sample(234.456);

                  new Sample(21, 324.57);
                  new Sample(32.23);

                  new Sample("radha");

	}

}
