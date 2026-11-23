package ejercicioCuentaCorriente;

public class CuentaCorriente {
	private String dni;
	private String nombre;
	private Double saldo;
	
	public CuentaCorriente (){
		saldo = 0.0;
	   }
	
	public CuentaCorriente (String dni, String nombre ){
		this.dni = dni;
		this.nombre = nombre; 
		saldo = 0.0;
	   }
	public void ingresar(double ingreso) {
		this.saldo += ingreso;
	}
	public void retirar(double retirada) {
		this.saldo -= retirada;
	}
	public void mostrarInfo() {
	      System.out.println("Nombre: " + nombre);
	      System.out.println("Dni: " + dni);
	      System.out.println("Saldo: " + saldo + " euros");
	}
}

