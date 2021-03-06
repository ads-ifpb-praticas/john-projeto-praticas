/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.servico;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ifpb
 */
@Entity
public class Servico implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;
    private LocalTime duracao;
    private TipoServico tipo;

    public Servico(long id, LocalTime duracao, TipoServico tipo) {
        this.id = id;
        this.duracao = duracao;
        this.tipo = tipo;
    }

    public Servico() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }

    
    
}
