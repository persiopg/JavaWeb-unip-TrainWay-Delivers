/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.TbLanches;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.TbLanchesFacade;

/**
 *
 * @author user
 */
@Named(value = "lancheManagedBean")
@ManagedBean
@SessionScoped
public class LancheManagedBean {

    @EJB
    private TbLanchesFacade tbLanchesFacade;
    private TbLanches lanche; 

    public TbLanchesFacade getTbLanchesFacade() {
        return tbLanchesFacade;
    }

    public void setTbLanchesFacade(TbLanchesFacade tbLanchesFacade) {
        this.tbLanchesFacade = tbLanchesFacade;
    }

    public TbLanches getLanche() {
        if(lanche == null){
            lanche = new TbLanches();
        }        
        return lanche;
    }

    public void setLanche(TbLanches lanche) {
        this.lanche = lanche;
    }
    
    public String inserir(){
        this.tbLanchesFacade.create(lanche);
        return null;
    }
    
    public List<TbLanches> listar(){
        return this.tbLanchesFacade.findAll();
    }

    /**
     * Creates a new instance of LancheManagedBean
     */
    public LancheManagedBean() {
    }
    
}
