public class vetorOrdenado {
    public static void main(String[] args) {
        int numeros[] = {1,2,2,3,4,5};
        boolean repetidos = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                  repetidos = true;  
                }
            }
        }
        System.out.println("Há números repetidos no vetor? " + repetidos);
    }
}
