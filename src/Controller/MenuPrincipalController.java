 
package Controller;

import View.Agenda;
import View.MenuPrincipal;
import View.Cliente;
import View.Financeiro;
 
import Controller.LoginController;
import Model.DAO.Banco;
import View.Funcionario;
import View.ListaClientes;
import View.ListaFuncionarios;
import View.ListaServicos;
import View.Login;
import View.Servico;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author jordan
 */
public class MenuPrincipalController {

    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }

    public void navegarFinanceiro(){
        Financeiro financeiro = new Financeiro();
        financeiro.setVisible(true);
    }

    public void navegarCliente(){
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
    }

    public void navegarServico(){
        Servico servico = new Servico();
        servico.setVisible(true);
    }

     public void navegarLogin(){
        Login login = new Login();
        login.setVisible(true);
        this.view.dispose();
        
    }                  
    
      public void navegarListaClientes(){
        ListaClientes listaClientes = new ListaClientes();
        listaClientes.setVisible(true);
        
    }     
            
      public void navegarListaFuncionarios(){
        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();
        listaFuncionarios.setVisible(true);
        
    }            
            
            
       public void navegarListaServicos(){
        ListaServicos listaServicos = new ListaServicos();
        listaServicos.setVisible(true);
        
    }            
              
    public void navegarParaFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setVisible(true);
    } 
          
}
