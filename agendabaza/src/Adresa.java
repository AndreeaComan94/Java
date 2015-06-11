public class Adresa {

	private int idAdresa;
	private String strada;
	private int numar;
	private String judet;

	
	public int getIdAdresa() {
		return idAdresa;
	}

	public void setIdAdresa(int idAdresa) {
		this.idAdresa = idAdresa;
	}

	public Adresa(int idAdresa, String strada, int numar, String judet) {
		this.idAdresa = idAdresa;
		this.strada = strada;
		this.numar = numar;
		this.judet = judet;
	}

	public void setstrada(String str) {
		this.strada = str;
	}

	public String getstrada() {
		return this.strada;
	}

	public void setnumar(int nr) {
		this.numar = nr;
	}

	public int getnumar() {
		return this.numar;
	}

	public void setjudet(String jud) {
		this.judet = jud;
	}

	public String getjudet() {
		return this.judet;
	}

	public String toString() {
		return "Adresa [strada=" + strada + ", numar=" + numar + ", judet="
				+ judet + "]";
	}
}
