import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Resolve {

	public static void main(String[] args) {
		ArrayList<Proprietar> sir =new ArrayList<>();
		ArrayList<Persoana> sir1=new ArrayList<>();
		
		sir1.add(new Persoana(1, "Balaceanu","Diana","dan_serge@yahoo.com", "2853245410253",new Adresa(1,"anabela",34,"Brasov"),new Studii(1,"conservator","muzica", new GregorianCalendar(2001,04,12), new GregorianCalendar(2001,12,12)),new ExperientaProfesionala(1.0,"awinta", new GregorianCalendar(2003,05,25), new GregorianCalendar(2014,04,30)), new Evenimente(1,"zionomastica","belvedere","grup",2,3,1))); 
		sir1.add(new Persoana(2,"Necula","Alexandra","ale_alexa@gmail.com", "2823245410275",new Adresa(2,"florilor",34,"Timis"),new Studii(2,"politehnica","inginerie",new GregorianCalendar(2001,02,21), new GregorianCalendar(2003,02,22)),new ExperientaProfesionala(7.8,"alfa", new GregorianCalendar(2008,04,30), new GregorianCalendar(2014,12,15)), new Evenimente(2,"aniversare", "restaurant","familie",3,1,1)));  
		sir1.add(new Persoana(3,"Trifan","Bianca","bianca_trifan@yahoo.com", "27336623245410525",new Adresa(3,"zizin",34,"Bucuresti"),new Studii(3,"marina","marinar",new GregorianCalendar(2001,02,02), new GregorianCalendar(2003,12,12)),new ExperientaProfesionala(3.5,"greg", new GregorianCalendar(1990,12,12), new GregorianCalendar(2000,11,17)), new Evenimente(3,"casatorie","acasa","grup",1,2,1))); 
	
		sir.add(new Proprietar("Lala", "baba",  sir1));
		
		for(int i = 0 ; i < sir1.size(); i++) 
			System.out.println(sir.get(i));	
		System.out.println("\n");
	
		//sortarea persoanelor dupa nr de vocale din nume	
		for(int i = 0; i < sir1.size()-1; i++)
			for( int j = i+1; j< sir1.size(); j++)
				if(sir1.get(i).catevocale() > sir1.get(j).catevocale())
					{
						Persoana	aux = sir1.get(i);
						sir1.set(i, sir1.get(j));
						sir1.set(j,  aux);
					}
				else {
					Persoana	aux = sir1.get(j);
					sir1.set(j, sir1.get(i));
					sir1.set(i,  aux);
				}
		for( int i = 0 ; i < sir1.size(); i++)
			System.out.println(sir1.get(i));
		
		
		//pentru un proprietar dat, care este persoana cu cele mai multe notificari.
		int max= -1;
		for(int i = 0; i < sir.size(); i++)
		{
			int cate = 0;
			for( int j = 0; j < sir.get(i).getLista().size(); j++)
			if(sir.get(i).getLista().get(j).getEvn().nreven() == 1)
				cate++;
			if(cate> max)
			System.out.println(sir.get(i));
		}
	}
}
