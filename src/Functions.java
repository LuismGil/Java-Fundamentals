public class Functions {
    public static void main(String[] args) {
        double y = 3;
        // Area of a circle
        // PI * r2
        circleArea(y);


        // Area of a sphere
        // 4*PI*r2
        sphereArea(y);

        // Volume of a sphere
        // (4/3) * PI * r3
        sphereVolume(y);

        System.out.println("Pesos to Dollar: " + convertToDollar(1000, "MXN"));
        System.out.println("Real to Dollar: " + convertToDollar(1000, "BRL"));
    }


    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    public static double convertToDollar(double quantity, String currency) {
        // MXN BRL
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "BRL":
                quantity = quantity * 0.17;
                break;
        }
        return quantity;
    }
}
