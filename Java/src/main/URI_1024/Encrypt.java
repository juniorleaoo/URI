package main.URI_1024;

public class Encrypt {
    private StringBuilder entrada;
    private int tamanhoEntrada;

    public Encrypt(String entrada) {
        this.entrada = new StringBuilder(entrada);
        this.tamanhoEntrada = entrada.length();
    }

    public String getEntrada() {
        return entrada.toString();
    }

    /**
     * Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser
     * deslocadas 3 posições para a direita, segundo a tabela ASCII:
     * letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente.
     */
    public void executaPrimeiraPassada() {
        for (int i = 0; i < tamanhoEntrada; i++) {
            char character = entrada.charAt(i);

            if (Character.isLetter(character) && (Character.isLowerCase(character) || Character.isUpperCase(character))) {
                int characterAscii = (int) character;
                characterAscii += 3;
                entrada.setCharAt(i, ((char) characterAscii));
            }

        }
    }

    /**
     * Na segunda passada, a linha deverá ser invertida.
     */
    public void executaSegundaPassada() {
        entrada.reverse();
    }

    /**
     * Na terceira e última passada, toda e qualquer caractere a partir da
     * metade em diante (truncada) devem ser deslocados uma posição para a esquerda
     * na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.
     */
    public void executaTerceiraPassada() {
        for (int i = tamanhoEntrada / 2; i < tamanhoEntrada; i++) {
            char character = entrada.charAt(i);

            int characterAscii = (int) character;
            characterAscii--;
            entrada.setCharAt(i, ((char) characterAscii));

        }
    }

    public void executaTodasEtapas() {
        executaPrimeiraPassada();
        executaSegundaPassada();
        executaTerceiraPassada();
    }

}
