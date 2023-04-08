public class Funcionarios {
    private double salario;
    private long registro;
    private boolean estaAtivo;
    private String nome;
    private String departamento;
    private String rg;

    public Funcionarios(double salario, long registro, boolean estaAtivo, String nome,String Departamento, String rg) {
        this.salario = salario;
        this.registro = registro;
        this.estaAtivo = estaAtivo;
        this.nome = nome;
        this.departamento = Departamento;
        this. rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Funcionario.." +
                "Salario: " + salario +
                "Registro: " + registro +
                "Funcionario Ativo: " + estaAtivo +
                "Nome: '" + nome + '\'' +
                "Departamento: '" + departamento + '\'' +
                "RG: '" + rg;
    }

    public void imprimir() {
        System.out.println("\nNome: " +nome+ "\nSalario: "+ salario + "\nSeu departamento é: " +departamento+ "\nRegistro: "+registro+"\nEsta ativo? "+estaAtivo+"\nRG: "+rg);
    }

    public void imprimirTodos() {
        System.out.println("\nNome: " +nome+ " || Salario: "+ salario + " || Seu departamento é: " +departamento+ " || Registro: "+registro+" || Esta ativo? "+estaAtivo+" || RG: \n"+rg);
}

    public void bonificar(double valor) {
        double bonificar = salario + valor;
        System.out.println("Com uma bonificação de R$ "+ valor +" Seu novo salario será: R$ " + bonificar);
        System.out.println("Bonificacao concluida com sucesso");
    }

}