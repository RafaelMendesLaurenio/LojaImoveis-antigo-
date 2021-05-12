package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import dto.CompradorDto;

public class CompradorDao {
	Connection conn;
	PreparedStatement pstm;	
	public void CadastrarComprador(CompradorDto comdto) {
		String sql = "insert into comprador (nome,endereco,cidade,bairro,estado,telefone,email,cpf) values (?,?,?,?,?,?,?,?)";
		conn = new ConexaoDao().conectaBD();
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, comdto.getNome());
			pstm.setString(2, comdto.getEndereco());
			pstm.setString(3, comdto.getCidade());
			pstm.setString(4, comdto.getBairro());
			pstm.setString(5, comdto.getEstado());
			pstm.setString(6, comdto.getTelefone());
			pstm.setString(7, comdto.getEmail());
			pstm.setInt(8, comdto.getCpf());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "CompradorDao" + erro);
		}
	}
	public ResultSet AutenticarComprador(CompradorDto comdto) {
		conn = new ConexaoDao().conectaBD();
		try {
			String sql = "select * from comprador where cpf = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, comdto.getCpf());
			ResultSet rs = pstm.executeQuery();
			return rs;
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "CompradorDao" + erro);
			return null;
		}
	}
}
