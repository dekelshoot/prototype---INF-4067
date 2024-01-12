package prototype;

public class Client {
    public static void main(String[] args){
        // Création d'un prototype de rectangle
        Forme rectangle = new Rectangle(5, 12, "black", 10, 15);
        // Création d'un prototype de cercle
        Forme circle = new Cercle(4,7, "red", 10);
        // Clonage du prototype
        Forme rectangleClone = rectangle.clone();
        // Clonage du prototype
        Forme circleShape = circle.clone();

        // Affichage des informations de la forme cloné
        rectangleClone.print();
        System.out.println("");
        circleShape.print();
    }
}

