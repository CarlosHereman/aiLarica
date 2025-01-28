// Nome: Abner do Nascimento Santos - RA: 2504154 
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDClasses {
    private List<Cliente> bdClient;
    private List<Fornecedor> bdFornecedor;
    private List<Refeicao> bdRef;
    private List<Medicamento> bdMed;
    private List<Bebida> bdBeb;
    private List<Mercadoria> bdMerc;
    private List<Pedido> bdPed;
    
    private static BDClasses bdUnic;

    private BDClasses() {
        bdClient = new ArrayList<>();
        bdFornecedor = new ArrayList<>();
        bdRef = new ArrayList<>();
        bdMed = new ArrayList<>();
        bdBeb = new ArrayList<>();
        bdMerc = new ArrayList<>();
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
    
    public List<Refeicao> getBdRef(){
            return bdRef;
    }
    
    public List<Medicamento> getBdMed(){
            return bdMed;
    }
    
    public List<Bebida> getBdBeb(){
            return bdBeb;
    }
    
    public List<Mercadoria> getBdMerc(){
            return bdMerc;
    }
    
    public List<Pedido> getBdPed(){
            return bdPed;
    }

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

    public Fornecedor cadFornecedor(Fornecedor fornecedor) {
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
    
    public Refeicao cadProd(Refeicao ref){
		if(consProdId(ref)== null){
			bdRef.add(ref);
			return ref;
		}
		else{
			return null;
		}

	}

	public Refeicao consProdId(Refeicao ref){
		for(int i = 0; i < bdRef.size(); i++){
			if(ref.getIdProd() == bdRef.get(i).getIdProd()){
				return bdRef.get(i);
			}
		}
		return null;
	}

	public Refeicao removeProdId(Refeicao ref){
                ref = consProdId(ref);
            	if(ref != null){
                    bdRef.remove(ref);
                    return null;
		}
		else{
                    return ref;
		}
		
	}

	public Refeicao atualizaProdId(Refeicao ref){
		for(int i = 0; i < bdRef.size(); i++){
			if(ref.getIdProd() == bdRef.get(i).getIdProd()){
                            try{
                                String nome = JOptionPane.showInputDialog(null, "Informe o novo nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setNomeProd(nome);
                                String price = JOptionPane.showInputDialog(null, "Informe o preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setPreco(price);
                                String forn = JOptionPane.showInputDialog(null, "Informe o fornecedor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setFornecedor(forn);
                                String quant = JOptionPane.showInputDialog(null, "Informe a quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setQuant(quant);
                                String desc = JOptionPane.showInputDialog(null, "Informe a descrição", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setDesc(desc);
                                String tempo = JOptionPane.showInputDialog(null, "Informe o tempo", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setTempo(tempo);
                                String ingred = JOptionPane.showInputDialog(null, "Informe os ingredientes", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setIngred(ingred);
                                String acomp = JOptionPane.showInputDialog(null, "Informe o acompanhamento", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                ref.setAcomp(acomp);
                            }
                            catch (NumberException ne) {
                                StackTraceElement[] stackTrace = ne.getStackTrace();
                                if (stackTrace[0].getMethodName().equals("setQuant")) {
                                    JOptionPane.showMessageDialog(null, "A quantidade deve ser um inteiro!", "ERRO de Quantidade", 0);
                                    ref = ne.refeicaoQuantNumberExc(ref);
                                } else if (stackTrace[0].getMethodName().equals("setTempo")) {
                                    JOptionPane.showMessageDialog(null, "O tempo deve ser um inteiro!", "ERRO de inserção", 0);
                                    ref = ne.refeicaoTempoNumberExc(ref);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", 0);
                                }        
                            } 
                            catch (DecimalNumberException dne) {
                                JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
                                ref = dne.refeicaoPriceExc(ref);
                            }
                            
				bdRef.set(i, ref);  
                                return bdRef.get(i);
			}
		}
                return null;
	}
        
        public Medicamento cadProd(Medicamento prod){

		if(consProdId(prod)== null){
			bdMed.add(prod);
			return prod;
		}
		else{
			return null;
		}

	}

	public Medicamento consProdId(Medicamento prod){
		for(int i = 0; i < bdMed.size(); i++){
			if(prod.getIdProd() == bdMed.get(i).getIdProd()){
				return bdMed.get(i);
			}
		}
		return null;
	}

	public Medicamento removeProdId(Medicamento prod){
                prod = consProdId(prod);
            	if(prod != null){
                    bdMed.remove(prod);
                    return null;
		}
		else{
                    return prod;
		}
		
	}

	public Medicamento atualizaProdId(Medicamento prod){
		for(int i = 0; i < bdMed.size(); i++){
			if(prod.getIdProd() == bdMed.get(i).getIdProd()){
                            try{
                                String nome = JOptionPane.showInputDialog(null, "Informe o novo nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setNomeProd(nome);
                                String price = JOptionPane.showInputDialog(null, "Informe o preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setPreco(price);
                                String forn = JOptionPane.showInputDialog(null, "Informe o fornecedor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setFornecedor(forn);
                                String quant = JOptionPane.showInputDialog(null, "Informe a quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setQuant(quant);
                                String desc = JOptionPane.showInputDialog(null, "Informe a descrição", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setDesc(desc);
                                String princip = JOptionPane.showInputDialog(null, "Informe o principio ativo", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setPrincipio(princip);
                                String reg = JOptionPane.showInputDialog(null, "Informe o registro no MS", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setRegistro(reg);
                                String receita = JOptionPane.showInputDialog(null, "Possui receita?", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setReceita(Integer.parseInt(receita));
                            }
                            catch (NumberException ne) {
                                StackTraceElement[] stackTrace = ne.getStackTrace();
                                if (stackTrace[0].getMethodName().equals("setQuant")) {
                                    JOptionPane.showMessageDialog(null, "A quantidade deve ser um inteiro!", "ERRO de Quantidade", 0);
                                    prod = ne.medicamentoQuantNumberExc(prod);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", 0);
                                }        
                            } 
                            catch (DecimalNumberException dne) {
                                JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
                                prod = dne.medicamentoPriceExc(prod);
                            } 
                            catch (OptionException oe){
                                JOptionPane.showMessageDialog(null, "A resposta deve ser 1 ou 2", "ERRO", 0);
                                prod = oe.receitaExc(prod); 
                            }
                            catch (LetterException le) {
                                JOptionPane.showMessageDialog(null, "O principio deve ser apenas letras!", "ERRO", 0);
                                prod = le.principioAtivoExc(prod); 
                            }
                   
                            
				bdMed.set(i, prod);  
                                return bdMed.get(i);
			}
		}
                return null;
	}
        
        public Bebida cadProd(Bebida prod){

		if(consProdId(prod)== null){
			bdBeb.add(prod);
			return prod;
		}
		else{
			return null;
		}

	}

	public Bebida consProdId(Bebida prod){
		for(int i = 0; i < bdBeb.size(); i++){
			if(prod.getIdProd() == bdBeb.get(i).getIdProd()){
				return bdBeb.get(i);
			}
		}
		return null;
	}

	public Bebida removeProdId(Bebida prod){
                prod = consProdId(prod);
            	if(prod != null){
                    bdBeb.remove(prod);
                    return null;
		}
		else{
                    return prod;
		}
		
	}

	public Bebida atualizaProdId(Bebida prod){
		for(int i = 0; i < bdBeb.size(); i++){
			if(prod.getIdProd() == bdBeb.get(i).getIdProd()){
                            try{
                                String nome = JOptionPane.showInputDialog(null, "Informe o novo nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setNomeProd(nome);
                                String price = JOptionPane.showInputDialog(null, "Informe o preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setPreco(price);
                                String forn = JOptionPane.showInputDialog(null, "Informe o fornecedor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setFornecedor(forn);
                                String quant = JOptionPane.showInputDialog(null, "Informe a quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setQuant(quant);
                                String desc = JOptionPane.showInputDialog(null, "Informe a descrição", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setDesc(desc);
                                String vol = JOptionPane.showInputDialog(null, "Informe o volume", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setVolume(vol);
                                String alcool = JOptionPane.showInputDialog(null, "É alcoolica?", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setAlcoolica(Integer.parseInt(alcool));
                            }
                            catch (NumberException ne) {
                                JOptionPane.showMessageDialog(null, "A quantidade deve ser um inteiro!", "ERRO de Quantidade", 0);
                                prod = ne.bebidaQuantNumberExc(prod);    
                            } 
                            catch (DecimalNumberException dne) {
                                JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
                                prod = dne.bebidaPriceExc(prod);
                            } 
                            catch (OptionException oe){
                                JOptionPane.showMessageDialog(null, "A resposta deve ser 1 ou 2 (SIM ou NAO)", "ERRO", 0);
                                prod = oe.bebidaExc(prod); 
                            }
                   
                            
				bdBeb.set(i, prod);  
                                return bdBeb.get(i);
			}
		}
                return null;
	}
        
        public Mercadoria cadProd(Mercadoria prod){

		if(consProdId(prod)== null){
			bdMerc.add(prod);
			return prod;
		}
		else{
			return null;
		}

	}

	public Mercadoria consProdId(Mercadoria prod){
		for(int i = 0; i < bdMerc.size(); i++){
			if(prod.getIdProd() == bdMerc.get(i).getIdProd()){
				return bdMerc.get(i);
			}
		}
		return null;
	}

	public Mercadoria removeProdId(Mercadoria prod){
                prod = consProdId(prod);
            	if(prod != null){
                    bdMerc.remove(prod);
                    return null;
		}
		else{
                    return prod;
		}
		
	}

	public Mercadoria atualizaProdId(Mercadoria prod){
		for(int i = 0; i < bdMerc.size(); i++){
			if(prod.getIdProd() == bdMerc.get(i).getIdProd()){
                            try{
                                String nome = JOptionPane.showInputDialog(null, "Informe o novo nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setNomeProd(nome);
                                String price = JOptionPane.showInputDialog(null, "Informe o preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setPreco(price);
                                String forn = JOptionPane.showInputDialog(null, "Informe o fornecedor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setFornecedor(forn);
                                String quant = JOptionPane.showInputDialog(null, "Informe a quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setQuant(quant);
                                String desc = JOptionPane.showInputDialog(null, "Informe a descrição", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setDesc(desc);
                                String set = JOptionPane.showInputDialog(null, "Informe o setor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setSetor(set);
                                String agen = JOptionPane.showInputDialog(null, "Informe o horario pra entrega (HH:mm)", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                prod.setAgenda(agen);
                            }
                            catch (NumberException ne) {
                                JOptionPane.showMessageDialog(null, "A quantidade deve ser um inteiro!", "ERRO de Quantidade", 0);
                                prod = ne.mercadoriaQuantNumberExc(prod);    
                            } 
                            catch (DecimalNumberException dne) {
                                JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
                                prod = dne.mercadoriaPriceExce(prod);
                            } 
                            catch (LetterException le) {
                                JOptionPane.showMessageDialog(null, "O setor deve ser apenas letras!", "ERRO", 0);
                                prod = le.setorExc(prod); 
                            }
                            catch (TimeException te) {
                                JOptionPane.showMessageDialog(null, "O agendamento deve ser no formato correto! (HH:mm)", "ERRO", 0);
                                prod = te.agendaExc(prod); 
                            }
                            
                   
                            
				bdMerc.set(i, prod);  
                                return bdMerc.get(i);
			}
		}
                return null;
	}
        
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