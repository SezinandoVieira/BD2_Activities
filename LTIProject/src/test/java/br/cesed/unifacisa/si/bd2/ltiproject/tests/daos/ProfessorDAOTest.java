package br.cesed.unifacisa.si.bd2.ltiproject.tests.daos;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.cesed.unifacisa.si.bd2.ltiproject.daos.ProfessorDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.ProfessorFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class ProfessorDAOTest {

	private static IDao<Professor, Long> daop;
	
	
	@BeforeClass
	public static void iniciaConexao() {
		daop = new ProfessorDAO();
	}
	
	@Test
	public void addProfessorTest(){
		Professor prof = ProfessorFactory.criaInstancia("nome", 1324123);
		prof = daop.add(prof);
		
	}
	
	@AfterClass
	public static void encerraConexao(){
		daop = null;
	}

}
