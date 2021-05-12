package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.CompradorDto;
import dto.ImovelDto;

public class ImovelDao {
	Connection conn;
	PreparedStatement pstm;	
	ResultSet rs;
	ArrayList<ImovelDto> lista = new ArrayList<>();
	public void CadastrarImovel(ImovelDto imodto) {
		String sql = "insert into imovel (endereco,cidade,bairro,estado,valor) values (?,?,?,?,?)";
		conn = new ConexaoDao().conectaBD();
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, imodto.getEndereco());
			pstm.setString(2, imodto.getCidade());
			pstm.setString(3, imodto.getBairro());
			pstm.setString(4, imodto.getEstado());
			pstm.setInt(5, imodto.getValor());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ImovelDao" + erro);
		}
	}
	public ArrayList<ImovelDto> pesquisarImovel(){
		String sql = "select * from imovel";
		conn = new ConexaoDao().conectaBD();
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				ImovelDto imodto = new ImovelDto();
				imodto.setCd_Imovel(rs.getInt("cd_imovel"));
				imodto.setEndereco(rs.getString("endereco"));
				imodto.setBairro(rs.getString("bairro"));
				imodto.setEstado(rs.getString("estado"));
				imodto.setCidade(rs.getString("cidade"));
				imodto.setValor(rs.getInt("valor"));
				
				lista.add(imodto);
			}
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "ImovelDao-pesquisar" + erro);
		}
		return lista;
	}
}
