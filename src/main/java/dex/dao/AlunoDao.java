/**
 * 
 */

/**
 * 
 */
package dex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dex.model.Aluno;

public class AlunoDao {

	public void entrar(Aluno aluno) {
		String sql = "INSERT INTO ALUNO (codigoAluno, matricula, nomeCompleto, emailResponsavel, endereco, dataNascimento) VALUES(null, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pStatement = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = (PreparedStatement) conn.prepareStatement(sql);
			pStatement.setString(1, aluno.getMatricula());
			pStatement.setString(2, aluno.getNomeCompleto());
			pStatement.setString(3, aluno.getEmailResponsavel());
			pStatement.setString(4, aluno.getEndereco());
			pStatement.setString(5, aluno.getDataNascimento());
			pStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

/*
 * package dex.dao;
 * 
 * import java.sql.Connection; import java.sql.PreparedStatement;
 * 
 * import dex.model.Ave;
 * 
 * public class AveDao {
 * 
 * public void catalogar (Ave ave) { String sql =
 * "INSERT INTO AVE VALUES (null, ?, ?, ?, ?)"; Connection conn = null;
 * PreparedStatement pStatement = null;
 * 
 * try{ conn = new MySqlConnection().getConnection(); pStatement =
 * (PreparedStatement) conn.prepareStatement(sql); pStatement.setString(1,
 * ave.getFamilia()); pStatement.setString(2, ave.getSubfamilia());
 * pStatement.setString(3, ave.getNomeingles()); pStatement.setString(4,
 * ave.getEstadoConservacao()); pStatement.execute(); } catch (Exception e) {
 * e.printStackTrace(); }finally { try { if(pStatement!=null) {
 * pStatement.close(); } if (conn!=null) { conn.close(); } } catch (Exception
 * e2) { e2.printStackTrace(); } } } }
 */
