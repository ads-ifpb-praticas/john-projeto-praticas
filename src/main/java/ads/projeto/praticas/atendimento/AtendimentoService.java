/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.atendimento;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author recursive
 */
@RequestScoped
public class AtendimentoService implements Serializable{
    
    @Inject
    private AtendimentoRepository ar;
    
    public void add(Atendimento ate){
        ar.add(ate);
    }
    
    public void remove(Atendimento ate){
        ar.remove(ate);
    }

    public void update(Atendimento ate){
        ar.update(ate);
    }
    
    public List<Atendimento> list(){
        return ar.list();
    }
    
    public Atendimento buscarId(int id){
        return ar.buscarPorId(id);
    }
}
