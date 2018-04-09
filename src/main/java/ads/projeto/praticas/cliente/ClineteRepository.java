/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.cliente;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author recursive
 */
@RequestScoped
public class ClineteRepository {
    
    @PersistenceContext()
    private EntityManager em;
    
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    public void add(Servico cli){
        em.persist(cli);
    }
    
    public void remove(Servico cli){
        em.remove(cli);
    }
    
    public void update(Servico cli){
        em.merge(cli);
    }
    
    public List<Servico> list(){
        return em.createQuery("SELECT c FROM Cliente c", Servico.class).getResultList();
    }
    
    public Servico buscarPorId(int id) {
        return em.find(Servico.class, id);
    }
    
    public Servico buscarPorNome(String nome) {
        List<Servico> clientes = list();
        Servico cli = null;
        for (Servico cliente : clientes) {
            if (cliente.getNome() == null ? nome == null : cliente.getNome().equals(nome)){
                cli = cliente;
            }
        }
        return cli;
    }
    
}
