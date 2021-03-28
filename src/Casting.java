public class Casting {
    public static void main(String[] args) {

        // In one year search 30 puppies
        // How many puppies per month?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Estimate
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Accuracy
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);
        //49 equals 1 in ASCII table

        short nS = (short) n;
        System.out.println(nS);





    }
}
