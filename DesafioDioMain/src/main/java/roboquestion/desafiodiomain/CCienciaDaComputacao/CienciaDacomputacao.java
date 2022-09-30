/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roboquestion.desafiodiomain.CCienciaDaComputacao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import roboquestion.desafiodiomain.Conteudo;
import roboquestion.desafiodiomain.Aluno.Aluno;

/**
 *
 * @author User
 */
public class CienciaDacomputacao {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal=dataInicial.plusDays(45);
    private Set<Aluno> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Aluno> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Aluno> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

  
    @Override
    public boolean equals(Object obj) {
    if(this== obj) return true;
    
    if(obj ==null || getClass()!= obj.getClass()) return false;
    CienciaDacomputacao bootcamp = (CienciaDacomputacao) obj;
    return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
        
    }

    @Override
    public int hashCode() {
   
        return Objects.hash(nome,descricao,dataInicial,dataFinal,devsInscritos,conteudos);
    }
    
    
    
}
