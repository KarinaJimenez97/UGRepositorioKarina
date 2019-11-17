/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.hibernate_karina.Mesa;
import com.mycompany.hibernate_karina.Mesero;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class DAOMesero {
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
	
	public void crear(Mesero mesero) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(mesero);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Mesero read(long MeseroID) {
		Session s =  sessionFactory.openSession();
		Mesero mesero = s.get(Mesero.class, MeseroID);
		s.close();
		return mesero;
	}
	
	protected void update(Mesero mesero) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(mesero);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int MeseroID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Mesero mesero = new Mesero();
		mesero.setIdMesero(MeseroID);
		s.delete(mesero);
		s.getTransaction().commit();
		s.close();
	}
}
