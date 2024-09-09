package polymorphism;


//method overriding...............................


public class RunTime_PolyMorPhism_Child extends RunTime_PolyMorPhism_parent{
	public void Team() {
		System.out.println("team method from Child class");
		
	}
	
	public void mate(float a) {
		System.out.println("Mate method from Child class");
		
	}
	public static void main(String[] args) {
		
		RunTime_PolyMorPhism_Child ref=new RunTime_PolyMorPhism_Child(); //Is a Relationship
		ref.Team();
		ref.mate(0);
		
		System.out.println("*****************************************");
		
		
		
		RunTime_PolyMorPhism_parent ref2=new RunTime_PolyMorPhism_parent(); //HAS a Relationship
		ref2.Team();
		ref2.mate(0);
		System.out.println("*****************************************");
		
		
		
		
		RunTime_PolyMorPhism_parent ref3= new RunTime_PolyMorPhism_Child(); //3rd proparty of inharitance
		ref3.Team();
		ref3.mate(0);
	}

}
