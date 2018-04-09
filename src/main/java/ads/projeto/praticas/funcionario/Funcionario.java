/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.funcionario;

import ads.projeto.praticas.servico.Agenda;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 *
 * @author ifpb
 */
@Entity
public class Funcionario implements Serializable{

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    @OneToOne
    private Agenda minhaAgenda;

    public Funcionario() {
    }

    public Funcionario(long id, String nome, Agenda minhaAgenda) {
        this.id = id;
        this.nome = nome;
        this.minhaAgenda = minhaAgenda;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agenda getMinhaAgenda() {
        return minhaAgenda;
    }

    public void setMinhaAgenda(Agenda minhaAgenda) {
        this.minhaAgenda = minhaAgenda;
    }

}
