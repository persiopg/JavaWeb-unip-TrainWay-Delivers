package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DaoUtil {
    
    private static EntityManagerFactory emf;
    public static EntityManager em;
    
    public void abreConexao(){
        emf = Persistence.createEntityManagerFactory("TranWayDeliversPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    public void fechaConexao(){
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    public void salvar(Object o){
        this.abreConexao();
        em.persist(o);
        this.fechaConexao();
    }
    public void alterar(Object o){
        this.abreConexao();
        em.merge(o);
        this.fechaConexao();
    }
    
    public void excluir(Object o){
        this.abreConexao();
        em.remove(em.merge(o));
        this.fechaConexao();
    } 
    
}
