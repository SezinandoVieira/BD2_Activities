package br.cesed.unifacisa.si.bd2.ltiproject.tests.daos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.cesed.unifacisa.si.bd2.ltiproject.daos.AlunoDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.daos.ProfessorDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.daos.ProjetoDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.daos.TecnologiaDAO;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Aluno;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Professor;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Projeto;
import br.cesed.unifacisa.si.bd2.ltiproject.entities.Tecnologia;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.AlunoFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.ProfessorFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.ProjetoFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.factories.TecnologiaFactory;
import br.cesed.unifacisa.si.bd2.ltiproject.interfaces.IDao;

public class ProjetoDAOTest {
	private ArrayList<Aluno> listAluno = new ArrayList<Aluno>();
	private static IDao<Aluno, Long> daoA;
	private ArrayList<Tecnologia> tecList = new ArrayList<Tecnologia>();
	private static IDao<Tecnologia, Long> daoT;
	private static IDao<Professor, Long> daoProf;
	private static IDao<Projeto, Long> daoProjeto;

	@Before
	public void test() {
		daoProjeto = new ProjetoDAO();
		daoT = new TecnologiaDAO();
		daoProf = new ProfessorDAO();
		daoA = new AlunoDAO();
	}

	@Test
	public void addProjeto() {
		try {
			Aluno aluno = AlunoFactory.criaInstancia("jarvas", 44565, 5);
			aluno = daoA.add(aluno);
			listAluno.add(aluno);
			Aluno aluno2 = AlunoFactory.criaInstancia("tuyisy", 6474, 4);
			aluno2 = daoA.add(aluno2);
			listAluno.add(aluno2);
			Tecnologia tec1 = TecnologiaFactory.criaInstancia("Firebasic", "É uma parada que voce usa no backend",
					"olha no site ", "tem");
			tec1 = daoT.add(tec1);
			tecList.add(tec1);
			Tecnologia tec2 = TecnologiaFactory.criaInstancia("NodeJS",
					"É uma parada que voce usa no front provavelmente", "olhe no site", "tem");
			tec2 = daoT.add(tec2);
			tecList.add(tec2);
			Professor prof = ProfessorFactory.criaInstancia("jeronimo", 468768);
			prof = daoProf.add(prof);
			Projeto proj = ProjetoFactory.criaInstancia("dor e sofrimento",
					"Um projeto que tem como objetivo fazer voce sofrer", listAluno, tecList, prof,
					new Date(02, 04, 2018), new Date(05, 04, 2018), "BD 2");
			daoProjeto.add(proj);
			assertTrue(proj.getId() != null);

		} catch (Exception e) {
			fail(e.getMessage());
		}

	}
	
	@Test
	public void deleteProjeto(){
		try{
			Aluno aluno = AlunoFactory.criaInstancia("jarvas", 44565, 5);
			aluno = daoA.add(aluno);
			listAluno.add(aluno);
			Aluno aluno2 = AlunoFactory.criaInstancia("tuyisy", 6474, 4);
			aluno2 = daoA.add(aluno2);
			listAluno.add(aluno2);
			Tecnologia tec1 = TecnologiaFactory.criaInstancia("Firebasic", "É uma parada que voce usa no backend", "olha no site ", "tem");
			tec1 = daoT.add(tec1);
			tecList.add(tec1);
			Tecnologia tec2 = TecnologiaFactory.criaInstancia("NodeJS", "É uma parada que voce usa no front provavelmente", "olhe no site", "tem");
			tec2 = daoT.add(tec2);
			tecList.add(tec2);
			Professor prof = ProfessorFactory.criaInstancia("jeronimo", 468768);
			prof = daoProf.add(prof);
			Projeto proj = ProjetoFactory.criaInstancia("dor e sofrimento", "Um projeto que tem como objetivo fazer voce sofrer", listAluno, tecList, prof, new Date(02, 04, 2018), new Date(05, 04, 2018), "BD 2");
			daoProjeto.add(proj);
			daoProjeto.delete(proj);
			assertTrue(daoProjeto.get().size() == 0);
			
		}catch (Exception e){
			fail(e.getMessage());
		}
	}

	@After
	public void encerraConexao() {
		daoProjeto = null;
		daoT = new TecnologiaDAO();
		daoProf = new ProfessorDAO();
		daoA = new AlunoDAO();
	}

}
