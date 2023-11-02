package console;

import java.util.*;
import modelo.*;

public class Program {

	public static void main(String[] args) {
		List<ICandidato> candidatos = new ArrayList<ICandidato>();
	    candidatos.add(new CandidatoGerente("Carlos", "Silva"));
	    candidatos.add(new Candidato("Maria", "Souza"));
	    candidatos.add(new CandidatoDiretor("Ana", "Lopes"));

	    List<Empregado> empregados = new ArrayList<Empregado>();
	    // CriadorContas criadorContas = new CriadorContas();

	    for (ICandidato candidato: candidatos)
	    {
	        empregados.add(candidato.obterCriadorContas.criar(candidato));
	    }

	    for (Empregado empregado: empregados)
	    {
	        System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + " " + empregado.getEmail());
	    }

	}

}
