public class TestAdresa {

	public static void main(String[] args) {

		Adresa ceva1 = new Adresa(1, "saadfs", 445, "sasaafs");
		Adresa ceva2 = new Adresa(2, "sdcxjhgjdffs", 4500, "sdgtrdefdgafs");
		Adresa ceva3 = new Adresa(5, "anahddna", 202, "ateslal");

		AdresaUtil some = new AdresaUtil();
		some.addAdresa(ceva1);
		some.addAdresa(ceva2);
		some.addAdresa(ceva3);
		ceva2.setjudet("Ionelaaaa");
		some.update(ceva2);

		Adresa cevaAdresa = some.findByid(10);
		System.out.println(cevaAdresa);
		cevaAdresa.setstrada("Alexandra");
		some.update(cevaAdresa);
		System.out.println(cevaAdresa);

	}
}
