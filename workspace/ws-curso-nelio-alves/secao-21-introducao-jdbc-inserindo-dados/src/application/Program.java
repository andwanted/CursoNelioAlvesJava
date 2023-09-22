package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement st = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			conn = DB.getConnection();
			st = conn.prepareStatement(
					//linguagem sql
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?,?,?,?,?)");
			
			st.setString(1, "Anderson Leandro");
			st.setString(2, "anderson@hotmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("18/04/1993").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			int rowsAffected = st.executeUpdate();
			System.out.println("Done !! Rows affected " + rowsAffected);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closedConnection();
		}

	}

}
