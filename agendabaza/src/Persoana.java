//import java.util.Scanner;


public class Persoana {
	private int idPersoana;
	private String nume;
	private String prenume;
	private String email;
	private String cnp;
	private Adresa adr;
	private Studii std;
	private ExperientaProfesionala exp;
	private Evenimente evn;

	
	public Persoana(int idPersoana, String nume, String prenume, String email,
			String cnp, Adresa adr, Studii std, ExperientaProfesionala exp,
			Evenimente evn) {
		super();
		this.idPersoana = idPersoana;
		this.nume = nume;
		this.prenume = prenume;
		this.email = email;
		this.cnp = cnp;
		this.adr = adr;
		this.std = std;
		this.exp = exp;
		this.evn = evn;
	}
	
	public int getIdPersoana() {
		return idPersoana;
	}

	public void setIdPersoana(int idPersoana) {
		this.idPersoana = idPersoana;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setcnp(String c){
		this.cnp = c;
	}
	
	public String getcnp(){
		return this.cnp;
	}
	
	public Adresa getAdr() {
		return adr;
	}

	public void setAdr(Adresa adr) {
		this.adr = adr;
	}

	public Studii getStd() {
		return std;
	}

	public void setStd(Studii std) {
		this.std = std;
	}

	public ExperientaProfesionala getExp() {
		return exp;
	}

	public void setExp(ExperientaProfesionala exp) {
		this.exp = exp;
	}

	public Evenimente getEvn() {
		return evn;
	}
	
	public void setEvn(Evenimente evn) {
		this.evn = evn;
	}


	@Override
	public String toString() {
		return "Persoana [idPersoana=" + idPersoana + ", nume=" + nume
				+ ", prenume=" + prenume + ", email=" + email + ", cnp=" + cnp
				+ ", adr=" + adr + ", std=" + std + ", exp=" + exp + ", evn="
				+ evn + "]";
	}
	
	public int catevocale() {
		int cate = 0;
		for (int i = 0; i < nume.length(); i++)
			if (getNume().charAt(i) == 'a' || getNume().charAt(i) == 'e'
					|| getNume().charAt(i) == 'i' || getNume().charAt(i) == 'o'
					|| getNume().charAt(i) == 'u')
				cate++;
		return cate;
	}
		
}
