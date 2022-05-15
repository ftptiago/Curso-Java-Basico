/**
 * CONTROLE DE FLUXO CONDICIONAL
 * Utilização do IF, ELSE 
 * @author Fabrício Paixão
 */

public class ControleFluxo2 {
    /* Método principal da classe */
    public static void main(String[] args) {
        int numero = 8; // Define o valor da variável em 8 
        if((numero % 2) == 0){// verifica se o resto da divisão é igual a 0.
            System.out.println("Este é um número par!"); //imprime em tela a mensagem
        }else{
            System.out.println("Este é um número impar!");//imprime em tela a mensagem
        }
    }//fim do Método
}//fim da Classe