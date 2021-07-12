import java.util.Scanner;

// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height
public class EquilateralTriangle {
    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public double base;
    public double height;

    public EquilateralTriangle() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
            this.height = Math.sqrt(3) / 2 * base;
        }
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return base * height / 2;
    }

    public double perimeter() {
        return this.base * 3;
    }

    public static void main(String[] args) {
        EquilateralTriangle t = new EquilateralTriangle();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = Double.parseDouble(sc.nextLine());

        t.setBase(base);

        double area = t.area();
        double perimeter = t.perimeter();

        System.out.println("A triangle with base of " + t.getBase() + " and height of " + t.getHeight() +
                " has an area of: " + area);
        System.out.println("A triangle with base of " + t.getBase() + " and height of " + t.getHeight() +
                " has a perimeter of: " + perimeter);
    }
}