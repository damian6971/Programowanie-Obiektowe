
class Prostokat  extends Figura{
	double wys=0, szer=0;
	
	public Prostokat(double wys,double szer){
		super();
		this.wys = wys;
		this.szer = szer;
			
	}

    public double getPowierzchnia() {
        return (szer * wys);
    }

	Prostokat(String kolor, float wys, float szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
		punkt = new Punkt(0,0);
	}

	public void przesun(float x,float y){
		punkt.setX(punkt.getX() );
		punkt.setY(punkt.getY() );
	}


	@Override
	String opis() {
		return super.opis();
	}
}