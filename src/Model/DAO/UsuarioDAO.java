 
package Model.DAO;

import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author jordan
 */
public class UsuarioDAO {
    
    /**
     * Insere um usuario dentro do banco de dados
     */
    public void insert(Usuario usuario){
        Banco.usuario.add(usuario);
    }
    
    /**
     * Atualiza um usuario no banco de dados
     */
    public boolean update(Usuario usuario){
        
        for (int i = 0; i < Banco.usuario.size(); i++) {
            if(idSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um usuario do banco de dados pelo id do usuario passado
     */
    public boolean delete(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuario) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     */
    public ArrayList<Usuario> selectAll(){
        return Banco.usuario;
    }
    
    /**
     * Retorna um usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     */
    public Usuario selectPorNomeESenha(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuario) {
            if(nomeESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe usuario e verifica se são iguais verificando o nome e senha
     */
    private boolean nomeESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) {
        return usuario.getNome().equals(usuarioAPesquisar.getNome()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois usuario tem a propriedade id igual
     */
    private boolean idSaoIguais(Usuario usuario, Usuario usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
    
    
}
