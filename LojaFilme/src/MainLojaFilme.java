import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Statement;



public class MainLojaFilme {

	public static void main(String[] args) throws SQLException {
		CriaConexaoLojaFilme criaConexao = new CriaConexaoLojaFilme();
		Connection con = criaConexao.recuperarConexao();
		
		Scanner ler = new Scanner(System.in);
		
		
		Statement stm = con.createStatement();
		int c = 0;
		do {
			System.out.println("Quantos filmes você quer ver?");
			int qtdFilmes = ler.nextInt();
			System.out.println("De qual págia você quer ver? 'obs: Só temos 2 paginas de filmes'");
			int pagina = ler.nextInt();
			if(pagina == 2 ) {
				stm.execute ("Select*from filmes limit " + qtdFilmes + " offset 10" );
				c++;
			}else if(pagina == 1) {
				stm.execute ("Select*from filmes limit " + qtdFilmes + " offset 0" );
				c++;
			}else {
				System.out.println("TEMOS APENAS 2 PAGINAS");
			}
			
		
			
		try {
			ResultSet rst = stm.getResultSet();
			
			
			
			while(rst.next()) {
				int id = rst.getInt("id");
				String nome = rst.getString("nome");			
		        String descricao = rst.getString("descricao");
		        int ano = rst.getInt("ano");
		        System.out.println("-----------------------------------");
		          System.out.println("Id: " + id + " \n Nome: " + nome +" \n Descrição: " + descricao +  
				       " \n Ano: " + ano);
		          System.out.println("-----------------------------------");
		          System.out.println("-----------------------------------");
				
			}
		}catch(java.lang.NullPointerException e) {
		     System.out.println("NÃO EXISTE ESTA PAGINA");
		     System.out.println("TEMOS APENAS 2 PAGINAS");
		}
		}while(c != 1);
			
	}

}
