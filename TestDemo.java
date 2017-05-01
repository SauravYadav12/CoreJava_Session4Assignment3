class C {
	public void test()
	{
		System.out.println("Hello C");
	}
}

class B extends C {
	
	public void test()
	{
		System.out.println("Hello B");
	}
}

class A extends B {
	A()
	{
	super.test();
	}
	public void test()
	{	
		System.out.println("Hello A");
	}
}

class TestDemo
{
	public static void main(String[] args)
	{
		A a = new A();
		a.test();
		
	}
}


// The answer will be 
// f. It is not possible to invoke test() method defined in C from a method in A.


// We are performing multilevel inheritance , if we will directly access the method of C
// without creating its instance then the encapsulation will break. 
	