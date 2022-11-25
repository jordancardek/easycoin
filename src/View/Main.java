 
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author jordan
 */
public class Main {
    
    
     public static void main(String[] args){
     
         String nome = "tiago";
         System.out.println(nome);
         
         Servico servico = new Servico(1, "clareamento", 30);
         
         System.out.println(servico.getDescricao());
         System.out.println(servico.getValor());
         
         
         Cliente cliente = new Cliente(1, "tiago", "rua teste", "92531214545");
         System.out.println(cliente.getNome());
         
         Usuario usuario = new Usuario(1, "secretaria", "123");
         System.out.println(usuario.getNome());
         
         
         Agendamento agendamento = new Agendamento( 1, cliente, servico, 30, "16/11/2022 09:15");
         System.out.println(agendamento.getCliente().getNome());
     }
    
    
    
}
