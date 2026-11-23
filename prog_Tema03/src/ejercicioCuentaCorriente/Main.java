package ejercicioCuentaCorriente;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cc1 = new CuentaCorriente("Antonio","12345678K");
		cc1.ingresar(56);
		cc1.mostrarInfo();
		
		cc1.retirar(23);
		cc1.mostrarInfo();
		
	}

	
}
