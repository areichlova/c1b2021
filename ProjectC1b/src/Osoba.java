
public class Osoba {
	private String jmeno;
	private int vek;
	
	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public int getVek() {
		return vek;
	}

	public void setVek(int vek) throws Exception {
		if(vek < 0) {
			throw new Exception("Vek nemuze byt zaporne cislo");
		}
		this.vek = vek;
	}

	public Osoba(String jmeno, int vek) throws Exception {
		super();
		this.jmeno = jmeno;
		this.setVek(vek);
	}

	@Override
	public String toString() {
		return "Osoba [jmeno=" + jmeno + ", vek=" + vek + "]";
	}

}
