package br.cesed.unifacisa.si.bd2.ltiproject.tests.daos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;

import br.cesed.unifacisa.si.bd2.ltiproject.daos.ProfessorDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.PeriodoInvalidoException;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.ProfessorFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class ProfessorDAOTest {

	private static IDao<Professor, Long> daop;

	@Before
	public void iniciaBD() {

		daop = new ProfessorDAO();
	}

	@Test
	public void addProfessorTest() throws PeriodoInvalidoException {
		Professor professor = ProfessorFactory.criaInstancia("hjty", 42323);
		professor = daop.add(professor);
		assertTrue(professor.getId() != null);
	}

	@Test
	public void updateProfessor() {
		String novo = "Marichovis";
		try {
			Professor professor = ProfessorFactory.criaInstancia("chiquinho", 46546);
			professor = daop.add(professor);
			professor.setNome(novo);
			professor = daop.update(professor);
			assertEquals(professor.getNome(), novo);
		} catch (Exception e) {
			fail("O metodo deu erro, conserta ai troxão");
		}
	}

	@Test
	public void deleteProfessor() {
		try {
			Professor professor = ProfessorFactory.criaInstancia("clovison", 43543);
			professor = daop.add(professor);
			professor = ProfessorFactory.criaInstancia("marcelo", 16786);
			professor = daop.add(professor);
			daop.delete(professor);
			assertTrue(daop.get().size() == 1);
		} catch (Exception e) {
			fail("TA ERRADO MERMAO, CONCERTA AI");
		}

	}

	@Test
	public void testListProfessor() {
		try {
			for (int i = 0; i < 10; i++) {
				Professor professor = ProfessorFactory.criaInstancia("wqwdeqw", 4123123);
				professor = daop.add(professor);
				assertNotNull(professor.getId());
			}

			assertTrue(daop.get().size() == 10);

		} catch (Exception e) {
			fail("Ta errado carai, AJEITA");
		}
	}

	@Test
	public void getProfessoroPorIDTest() {
		try {
			Professor professores = ProfessorFactory.criaInstancia("chavao", 68476);
			professores = daop.add(professores);
			assertNotNull(professores.getId());

			assertTrue(daop.getPorID(professores.getId()).equals(daop.get().get(0)));
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@After
	public void encerraBD() {
		daop = null;
	}

}
