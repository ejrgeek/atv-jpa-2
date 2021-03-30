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
        //em.close();
    }

    public T findBtId(Class<T> cls, Long id){
        em.getTransaction().begin();
        T obj = em.find(cls, id);
        em.close();
        return obj;
    }

    public void delete(T object){
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
        em.close();
    }
}
