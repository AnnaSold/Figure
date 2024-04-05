public class Recktangle extends Figure{
    double length, width;

    public Recktangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateAreaFigure() {
        double areaReckt = length * width;
        //System.out.println(areaReckt);
        return areaReckt;

    }
}
