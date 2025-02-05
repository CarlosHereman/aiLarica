import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
    public boolean cadastrarFornecedor(Fornecedor fornecedor) {
        String sql = "INSERT INTO fornecedor (cnpj, nome, telefone, endereco, email, senha, categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getNome());
            stmt.setLong(3, fornecedor.getTel());
            stmt.setString(4, fornecedor.getEnd());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getSenha());
            stmt.setString(7, fornecedor.getCateg());

            return stmt.executeUpdate() > 0;  // Retorna true se inseriu com sucesso

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Fornecedor consultarFornecedorPorCpf(String cnpj) {
        String sql = "SELECT * FROM fornecedor WHERE cnpj = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cnpj);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Fornecedor(
                    rs.getString("nome"),
                    rs.getLong("telefone"),  
                    rs.getString("endereco"),
                    rs.getString("categoria"),  
                    rs.getString("cnpj"),
                    rs.getString("email"),
                    rs.getString("senha")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Retorna null se não encontrou
    }
    
    public Fornecedor consultarFornecedorPorEmail(String email) {
        String sql = "SELECT * FROM fornecedor WHERE email = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Fornecedor(
                    rs.getString("nome"),
                    rs.getLong("telefone"),  
                    rs.getString("endereco"),
                    rs.getString("categoria"),  
                    rs.getString("cnpj"),
                    rs.getString("email"),
                    rs.getString("senha")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Retorna null se não encontrou
    }

    public boolean removerFornecedor(String cnpj) {
        String sql = "DELETE FROM fornecedor WHERE cnpj = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cnpj);
            return stmt.executeUpdate() > 0;  // Retorna true se removeu com sucesso

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarFornecedor(Fornecedor fornecedor) {
        String sql = "UPDATE fornecedor SET nome = ?, telefone = ?, endereco = ?, email = ?, senha = ?, categoria = ? WHERE cnpj = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fornecedor.getNome());
            stmt.setLong(2, (fornecedor.getTel()));
            stmt.setString(3, fornecedor.getEnd());
            stmt.setString(4, fornecedor.getEmail());
            stmt.setString(5, fornecedor.getSenha());
            stmt.setString(5, fornecedor.getSenha());
            stmt.setString(6, fornecedor.getCateg());
            stmt.setString(7, fornecedor.getCnpj());

            return stmt.executeUpdate() > 0;  // Retorna true se atualizou com sucesso

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
    }

    public List<Fornecedor> listarFornecedor() {
        List<Fornecedor> fornecedor = new ArrayList<>();
        String sql = "SELECT * FROM fornecedor";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                fornecedor.add(new Fornecedor(
                    rs.getString("nome"),
                    rs.getLong("telefone"),  
                    rs.getString("endereco"),
                    rs.getString("categoria"),  
                    rs.getString("cnpj"),
                    rs.getString("email"),
                    rs.getString("senha")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fornecedor;
    }
}
