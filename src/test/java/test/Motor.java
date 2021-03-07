package test;

public class Motor {
	int numeroCilindros;
	String tipo;
    int registro;
	
	
	public void asignarTipo (String tipo) {
		if ((tipo.equals("electrico"))||(tipo.equals("gasolina"))) {
		 this.tipo=tipo;	
		}
    }
	public void cambiarRegistro(int nuevoRegistro) {
		this.registro=nuevoRegistro;
		
		
	}
	
	
	
}
