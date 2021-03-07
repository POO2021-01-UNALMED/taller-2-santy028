package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
  
	public void cambiarColor (String color) {
		if ((color.equals("rojo"))||(color.equals("amarillo"))||(color.equals("verde"))||(color.equals("negro"))||(color.equals("blanco"))) {
		 this.color=color;
			
		}
		
	}
	
	
}

