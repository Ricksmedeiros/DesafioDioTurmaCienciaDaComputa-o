/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roboquestion.desafiodiomain.Aluno;

import roboquestion.desafiodiomain.CCienciaDaComputacao.CienciaDacomputacao;
import java.util.*;
import roboquestion.desafiodiomain.Conteudo;




/**
 *
 * @author User
 */
public class Aluno {
    private String nome;
    private Set<Conteudo> materiasConcluidas = new LinkedHashSet<>();
    private Set<Conteudo> materiasParaConcluir = new LinkedHashSet<>();
    private Set<Conteudo> materiasEmDependencia = new LinkedHashSet<>();
    
    public void inscreverBootcamp(CienciaDacomputacao bootcamp){
        this.materiasParaConcluir.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir(double  media){
        Optional<Conteudo> conteudo =this.materiasParaConcluir.stream().findFirst();
        if(conteudo.isPresent()&& media >=7.0){
            this.materiasConcluidas.add(conteudo.get());
            this.materiasParaConcluir.remove(conteudo.get());
        }else{
            System.err.println("Voce esta reprovado");
            this.materiasParaConcluir.remove(conteudo.get());
            this.materiasEmDependencia.add(conteudo.get());
        }
        
   
   }    
        
   public double calcularTotalXp() {
       Iterator<Conteudo> iterator =this.materiasConcluidas.iterator();
       double soma=0;
       while(iterator.hasNext()){
           double next = iterator.next().calcularXp();
           soma+=next;
       }
       
       return soma;     
   }

   
   
    public Set<Conteudo> getMateriasEmDependencia() {
        return materiasEmDependencia;
    }

    public void setMateriasEmDependencia(Set<Conteudo> materiasEmDependencia) {
        this.materiasEmDependencia = materiasEmDependencia;
    }

   
   
   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getMateriasConcluidas() {
        return materiasConcluidas;
    }

    public void setMateriasConcluidas(Set<Conteudo> materiasConcluidas) {
        this.materiasConcluidas = materiasConcluidas;
    }

    public Set<Conteudo> getMateriasParaConcluir() {
        return materiasParaConcluir;
    }

    public void setMateriasParaConcluir(Set<Conteudo> materiasParaConcluir) {
        this.materiasParaConcluir = materiasParaConcluir;
    }

   

  
   @Override
    public boolean equals(Object obj) {
    if(this== obj) return true;
    
    if(obj ==null || getClass()!= obj.getClass()) return false;
    Aluno dev = (Aluno) obj;
    return Objects.equals(nome, dev.nome) && Objects.equals(materiasConcluidas, dev.materiasConcluidas) && Objects.equals(materiasParaConcluir, dev.materiasParaConcluir);
        
    }

    @Override
    public int hashCode() {
   
        return Objects.hash(nome,materiasParaConcluir,materiasConcluidas);
    } 
    
}
