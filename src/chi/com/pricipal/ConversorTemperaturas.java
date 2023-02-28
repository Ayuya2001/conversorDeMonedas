package chi.com.pricipal;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorTemperaturas
{
	JPanel panelReferencia = new JPanel();
	
	/* tipos de temperatura:
	 * 
	 * Celsius - Fahrenheit - Kelvin- Rankine
	 * 
	 */
	
	
	//CONVERTIR CELSIUS A OTRO -->>
	
	 public ConversorTemperaturas(JPanel panelReferencia )
	 {
		 this.panelReferencia = panelReferencia;
	 }
	 
	 public void convertir_Celsius_a_Fahrenheit(double impCelsius)
	 { 
		redondeaImprime(impCelsius * 9/5 + 32,"Fahrenheit");
	 }
	 
	 public void convertir_Celsius_a_Kelvin(double impCelsius)
	 {
		redondeaImprime(impCelsius + 273.15,"Kelvin");
	 }
	 
	 public void convertir_Celsius_a_Rankine(double impCelsius)
	 {
		redondeaImprime(impCelsius * 9/5 + 491.67,"Rankine");
	 }
	 
	 
	 //CONVERTIR OTRO A CELSIUS -->>
	 
	 
	 public void convertir_Fahrenheit_a_Celsius(double pInput)
	 {
		redondeaImprime((pInput - 32) * 5/9,"Celsius");
	 }
	 
	 public void convertir_Kelvin_a_Celsius(double pInput)
	 {
		redondeaImprime(pInput - 273.15,"Celsius");
	 }
	 
	 public void convertir_Rankine_a_Celsius(double pInput)
	 {
		redondeaImprime((pInput - 491.67) * 5/9,"Celsius");
	 }
	 
	 private void redondeaImprime(double valor,String tipoTemp)
	 {
		 double temp = (double) Math.round(valor * 100d) /100;
		 JOptionPane.showMessageDialog(panelReferencia, "El valor en " + tipoTemp + " es : " + temp);;
	 }
	 
	
	
}
