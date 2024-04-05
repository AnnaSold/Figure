//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Recktangle recktangle1 = new Recktangle(4.0,3.0);
        Recktangle recktangle2 = new Recktangle(5.0,3.0);


        Triangle triangle1 = new Triangle(8.0,8.0,8.0);


        Circle circle1 = new Circle(2.5);
// прямоугольник1 с треугольником
        double s1 = recktangle1.calculateAreaFigure();
        double t = triangle1.calculateAreaFigure();
        boolean d = recktangle1.compareAreasFigures(s1,t);
        System.out.println(d+" " +t + " " + s1);

        // прямоугольник2 с треугольником
        double s2 = recktangle2.calculateAreaFigure();
        boolean d1 = recktangle2.compareAreasFigures(s2,t);
        System.out.println(d1 +" " +s2);

        //прямоугольник1 с прямоугольник2
        boolean d2 = recktangle1.compareAreasFigures(s1,s2);
        System.out.println(d2);

        //прямоугольник1 с окружностью
        double c1 = circle1.calculateAreaFigure();
        boolean d3 = recktangle1.compareAreasFigures(s1,c1);
        System.out.println(d3 +" " + c1);

        // прямоугольник2 с окружностью
        boolean d4 = recktangle2.compareAreasFigures(s2,c1);
        System.out.println(d4);

        //треугольник с окружностью
        boolean d5 = triangle1.compareAreasFigures(t,c1);
        System.out.println(d5);

    }
}
class Figure{
    public double calculateAreaFigure(){
        return 0 ;
    }
    public boolean compareAreasFigures(double figArea1, double figArea2){
        boolean t = true;
        if (figArea1 == figArea2);
        else t = false;
    return t;
}}