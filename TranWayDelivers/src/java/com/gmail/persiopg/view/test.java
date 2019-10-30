
package com.gmail.persiopg.view;

import com.gmail.persiopg.Dao.DaoLanches;
import com.gmail.persiopg.entidades.TbLanches;
import java.util.List;

public class test {
    public static void main(String[] args) {
        
        DaoLanches dl = new DaoLanches();
        
        List<TbLanches> tl = dl.listar();
        
        for(TbLanches lanche : tl){
            
            System.out.println(lanche.getNmLanche());
        }
        
        
        
    }
}
