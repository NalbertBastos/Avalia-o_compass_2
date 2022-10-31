package CadastroProdutos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) throws SQLException{
		Scanner ler = new Scanner(System.in);
		int op=0;
		Connection connection = DriverManager
		        .getConnection("jdbc:mysql://localhost/cadastro_produtos?useTimezone=true&serverTimezone=UTC","root","P@lmerasskate10");
		        
		        
		
		
		
		
		
		Statement stm = connection.createStatement();
		
		do {
			menu();
			op = ler.nextInt();
			
			switch(op) {
			     case 1:
			    	 try {
							if(op==1) {
								stm.execute("Insert into produtos (id,nome,descricao,quantidade,preco) value ('1','Mouse','Mouse preto','50','50.0')");
								stm.execute("Insert into produtos (id,nome,descricao,quantidade,preco) value ('2','Lapis','Lapis de cor','20','1.0')");
								stm.execute("Insert into produtos (id,nome,descricao,quantidade,preco) value ('3','Bola','Bola de baseball','40','49.9')");
								System.out.println("-----------------------------------");
								System.out.println("Produtos Cadastrados com Sucesso!");
								System.out.println("-----------------------------------");
							}
						}catch( java.sql.SQLIntegrityConstraintViolationException e) {
							System.out.println("-----------------------------------");
							System.out.println("Já foram cadastrados esses produtos");
							System.out.println("-----------------------------------");
						}
			      break;
			      
			     case 2:
			    	 
			    	 stm.execute("update produtos set nome = 'mouse', descricao = 'Mouse azul marinho' where nome = 'Mouse'"  );
						System.out.println("-----------------------------------");
						System.out.println("Produto Atualizado com Sucesso!");
						System.out.println("-----------------------------------");
				 break;
				 
			     case 3:
			    	 stm.execute("delete from produtos where id = 2");
			    	 System.out.println("-----------------------------------");
						System.out.println("Produto excluido com Sucesso!");
						System.out.println("-----------------------------------");
			     break;
			     			     
			     case 4:
			    	 try {
			    		 stm.execute("Select*from produtos");
			    		 ResultSet rst = stm.getResultSet();
					      while(rst.next()) {
						          int id = rst.getInt("id");			
						          String nome = rst.getString("nome");			
						          String descricao = rst.getString("descricao");			
						          int qtd = rst.getInt("quantidade");
						          float preco = rst.getInt("preco");
						          
						          System.out.println("PRODUTOS:");
						          System.out.println("-----------------------------------");
						          System.out.println("Id: " + id + " \n Nome: " + nome +" \n Descrição: " + descricao + " \n Quantidade: " + qtd 
								      + " \n Preço: R$ " + preco);
						          System.out.println("-----------------------------------");
					       }
				      }catch(java.sql.SQLException e) {
					       System.out.println("-----------------------------------");
					       System.out.println("Saindo do sistema");
					       System.out.println("-----------------------------------");
					       System.out.println("Para ver os produtos entre no sistema outra vez e tecle '0' ");
					       System.out.println("-----------------------------------");						
				      }
			     break;
			
			}
			
		}while(op!=0);
		    
		connection.close();
		
	}

	public static void menu() {
		System.out.println("Bem vindos ao sistema de Produtos!");
		System.out.println("-----------------------------------");
		System.out.println("Escolha opções:");
		System.out.println("-----------------------------------");
		System.out.println("1-Cadastrar produtos");
		System.out.println("2-Atualizar produtos");
		System.out.println("3-Excluir produto");
		System.out.println("4-Mostrar produtos");
		System.out.println("0-Sair do Sistema");
		System.out.println("-----------------------------------");
		
	}
	
}
