public class Triangle extends Figure{
    double ab;
    double bc, ac;

    public Triangle(double ab, double bc, double cd) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }
    public double calculateAreaFigure(double a, double b, double c){
        double trP = a + b + c;

        double p = trP/2;
        double trArea =  Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return trArea;
    }
}
