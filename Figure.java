package HomeWorkOOPFigure;
// ДЗ - Создать класс Круг и Эллипс (обозначить между ними связь), при этом Эллипс и Прямоугольник
// происходят от класса Фигура (прописать два поля у этого класса  x  и y - координаты центра фигуры и создать метод смещения Фигуры).
// Создать метод получения значения Периметра и переопределить его в каждом классе.
// В демоклассе создать экземпляры этих классов и вызвать метод получения значения Периметра
// а также сместить каждую фигуру в другое место


class Figure {
    double coordinateX;
    double coordinateCenterY;


    public Figure(double coordinateX, double coordinateCenterY) {
        this.coordinateX = coordinateX;
        this.coordinateCenterY = coordinateCenterY;
    }

    public Figure() {
    }

    void move() {
        System.out.println();
        System.out.println("Figure not moved");
    }

}

class Rectangle extends Figure {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double coordinateX, double coordinateCenterY, double width, double height) {
        super(coordinateX, coordinateCenterY);
        this.width = width;
        this.height = height;
    }


    @Override
    void move() {
        if (coordinateX == 0 || coordinateCenterY == 0)
            System.out.println("Figure not moved");
        else if (coordinateX > 0 || coordinateCenterY > 0)
            System.out.println("The figure is moved to the right - " + " on x " + coordinateX + " on y " + coordinateCenterY);
        else if (coordinateX < 0 || coordinateCenterY < 0)
            System.out.println("The figure is moved to the left - " + " on x " + coordinateX + " on y " + coordinateCenterY);

    }

    double perimeter() {
        System.out.println("The perimeter of the rectangle is -  " + width * height);
        return width * height;
    }
}

class Ellipse extends Figure {
    double p = 3.14;
    double a;
    double b;


    public Ellipse(double p, double a, double b) {
        this.p = p;
        this.a = a;
        this.b = b;
    }

    public Ellipse(double coordinateX, double coordinateCenterY) {
        super(coordinateX, coordinateCenterY);
    }


    @Override
    void move() {
        if (coordinateX == 0 || coordinateCenterY == 0)
            System.out.println("Figure not moved");
        else if (coordinateX > 0 || coordinateCenterY > 0)
            System.out.println("The figure is moved to the right - " + " on x " + coordinateX + " on y " + coordinateCenterY);
        else if (coordinateX < 0 || coordinateCenterY < 0)
            System.out.println("The figure is moved to the left - " + " on x " + coordinateX + " on y " + coordinateCenterY);

    }

    double perimeter() {
        System.out.println("The perimeter of the Ellipse is: " + p * (a + b));
        return p * (a + b);

    }
}

class Circle extends Ellipse {
    double radius;
    double p = 3.14;

    public Circle(double p, double a, double b, double radius) {
        super(p, a, b);
        this.radius = radius;
    }

    public Circle(double coordinateX, double coordinateCenterY) {
        super(coordinateX, coordinateCenterY);
    }


    @Override
    double perimeter() {
        System.out.println("The perimeter of the Circle is -  " + 2 * p * radius);
        return 2 * p* radius;
    }

    @Override
    void move() {
        if (coordinateX == 0 || coordinateCenterY == 0)
            System.out.println("Figure not moved");
        else if (coordinateX > 0 || coordinateCenterY > 0)
            System.out.println("The figure is moved to the right  - " + " on x " + coordinateX + " on y " + coordinateCenterY);
        else if (coordinateX < 0 || coordinateCenterY < 0)
            System.out.println("The figure is moved to the left  - " + " on x " + coordinateX + " on y " + coordinateCenterY);


    }
}

class DemoFigure {
    public static void main(String[] args) {

        Figure figure = new Figure();
        figure.move();
        System.out.println();
        Rectangle rectangle = new Rectangle(6, 7);
        Rectangle rectangle1 = new Rectangle(5, 6, 9, 8.5);
        rectangle.perimeter();
        rectangle1.move();
        System.out.println();
        Ellipse ellipse = new Ellipse(3.14, 5, 6);
        Ellipse ellipse1 = new Ellipse(-0.8, -8);
        ellipse.perimeter();
        ellipse1.move();
        System.out.println();
        Circle circle = new Circle(3.14, 6, 5, 6);
        Circle circle1 = new Circle(2.8, 9.4);
        circle.perimeter();
        circle1.move();

    }
}







