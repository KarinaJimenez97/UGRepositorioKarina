/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.hibernate_karina.Cliente;
import com.mycompany.hibernate_karina.Factura;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class DAOCliente {
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
	
	public void crear(Cliente cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Cliente read(long ClienteID) {
		Session s =  sessionFactory.openSession();
		Cliente cliente = s.get(Cliente.class, ClienteID);
		s.close();
		return cliente;
	}
	
	protected void update(Cliente cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int ClienteID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Cliente cliente = new Cliente();
		cliente.setIdCliente(ClienteID);
		s.delete(cliente);
		s.getTransaction().commit();
		s.close();
	}
}
