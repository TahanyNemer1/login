package brugerautorisation.transport.rmi;

import brugerautorisation.data.Diverse;
import brugerautorisation.data.Bruger;
import java.rmi.Naming;

public class Brugeradminklient {
	public static void main(String[] arg) throws Exception {
//		Brugeradmin ba =(Brugeradmin) Naming.lookup("rmi://localhost/brugeradmin");
		Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");

		//Bruger off = ba.hentBrugerOffentligt("s144260");
		//System.out.println("Fik offentlige data " + Diverse.toString(off));

    //ba.sendGlemtAdgangskodeEmail("s123456", "Dette er en test, husk at skifte kode");
		//ba.ændrAdgangskode("s144260", "kodeonx98u", "1398zz");
		Bruger b = ba.hentBruger("s144260", "1398zz");
		System.out.println("Fik bruger " + b);
		System.out.println("med data " + Diverse.toString(b));
		// ba.sendEmail("jacno", "xxx", "Hurra det virker!", "Jeg er så glad");

		Object ekstraFelt = ba.getEkstraFelt("s123456", "kode1xyz", "hobby");
		System.out.println("Brugerens hobby er: " + ekstraFelt);

		//ba.setEkstraFelt("s144260", "1398zz", "hobby", "running"); // Skriv noget andet her

		//String webside = (String) ba.getEkstraFelt("s123456", "kode1xyz", "webside");
		//System.out.println("Brugerens webside er: " + webside);
	}
}
