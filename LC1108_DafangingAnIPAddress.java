public class LC1108_DafangingAnIPAddress {
    public static void main(String[] args) {
        String address = {"1.1.1.1"};
        System.out.println(defangingIPAddress(address));
    }
    public static string defangingIPAddress(String address){
        return address.replace(".", "[.]")
    }
}
