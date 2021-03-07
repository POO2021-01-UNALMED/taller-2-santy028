package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	
	public int cantidadAsientos( ) {
	int nasientos=0;	
		for (int i=0; i<asientos.length;i++){
			if(asientos[i]!= null) {
				nasientos++;
			}
			
		}
		
		return nasientos;
		
	}
	
	
  public String verificarIntegridad() {
	  int i =0;
	 String text="";
	  while (asientos[i]== null && i<asientos.length) {
		  i++;
	  }
		
		if((motor.registro)!=(registro)||(registro!=asientos[i].registro)) {
			text="Las piezas no son originales";
			
			
			
			
		}
		if((motor.registro)==(registro)&&(registro==asientos[i].registro)) {
			text="Auto original";
		
			
			
		}
		return text;
	}
	

}
