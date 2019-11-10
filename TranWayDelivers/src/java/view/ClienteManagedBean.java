
package view;

import entidades.TbCliente;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import model.TbClienteFacade;

/**
 *
 * @author user
 */
@Named(value = "clienteManagedBean")
@ManagedBean
@SessionScoped
public class ClienteManagedBean {


    @EJB
    private TbClienteFacade tbClienteFacade;
    private TbCliente cliente;

    /**
     * Creates a new instance of clienteManagedBean
     */
    public ClienteManagedBean() {
    }

    public TbClienteFacade getTbClienteFacade() {
        return tbClienteFacade;
    }

    public void setTbClienteFacade(TbClienteFacade tbClienteFacade) {
        this.tbClienteFacade = tbClienteFacade;
    }

    public TbCliente getCliente() {
        if(cliente == null){
            cliente = new TbCliente();
        }
        return cliente;
    }

    public void setCliente(TbCliente cliente) {
        this.cliente = cliente;
    }
    
    public String inserirCliente(){       
        if(cliente != null){
            this.tbClienteFacade.create(cliente);
            System.out.println("entrou");
            return "index.xhtml?faces-redirect=true";
        }
        System.out.println("nao entrou");
        return null;
    }
    
    public String checkLogin(){
        for(TbCliente c : this.listar()){
            if((c.getEmail().equals(cliente.getEmail())) && (c.getSenha().equals(cliente.getSenha()))){
               cliente = c;
               System.out.println("entrou");
               return "index.xhtml?faces-redirect=true";               
            }
        }
        System.out.println("nao entrou");
        return "";  
    }
    
    public List<TbCliente> listar(){
        return this.tbClienteFacade.findAll();
    }   
    
    public TbCliente buscar(){
        for(TbCliente l : this.listar()){
            if(l.getIdCliente()== cliente.getIdCliente()){
                cliente=l;
                return cliente;
            }
        }
        return null;
    }
    
     public String logout() {
      if(cliente != null){
          cliente = null;
          HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          sessao.invalidate();
          System.out.println("entrou");
          return "index.xhtml?faces-redirect=true";
      }
          
       return null;//AQUI EU PASSO O NOME DA MINHA TELA INICIAL.
    }
}
