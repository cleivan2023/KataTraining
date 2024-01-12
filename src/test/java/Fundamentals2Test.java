public class Fundamentals2 {
    public static long sumCubes(long n) {
        // Verificamos si n es positivo
        if (n <= 0) {
            System.out.println("El número debe ser un entero positivo.");
            return 0;
        }

        // Inicializamos la suma de los cubos
        long sum = 0;

        // Sumamos los cubos de los números desde 1 hasta n
        for (long i = 1; i <= n; i++) {
            sum += i * i * i;  // En lugar de Math.pow, utilizamos la multiplicación para mejorar el rendimiento
        }

        return sum;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println("sumCubes(2) --> " + sumCubes(2)); // Debería imprimir 9
        System.out.println("sumCubes(3) --> " + sumCubes(3)); // Debería imprimir 36
    }
}

