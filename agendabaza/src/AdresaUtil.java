import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdresaUtil 
{
	
	public static final String CONNECTION_URL = "jdbc:mysql://localhost/agendbaza";


	public void addAdresa(Adresa adr)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into adresa(strada, numar, judet) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, adr.getstrada());
			ps.setInt(2,  adr.getnumar());
			ps.setString(3, adr.getjudet());
			int affectedRows = ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next())
			{
				adr.setIdAdresa(rs.getInt(1));
			}
			closeConnection(conn);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}


	public boolean update(Adresa adr)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("update adresa set Strada=?, Numar=?, Judet=? where idAdresa = ?");
			ps.setString(1, adr.getstrada());
			ps.setInt(2, adr.getnumar());
			ps.setString(3, adr.getjudet());
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
			PreparedStatement ps = conn.prepareStatement("delete from adress where id = ?");
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

	
	public Adresa findByid(int id)
	{
		Adresa adr = null;
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from adresa where idAdresa = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int id2 = rs.getInt("idAdresa");
				String strada= rs.getString("Strada");
				int numar=rs.getInt("Numar");
				String judet=rs.getString("Judet");
				adr = new Adresa(id2, strada, numar, judet);
			}
			
			closeConnection(conn);
			return adr;
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
