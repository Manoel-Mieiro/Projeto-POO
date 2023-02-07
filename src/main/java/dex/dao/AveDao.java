/**
 * 
 */

/**
 * 
 */
package dex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dex.model.Ave;

public class AveDao {

	public void catalogar(Ave ave) {
		String sql = "INSERT INTO AVE (codigoAve, especie, familia, subfamilia, nomeIngles, estadoConservacao)VALUES (null, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pStatement = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = (PreparedStatement) conn.prepareStatement(sql);
			pStatement.setString(1, ave.getEspecie());
			pStatement.setString(2, ave.getFamilia());
			pStatement.setString(3, ave.getSubfamilia());
			pStatement.setString(4, ave.getNomeingles());
			pStatement.setString(5, ave.getEstadoConservacao());
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
	
	public Ave BuscarAvePorCodigo (int id) {
		String sql = "SELECT * FROM AVE WHERE codigoAve = ?";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Ave ave = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement  = conn.prepareStatement(sql);
			pStatement.setInt(1, id); 
			rs = pStatement.executeQuery();
			if (rs!=null && rs.next()) {
				ave = new Ave();
				ave.setCodigoAve(rs.getInt("codigoAve"));
				ave.setEspecie(rs.getString("especie"));
				ave.setFamilia(rs.getString("familia"));
				ave.setSubfamilia(rs.getString("subfamilia"));
				ave.setNomeingles(rs.getString("nomeIngles"));
				ave.setEstadoConservacao(rs.getString("estadoConservacao"));
			}
		} catch (Exception e) {
		e.printStackTrace();	
		} finally {
			try {
				if (pStatement!=null) {
					pStatement.close();
				}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			try {
			if (conn!=null) {
				conn.close();
			}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		return  ave;
	}

	public ArrayList<Ave> BuscarAvePorNomeIngles(String nomeIngles) {
		String sql = "SELECT * FROM AVE WHERE nomeIngles LIKE '%" + nomeIngles + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Ave ave = null;
		ArrayList<Ave> aves = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();

			if (rs != null) {
				aves = new ArrayList<Ave>();
				while (rs.next()) {
					ave = new Ave();
					ave.setCodigoAve(rs.getInt("codigoAve"));
					ave.setEspecie(rs.getString("especie"));
					ave.setFamilia(rs.getString("familia"));
					ave.setSubfamilia(rs.getString("subfamilia"));
					ave.setNomeingles(rs.getString("nomeIngles"));
					ave.setEstadoConservacao(rs.getString("estadoConservacao"));
					aves.add(ave);
				}
			}

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
		return aves;
	}

	public void ExcluirAve(int codigoAve) {
		String sql = "DELETE FROM AVE WHERE codigoAve = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, codigoAve);
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
	
	public void AlterarRegistro (Ave ave) {
		String sql = "UPDATE AVE SET especie = ?, familia = ?, subfamilia = ?, nomeIngles = ?, estadoConservacao = ? WHERE codigoAve = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, ave.getEspecie());
			pStatement.setString(2, ave.getFamilia());
			pStatement.setString(3, ave.getSubfamilia());
			pStatement.setString(4, ave.getNomeingles());
			pStatement.setString(5, ave.getEstadoConservacao());
			pStatement.setInt(6, ave.getCodigoAve());
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
