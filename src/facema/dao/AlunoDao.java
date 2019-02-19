package facema.dao;

import facema.factory.Factory;
import facema.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author savio
 */
public class AlunoDao {
    
    private Connection conn;
    
    public AlunoDao(){
        this.conn = new Factory().connection("trab_ferds?autoReconnect=true&useSSL=false", "root", "");
    }
     
    public void addAluno(Aluno aluno){
        String sql="INSERT INTO aluno (nome,numero,cpf,endereco,ano_nasc,numMatricula,serie,nome_pai,nome_mae) "
                 + "VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement psm = this.conn.prepareStatement(sql);
            psm.setString(1, aluno.getNome());
            psm.setString(2, aluno.getNumero());
            psm.setString(3, aluno.getCpf());
            psm.setString(4, aluno.getEndereco());
            psm.setInt(5, aluno.getAnoNascimento());
            psm.setInt(6, aluno.getNumMatricula());
            psm.setInt(7, aluno.getSerie());
            psm.setString(8, aluno.getNomePai());
            psm.setString(9, aluno.getNomeMae());
            
            psm.execute();
            psm.close();
            this.conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void atualizarAluno(String nome, String num, String cpf, String end, String numMatricula){
        String sql = "UPDATE aluno SET nome=?,numero=?,cpf=?,endereco=? WHERE numMatricula=?";
        try {
            PreparedStatement psm = this.conn.prepareStatement(sql);
            psm.setString(1, nome);
            psm.setString(2, num);
            psm.setString(3, cpf);
            psm.setString(4, end);
            psm.setString(5, numMatricula);
            
            psm.executeUpdate();
            psm.close();
            this.conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void removerAluno(String numMatricula){
        String sql = "DELETE FROM aluno WHERE numMatricula=?";
        try {
            PreparedStatement psm = this.conn.prepareStatement(sql);
            psm.setString(1, numMatricula);
            
            psm.executeUpdate();
            psm.close();
            this.conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void listaAluno(DefaultTableModel table){
        String sql = "SELECT * FROM aluno";
        Aluno aluno = new Aluno();

        try {
            PreparedStatement psm = this.conn.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while(rs.next()){
                aluno.setId(rs.getInt("id_alu")); 
                aluno.setAnoNascimento(rs.getInt("ano_nasc"));
                aluno.setNumMatricula(rs.getInt("numMatricula")); 
                aluno.setSerie(rs.getInt("serie"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNumero(rs.getString("numero"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setNomePai(rs.getString("nome_pai"));
                aluno.setNomeMae(rs.getString("nome_mae"));
                Object[] alunos={aluno.getId(),aluno.getNome(),aluno.getNumero(),aluno.getCpf(),
                aluno.getEndereco(),2018-aluno.getAnoNascimento(),aluno.getNumMatricula(),aluno.getSerie(),
                aluno.getNomePai(),aluno.getNomeMae()};
                table.addRow(alunos);
            }
            psm.close();
            rs.close();
            this.conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void pesquisarAluno(String nomeAluno, DefaultTableModel tabela){
        String sql = "SELECT * FROM aluno WHERE nome LIKE ?";
        Aluno aluno = new Aluno();
        try {
            PreparedStatement psm = this.conn.prepareStatement(sql);
            psm.setString(1, nomeAluno+"%");
            ResultSet rs = psm.executeQuery();
            while(rs.next()){
                aluno.setId(rs.getInt("id_alu")); 
                aluno.setAnoNascimento(rs.getInt("ano_nasc"));
                aluno.setNumMatricula(rs.getInt("numMatricula")); 
                aluno.setSerie(rs.getInt("serie"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNumero(rs.getString("numero"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setNomePai(rs.getString("nome_pai"));
                aluno.setNomeMae(rs.getString("nome_mae"));
                Object[] alunos={aluno.getId(),aluno.getNome(),aluno.getNumero(),aluno.getCpf(),
                aluno.getEndereco(),2018-aluno.getAnoNascimento(),aluno.getNumMatricula(),aluno.getSerie(),
                aluno.getNomePai(),aluno.getNomeMae()};
                tabela.addRow(alunos);
            }
            psm.close();
            rs.close();
            this.conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
