import java.util.ArrayList;
import java.util.Scanner;

public class MiniPJ {
    public static void linhas() {
        System.out.println("    --------------------------------------- ");
    }
    public static void Alunos() {
        System.out.println("  ---------Lista de Produtos Atualizada-------- ");
    }

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> idades = new ArrayList<Integer>();
        ArrayList<String> faculdades = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        while (true) {
            String nome;
            int idade;
            String faculdade;
            linhas();
            System.out.println("\033[32m               Digite a opcao");
            linhas();
            System.out.println("            1- Cadastrar Produto");
            System.out.println("        2- Buscar Produto Cadastrado");
            System.out.println("            3- Lista de Produtos");
            System.out.println("             4- Editar Produtos");
            System.out.println("             5- Remover Produtos");
            System.out.println("                 6- Sair ! ");

            System.out.println("Apenas numeros - 1 , 2 , 3 , 4 , 5 , 6 !");
            Alunos();
            for (int j = 0; j < nomes.size(); j++) {
                System.out.println((j + 1) + " - " + nomes.get(j));
            }
            linhas();
            int opcao = input.nextInt();

            while (opcao > 6 || opcao < 1) {
                System.out.println("Opção inválida!");
                System.out.print("Escolha um número entre 1 e 6: ");
                opcao = input.nextInt();
            }
            // CREATE
            if (opcao == 1) {
                linhas();
                System.out.println("\033[30;40m Nome do Produto:");
                nome = input.next();
                linhas();
                System.out.println("Código do Produto:");
                idade = input.nextInt();
                linhas();
                System.out.println("Valor do Produto:");
                faculdade = input.next();
                linhas();


                nomes.add(nome);
                idades.add(idade);
                faculdades.add(faculdade);
                

                System.out.println("\033[34m      Produto Cadastrado com Sucesso");

                // READ
            } else if (opcao == 2) {
                linhas();
                System.out.println("Digite o nome do Produto");
                nome = input.next();
                linhas();

                for (int i = 0; i < nomes.size(); i++) {
                    String nomeLista = nomes.get(i);
                    if (nomeLista.equals(nome)) {
                        linhas();
                        System.out.println("\033[33m     <(@_@)> Produto Encontrado <(@_@)> ");
                        linhas();
                        System.out.println("\033[33m          --- Nome do Produto --- ");
                        System.out.println("  ------------>> "+nomeLista);
                        linhas();
                        int idadeBusca = idades.get(i);
                        System.out.println("\033[33m         --- Código  ---  ");
                        System.out.println("----------------->> "+idadeBusca);
                        linhas();
                        String faculdadeBusca = faculdades.get(i);
                        System.out.println("\033[33m       --- Valor ---" );
                        System.out.println("-------------->> "+faculdadeBusca);
                    }
                }
            } else if (opcao == 3) {
                linhas();
                Alunos();
                for (int j = 0; j < nomes.size(); j++) {
                    System.out.println((j + 1) + " - " + nomes.get(j));
                }
                linhas();


            } else if (opcao == 4) {
                String editor;
                linhas();
                System.out.print("\033[34m Informe o número do Produto que deseja editar: ");
                opcao = input.nextInt();
                while (opcao > nomes.size()) {
                    linhas();
                    System.out.println("\033[34m Ao todo são " + (nomes.size()) + " Produtos.");
                    System.out.print("Informe um número entre 1 e " + (nomes.size()) + ": ");
                    opcao = input.nextInt();
                }
                linhas();
                System.out.println("\033[34m Pronto Produto selecionado : " + nomes.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe o novo Produto: ");
                editor = input.next();
                nomes.set(opcao - 1, editor);
                linhas();

                System.out.println("Agora  ");
                linhas();
                System.out.println("\033[34m Pronto Produto selecionado : " + faculdades.get(opcao - 1));
                linhas();
                System.out.print("\033[34m Informe o novo valor : ");
                editor = input.next();
                faculdades.set(opcao - 1, editor);
                linhas();


            } else if (opcao == 5) {
                System.out.print("Informe o número do Produto que deseja remover: ");
                opcao = input.nextInt();
                while (opcao > nomes.size()) {
                    System.out.println("Ao todo são " + (nomes.size()) + " alunos.");
                    System.out.print("Informe um número entre 1 e " + (nomes.size()) + " : ");
                    opcao = input.nextInt();
                }
                linhas();
                System.out.println("        Produto removido: " + nomes.get(opcao - 1));
                nomes.remove(opcao - 1);
                linhas();

            } else if(opcao == 6){
                System.out.println("Programa atualizado com Sucesso!");
                break;
            }

        }

        input.close();

    }

}
    

