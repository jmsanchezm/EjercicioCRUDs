package ejercicio1;


public class Alumno {
	
	/**
	 * Se guardará el nombre del alumno
	 */
	
	private String nombre = null;
	/**
	 * Se guardará la nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor por defecto
	 */
	public Alumno() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 * @param notaMedia
	 */
	public Alumno(String nombre, double notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the notaMedia
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia > 0) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Método toString que mostrará el alumno con su respectivo nombre y nota
	 */
	@Override
	public String toString() {
		return "Alumno: " + nombre + "\nNota media: "+ notaMedia;
	}
	
}
