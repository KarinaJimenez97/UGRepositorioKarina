/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.hibernate_karina.Platillos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class DAOPlatillos {
               protected SessionFactory sessionFactory;
	
	public void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	public void crear(Platillos platillos) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(platillos);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Platillos read(long PlatillosID) {
		Session s =  sessionFactory.openSession();
		Platillos platillos = s.get(Platillos.class, PlatillosID);
		s.close();
		return platillos;
	}
	
	protected void update(Platillos platillos) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(platillos);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int PlatillosID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Platillos platillos = new Platillos();
		platillos.setIdPlatillos(PlatillosID);
		s.delete(platillos);
		s.getTransaction().commit();
		s.close();
	}
}
