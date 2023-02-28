package chi.com.pricipal;

public class ValidaInput
{
	   Object input = null;
	   String res = "null";
	   
	   
      public ValidaInput(Object input)
      {
    	  this.input = input;
      }
      
      public void get_input(Object input)
      {
    	  this.input = input;
      }
      
      
      
      public boolean isNumber() 
  	{
    	  boolean res = false;
    	  String valor = "null";
    	  if(input != null)
    	  {
    		  valor = input.toString();
    	  }
    		  
  		try 
  		{
  			Integer.parseInt(valor);
  			res = true;
  		}
  		
  		catch (NumberFormatException exep)
  		{
  			res = false;
  		} 		
    	  
    	  
  		return res;
  	}
      
      public String convertir_a_String()
      {
    	  if(input!=null)
    	  {
    		  res= input.toString(); 
    	  }    	  
    	  return res;
      }
      
      public boolean noEs_Null()
      {
    	  return input!=null;    	  
      }
      
      
      
      
      
}
