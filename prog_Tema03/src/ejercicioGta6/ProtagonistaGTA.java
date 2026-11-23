package ejercicioGta6;

public class ProtagonistaGTA {
	
	private String nombre;
	private Integer nivelBusqueda;
	private Double dinero;
	
	public ProtagonistaGTA() {
		this.nivelBusqueda = 0;
		this.dinero = 50.0;
	}

	public ProtagonistaGTA(String nombre) {
		this.nombre = nombre;
		this.nivelBusqueda = 0;
		this.dinero = 50.0;
	}

	public void cometerDelito(double dineroRobado) {
		this.dinero += dineroRobado;
		this.nivelBusqueda++;
		
		if(this.nivelBusqueda > 6) {
			this.nivelBusqueda = 6;
		}
	}
	public void sobornarPolicia(int estrellas) {
		if(this.nivelBusqueda == 0) {
			System.out.println("No puedes bajar de 0 estrellas!!!");
		}
	}
	
}
