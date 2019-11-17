/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.hibernate_karina.Factura;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class DAOFactura {
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
	
	public void crear(Factura factura) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(factura);
		s.getTransaction().commit();
		s.close();
	}
	
	public Factura read(long FacturaID) {
		Session s =  sessionFactory.openSession();
		Factura factura = s.get(Factura.class, FacturaID);
		s.close();
		return factura;
	}
	
	public void update(Factura factura) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(factura);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int FacturaID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Factura factura = new Factura();
		factura.setIdFactura(FacturaID);
		s.delete(factura);
		s.getTransaction().commit();
		s.close();
	}

}
