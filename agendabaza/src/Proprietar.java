import java.util.ArrayList;

public class Proprietar {
	private String username;
	private String password;
	private ArrayList<Persoana> lista = new ArrayList<>();

	public Proprietar(String username, String password,
			ArrayList<Persoana> lista) {
		super();
		this.username = username;
		this.password = password;
		this.lista = lista;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Persoana> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Persoana> sir) {
		this.lista = sir;
	}

	@Override
	public String toString() {
		return "Proprietar [username=" + username + ", password=" + password
				+ ", lista=" + lista + "]";
	}

	public Adresa getAdr() {
		return this.getAdr();
	}

}
