package facema.model;

import java.util.Random;

/**
 *
 * @author savio
 */
public class Aluno extends Pessoa {
    
    private int numMatricula;
    private int serie;
    private String nomeMae;
    private String nomePai;

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    
    /*public void retornarAluno(String nome,String numero,String cpf,String endereco,String anoNasc,String serie,String nomePai,String nomeMae){
        Random random = new Random();
        int numMatricula= random.nextInt(101) ;
        
        this.aluno.setNome(nome);
        this.aluno.setAnoNascimento(Integer.parseInt(anoNasc));
        this.aluno.setCpf(cpf);
        this.aluno.setEndereco(endereco);
        this.aluno.setNomeMae(nomeMae);
        this.aluno.setNomePai(nomePai);
        this.aluno.setNumero(numero);
        this.aluno.setSerie(Integer.parseInt(serie));
        this.aluno.setNumMatricula(numMatricula);
        
        //return this.aluno;
    }*/
    
    
}
