package prototype;

abstract class Forme{
    public float x;
    public float y;
    public String color;

    public Forme(float x, float y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Forme(){
        this.x = 1;
        this.y = 1;
        this.color = "black";
    }


    public abstract Forme clone();

    public abstract void print();

}