package tp07.Ejercicio02;

public class mainEjercicio02 {
    public static void main(String[] args) {

        // Creación de figuras
        System.out.println("1. Creando figuras individuales:\n");
        
        Circulo circulo1 = new Circulo(5.0);
        System.out.println("Círculo creado:");
        circulo1.mostrarInfo();
                
        Rectangulo rectangulo1 = new Rectangulo(4.0, 6.0);
        System.out.println("Rectángulo creado:");
        rectangulo1.mostrarInfo();
                
        // Demostración de polimorfismo con array
        System.out.println("2. Array de Figuras:\n");
        
        Figura[] figuras = new Figura[5];
        figuras[0] = new Circulo(3.0);
        figuras[1] = new Rectangulo(5.0, 8.0);
        figuras[2] = new Circulo(7.5);
        figuras[3] = new Rectangulo(10.0, 2.5);
        figuras[4] = new Circulo(4.2);
        
        // Recorrer el array y mostrar información usando polimorfismo
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + (i + 1) + ":");
            figuras[i].mostrarInfo();
            System.out.println();
        }
                
        // Cálculo del área total usando polimorfismo
        System.out.println("3. Cálculo del área total de todas las figuras:\n");
        
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        
        System.out.println("Área total de todas las figuras: " + String.format("%.2f", areaTotal) + " unidades²");

        
    }
}