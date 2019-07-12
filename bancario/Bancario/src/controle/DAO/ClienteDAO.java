package controle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import controle.FabricaDeConexoes;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class ClienteDAO {
	
	private Connection conn;

	public ClienteDAO() {
		
		conn = new FabricaDeConexoes().getConnection();
		
	}
	
	public void inserirClienteF(PessoaFisica cliente) throws SQLException {
		String sql = "insert into clientesf (nomePessoa,nomeSocial,cpf,cep,num,complemento) values(?,?,?,?,?,?)"; 
	
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, cliente.getNomePessoa());
		stmt.setString(2, cliente.getNomeSocial());
		stmt.setString(3, cliente.getCpf());
		stmt.setString(4, cliente.getCep());
		stmt.setString(5, cliente.getNum());
		stmt.setString(6, cliente.getComplemento());
		
		stmt.execute();
		stmt.close();
		conn.close();
	}
	
	public void excluirClienteF(PessoaFisica cliente) throws SQLException {
		
		String sql = "delete from clientesF where id=?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, cliente.getIdPessoa());
                
                stmt.execute();
                stmt.close();
                conn.close();
                
	}
	
	public void alterarClienteF(PessoaFisica cliente) throws SQLException {
		
		String sql = "update clientesF set nomePessoa=?,nomeSocial=?,cpf=?,cep=?,complemento=? where idPessoa=?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, cliente.getNomePessoa());
                stmt.setString(2,cliente.getNomeSocial());
                stmt.setString(3, cliente.getCpf());
                stmt.setString(4, cliente.getCep());
                stmt.setString(5, cliente.getComplemento());
                stmt.setInt(5, cliente.getIdPessoa());
                
                stmt.executeUpdate();
                
                stmt.close();
                conn.close();
	}
	
	
	
	
	public ArrayList listarClienteF() throws SQLException{
		
		String sql = "select * from clientesF";
		//String sql = "select * from clientesF where nomePessoa like ?"; 
		
                //acessa o banco de dados
                PreparedStatement stmt = conn.prepareStatement(sql);
		
		
		//stmt.setString(1, "%"nome"%");
		
                //retorna resultado do banco de dados
		ResultSet rs = stmt.executeQuery();
		
		ArrayList<PessoaFisica> clientesF = new ArrayList<PessoaFisica>();
		
		while(rs.next()) {
			PessoaFisica pf = new PessoaFisica();
			pf.setIdPessoa(rs.getInt("idPessoa"));
			pf.setNomePessoa(rs.getString("nomePessoa"));
			pf.setNomeSocial(rs.getString("nomeSocial"));
			pf.setCpf(rs.getString("cpf"));
			pf.setCep(rs.getString("cep"));
			pf.setNum(rs.getString("num"));
			pf.setComplemento(rs.getString("complemento"));
			
			clientesF.add(pf);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		return clientesF;
		
	}
        
        
        public void inserirClienteJ(PessoaJuridica cliente) throws SQLException {
		String sql = "insert into clientesJ (nomePessoa,nomeSocial,cnpj,cep,num,complemento) values(?,?,?,?,?,?)"; 
	
		PreparedStatement stmt = conn.prepareStatement(sql);
		
                
		stmt.setString(1, cliente.getNomePessoa());
		stmt.setString(2, cliente.getNomeSocial());
		stmt.setString(3, cliente.getcnpj());
		stmt.setString(4, cliente.getCep());
		stmt.setString(5, cliente.getNum());
		stmt.setString(6, cliente.getComplemento());
		
		stmt.execute();
		stmt.close();
		conn.close();
	}
        

        public void excluirClienteJ(int id) throws SQLException {
		
		String sql = "delete from clientesJ where id=?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1, id);
                
                stmt.executeUpdate();
                stmt.close();
                conn.close();
	}
	
	public void alterarClienteJ(PessoaFisica cliente,Integer idPessoa) throws SQLException {
		
		String sql = "update clientesJ set nomePessoa=?,nomeSocial=?,cnpj=?,cep=?,complemento=? where idPessoa=?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
	}
        
        
        public List<PessoaJuridica> consultarClienteJ(String nome) throws SQLException{
		
		String sql = "select * from clientesJ where nomePessoa = ?";
		//String sql = "select * from clientesF where nomePessoa like ?"; 
		
                //acessa o banco de dados e executa a query
                PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, nome);
		//stmt.setString(1, "%"nome"%");
		
                //retorna resultado da query
		ResultSet rs = stmt.executeQuery();
		
                
                //array
		List<PessoaJuridica> clientesJ = new ArrayList<PessoaJuridica>();
		
		while(rs.next()) {
			PessoaJuridica pj = new PessoaJuridica();
			pj.setIdPessoa(rs.getInt("idPessoa"));
			pj.setNomeSocial(rs.getString("nomeSocial"));
			pj.setCnpj(rs.getString("cnpj"));
			pj.setCep(rs.getString("cep"));
			pj.setNum(rs.getString("num"));
			pj.setComplemento(rs.getString("complemento"));
			
			clientesJ.add(pj);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		return clientesJ;
		
	}

	public int buscarClienteCPF(String cpf) throws SQLException {
                
            boolean status;
                int id = 0;
		String sql = "select * from clientesf where cpf =?";
		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, cpf);
               
		ResultSet rs = stmt.executeQuery();

		if(rs.next()){
                   id = rs.getInt("idPessoa");
                }else{
                    status = false;
		}
		rs.close();
		stmt.close();
		conn.close();
		return id;

	}
        
        	public int buscarClienteCNPJ(String cnpj) throws SQLException {
                
            boolean status;
                int id = 0;
		String sql = "select * from clientesj where cnpj =?";
		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, cnpj);
               
		ResultSet rs = stmt.executeQuery();

		if(rs.next()){
                   id = rs.getInt("idPessoa");
                }else{
                    status = false;
		}
		rs.close();
		stmt.close();
		conn.close();
		return id;
	}
                
    public String getNomeById(int id) throws SQLException{
        String sql = "SELECT * FROM clientesf WHERE idPessoa=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        String nome = null;
        if(rs.next()){
             nome = rs.getString("nomePessoa");
        }
        
        return nome;
    }
}
