public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        // assignment operators
        System.out.println("a equals to b? -> " + (a == b));
        System.out.println("a is different to b? -> " + (a != b));

        // relational operators
        System.out.println("a is greater than b -> " + (a > b));
        System.out.println("a is lower than b -> " + (a < b));
        System.out.println("a is greater or equal to b -> " + (a >= b));
        System.out.println("a is lower or equal to b -> " + (a <= b));

        if (a == b) {
            System.out.println("a equals to b");
        } else if((a != b) && (a > b)) {
            System.out.println("a is different to b");
        } else if(a > b) {
            System.out.println("a is greater than b");
        } else if(a < b) {
            System.out.println("a is lower than b");
        } else if(a >= b) {
            System.out.println("a is greater or equal to b");
        } else if(a <= b) {
            System.out.println("a is lower or equal to b");
        }
    }
}
