import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public boolean cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (cpf, nome, telefone, endereco, email, senha) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, (cliente.getCpf()));
            stmt.setString(2, cliente.getNome());
            stmt.setLong(3, cliente.getTel());
            stmt.setString(4, cliente.getEnd());
            stmt.setString(5, cliente.getEmail());
            stmt.setString(6, cliente.getSenha());

            return stmt.executeUpdate() > 0;  // Retorna true se inseriu com sucesso

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Cliente consultarClientePorCpf(String cpf) {
        String sql = "SELECT * FROM cliente WHERE cpf = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Cliente(
                    rs.getString("nome"),
                    rs.getLong("telefone"),
                    rs.getString("endereco"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("senha")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Retorna null se não encontrou
    }
    
    public Cliente consultarClientePorEmail(String email) {
        System.out.println("🔍 Iniciando consulta para o email: " + email);

        String sql = "SELECT * FROM cliente WHERE email = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            System.out.println("📤 Executando consulta: " + stmt.toString());  // Mostra a consulta formatada

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("✅ Cliente encontrado!");

                Cliente cliente = new Cliente(
                    rs.getString("nome"),
                    rs.getLong("telefone"),
                    rs.getString("endereco"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("senha")
                );

                System.out.println("👤 Dados do Cliente: " + cliente.toString()); // Verifica se os dados foram carregados
                return cliente;
            } else {
                System.out.println("⚠️ Nenhum cliente encontrado para o email: " + email);
            }
        } catch (SQLException e) {
            System.err.println("❌ Erro ao consultar cliente: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public boolean removerCliente(String cpf) {
        String sql = "DELETE FROM cliente WHERE cpf = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            return stmt.executeUpdate() > 0;  // Retorna true se removeu com sucesso

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, telefone = ?, endereco = ?, email = ?, senha = ? WHERE cpf = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setLong(2, (cliente.getTel()));
            stmt.setString(3, cliente.getEnd());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getSenha());
            stmt.setString(6, cliente.getCpf());

            return stmt.executeUpdate() > 0;  // Retorna true se atualizou com sucesso

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                clientes.add(new Cliente(
                    rs.getString("nome"),
                    rs.getLong("telefone"),  
                    rs.getString("endereco"),
                    rs.getString("email"),  
                    rs.getString("senha"),
                    rs.getString("cpf")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}
