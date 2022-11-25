 
package Model.DAO;

import Model.Servico;
import java.util.ArrayList;

/**
 *
 * @author jordan
 */
public class ServicoDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     */
	 
    public void insert(Servico servico){
        Banco.servico.add(servico);
    }
    
    /**
     * Atualiza um cliente no banco de dados
     */
    public boolean update(Servico servico){
        
        for (int i = 0; i < Banco.servico.size(); i++) {
            if(idSaoIguais(Banco.servico.get(i),servico)){
                Banco.servico.set(i, servico);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um cliente do banco de dados pelo id do servico passado
     */
    public boolean delete(Servico servico){
        for (Servico servicoLista : Banco.servico) {
            if(idSaoIguais(servicoLista,servico)){
                Banco.servico.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     */
    public ArrayList<Servico> selectAll(){
        return Banco.servico;
    }
    
    /**
     * Compara se dois cliente tem a propriedade id igual
     */
    private boolean idSaoIguais(Servico servico, Servico servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }
    
}
