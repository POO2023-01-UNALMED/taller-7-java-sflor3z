package comunicacion;

public class Periodico extends Escrito {
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	

	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	
	public String getPrimicia() {
		return primicia;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas()*palabrasPagina*10;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String formato = String.format("%s\n %s\n %s\n %d\n %s\n %s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), getFecha(), getPrimicia());
		return formato;
	}

}
