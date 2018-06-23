/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.study.bean;

import br.com.study.dao.PessoaDao;
import br.com.study.model.Pessoa;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
//
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;

/**
 *
 * @author adriano
 */

//@ManagedBean(name = "bean")
//@RequestScoped

@Named(value = "bean")
@RequestScoped
public class PessoaBean {
    
    @EJB
    private PessoaDao dao;
    
    private List<Pessoa> pessoas;
    
    

    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public PessoaDao getDao() {
        return dao;
    }

    public void setDao(PessoaDao dao) {
        this.dao = dao;
    }

    public void save() {
        Pessoa pessoa = new Pessoa(nome, endereco);
        dao.create(pessoa);
        setNome("");
        setEndereco("");
    }

    
}
