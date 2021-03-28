public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Returns an integer upward
        System.out.println(Math.ceil(x));

        // Returns an integer downward
        System.out.println(Math.floor(x));

        // Returns a number raised to another number
        System.out.println(Math.pow(x,y));

        // Return de largest number
        System.out.println(Math.max(x,y));

        // Returns the square root
        System.out.println(Math.sqrt(y));

        // Area of a circle
        // PI * r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Area of a sphere
        // 4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volume of a sphere
        // (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
