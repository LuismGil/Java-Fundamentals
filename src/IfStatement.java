public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // Send file
            fileSended++;
            System.out.println("File sent");
        } else {
            fileSended--;
            System.out.println("Please turn on your bluetooth to start the transfer");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
