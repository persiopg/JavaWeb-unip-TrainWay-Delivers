/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entidades.TbLanches;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class TbLanchesFacade extends AbstractFacade<TbLanches> {

    @PersistenceContext(unitName = "TranWayDeliversPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbLanchesFacade() {
        super(TbLanches.class);
    }
    
}
