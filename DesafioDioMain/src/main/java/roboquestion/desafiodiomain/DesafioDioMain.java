/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package roboquestion.desafiodiomain;

import java.time.LocalDate;
import roboquestion.desafiodiomain.CCienciaDaComputacao.CienciaDacomputacao;
import roboquestion.desafiodiomain.Curso.Curso;
import roboquestion.desafiodiomain.Aluno.Aluno;
import roboquestion.desafiodiomain.ProjetoDeEstagio.ProjetoDeEstagio;

/**
 *
 * @author User
 */
public class DesafioDioMain {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Calculo II");
        curso1.setDescricao("Curso de calculo avançado");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Programação II");
        curso2.setDescricao("curso de programação volta a java");
        curso2.setCargaHoraria(120);

        ProjetoDeEstagio estagio = new ProjetoDeEstagio();
        estagio.setTitulo("Não definido");
        estagio.setDescricao("Aluno ainda não definil");
        estagio.setData(LocalDate.now());

        CienciaDacomputacao turmaCc = new CienciaDacomputacao();
        turmaCc.setNome("Novo do curso de ciencia da computação");
        turmaCc.setDescricao("Curso da ciencia da computação do ano de 2022");
        turmaCc.getConteudos().add(curso1);
        turmaCc.getConteudos().add(curso2);
        turmaCc.getConteudos().add(estagio);

        Aluno devHenrique = new Aluno();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(turmaCc);
        System.out.println("Materias de Henrique pt1:" + devHenrique.getMateriasParaConcluir());
        devHenrique.progredir(7.0);
        devHenrique.progredir(6.5);
        System.out.println("-");
        System.out.println("Materias de Henrique pt2:" + devHenrique.getMateriasParaConcluir());
        System.out.println("Materias que Henrique ja concluiu:" + devHenrique.getMateriasConcluidas());
        System.out.println("Materias que Henrique está de depencia :" + devHenrique.getMateriasEmDependencia());
        System.out.println("XP:" + devHenrique.calcularTotalXp());

       

      

    }
}
