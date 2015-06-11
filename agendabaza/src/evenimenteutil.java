import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class evenimenteutil {
	public static final String CONNECTION_URL = "jdbc:mysql://localhost/agendbaza";

	public void addevenimente(Evenimente evn) {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn
					.prepareStatement(
							"insert into evenimente(denumire, locatie, detalii, notificare, prioritate, prezenta ) values(?,?,?,?,?,?,?)",
							Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, evn.getDenumire());
			ps.setString(2, evn.getLocatie());
			ps.setString(3, evn.getDetalii());
			ps.setInt(4, evn.getNotificare());
			ps.setInt(5, evn.getPrioritate());
			ps.setInt(6, evn.getPrezenta());
			int affectedRows = ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				evn.setIdEvenimente(rs.getInt(1));
			}
			closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean update(Evenimente evn) {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn
					.prepareStatement("update eveniment set denumire=?, locatie=?, detalii=?, notificare=?, prioritate=?, prezenta=? where idEvenimente = ?");
			ps.setString(1, evn.getDenumire());
			ps.setString(2, evn.getLocatie());
			ps.setString(3, evn.getDetalii());
			ps.setInt(4, evn.getNotificare());
			ps.setInt(5, evn.getPrioritate());
			ps.setInt(6, evn.getPrezenta());
			int affectedRows = ps.executeUpdate();
			closeConnection(conn);
			return affectedRows == 1;
		} catch (SQLException e) {
			return false;
		}
	}

	public boolean delete(int id) {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn
					.prepareStatement("delete from evenimete where id = ?");
			ps.setInt(3, id);
			int affectedRows = ps.executeUpdate();
			closeConnection(conn);
			return affectedRows == 1;
		} catch (SQLException e) {
			return false;
		}
	}

	public Evenimente findByid(int id) {
		Evenimente evn = null;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn
					.prepareStatement("select * from evenimente where idEvenimente = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int id2 = rs.getInt("idEvenimente");
				String denumire = rs.getString("denumire");
				String locatie = rs.getString("locatie");
				String detalii = rs.getString("detalii");
				int notificare = rs.getInt("notificare");
				int prioritate = rs.getInt("prioritate");
				int prezenta = rs.getInt("prezenta");
				evn = new Evenimente(id2, denumire, locatie, detalii,
						notificare, prioritate, prezenta);
			}

			closeConnection(conn);
			return evn;
		} catch (SQLException e) {
			return null;
		}
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(CONNECTION_URL, "root", "root");
	}

	public void closeConnection(Connection conn) throws SQLException {
		conn.close();
	}

}
