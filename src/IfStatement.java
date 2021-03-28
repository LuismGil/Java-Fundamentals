public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // Send file
            fileSended++;
            System.out.println("File sent");
            System.out.println(fileSended);
        }
    }
}
