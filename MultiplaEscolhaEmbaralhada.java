import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultiplaEscolhaEmbaralhada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite = 0;
        boolean taCerto = false;


        ArrayList<String> resposta = new ArrayList<String>();
            
            resposta.add("<A> System.out.println(''); ");
            resposta.add("<B> console.log('');");
            resposta.add("<C> System.println('');");
            resposta.add("<D> System.out.println('') ");
            resposta.add("<E> Nenhuma das opções");
            

        do{
            limite++;
            System.out.println("--");
            System.out.println("Para imprimir uma mensagem na tela em java, qual seria o comando ?");
            System.out.println("Digite uma alternativa!");
            System.out.println("--");
            for(String resp : resposta){
                System.out.println(resp);
            }
            String resp = input.next();
            Collections.shuffle(resposta);

            switch (resp) {
                case "A":
                case "a":
                    System.out.println("Alternativa ' "  + resp + " ' esta correta! ");
                    taCerto = true;
                    break;
                case "B":
                case "b":
                    System.out.println("Alternativa ' "  + resp + " ' esta Incorreta! ");
                    break;
                case "C":
                case "c":
                    System.out.println("Alternativa ' "  + resp + " ' esta Incorreta! ");
                    break;
                case "D":
                case "d":
                    System.out.println("Alternativa ' "  + resp + " ' esta Incorreta! ");
                    break;
                case "E":
                case "e":
                    System.out.println("Alternativa ' "  + resp + " ' esta Incorreta! ");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

            if(!taCerto && limite >= 3){
                System.out.println("Resposta incorreta nas 3 tentativas!");
                System.out.println("Alternativa correta: ' A '");
                break;
            }
        }while(!taCerto && limite < 3);
    }
}