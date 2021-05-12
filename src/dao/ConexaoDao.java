package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDao {
			
		public Connection conectaBD() {
			Connection conn = null;
			try {
				String url = "jdbc:mysql://localhost:3306/lojaimoveis?user=root&password=";
				conn = DriverManager.getConnection(url);
				
			} catch (SQLException erro) {
				JOptionPane.showMessageDialog(null, "conexaodao" + erro.getMessage());
			}
			return conn;
		}
}
