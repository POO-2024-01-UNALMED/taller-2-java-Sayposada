package test;

public class motor 
{
	int numCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) 
	{
		this.registro = registro;
		
	}
	
	String asignarTipo(String tipo) 
	{
		if (tipo == "eléctrico" || tipo == "gasolina")
		{
			this.tipo = tipo; 
		}
		
	}
}


