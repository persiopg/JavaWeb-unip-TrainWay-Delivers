
package com.gmail.persiopg.Dao;

import com.gmail.persiopg.entidades.TbLanches;
import java.util.List;


public class DaoLanches extends DaoUtil{
    
    public List<TbLanches> listar(){
        this.abreConexao();
        List<TbLanches> lanches;
        lanches = em.createQuery("SELECT l from tb_lanches as l").getResultList();
        this.fechaConexao();
        
        return lanches;
    }
    
    public TbLanches buscarLanches(int id){
        this.abreConexao();
        TbLanches lanche = em.find(TbLanches.class, id);
        this.fechaConexao();
        return lanche;
    }
    
}
