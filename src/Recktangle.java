public class Recktangle extends Figure{
    double length, width;

    public Recktangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calculateAreaFigure(double storona1, double storona2) {
        double areaReckt = storona1 * storona2;
        return areaReckt;

    }
}
