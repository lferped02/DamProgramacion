package OrientacionAObjetos.Gatos.Modelo;

 public class Gato {
    String color;
    String raza;
    String sexo;
    int edad;
    double peso;

     public Gato(String color, String raza, String sexo, int edad, double peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

     public void maullar() {
        System.out.println("miuauuuuu");
    }

     public void ronronear() {
        System.out.println("rrrrr");
    }

     public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println("Yummy Yummy");
        } else {
            System.out.println("buahhh, mejor no");
        }
    }

     public void pelear(Gato oponente) {
        if (this.sexo.equals(oponente.sexo)) {
            System.out.println("Ven aquí que te vas a enterar");
        } else {
            System.out.println("La violencia nunca es la solución");
        }
    }
}
