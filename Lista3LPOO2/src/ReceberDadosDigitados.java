
import dao.ContatoDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macedo
 */
public class ReceberDadosDigitados {
    
    public void escolherOpcao() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println ("Digite 1 - Alterar Contato");
            System.out.println ("Digite 2 - Remover Contato");
            System.out.println ("Digite 3 - Listar Contatos");
            System.out.println ("Digite 4 - Inserir Contato");
            System.out.println ("Digite 5 - Sair");
            
            opcao = sc.nextInt();
            
            if(opcao == 1) {
                this.alterarContato();
            } else if(opcao == 2) {
                this.removerContato();
            } else if (opcao == 3) {
                this.listarContatos();
            } else if (opcao == 4) {
                this.insereContato();
            } else {
                System.out.println("Opção inválida!");
            }
        } while(opcao != 5);
    }
    
    public void alterarContato() {
        ContatoDAO novoContatoDAO = new ContatoDAO();
        long id;
        String nome;
        String email;
        String endereco;
        String dataNascimentoAsString;
        Date data = null;
        Calendar dataNascimento = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o id do contato : ");
                id = sc.nextLong();
                System.out.println("Digite o nome do contato : ");
                sc.next();
                nome = sc.nextLine();
                System.out.println("Digite o email do contato : ");
                email = sc.nextLine();
                System.out.println("Digite o endereco do contato");
                endereco = sc.nextLine();
                System.out.println("Digite a data de nascimento do contato");
                dataNascimentoAsString = sc.nextLine();
                try {
                    data = sdf.parse(dataNascimentoAsString);
                } catch (ParseException ex) {
                    Logger.getLogger(ReceberDadosDigitados.class.getName()).log(Level.SEVERE, null, ex);
                }
                dataNascimento.setTime(data);
                Contato novoContato = new Contato();
                novoContato.setId(id);
                novoContato.setNome(nome);
                novoContato.setEmail(email);
                novoContato.setEndereco(endereco);
                novoContato.setDataNascimento(dataNascimento);
                novoContatoDAO.altera(novoContato);
                break;
            } catch(RuntimeException e) {
                System.out.println(e);
            }
        } while(true);
    }
    
    public void removerContato() {
        ContatoDAO novoContatoDAO = new ContatoDAO();
        long id;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o id do contato : ");
                id = sc.nextLong();
                Contato novoContato = new Contato();
                novoContato.setId(id);
                novoContatoDAO.remove(novoContato);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public void listarContatos() {
        ContatoDAO novoContatoDAO = new ContatoDAO();
        novoContatoDAO.lista();
    }
    
    public void insereContato() {
        ContatoDAO novoContatoDAO = new ContatoDAO();
        long id;
        String nome;
        String email;
        String endereco;
        String dataNascimentoAsString;
        Date data = null;
        Calendar dataNascimento = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o id do contato : ");
                id = sc.nextLong();
                System.out.println("Digite o nome do contato : ");
                sc.next();
                nome = sc.nextLine();
                System.out.println("Digite o email do contato : ");
                email = sc.nextLine();
                System.out.println("Digite o endereco do contato");
                endereco = sc.nextLine();
                System.out.println("Digite a data de nascimento do contato");
                dataNascimentoAsString = sc.nextLine();
                try {
                    data = sdf.parse(dataNascimentoAsString);
                } catch (ParseException ex) {
                    Logger.getLogger(ReceberDadosDigitados.class.getName()).log(Level.SEVERE, null, ex);
                }
                dataNascimento.setTime(data);
                Contato novoContato = new Contato();
                novoContato.setId(id);
                novoContato.setNome(nome);
                novoContato.setEmail(email);
                novoContato.setEndereco(endereco);
                novoContato.setDataNascimento(dataNascimento);
                novoContatoDAO.insere(novoContato);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
    }
}
