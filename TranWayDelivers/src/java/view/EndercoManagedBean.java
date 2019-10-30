/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.TbEndereco;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.TbEnderecoFacade;

/**
 *
 * @author user
 */
@Named(value = "endercoManagedBean")
@ManagedBean
@SessionScoped
public class EndercoManagedBean {

    @EJB
    private TbEnderecoFacade tbEnderecoFacade;
    private TbEndereco endereco;
    /**
     * Creates a new instance of EndercoManagedBean
     */
    public EndercoManagedBean() {
    }

    public TbEnderecoFacade getTbEnderecoFacade() {
        return tbEnderecoFacade;
    }

    public void setTbEnderecoFacade(TbEnderecoFacade tbEnderecoFacade) {
        this.tbEnderecoFacade = tbEnderecoFacade;
    }

    public TbEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(TbEndereco endereco) {
        this.endereco = endereco;
    }
    
}
