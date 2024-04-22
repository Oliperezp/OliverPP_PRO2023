package JPA_entitiesTest;

import es.ies.puerto.JPA.modelo.Personaje;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonajeTest {
	static EntityManagerFactory emf;
	EntityManager em;

	Personaje personaje;

	@BeforeAll
	public static void setUp() {
		emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
	}

	@BeforeEach
	public void initEntityManager() {
		em = emf.createEntityManager();
		personaje = new Personaje();
		personaje.setNombre("personajeTest");
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(personaje);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testPersistFind() {
		try {
			Personaje personajeDB = em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personaje.getNombre(), personajeDB.getNombre());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		try {
			Personaje personajeFind = em.find(Personaje.class, personaje.getId()); // See file import.sql
			personajeFind.setGenero("Fememino");

			// Persist in database
			em.getTransaction().begin();
			em.merge(personajeFind);
			em.getTransaction().commit();

			// Find by id
			Personaje personDBUpdate = em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personajeFind.getGenero(), personDBUpdate.getGenero());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removePerson() {
		try {
			int personajeId = personaje.getId();
			Personaje personaje = em.find(Personaje.class, personajeId); // See file import.sql
			em.getTransaction().begin();
			em.remove(personaje);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Personaje personDB = em.find(Personaje.class, personajeId); // See file import.sql

			Assertions.assertNull(personDB);

		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void closeEntityManager() {
		em.close();
		em = null;
	}

	@AfterAll
	public static void closeEntityManagerFactory() {
		emf.close();
	}

}
