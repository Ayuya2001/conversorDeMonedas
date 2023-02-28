package chi.com.pricipal;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class FuncionTemp 
{
	String seleccion = "null";
	
	ConversorTemperaturas temperatura = null;
	JPanel panelReferencia = null;
	
	Object[] valoresPosibles = {" De Celsius a Fahrenheit ", " De Celsius a Kelvin ", "De Celsius a Rankine" ,
			" De Fahrenheit a Celsius "," Kelvin Celsius" ," Rankine Celsius "};
	
    public FuncionTemp (JPanel panelReferencia)
    { 
    	this.temperatura = new ConversorTemperaturas(panelReferencia);
    	this.panelReferencia = panelReferencia;
	}
    	
    	
    	public void convertirTemperatura (double valor)
        { 
        	
        	
        	Object input = JOptionPane.showInputDialog(panelReferencia,"Seleccione una opcion de conversion " , "Menu", JOptionPane.QUESTION_MESSAGE, null, valoresPosibles, valoresPosibles);
        	
        	if(input!=null) {seleccion = input.toString();}
        	switch (seleccion) 
        	{
    		
        	case " De Celsius a Fahrenheit "  :  { temperatura.convertir_Celsius_a_Fahrenheit(valor);	break;}
        	
        	case  " De Celsius a Kelvin " : {temperatura.convertir_Celsius_a_Kelvin(valor);  			break;}
        	
        	case  "De Celsius a Rankine" : { temperatura.convertir_Celsius_a_Rankine(valor); 			break;}
        	
        	case  " De Fahrenheit a Celsius " : {temperatura.convertir_Fahrenheit_a_Celsius(valor);  	break;}
        	
        	case  " Kelvin Celsius"  : {temperatura.convertir_Kelvin_a_Celsius(valor);  				break;}
        	
        	case  " Rankine Celsius ": {temperatura.convertir_Rankine_a_Celsius(valor);  				break;}     	
    //    
        	case "null": {break;}
    		}
    	
    	
    }
    
    
    
}
