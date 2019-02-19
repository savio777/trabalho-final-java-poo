package facema.model;

/**
 *
 * @author savio
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private String cpf;
    private String numero;
    private String endereco;
    private int anoNascimento;
    
    public Pessoa(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int idPessoa) {
        this.id = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    
    
}
