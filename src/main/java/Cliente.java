public class Cliente {

    private String nome;
    private int cpf;
    private int idade;


    public String getNome() {
        return nome;
    }

    public Cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getCpf() {
        return cpf;
    }

    public Cliente setCpf(int cpf) {
        this.cpf = cpf;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Cliente setIdade(int idade) {
        this.idade = idade;
        return this;
    }
}
