
class Trojkat extends Figura
{
	public double wys=0, podst=0;

	public Trojkat(double wys, double podst)
	{
		super();
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(String kolor,float wys, float podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}
}