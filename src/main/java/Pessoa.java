public class Pessoa {

    private String nome;
    private int cpf;
    private int idade;


    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getCpf() {
        return cpf;
    }

    public Pessoa setCpf(int cpf) {
        this.cpf = cpf;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa setIdade(int idade) {
        this.idade = idade;
        return this;
    }
}
