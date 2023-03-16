import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProdutoMain {
    public List<Produto> produtos= new ArrayList<>();
    public Scanner sc = new Scanner(System.in);
    public Produto pt = new Produto();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoMain teste = new ProdutoMain();
        int opcao = 0;
        do{ //FAZENDO O MENUZAO
            System.out.println("MENU");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Registrar entrada de produto");
            System.out.println("3. Registrar saida de produto");
            System.out.println("4. Consultar os produtos cadastrados");
            System.out.println("6. Verificar valor dos produtos em estoque");
            System.out.println("9. FIM");
            System.out.println("Escolha sua opcao");
            opcao = parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execRegistrarEntrada();
                    break;
                case 3:
                    teste.execRegistrarSaida();
                    break;
                case 4:
                    teste.execConsultar();
                    break;

                case 6:
                    teste.execValorEmReais();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (opcao!=9);
    }

    public void execCadastrar(){
        //FUNCAO DO CADASTRO
        Produto produto = new Produto();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto");
        pt.setCodigo(parseInt(sc.nextLine()));
        System.out.println("Digite o Nome do produto");
        pt.setNome(sc.nextLine());
        System.out.println("Digite a descricao do produto");
        pt.setDescricao(sc.nextLine());
        System.out.println("Digite o preco do produto");
        pt.setValorUnit(Double.parseDouble(sc.nextLine()));
        double porcentagem;
        System.out.println("Digite o custo de produção em %, ex: 10% ..:");
        porcentagem = Double.parseDouble(sc.nextLine());
        porcentagem /= 100;
        double desconto = pt.getValorUnit() * porcentagem;
        pt.producao(desconto);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso");
    }
    public void execConsultar(){

        System.out.println("Exibindo todos os produtos cadastroasdos");
        for(Produto f : produtos){
            pt.imprimir();
            }
        }


    public void execRegistrarSaida(){
        Scanner sc = new Scanner(System.in);
        int valorSaida;
        System.out.println("Digite o valor a ser retirado");
        valorSaida = parseInt(sc.nextLine());
        boolean saiu = pt.darSaida(valorSaida);
        if(saiu){
            System.out.println("Produto retirado com sucesso");
        }else{
            System.out.println("Nao possui estoque o sucificiente para saida");
        }
    }
    public void execRegistrarEntrada(){
        Scanner sc = new Scanner(System.in);
        int valorEntrada;
        System.out.println("Digite o valor da entrada");
        valorEntrada = parseInt(sc.nextLine());
        pt.darEntrada(valorEntrada);
        System.out.println("Entrada realizada com sucesso");
    }
    public void execValorEmReais(){
        int valorEmReais = (int) (pt.getQuantidadeEstoque()* pt.getValorUnit());
        System.out.println("Valor em reais = " + valorEmReais);
    }
}