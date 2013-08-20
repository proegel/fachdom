// Einfache Veraenderung der Datei durch einfuegen eines Kommentars
// Hallo Welt.
// Tschuess

package fachdomaene;

import fachdomaene.service.FachDomaeneImpl;


public class FDMain {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			FachDomaeneImpl main = new FachDomaeneImpl();
			main.newMember("Dr. Hans Zimmermann", "zimmermann@web.de");
			main.newMember("Frau Lieselotte Mustermann", "lieschen@gmx.net");
			main.newMember("Herr Ruediger Hoffmann", "comiker@quatschcomedy");
			main.newMember("Prof. Nikola Tesla", "tesla@spule.de");
			main.newMember("Genosse Ivan Sputnik", "first@weltraum.ru");
			
	//		main.printMember();
			
			main.newCategory("Si-fi");
			
	//		main.newBook("Java ist auch eine Insel","01/01/2012","Programmierung");
	//		main.newBook("Javabook.org","01/04/2010","Programmierung");
	//		main.newBook("Krieg der Welten","01/12/1898","Si-fi");
	//		main.newBook("Die Insel des Dr. Moreau","01/12/1896","Si-fi");
	//		main.newBook("Feuernacht","12/12/2006","Krimi");
	//		main.newBook("Hafenmord","13/06/2003","Krimi");
			
			main.newBooks("Java ist auch eine Insel:01/01/2012:Programmierung,Javabook.org:01/04/2010:Programmierung,"
					+ "Krieg der Welten:01/12/1898:Si-fi,Die Insel des Dr. Moreau:01/12/1896:Si-fi,"
					+ "Feuernacht:12/12/2006:Krimi,Hafenmord:13/06/2003:Krimi");
			
			main.printCategories();
			main.printBookTitles();
//			main.printBooks();
//			
//			main.newRent(0, 1);
//			main.newRent(0, 4);
//			main.newRent(3, 5, "14/07/2013");
//			main.newRent(2, 3);
//			main.newRent(4, 1);
//			main.newRent(4, 2, "16/07/2013");
//			main.newRent(4, 0);
//			
//			main.printRents();
//			
//			main.checkDeadline();
//			main.reclaimBook(2);
//			main.reclaimBook(4);
//			main.checkDeadline();
//			
//			main.printRents();
//			
//			main.returnRent(1);
//			
//			main.printRents();
//			
//			main.newRent(4, 1);
//			
//			main.printRents();
//			
//			main.printIds();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Juhu, ich habe alles geschafft");
		}
	}

}
