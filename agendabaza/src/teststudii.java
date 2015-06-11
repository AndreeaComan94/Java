import java.util.GregorianCalendar;

public class teststudii {
	public static void main(String[] args) {

		Studii ceva1 = new Studii(4, "Politehnica", "Automatica",
				new GregorianCalendar(2012, 12, 15), new GregorianCalendar(
						2014, 04, 20));
		Studii ceva2 = new Studii(5, "Academia Militara", "Aviatie",
				new GregorianCalendar(2004, 12, 20), new GregorianCalendar(
						2008, 04, 20));
		Studii ceva3 = new Studii(6, "Agronomie", "economia mediului",
				new GregorianCalendar(2005, 04, 30), new GregorianCalendar(
						2005, 07, 25));

		studiiutil some = new studiiutil();
		some.addStudii(ceva1);
		some.addStudii(ceva2);
		some.addStudii(ceva3);
		ceva2.setfacultate("aviatie");
		some.update(ceva2);

		Studii cevastudii = some.findByid(3);
		System.out.println(cevastudii);
		cevastudii.setspecializare("terestra");
		some.update(cevastudii);
	}
}
