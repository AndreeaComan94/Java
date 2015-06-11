import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class studiiutil {

	public static final String CONNECTION_URL = "jdbc:mysql://localhost/agendbaza";


	public void addStudii(Studii std)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into studii(facultate, spcializare, detal_timp, detal_timpfin) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, std.getfacultate());
			ps.setString(2,  std.getspecializare());
			ps.setDate(3, std.getDetal_timp());
			ps.setDate(4, std.getDetal_timpfin());
			int affectedRows = ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next())
			{
				std.setIdStudii(rs.getInt(1));
			}
			closeConnection(conn);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}


	public boolean update(Studii std)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("update studii set facultate=?, specializare=?, detal_timp=?, detal_timpfin=? where idStudii = ?");
			ps.setString(1, std.getfacultate());
			ps.setString(2, std.getspecializare());
			ps.setData(3, std.getDetal_timp());
			ps.setCalendar(4, std.getDetal_timpfin());
			int affectedRows = ps.executeUpdate();
			closeConnection(conn);
			return affectedRows == 1;
		}
		catch(SQLException e)
		{
			return false;
		}
	}

	public boolean delete(int id)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("delete from studii where id = ?");
			ps.setInt(3, id);
			int affectedRows = ps.executeUpdate();
			closeConnection(conn);
			return affectedRows == 1;
		}
		catch(SQLException e)
		{
			return false;
		}
	}

	
	public Studii findByid(int id)
	{
		Studii std = null;
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from studii where idStudii = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int id2 = rs.getInt("idStudii");
				String facultate= rs.getString("facultate");
				String specializare = rs.getString("specializare");
				Date detal_timp=rs.getDate(detal_timp);
				Date detal_timpfin = rs.getDate(detal_timpfin);
				std = new Studii(id2, facultate, specializare, detal_timp, detal_timpfin);
			}
			
			closeConnection(conn);
			return std;
		}
		catch(SQLException e)
		{
			return null;
		}
	}
	
	public Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(CONNECTION_URL, "root", "root");
	}
	
	public void closeConnection(Connection conn) throws SQLException
	{
		conn.close();
	}

}
