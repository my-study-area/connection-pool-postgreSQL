package br.com.study.testes;

import br.com.study.model.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaTeste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connection-pool-postgreSQLPU");
        EntityManager em = emf.createEntityManager();
        
        Pessoa pessoa = new Pessoa("adriano", "rua rondonia");
        
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
    
}
