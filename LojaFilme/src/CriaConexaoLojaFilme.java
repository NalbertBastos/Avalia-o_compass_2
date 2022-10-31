import java.sql.Connection;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class CriaConexaoLojaFilme {
	
	public DataSource dataSource;
	
	public CriaConexaoLojaFilme(){
		ComboPooledDataSource comboPoolDataSource = new ComboPooledDataSource();
		comboPoolDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_filmes?useTimezone=true&serverTimezone=UTC");
		comboPoolDataSource.setUser("root");
		comboPoolDataSource.setPassword("P@lmerasskate10");
		
		this.dataSource = comboPoolDataSource;
	}
	
	public Connection recuperarConexao() throws SQLException {
		
		return this.dataSource.getConnection();
		
	}

}
