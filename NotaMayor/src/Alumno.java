
public class Alumno {
	
	private String nombre, apellido;
	private double notaFinal;

	public Alumno(String nombre, String apellido, double notaFinal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaFinal = notaFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
}
