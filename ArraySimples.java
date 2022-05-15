import java.util.Arrays;

public class ArraySimples {
    
    public static void main(String[] args) {
        String[] Pessoas = {"Leo", "Maria", "Ana", "Pedro"};
        /* ================== 0 ===== 1 ===== 2 ===== 3 === */ 
        System.out.println(Pessoas[2]); /* Pessoas[0] = Representa a posição do dado contido no array selecionado[0] Exemplo "Leo".*/
        System.out.println(Arrays.toString(Pessoas));

        int posicao = Arrays.binarySearch(Pessoas, "Pedro");
        System.out.println(posicao);

        Arrays.sort(Pessoas, 0, Pessoas.length); //ordena o nosso array iniciando em zero
        System.out.println (Arrays.toString (Pessoas)); //imprime o resultado em tela
    }
}
