public class Algorithms2 {
    public static void main(String[] args) {
        HalvingSum halvingSumInstance = new HalvingSum();

        int result = halvingSumInstance.halvingSum(25); // Puedes cambiar el número según sea necesario
        System.out.println("La suma es: " + result);
    }

    int halvingSum(int n) {
        int sum = 0;
        int currentTerm = n;

        while (currentTerm > 0) {
            sum += currentTerm;
            currentTerm = currentTerm / 2;
        }

        return sum;
    }
}

}

/* caso: Halving Sum (Reducir a la mitad la suma)
Instrucciones:
Dado un número entero positivo n, calcule la siguiente suma:

n + n/2 + n/4 + n/8 + ...
Todos los elementos de la suma son el resultado de la división de números enteros.

Ejemplo
25 => 25 + 12 + 6 + 3 + 1 = 47
ALGORITMOS
 */
