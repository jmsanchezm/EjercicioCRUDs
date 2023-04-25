package ejercicio3;

public class Pizza {
	/**
	 * Código de la pizza
	 */
	private int codigo;

	/**
	 * Enum para los distintos tamaños de la pizza
	 * 
	 * @author sanch
	 *
	 */
	enum Tamaño {
		Mediana, Familiar
	}

	/**
	 * Enum para los distintos tipos de pizza
	 * 
	 * @author sanch
	 *
	 */
	enum Tipo {
		Margarita, CuatroQuesos, Funghi
	}

	/**
	 * Enum para el estado de la pizza
	 * 
	 * @author sanch
	 *
	 */
	enum Estado {
		Pedida, Servida
	}

	/**
	 * Se guardará un valor del enum tamaño
	 */
	private Tamaño tamaño;
	/**
	 * Se guardará un valor del enum tipo
	 */
	private Tipo tipo;
	/**
	 * Se guardará un valor del enum estado
	 */
	private Estado estado;

	/**
	 * Constructor por defecto
	 */
	public Pizza() {
		super();

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param codigo
	 * @param tamaño
	 * @param tipo
	 */
	public Pizza(int codigo, Tamaño tamaño, Tipo tipo) {
		super();
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the tamaño
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pizza " + codigo + " " + tamaño + " " + tipo + " " + estado;
	}

	/**
	 * Método que verifica el tamaño de la pizza
	 * @param tam
	 * @return
	 */
	public static boolean contTam(String tam) {
		boolean result = false;
		for (Tamaño ta : Tamaño.values()) {
			if (ta.equals(Tamaño.valueOf(tam))) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Método que verifica el tipo de la pizza
	 * @param tipo
	 * @return
	 */
	public static boolean contTipo (String tipo) {
		boolean result=false;
		for (Tipo t: Tipo.values()) {
			if (t.equals(Tipo.valueOf(tipo))) {
				result=true;
				break;
			}
		}
		return result;
	}
}
