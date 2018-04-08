package br.cesed.unifacisa.si.bd2.ltiproject.tests.daos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import br.cesed.unifacisa.si.bd2.ltiproject.daos.AlunoDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.AlunoFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class AlunoDAOTest {

	private static IDao<Aluno, Long> dao;
	private static AlunoFactory fabric;

	@BeforeClass
	public static void beforeAll() {
		
		dao = new AlunoDAO();
	}
	
	@Test
	public void addAlunoTest(){
		Aluno aluno = fabric.criaInstancia("asdasd", 468746, 1);
		aluno = dao.add(aluno);
		assertTrue(aluno.getId() != null);
	}
	
	@AfterClass
	public static void afterAll() {
		dao = null;
	}
	

}
