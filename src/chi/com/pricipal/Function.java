package chi.com.pricipal;

import javax.swing.*;


public class Function 
{
	 ConversorMonedas monedas = new ConversorMonedas();
	  String opciones = "null";
	
     public void ConvertirMonedas(Double valorRecibido, JPanel panelReferencia)
     {
    	
    	 monedas.getPanel(panelReferencia);
    	 
    	 Object[] valoresPosibles = {"De Pesos a Dolar" ,"De Pesos a Euro","De Pesos a Libras","De Pesos a Yen",
		      "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos"};
    	 
    	
    	 Object input = (JOptionPane.showInputDialog(panelReferencia, "Seleccione una opcion de conversion " , "Menu", 
    			            JOptionPane.QUESTION_MESSAGE , null,
    			            valoresPosibles 
    	                   ,valoresPosibles[1]  ) );   
    	 
    	 if(input!=null) {opciones = input.toString();}
    	 
    	 switch (opciones) 
    	 {
		case "De Pesos a Dolar": { monedas.ConvertirPesosChi_Dollar(valorRecibido);	  break; }
		case "De Pesos a Euro": { monedas.ConvertirPesosChi_Euro(valorRecibido);	  break; }
		case "De Pesos a Libras": { monedas.ConvertirPesosChi_Libras(valorRecibido);  break; }
		case "De Pesos a Yen": { monedas.ConvertirPesosChi_Yen(valorRecibido);	      break; }
		
		case "De Dolar a Pesos": { monedas.Convertir_Dollar_PesosChi(valorRecibido);  break; }
		case "De Euro a Pesos": { monedas.Convertir_Euro_PesosChi(valorRecibido);     break; }
		case "De Libras a Pesos": { monedas.Convertir_Libras_PesosChi(valorRecibido); break; }
		case "De Yen a Pesos": { monedas.Convertir_Yen_PesosChi(valorRecibido);	 	  break; }
		case "null": {break;}
		}
         
     }
}
