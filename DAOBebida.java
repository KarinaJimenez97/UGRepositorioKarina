/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.hibernate_karina.Bebida;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author User
 */
public class DAOBebida {
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
	
	public void crear(Bebida bebida) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(bebida);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Bebida read(long BebidaID) {
		Session s =  sessionFactory.openSession();
		Bebida bebida = s.get(Bebida.class, BebidaID);
		s.close();
		return bebida;
	}
	
	protected void update(Bebida bebida) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(bebida);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int BebidaID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Bebida bebida = new Bebida();
		bebida.setIdBebida(BebidaID);
		s.delete(bebida);
		s.getTransaction().commit();
		s.close();
	}
}
