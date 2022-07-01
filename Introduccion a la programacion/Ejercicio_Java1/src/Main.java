public class Main {

    public static void main(String[] args) {
        suma(4, 6, 56); //Parte 1

        Ejercicio1_java miCoche = new Ejercicio1_java(); //Parte 2
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) { //Parte 1
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
    class Ejercicio1_java {  //Parte 2
        public int puertas = 3;
        public void sumarPuertas() {
            this.puertas++;
        }
    }