package string_methods;

public class String_all_methods {

	public static void main(String[] args) {
	
		
		//1st way to 
		String Bro="1cup-chay please"; 
		
		String bhai=" sakt londa";
		
		
		//is emty 
		System.out.println(Bro.isEmpty());
		
		
		// lenth method
		System.out.println(Bro.length());
		
		
		
		//replace method
    	System.out.println(Bro.replace("1cup", "2 bashi"));
    	
    	
    	
    	//index
    	System.out.println(Bro.indexOf("p"));
    	
    	
    	//charat 
        System.out.println(Bro.charAt(11));
        
        
        //to lower case
        System.out.println(Bro.toLowerCase());
        
        
        //to upper case
        System.out.println(Bro.toUpperCase());
        
        //to compare method
       System.out.println(Bro.equals(bhai)); 
       
       // concat method
       System.out.println(Bro.concat(bhai));
        
       
      //substing method
        System.out.println(Bro.substring(0, 4));
        
      //substring method
        System.out.println(Bro.substring(4));
        
        System.out.println();
      
      
		
	}

}
