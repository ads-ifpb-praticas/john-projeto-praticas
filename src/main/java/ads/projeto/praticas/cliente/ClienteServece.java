/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.cliente;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author recursive
 */
@RequestScoped
public class ClienteServece {
    
    @Inject
    private ClineteRepository cr;
    
    public void add(Servico cli){
        cr.buscarPorNome(cli.getNome());
        cr.add(cli);
    }
    
    public void remove(Servico cli){
        cr.remove(cli);
    }
    
    public void update(Servico cli){
        cr.update(cli);
    }
    
    public List<Servico> list(){
        return cr.list();
    }
    
    public Servico buscarPorId(int id) {
        return cr.buscarPorId(id);
    }
    
    public Servico buscarPorNome(String nome) {
        return cr.buscarPorNome(nome);
    }

    public boolean logar(Servico cli){
        Servico c = buscarPorNome(cli.getNome());
        return c != null;
    }
    
}
