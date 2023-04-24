package ejercicio2;

public class Gestisimal {

	/**
	 * Se guardará el código del producto
	 */
	private String codigo = "vacio";

	/**
	 * Se guardará la descripción del producto
	 */
	private String descripcion;

	/**
	 * Se guardará el precio de compra del producto
	 */
	private double precioCompra;

	/**
	 * Se guardará el precio de venta del producto
	 */
	private double precioVenta;

	/**
	 * Se guardará el número de stock
	 */
	private int stock;

	/**
	 * Constructor por defecto
	 */
	public Gestisimal() {
		super();

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param codigo
	 * @param descripcion
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 */
	public Gestisimal(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		if (stock >= 0) {
			this.stock = stock;
		}
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Producto: " + codigo + "\n" + descripcion + "\nprecioCompra=" + precioCompra + "\nprecioVenta="
				+ precioVenta + "\nStock=" + stock;
	}

	/**
	 * Método que incrementa el valor del Stock
	 * 
	 * @param incremento
	 */
	public void incrementoStock(int incremento) {
		stock += incremento;
	}

	/**
	 * Método que decrementa el valor del stock
	 * 
	 * @param decremento
	 */
	public void decrementoStock(int decremento) {
		//Si el decremento es menor al stock
		if (decremento < stock) {
			stock -= decremento;
		}
	}

}
