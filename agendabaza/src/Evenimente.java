public class Evenimente {
	private int idEvenimente;
	private String denumire;
	private String locatie;
	private String detalii;
	private int notificare;
	private int prioritate;
	private int prezenta;

	public Evenimente(int idEvenimente, String denumire, String locatie,
			String detalii, int notificare, int prioritate, int prezenta) {
		super();
		this.idEvenimente = idEvenimente;
		this.denumire = denumire;
		this.locatie = locatie;
		this.detalii = detalii;
		this.notificare = notificare;
		this.prioritate = prioritate;
		this.prezenta = prezenta;
	}

	public int getIdEvenimente() {
		return idEvenimente;
	}

	public void setIdEvenimente(int idEvenimente) {
		this.idEvenimente = idEvenimente;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public int getNotificare() {
		return notificare;
	}

	public void setNotificare(int notificare) {
		this.notificare = notificare;
	}

	public String getDetalii() {
		return detalii;
	}

	public void setDetalii(String detalii) {
		this.detalii = detalii;
	}

	public int getPrioritate() {
		return prioritate;
	}

	public void setPrioritate(int prioritate) {
		this.prioritate = prioritate;
	}

	public int getPrezenta() {
		return prezenta;
	}

	public void setPrezenta(int prezenta) {
		this.prezenta = prezenta;
	}

	@Override
	public String toString() {
		return "Evenimente [idEvenimente=" + idEvenimente + ", denumire="
				+ denumire + ", locatie=" + locatie + ", detalii=" + detalii
				+ ", notificare=" + notificare + ", prioritate=" + prioritate
				+ ", prezenta=" + prezenta + "]";
	}

	public int nreven() {
		if (this.getNotificare() == 1)
			return 1;
		return 0;
	}
}