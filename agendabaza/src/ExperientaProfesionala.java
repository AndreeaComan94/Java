import java.util.Calendar;


public class ExperientaProfesionala {

	private double nr_ani;
	private String societate;
	private Calendar detal_timp;
	private Calendar detal_timpfin;
	
	public ExperientaProfesionala() {
		this.nr_ani = 0;
		this.societate = "";
	}
	
	
	public ExperientaProfesionala(double nr_ani, String societate,
			Calendar detal_timp, Calendar detal_timpfin) {
		super();
		this.nr_ani = nr_ani;
		this.societate = societate;
		this.detal_timp = detal_timp;
		this.detal_timpfin = detal_timpfin;
	}



	public Calendar getDetal_timp() {
		return detal_timp;
	}

	public void setDetal_timp(Calendar detal_timp) {
		this.detal_timp = detal_timp;
	}

	public Calendar getDetal_timpfin() {
		return detal_timpfin;
	}

	public void setDetal_timpfin(Calendar detal_timpfin) {
		this.detal_timpfin = detal_timpfin;
	}

	public void setnr_ani(double nra) {
		this.nr_ani = nra;
	}
	
	public double getnr_ani() {
		return this.nr_ani;
	}
	
	public void setsocietate(String soc) {
		this.societate = soc;
	}
	
	public String getsocietate()
	{
		return this.societate;	
	}

	@Override
	public String toString() {
		return "ExperientaProfesionala [nr_ani=" + nr_ani + ", societate="
				+ societate + ", detal_timp=" + detal_timp + ", detal_timpfin="
				+ detal_timpfin + "]";
	}
	
}
