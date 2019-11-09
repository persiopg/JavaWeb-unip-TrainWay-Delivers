/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidades.TbLanches;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
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
    private List<TbLanches> LancheVendList;
    
    public TbLanches randomLanche(){
        int random  = new Random().nextInt(5);
        lanche = listar().get(random);
        return lanche;
    }
    
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
        return tbLanchesFacade.findAll();
    }    

    public List<TbLanches> getLancheVendList() {
        return LancheVendList;
    }

    public void setLancheVendList(List<TbLanches> LancheVendList) {
        this.LancheVendList = LancheVendList;
    }
    
    
    
    public String AddLanche(){      
        if(lanche != null){
        return "index.xhtml?faces-redirect=true";
        }
        return "";
    }
    
    public TbLanches buscar(){
        for(TbLanches l : this.listar()){
            if(l.getIdLanche() == lanche.getIdLanche()){
                lanche=l;
                return lanche;
            }
        }
        return null;
    }
    
   
    /**
     * Creates a new instance of LancheManagedBean
     */
    public LancheManagedBean() {
    }
    
}
