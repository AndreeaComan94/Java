import java.util.GregorianCalendar;


public class testevenimente {


	public static void main(String[] args)
	{
		
	Evenimente ceva1=new Evenimente(4,"intalnire", new GregorianCalendar(2012,12,15) , "acasa", "prieteni", 1, 1, 1);
	Evenimente ceva2=new Evenimente(5,"sedinta",new GregorianCalendar(2014,12,20),"scoala", "parinti", 3, 1 , 2);
	Evenimente ceva3 = new Evenimente(6,"iesire", new GregorianCalendar(2011,04,30), "ateslal", "amici", 2,1,1);


	evenimenteutil some=new evenimenteutil();
	some.addevenimente(ceva1);
	some.addevenimente(ceva2);
	some.addevenimente(ceva3);
	ceva2.setDenumire("Cefaci");
	some.update(ceva2);
	
	Evenimente cevaevenimente=some.findByid(10);
	System.out.println(cevaevenimente);
	cevaevenimente.setLocatie("Alexandra");
	some.update(cevaevenimente);
	System.out.println(cevaevenimente);
				
//Employee foundEmp = eDAO.findById(1);
//	foundEmp.setName("Cristina");
//	eDAO.update(foundEmp);
	
	
}
}

