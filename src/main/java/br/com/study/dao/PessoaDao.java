package br.com.study.dao;

import br.com.study.model.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adriano
 */
@Stateless
public class PessoaDao {
    
    @PersistenceContext(unitName = "studyPU")
    private EntityManager em;
    
    private List<Pessoa> listaPessoa;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<Pessoa> getListaPessoa() {
        return em.createQuery("from pessoa p").getResultList();
    }

    public void setListaPessoa(List<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }
    
    public void create(Pessoa pessoa) {
        em.persist(pessoa);
    }
    
    
    
}
