 
package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author jordan
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "admin", 'M', "09/05/1996", "30212121", "admin@odonoplus.com", "521454123", "admin", "administrador");
        Usuario usuario2 = new Usuario(2, "secretaria", 'F', "09/05/1996", "30212122", "secretaria@odonoplus.com", "451244123", "123", "funcionario");
        Usuario usuario3 = new Usuario(3, "dentista", 'M', "09/05/1996", "30212122", "dentista@odonoplus.com", "451244123", "123", "funcionario");
        
        Cliente cliente1 = new Cliente(01, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(02, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(03, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(04, "Nathan Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(05, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(06, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Cliente cliente7 = new Cliente(07, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Cliente cliente8 = new Cliente(12, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Cliente cliente9 = new Cliente(29, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Cliente cliente10 = new Cliente(20, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Servico servico1 = new Servico(1, "Limpeza Bucal Simples", 132);
        Servico servico2 = new Servico(2, "Aparelho Fixo", 480);
        Servico servico3 = new Servico(3, "Protese Total", 840);
        Servico servico4 = new Servico(4, "Clareamento Dental", 1152);
        Servico servico5 = new Servico(5, "Consulta", 61);
        Servico servico6 = new Servico(6, "Prótese Parcial Removivel", 936);
		Servico servico7 = new Servico(7, "Raspagem Sub-Gengiva", 109); 
		Servico servico8 = new Servico(8, "Monobloco plano Bimeler", 720);

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 480, "21/11/2022 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 1152, "21/11/2022 11:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 132,"21/11/2022 09:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
		servico.add(servico7);
        servico.add(servico8);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
