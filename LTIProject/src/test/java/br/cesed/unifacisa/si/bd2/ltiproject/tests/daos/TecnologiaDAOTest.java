package br.cesed.unifacisa.si.bd2.ltiproject.tests.daos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;

import br.cesed.unifacisa.si.bd2.ltiproject.daos.TecnologiaDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Tecnologia;
import br.cesed.unifacisa.si.bd2.ltiproject.exceptions.PeriodoInvalidoException;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.TecnologiaFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class TecnologiaDAOTest {

	private static IDao<Tecnologia, Long> daot;

	@Before
	public void beforeAll() {

		daot = new TecnologiaDAO();
	}

	@Test
	public void addAlunoTest() throws PeriodoInvalidoException {
		Tecnologia tecnologia = TecnologiaFactory.criaInstancia("tec1", "tecnologia muito doida", "show", "tem");
		tecnologia = daot.add(tecnologia);
		assertTrue(tecnologia.getId() != null);
	}

	@Test
	public void updateAluno() {
		String novo = "tec doidera";
		try {
			Tecnologia tecnologia = TecnologiaFactory.criaInstancia("tec 2", "doidera doida", "fdgdasf", "erqweqw");
			tecnologia = daot.add(tecnologia);
			tecnologia.setNome(novo);
			tecnologia = daot.update(tecnologia);
			assertEquals(tecnologia.getNome(), novo);
		} catch (Exception e) {
			fail("O metodo deu erro, conserta ai troxa");
		}
	}

	@Test
	public void deleteAluno() {
		try {
			Tecnologia tecnologia = TecnologiaFactory.criaInstancia("asdasd", "468746", "4", "");
			tecnologia = daot.add(tecnologia);
			tecnologia = TecnologiaFactory.criaInstancia("asdasd", "468746", "4", "");
			tecnologia = daot.add(tecnologia);
			daot.delete(tecnologia);
			assertTrue(daot.get().size() == 1);
		} catch (Exception e) {
			fail("TA ERRADO MERMAO");
		}

	}

	@Test
	public void testList() {
		try {
			for (int i = 0; i < 10; i++) {
				Tecnologia tecnologia = TecnologiaFactory.criaInstancia("asdasd", "adsfassfg", "qdfasdsad", "fgdfads");
				tecnologia = daot.add(tecnologia);
				assertNotNull(tecnologia.getId());
			}

			assertTrue(daot.get().size() == 10);

		} catch (Exception e) {
			fail("Ta errado carai");
		}
	}

	@Test
	public void getAlunoPorIDTest() {
		try {
			Tecnologia tecnologias = TecnologiaFactory.criaInstancia("tec1", "xou", "de bola", "google");
			tecnologias = daot.add(tecnologias);
			assertNotNull(tecnologias.getId());

			assertTrue(daot.getPorID(tecnologias.getId()).equals(daot.get().get(0)));
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@After
	public void afterAll() {
		daot = null;
	}

}