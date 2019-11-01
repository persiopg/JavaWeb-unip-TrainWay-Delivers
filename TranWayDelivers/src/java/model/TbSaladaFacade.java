/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entidade.TbSalada;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class TbSaladaFacade extends AbstractFacade<TbSalada> {

    @PersistenceContext(unitName = "TranWayDeliversPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbSaladaFacade() {
        super(TbSalada.class);
    }
    
}
