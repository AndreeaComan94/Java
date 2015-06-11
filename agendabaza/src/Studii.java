
import java.util.GregorianCalendar;



public class Studii {
	private int idStudii;
	private String facultate;
	private String specializare;
	private GregorianCalendar detal_timp;
	private GregorianCalendar detal_timpfin;


	public Studii(int idStudii, String facultate, String specializare,
			GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
		super();
		this.idStudii = idStudii;
		this.facultate = facultate;
		this.specializare = specializare;
		this.detal_timp = gregorianCalendar;
		this.detal_timpfin = gregorianCalendar2;
	}

	public int getIdStudii() {
		return idStudii;
	}

	public void setIdStudii(int idStudii) {
		this.idStudii = idStudii;
	}

	public void setfacultate(String fac) {
		this.facultate = fac;
	}
	
	public String getfacultate() {
		return this.facultate;
	}	
	
	public void setspecializare(String spec) {
		this.specializare = spec;
	}
	
	public String getspecializare() {
		return this.specializare;
	}
	
	public GregorianCalendar getDetal_timp() {
		return detal_timp;
	}

	public void setDetal_timp(GregorianCalendar detal_timp) {
		this.detal_timp = detal_timp;
	}
	
	public GregorianCalendar getDetal_timpfin() {
		return detal_timpfin;
	}

	public void setDetal_timpfin(GregorianCalendar detal_timpfin) {
		this.detal_timpfin = detal_timpfin;
	}

	@Override
	public String toString() {
		return "Studii [idStudii=" + idStudii + ", facultate=" + facultate
				+ ", specializare=" + specializare + ", detal_timp="
				+ detal_timp + ", detal_timpfin=" + detal_timpfin + "]";
	}


}

