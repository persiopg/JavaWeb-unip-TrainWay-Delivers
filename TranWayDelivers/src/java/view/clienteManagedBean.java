/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.TbCliente;
import entidade.TbEndereco;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.TbClienteFacade;
import model.TbEnderecoFacade;

/**
 *
 * @author user
 */
@Named(value = "clienteManagedBean")
@ManagedBean
@SessionScoped
public class clienteManagedBean {

    @EJB
    private TbEnderecoFacade tbEnderecoFacade;
    private TbEndereco endereco;

    public TbEnderecoFacade getTbEnderecoFacade() {
        return tbEnderecoFacade;
    }

    public void setTbEnderecoFacade(TbEnderecoFacade tbEnderecoFacade) {
        this.tbEnderecoFacade = tbEnderecoFacade;
    }

    public TbEndereco getEndereco() {
        if(endereco == null){
            endereco = new TbEndereco();
        }
        return endereco;
    }

    public void setEndereco(TbEndereco endereco) {
        this.endereco = endereco;
    }

    @EJB
    private TbClienteFacade tbClienteFacade;
    private TbCliente cliente;

    /**
     * Creates a new instance of clienteManagedBean
     */
    public clienteManagedBean() {
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
    
    public String inserir(){        
        this.tbEnderecoFacade.create(endereco);
        cliente.setIdEnd(endereco);
        this.tbClienteFacade.create(cliente);
        return "/";
    }
    
    public String buscar(){
       TbCliente t =  this.tbClienteFacade.find(cliente);
       return t.getApelido();
    }
    
}
