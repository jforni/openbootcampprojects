public class Main {
    public static void main(String[] args){
        int resultadoSuma = sumaTresNumeros(8, 25, 125);
        System.out.println(resultadoSuma);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.numeroPuertas);
    }
    public static int sumaTresNumeros(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

class Coche {
    public int numeroPuertas = 0;

    public void AgregarPuerta() {
        this.numeroPuertas++;
    }
}

