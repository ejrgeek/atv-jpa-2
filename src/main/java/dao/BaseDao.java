package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseDao<T> {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("futebol");
    public EntityManager em = emf.createEntityManager();

    public void saveOrUpdate(T object){
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        em.close();
    }
}
