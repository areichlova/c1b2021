
public class Main {

	public static void main(String[] args) {
		try {
			Osoba osubka = new Osoba("karel", 17);
			System.out.println(osubka);
			Osoba druhaOsoba = new Osoba("jan", 25);
			System.out.println(druhaOsoba);
		} catch (Exception e) {
			System.out.println("Vek nemuze byt zaporny");
		}

	}

}
