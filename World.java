package Constructor; // constructor are special type of method, it does not have return type

public class World { 
	                     
	World(String a)// constructor method, with para 
	{                                         // it has default access specifier 
		System.out.println(1);
	}

	public static void main(String[] args) {
		//new World("hello");// object 
		World w1=new World("hiiiiiiiii"); // 1
                new World("hi") ;// 2   :we can create object in this 2 ways also
	}

}
