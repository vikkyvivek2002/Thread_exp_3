 class A extends Thread {
	public void run()
	{
		System.out.println("I am thread A-1");
		System.out.println("I am thread A-2");
		System.out.println("I am thread A-3");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("I am thread B-1");
		System.out.println("I am thread B-2");
		System.out.println("I am thread B-3");
	}
}

	class C extends Thread
	{
		public void run()
		{
			System.out.println("I am thread C-1");
			System.out.println("I am thread C-2");
			System.out.println("I am thread C-3");
		}
	}
	
		
	public class Thread_exp_3
 {
	public static void main(String[] args) {
		new A().start();
		new B().start();
		new C().start();

	}

}
