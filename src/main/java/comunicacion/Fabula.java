package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return super.getPaginas()*palabrasPagina*1;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		String formato = String.format("%s\n %s\n %s\n %d\n %s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), getEnsenanza());
		return formato;
	}

}
