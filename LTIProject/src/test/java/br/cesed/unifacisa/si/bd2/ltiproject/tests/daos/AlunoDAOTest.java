package br.cesed.unifacisa.si.bd2.ltiproject.tests.daos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;

import br.cesed.unifacisa.si.bd2.ltiproject.daos.AlunoDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.PeriodoInvalidoException;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.AlunoFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class AlunoDAOTest {

	private static IDao<Aluno, Long> dao;

	@Before
	public void beforeAll() {

		dao = new AlunoDAO();
	}

	@Test
	public void addAlunoTest() throws PeriodoInvalidoException {
		Aluno aluno = AlunoFactory.criaInstancia("asdasd", 468746, 4);
		aluno = dao.add(aluno);
		assertTrue(aluno.getId() != null);
	}

	@Test
	public void updateAluno() {
		String novo = "Marichovis";
		try {
			Aluno aluno = AlunoFactory.criaInstancia("chiquin", 46546, 4);
			aluno = dao.add(aluno);
			aluno.setNome(novo);
			aluno = dao.update(aluno);
			assertEquals(aluno.getNome(), novo);
		} catch (Exception e) {
			fail("O metodo deu erro, conserta ai troxa");
		}
	}

	@Test
	public void deleteAluno() {
		try {
			Aluno aluno = AlunoFactory.criaInstancia("clovis", 32132, 5);
			aluno = dao.add(aluno);
			aluno = AlunoFactory.criaInstancia("marcel", 123123, 5);
			aluno = dao.add(aluno);
			dao.delete(aluno);
			assertTrue(dao.get().size() == 1);
		} catch (Exception e) {
			fail("TA ERRADO MERMAO");
		}

	}

	@Test
	public void testList() {
		try {
			for (int i  = 0; i < 10; i++){
				Aluno aluno = AlunoFactory.criaInstancia("asdasd", 4123123, 4);
				aluno = dao.add(aluno);
				assertNotNull(aluno.getId());
			}
			
			assertTrue(dao.get().size() == 10);

		} catch (Exception e) {
			fail("Ta errado carai");
		}
	}
	
	@Test
	public void getAlunoPorIDTest (){
		
	}

	@After
	public void afterAll() {
		dao = null;
	}

}
