import java.util.Scanner;

public class Aula12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nome = new String[5];
        int[] idade = new int[5];
        String[] sexo = new String[5];

       for(int x=0; x<5; x++) {

           System.out.println("----Cadastro de Usuário-----");

           System.out.println("Digite seu nome:");
           nome[x] = scanner.nextLine();

           System.out.println("Digite sua idade:");
           idade[x] = Integer.parseInt( scanner.nextLine() );

           System.out.println("Digite seu sexo:");
           sexo[x] = scanner.nextLine();
       }


        System.out.println("Lista de usuários");

       for(int x=0; x<5; x++){
           System.out.println("Nome: "+nome[x]+ " - Idade: "+idade[x]+ " - Sexo: "+ sexo[x]);
       }

    }
}
