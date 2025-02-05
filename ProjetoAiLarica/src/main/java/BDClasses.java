// Nome: Abner do Nascimento Santos - RA: 2504154 
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDClasses {
    private List<Cliente> bdClient;
    private List<Fornecedor> bdFornecedor;
    private List<Pedido> bdPed;
    //private List<Carrinho> bdCar;
    
    private static BDClasses bdUnic;

    private BDClasses() {
        bdClient = new ArrayList<>();
        bdFornecedor = new ArrayList<>();
        bdPed = new ArrayList<>();
    }

    // MÉTODO SINGLETON
    public static BDClasses getInstance() {
        if (bdUnic == null) {
            bdUnic = new BDClasses();
        }
        return bdUnic;
    }

    public List<Cliente> getBdClient() {
        return bdClient;
    }

    public List<Fornecedor> getBdFornecedor() {
        return bdFornecedor;
    }
    
    public List<Pedido> getBdPed(){
            return bdPed;
    }

    /*
    public Cliente cadClient(Cliente client) {
        if (consClientCpf(client) == null) {
            bdClient.add(client);
            return client;
        } else {
            return null;
        }
    }

    public Cliente consClientCpf(Cliente client) {
        for (Cliente c : bdClient) {
            if (c.getCpf() == (client.getCpf())) {
                return c;
            }
        }
        return null;
    }

    public Cliente removeClientCod(Cliente client) {
        client = consClientCpf(client);
        if (client != null) {
            bdClient.remove(client);
            return null;
        } else {
            return client;
        }
    }

    public Cliente atualizaClientCod(Cliente client) {
        for (int i = 0; i < bdClient.size(); i++) {
            if (client.getCpf() == (bdClient.get(i).getCpf())) {
                try{
                    String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    client.setNome(nome);
                    String tel = JOptionPane.showInputDialog(null, "Informe o NOVO telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    client.setTel(tel);
                    String end = JOptionPane.showInputDialog(null, "Informe o NOVO endereço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    client.setEnd(end);
                    String email = JOptionPane.showInputDialog(null, "Informe o NOVO e-mail", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    client.setEmail(email);
                }catch (LetterException le) {
                    JOptionPane.showMessageDialog(null, "O Nome deve ser apenas letras!", "ERRO de Nome", 0);
                    client = le.nomeLetterExc(client);
                }
                catch (NumberException ne) {
                    JOptionPane.showMessageDialog(null, "O Telefone deve ser inteiro!", "ERRO de Telefone", 0);
                    client = ne.clienteTelefoneExc(client);
                }
                catch (EmailException ee) {
                    JOptionPane.showMessageDialog(null, "O E-mail deve ser válido!", "ERRO de E-mail", 0);
                    client = ee.emailExc(client);
                }
                bdClient.set(i, client);
                return bdClient.get(i);
            }
        }
        return null;
    }
*/

   /* public Fornecedor cadFornecedor(Fornecedor fornecedor) {
        if (consFornecedorCnpj(fornecedor) == null) {
            bdFornecedor.add(fornecedor);
            return fornecedor;
        } else {
            return null;
        }
    }

    public Fornecedor consFornecedorCnpj(Fornecedor fornecedor) {
        for (Fornecedor f : bdFornecedor) {
            if (f.getCnpj() == (fornecedor.getCnpj())) {
                return f;
            }
        }
        return null;
    }

    public Fornecedor removeFornecedorCnpj(Fornecedor fornecedor) {
        fornecedor = consFornecedorCnpj(fornecedor);
        if (fornecedor != null) {
            bdFornecedor.remove(fornecedor);
            return null;
        } else {
            return fornecedor;
        }
    }

    public Fornecedor atualizaFornecedorCnpj(Fornecedor fornecedor) {
        for (int i = 0; i < bdFornecedor.size(); i++) {
            if (fornecedor.getCnpj() == (bdFornecedor.get(i).getCnpj())) {
                try {
                    String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    fornecedor.setNome(nome);
                    String tel = JOptionPane.showInputDialog(null, "Informe o NOVO telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    fornecedor.setTel(tel);
                    String end = JOptionPane.showInputDialog(null, "Informe o NOVO endereço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    fornecedor.setEnd(end);
                    String categ = JOptionPane.showInputDialog(null, "Informe a NOVA categoria", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    fornecedor.setCateg(categ);
            } catch (LetterException le) {
                    JOptionPane.showMessageDialog(null, "Deve ser apenas letras!", "ERRO de inserção", 0);
                    fornecedor = le.nomeLetterExc(fornecedor);
            } catch (NumberException ne) {
                    JOptionPane.showMessageDialog(null, "O Telefone deve ser inteiro!", "ERRO de Telefone", 0);
                    fornecedor = ne.fornecedorTelefoneExc(fornecedor);
            }
                bdFornecedor.set(i, fornecedor);
                return bdFornecedor.get(i);
            }
        }
        return null;
    }
    */
        
        public Pedido cadPed(Pedido ped){

		if(consPedId(ped)== null){
			bdPed.add(ped);
			return ped;
		}
		else{
			return null;
		}

	}

	public Pedido consPedId(Pedido ped){
		for(int i = 0; i < bdPed.size(); i++){
			if(ped.getIdPed() == bdPed.get(i).getIdPed()){
				return bdPed.get(i);
			}
		}
		return null;
	}

	public Pedido removePedId(Pedido ped){
                ped = consPedId(ped);
            	if(ped != null){
                    bdPed.remove(ped);
                    return null;
		}
		else{
                    return ped;
		}
		
	}

	public Pedido atualizaPedId(Pedido ped){
		for(int i = 0; i < bdPed.size(); i++){
			if(ped.getIdPed() == bdPed.get(i).getIdPed()){
                            try{
                                String hora = JOptionPane.showInputDialog(null, "Informe o novo horario de expediçao", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ped.setHora(hora);
                                String price = JOptionPane.showInputDialog(null, "Informe o preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ped.setPreco(Double.parseDouble(price));
                                String status = JOptionPane.showInputDialog(null, "Informe o status (preparando, a caminho, entregue ou cancelado)", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ped.setStatus(status);
                                String pag = JOptionPane.showInputDialog(null, "Informe a forma de pagamento", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ped.setPagamento(pag);
                            }

                            catch (TimeException te) {
                                JOptionPane.showMessageDialog(null, "O horario deve ser no formato (HH:mm)", "ERRO", 0);
                                ped = te.pedidoHoraExc(ped);
                            }
                            catch (StatusException se) {
                                JOptionPane.showMessageDialog(null, "Digite em um formato válido (preparando, a caminho, entregue ou cancelado).", "ERRO", 0);
                                ped = se.statusExc(ped);
                            }
                            catch (LetterException le) {
                                JOptionPane.showMessageDialog(null, "Digite apenas letras!", "ERRO", 0);
                                ped = le.pagamentoExc(ped);
                            }
                            
                            
				bdPed.set(i, ped);  
                                return bdPed.get(i);
			}
		}
                return null;
	}
   }