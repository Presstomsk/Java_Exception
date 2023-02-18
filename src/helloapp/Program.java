package helloapp;



public class Program {
	  public static void main(String[] args) {
		   
		  try{
		        int number = -2; 
		        Validator.NumberValidator(number);
		        System.out.println(number);		        
		    }
		  catch(NonPositiveException ex){		         
			   
			  	System.out.println(Exceptions.NON_POSITIVE_EXCEPTION + ":" + NonPositiveException.serialVersionUID);
		        System.out.println(ex.getMessage());
		        System.out.println(ex.getNumber());		        
		    }
	  }
}

enum Exceptions{
	NON_POSITIVE_EXCEPTION,
	EXCEPTION
}

class NonPositiveException extends Exception{
	public static final long serialVersionUID = 1201030038691748218L;
	private int number;
    public int getNumber(){return number;}
    
    public NonPositiveException(String message, int num){     
        super(message);        
        number = num;
    }
}

class Validator{
	 
    public static void NumberValidator(int num) throws NonPositiveException{     
        
        if(num<0) throw new NonPositiveException("The number is non-positive", num);        
       
    }
}


