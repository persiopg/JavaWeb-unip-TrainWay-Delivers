/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.TbCliente;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.TbClienteFacade;

/**
 *
 * @author user
 */
@Named(value = "clienteManagedBean")
@ManagedBean
@SessionScoped
public class clienteManagedBean {

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
        return cliente;
    }

    public void setCliente(TbCliente cliente) {
        this.cliente = cliente;
    }
    
}
