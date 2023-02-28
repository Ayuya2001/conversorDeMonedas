package chi.com.pricipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;


public class principal 
{
    public static void main(String[] args) 
    {
    	
    	 Cliente clienteActual = new Cliente("anonimo","admin", "admin", 0);
    	 
    	 generaLogin(clienteActual);
    	
	}
    
    

	
	public static void generaLogin(Cliente pCliente) 
	{
		JFrame frame = new JFrame(" - Conversor - ");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setSize(400, 300);
		panel.setLayout(null);        
		
		JLabel etiquetaUsuario = new JLabel("Usuario: ");         etiquetaUsuario.setBounds(50, 20, 100, 25);  
		JLabel etiquetaClave = new JLabel("Contraseña: ");        etiquetaClave.setBounds(50, 50, 100, 25); 
		
		JTextField inputUsuario = new JTextField(20);             inputUsuario.setBounds(200, 20, 120, 25);
		JPasswordField inputContrasenia = new JPasswordField(20);         inputContrasenia.setBounds(200, 50, 120, 25);
		
		JButton botonIniciar = new JButton("iniciar");            botonIniciar.setBounds(50, 150, 100, 25);
		JButton botonRegistrarse = new JButton("Registrarse");    botonRegistrarse.setBounds(200, 150, 125, 25);
		
		panel.add(etiquetaUsuario);
		panel.add(etiquetaClave);
		panel.add(inputUsuario);
		panel.add(inputContrasenia);
		panel.add(botonIniciar);
		panel.add(botonRegistrarse);
		
		frame.add(panel);
		

		frame.setVisible(true);
		
		botonIniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   
				if( ( pCliente.getUsuario().equals(inputUsuario.getText() ) ) && ( pCliente.getContrasenia().equals(inputContrasenia.getText()) ) )
				{
					iniciarPrograma(panel);
					inputUsuario.setText("");
					inputContrasenia.setText("");
				}
				else
				{
			         JOptionPane.showMessageDialog(botonIniciar, "No existe el usuario o la contraseña imgresada, por favor registrese");
			         inputUsuario.setText("");
					 inputContrasenia.setText("");
				}
				
			}
		});
		
		botonRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			pCliente.setUsuario(inputUsuario.getText());
			pCliente.setContrasenia(inputContrasenia.getText());
				
				
				  JOptionPane.showMessageDialog(botonIniciar, "Se registro el usuario: "+pCliente.getUsuario());
			         inputUsuario.setText("");
					 inputContrasenia.setText("");
				
			}
		});
		
		
	}
	
	
	
	public static void iniciarPrograma(JPanel panelReferencia)
	{
        Function monedas = new Function();
        ValidaInput valorInput = new ValidaInput(null);  
	    
	    int seleccion = 0;
	    Object receptor = "0";
	    
	    while(seleccion <1 && receptor!=null)
	    {
	    	receptor = (JOptionPane.showInputDialog(panelReferencia, "Seleccione una opcion de conversion " , "Menu", JOptionPane.QUESTION_MESSAGE , null, new Object[] {"Conversor de Moneda" , "Conversor de Temperatura"} ,"Seleccion"  )  );                                                             
           
	    	if(receptor != null) { String opciones = receptor.toString(); 
       
        
        	
        
    	switch (opciones)
    	{
		
    	case "Conversor de Moneda": 
		{
			
			Object input = JOptionPane.showInputDialog(panelReferencia,"Ingrese un valor a convertir: ");
	        valorInput.get_input(input);                                             
			
	        
			
			while(!valorInput.isNumber() && valorInput.noEs_Null())
			{
				valorInput.get_input(JOptionPane.showInputDialog(panelReferencia,"Debe ingresar por lo menos un valor numerico"));
			}
			
			 if(valorInput.noEs_Null())
				{
			double valorRecibido = Double.parseDouble(valorInput.convertir_a_String());
			
			monedas.ConvertirMonedas(valorRecibido,panelReferencia);
			
		   }
			
			 seleccion = JOptionPane.showConfirmDialog(panelReferencia," ¿Desea realizar otra operacion? ");	
			 
			 break;
					
		}
		
		
    	
    	
    	case "Conversor de Temperatura": 
    	{
    		/*¿Cuáles son los 5 tipos de temperatura?
    		 * Celsius - Fahrenheit - Kelvin- Rankine
    		 * 
    		 * */
    		Object input = JOptionPane.showInputDialog(panelReferencia,"Ingrese un valor a convertir");
    		valorInput.get_input(input);
    		
    		FuncionTemp temperatura = new FuncionTemp(panelReferencia);
  
			
			while(!valorInput.isNumber() && valorInput.noEs_Null())
			{
				valorInput.get_input(JOptionPane.showInputDialog(panelReferencia,"Debe ingresar por lo menos un valor numerico"));
			}
			
			 if(valorInput.noEs_Null())
				{
			double valorRecibido = Double.parseDouble(valorInput.convertir_a_String());
			temperatura.convertirTemperatura(valorRecibido);
				}
			 
			 seleccion = JOptionPane.showConfirmDialog(panelReferencia," ¿Desea realizar otra operacion? ");
    	
			 break;
    	}
		
		
		
		
		}
    	 
		
        }
               
        
	    }
	    
	    JOptionPane.showMessageDialog(panelReferencia,"Programa terminado ");
    	
	  
	}
	
	
	
	
	
}