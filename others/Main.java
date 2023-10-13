public class Main{
	public static void main(String args[]){
		Human dhrubo = new Human(23, "ronaldo", 23000, false);
		Human chagol = new Human(30, "gadha", 22000, true); 
		
		//System.out.println(dhrubo.population);
		//System.out.println(chagol.population);
		
		//System.out.println(Human.population);
		//System.out.println(Human.population);  
		
		//String naam = "goru";
		//System.out.println(chagol.name);
		//System.out.println(naam);
		
		Main ob = new Main();
		
		greeting();
		ob.fun();
	}
	
	static void greeting(){
		System.out.println("hello world");
		
	} 	
	
	void fun(){
		System.out.println("having fun");
		//greeting();
	}
}