package unidad2.ExpresionesRegulares;

public class Ejercicio17 {
    public static void main(String[] args) {
        String[] ips = {
                "215.08.096.196",
                "171.102.000.104",
                "010.001.00.000",
                "192.168.01.01"
        };
        String regex = "\\b0+(\\d)";
        System.out.println("IP Original          ->  IP Limpia");
        System.out.println("------------------------------------");
        for (String ip : ips) {
            String limpia = ip.replaceAll(regex, "$1");
            System.out.println(ip + "      ->  " + limpia);
        }
    }
}
