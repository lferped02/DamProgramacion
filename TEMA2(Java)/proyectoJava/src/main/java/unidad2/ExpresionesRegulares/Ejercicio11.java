package unidad2.ExpresionesRegulares;

public class Ejercicio11 {
    public static void main(String[] args) {

        String texto = "El servidor principal fue configurado con la dirección 192.168.1.10, " +
                "mientras que el servidor de respaldo utiliza 192.168.1.20 para garantizar la continuidad... " +
                "se detectó tráfico inusual proveniente de 10.0.0.45, lo que llevó a una revisión... " +
                "distribuye las solicitudes entre 172.16.0.5 y 172.16.0.6... " +
                "permitido desde la IP 203.0.113.8... conexiones fallidas desde 198.51.100.23.";
        String regexIP = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        String textoProtegido = texto.replaceAll(regexIP, "[IPv4]");
        System.out.println("--- TEXTO PROCESADO ---");
        System.out.println(textoProtegido);
    }
}
