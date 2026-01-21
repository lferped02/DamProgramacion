package unidad2.BoletinMatrices;

public class MaquinaDulces {
    public static void main(String[] args) {
        int[][] inventario = {
                {5, 0, 8}, // Estante 0
                {2, 10, 0}, // Estante 1
                {0, 4, 1},  // Estante 2
        };

        MaquinaDulces maquina = new MaquinaDulces();
        maquina.deteccionAgotados(inventario);
        int totalAgotados = maquina.contabilizaAgotador(inventario);
        System.out.println("Resumen: Se han encontrado " + totalAgotados + " productos agotados en total.");
    }
    public void deteccionAgotados(int[][] inventario) {
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                if (inventario[i][j] == 0) {
                    System.out.println("¡Alerta! Producto agotado en la Fila " + i + ", Columna " + j + ".");
                }
            }
        }
    }
    public int contabilizaAgotador(int[][] inventario) {
        int contador = 0;
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                if (inventario[i][j] == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }
}