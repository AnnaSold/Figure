public class Circle extends Figure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateAreaFigure(){
        double s = radius * radius * Math.PI;
        //System.out.println(s);
        return s;
    }
}
