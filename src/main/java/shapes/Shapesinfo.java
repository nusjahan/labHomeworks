package shapes;

public class Shapesinfo {

        public static void main(String[] args ){
                Triangle area = new Triangle();
                area.base=10;
                area.height=16;
                area.calculatedArea();


                Square line = new Square();
                line.side = 7;
                line.areOfSquare();


                Circle round = new Circle();
                round.radius = 2;
                round.areofCircle();



        }
}
