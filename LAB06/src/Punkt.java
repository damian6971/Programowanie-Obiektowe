public class Punkt {
    public int x,y;


    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt punkt) {
        this.x=punkt.x;
        this.y=punkt.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zeruj(){
        this.x=0;
        this.y=0;
    }

    public void opis(){
        System.out.println("Punkt( " + x + ", " + y+ ")");
    }

    public void przesuniecie(double x,double y){
        this.x +=x;
        this.y+=y;
    }
}
