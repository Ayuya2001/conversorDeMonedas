package chi.com.pricipal;

import javax.swing.*;




public class ConversorMonedas
{
	JPanel panelReferencia =null;
	
	double pesosA_dolar = 833.64;     	// De Pesos a Dolar
	double pesosA_euro = 882.90;		// De Pesos a Euros
	double pesosA_libras = 1003.23000;		// De Pesos a Libras
	double pesosA_yen =6.12 ;			// De Pesos a Yenes
	
	public void getPanel(JPanel panelReferencia) 
	{
		this.panelReferencia = panelReferencia;
	}
	
	
	
	public void ConvertirPesosChi_Dollar(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_dolar," Dolares");
	}
	
	public void ConvertirPesosChi_Euro(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_euro," Euros");
	}
	
	public void ConvertirPesosChi_Libras(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_libras," Libras");
	}
	public void ConvertirPesosChi_Yen(double valorRecibido)
	{
		calc_Pesos_a(valorRecibido,pesosA_yen," Yen");
	}
	
   
	
	/** otra moneda a pesos chilenos **/
	
	
	public void Convertir_Dollar_PesosChi(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_dolar," Pesos Chilenos");
	}
	
	public void Convertir_Euro_PesosChi(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_euro," Pesos Chilenos");
	}
	
	public void Convertir_Libras_PesosChi(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_libras," Pesos Chilenos");
	}
	public void Convertir_Yen_PesosChi(double valorRecibido)
	{
		calc_a_Pesos(valorRecibido,pesosA_yen," Pesos Chilenos");
	}
	
	

	
	
	public void calc_Pesos_a(double valorRecibido, double cotizacion, String nombreMoneda)
	{
		double moneda = valorRecibido/ cotizacion;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(panelReferencia, "Tienes " + moneda + nombreMoneda);
	}
	
	public void calc_a_Pesos(double valorRecibido, double cotizacion, String nombreMoneda)
	{
		double moneda = valorRecibido*cotizacion;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(panelReferencia, "Tienes " + moneda + nombreMoneda);
	}
	

}
