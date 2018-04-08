package br.cesed.unifacisa.si.bd2.ltiproject.tests.daos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.cesed.unifacisa.si.bd2.ltiproject.daos.ProjetoDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Projeto;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.ProjetoFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class ProjetoDAOTest {
	private static IDao<Projeto, Long> daoProjeto;
	private static ProjetoFactory projFactory;

	@Before
	public void test() {
		daoProjeto = new ProjetoDAO();
	}
	
	@Test
	public void addProjeto(){
		
		
	}
	
	@After
	public void encerraConexao(){
		daoProjeto = null;
	}

}
