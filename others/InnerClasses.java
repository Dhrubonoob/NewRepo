
//inner classes can be static but outer classes cannot be static
public class InnerClasses{
	
	//this class test is doesn't dependent on the inner class so it is static
	static class Test{
		String name;
		
		public Test(String name){
			this.name = name;
		}
	}
	
	public static void main(String args[]){
		Test ob = new Test("dhrubo");
		System.out.println(ob.name); 
	}
}