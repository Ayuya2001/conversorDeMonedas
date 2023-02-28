package chi.com.pricipal;


public class Cliente
{
   String nombre;
   String usuario;
   String contrasenia;
   Integer edad;
   
   public Cliente(String nombre, String usuario, String contrasenia, Integer edad)
   {
	   this.nombre = nombre;
	   this.usuario = usuario;
	   this.contrasenia = contrasenia;
	   this.edad = edad;
   }
   
   
   
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}


   
   
}
