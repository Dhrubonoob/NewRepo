public class StaticBlock{
	static int a = 4;
	static int b;
	
	
	static {
		System.out.println("i am inside the static block");
		b = a * 5;
	}
	
	public static void main(String args[]){
		
		//as soon as this class is loaded "StaticBlock" all the static elements reun first
		StaticBlock obj = new StaticBlock();
		System.out.println(obj.a + " " + obj.b);
		System.out.println(StaticBlock.a + " " + StaticBlock.b);
	}
}	