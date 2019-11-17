/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.hibernate_karina.Mesa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class DAOMesa {
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
	
	public void crear(Mesa mesa) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(mesa);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Mesa read(long MesaID) {
		Session s =  sessionFactory.openSession();
		Mesa mesa = s.get(Mesa.class, MesaID);
		s.close();
		return mesa;
	}
	
	protected void update(Mesa mesa) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(mesa);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int MesaID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Mesa mesa = new Mesa();
		mesa.setIdMesa(MesaID);
		s.delete(mesa);
		s.getTransaction().commit();
		s.close();
	}
}
