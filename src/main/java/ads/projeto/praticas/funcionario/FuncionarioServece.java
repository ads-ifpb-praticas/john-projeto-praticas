/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.funcionario;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author recursive
 */
@RequestScoped
public class FuncionarioServece {
    
    @Inject
    private FuncionarioRepository cr;
    
    public void add(Funcionario fun){
        cr.buscarPorNome(fun.getNome());
        cr.add(fun);
    }
    
    public void remove(Funcionario fun){
        cr.remove(fun);
    }
    
    public void update(Funcionario fun){
        cr.update(fun);
    }
    
    public List<Funcionario> list(){
        return cr.list();
    }
    
    public Funcionario buscarPorId(int id) {
        return cr.buscarPorId(id);
    }
    
    public Funcionario buscarPorNome(String nome) {
        return cr.buscarPorNome(nome);
    }

    public boolean logar(Funcionario fun){
        Funcionario f = buscarPorNome(fun.getNome());
        return f != null;
    }
    
}
