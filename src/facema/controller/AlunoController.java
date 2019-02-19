package facema.controller;

import facema.model.Aluno;
import facema.dao.AlunoDao;
import javax.swing.JOptionPane;
//import facema.view.TelaPrincipal;        
//import facema.model.Aluno;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author savio
 */
public class AlunoController {

    private AlunoDao alunoDao = new AlunoDao();
    private Aluno aluno = new Aluno();
    
    public void listarAlunos(DefaultTableModel tabela){
        this.alunoDao.listaAluno(tabela);
    }
    
    public void addAlunos(Aluno aluno){
        this.alunoDao.addAluno(aluno);         
        JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + ", matriculado.");

    }
    
    public void pesquisarAlunos(String nome, DefaultTableModel tabela){
        this.alunoDao.pesquisarAluno(nome, tabela);
    }
    
    public void apagarAluno(String nomeAluno){
        this.alunoDao.removerAluno(nomeAluno);
        JOptionPane.showMessageDialog(null, "Matricula cancelada: "+nomeAluno);
    }
    
    public void alterarAluno(String nomeAluno,String num, String cpf, String end, String numMatricula){
        this.alunoDao.atualizarAluno(nomeAluno, num, cpf, end, numMatricula);
        JOptionPane.showMessageDialog(null, "Aluno: "+nomeAluno+", alterado com sucesso");
    }
    
}
