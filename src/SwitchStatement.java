public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("You selected Light mode");
                break;
            case "Night":
                System.out.println("You selected Night mode");
                break;
            case "Blue Dark":
                System.out.println("You selected Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("You selected Dark Mode");
                break;
            default:
                System.out.println("Select an option");
        }
    }
}
