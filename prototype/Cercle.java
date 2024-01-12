package prototype;

public class Cercle extends Forme {
    private float radius;

    public Cercle(float x, float y, String color, float radius) {
        super(x, y, color);
        this.radius = radius;
    }
    public Cercle(Cercle circle) {
    }
    @Override
    public Forme clone() {
        // TODO Auto-generated method stub
        return new Cercle(this.x,this.y,this.color,this.radius);
    }

    public void print() {
        System.out.println("je suis un cercle");
        System.out.println("x = " + x + "\ny = " + y +
        "\ncolor = " + color+ "\nradius = "+radius);}

    
}
