/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidades.TbLanches;
import entidades.TbVenda;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.TbVendaFacade;

/**
 *
 * @author user
 */
@Named(value = "vendaManagedBean")
@ManagedBean
@SessionScoped
public class VendaManagedBean {

    @EJB
    private TbVendaFacade tbVendaFacade;
    private TbVenda vendas;
    

    public TbVendaFacade getTbVendaFacade() {
        return tbVendaFacade;
    }

    public void setTbVendaFacade(TbVendaFacade tbVendaFacade) {
        this.tbVendaFacade = tbVendaFacade;
    }

    public TbVenda getVendas() {
        return vendas;
    }

    public void setVendas(TbVenda vendas) {
        this.vendas = vendas;
    }
    
    public String inserir(){
        //pega a data/hora da venda 
        Date data = new Date();
        SimpleDateFormat dataV = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaV = new SimpleDateFormat("HH:mm");
        //formata a data/hora 
        String dataVenda = dataV.format(data);
        String horaVenda = horaV.format(data);  
        //add hora e data da venda
        vendas.setHora(horaVenda);
        vendas.setDataVenda(dataVenda);
        
        //this.tbVendaFacade.create(vendas);
        
        return null;
    }
    
    public List<TbVenda> listar(){
        return this.tbVendaFacade.findAll();
    }

    /**
     * Creates a new instance of VendaManagedBean
     */
    public VendaManagedBean() {
    }
    
}
