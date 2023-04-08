import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class GerenciarFuncionarios {

    public static List<Funcionarios> listaFuncionarios = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciarFuncionarios gf = new GerenciarFuncionarios();
        int opcao;
        do {
            System.out.println("_______________________________");
            System.out.println("..GERENCIADOR DE FUNCIONARIOS..");
            System.out.println("_______________________________");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Consultar lista de Funcionarios");
            System.out.println("3 - Consultar Unico Funcionario");
            System.out.println("4 - Bonificar todos os funcionarios");
            System.out.println("5 - Bonificar Unico Funcionario");
            System.out.println("9 - Sair");
            System.out.println("_______________________________");
            System.out.println("O que voce deseja: ");

            opcao = Integer.parseInt(gf.sc.nextLine());

            switch (opcao) {
                case 1 -> gf.execCadastrar();
                case 2 -> gf.execConsultar();
                case 3 -> gf.execConsultarUnico();
                case 4 -> gf.execBonificar();
                case 5 -> gf.execBonificarUnico();
                case 9 -> System.out.println("Saindo do programa...\nFinalizado com Sucesso.");
                default -> System.out.println("Opcao Invalida");
            }

        } while (opcao!=9);

    }

    public void execCadastrar(){
        System.out.println("Salario: ");
        double salario = Double.parseDouble(sc.nextLine());
        System.out.println("Registro: ");
        long registro = Long.parseLong(sc.nextLine());
        System.out.println("Esta Ativo [SIM/NAO]: ");
        String entradaUsuario = sc.nextLine();
        //boolean estaAtivo = Boolean.parseBoolean(sc.nextLine());
        boolean estaAtivo = true;
        if (entradaUsuario.equalsIgnoreCase("SIM")){
            estaAtivo = true;
        } else if(entradaUsuario.equalsIgnoreCase("NAO")){
            estaAtivo = false;
        }
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Departamento: ");
        String departamento = sc.nextLine();
        System.out.println("RG: ");
        String rg = sc.nextLine();

        Funcionarios funcionarios1 = new Funcionarios(salario, registro, estaAtivo, nome, departamento, rg);
        listaFuncionarios.add(funcionarios1);

    }


    public void execConsultar(){
        System.out.println("Consulta de todos os funcionarios..");
        for (Funcionarios funcionarios1: listaFuncionarios) {
            funcionarios1.imprimirTodos();
        }
        System.out.println("Fim da Lista");
    }

    public void execConsultarUnico(){
        System.out.println("Informe o registro do funcionario: ");
        long registro = Long.parseLong(sc.nextLine());
        for (Funcionarios funcionarios: listaFuncionarios) {
            if (funcionarios.getRegistro() == registro) {
                System.out.println("Funcionario encontrado com sucesso");
                funcionarios.imprimir();
            } else {
                System.out.println("Funcionario não encontrado");
            }
        }
    }

    public void execBonificar(){
        System.out.println("informe o valor da bonificação: ");
        double valor = Double.parseDouble(sc.nextLine());
        for (Funcionarios funcionarios1: listaFuncionarios) {
            funcionarios1.setSalario(funcionarios1.getSalario() + valor);
        }
        System.out.println("Funcionarios Bonificados!");
    }

    public void execBonificarUnico(){
        System.out.println("Informe o Registro do funcionario que voce deseja bonificar: ");
        long registro = Long.parseLong(sc.nextLine());
        for (Funcionarios funcionarios1: listaFuncionarios) {
            if (funcionarios1.getRegistro() == registro) {
                System.out.println("Informe o valor da bonificacao para esse funcionario");
                double valor = Double.parseDouble(sc.nextLine());
                funcionarios1.setSalario(funcionarios1.getSalario() + valor);
            } else {
                System.out.println("Funcionario não encontrado");
            }
        }
    }

}