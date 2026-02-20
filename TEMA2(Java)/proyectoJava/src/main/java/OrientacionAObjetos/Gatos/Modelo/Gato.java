package OrientacionAObjetos.Gatos.Modelo;

 class Gato {
    String color;
    String raza;
    String sexo;
    int edad;
    double peso;

     Gato(String color, String raza, String sexo, int edad, double peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

     void maullar() {
        System.out.println("miuauuuuu");
    }

     void ronronear() {
        System.out.println("rrrrr");
    }

     void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println("Yummy Yummy");
        } else {
            System.out.println("buahhh, mejor no");
        }
    }

     void pelear(Gato oponente) {
        if (this.sexo.equals(oponente.sexo)) {
            System.out.println("Ven aquí que te vas a enterar");
        } else {
            System.out.println("La violencia nunca es la solución");
        }
    }
}
