
package Main;

import DAO.DAOBebida;
import DAO.DAOCliente;
import DAO.DAOFactura;
import DAO.DAOMesa;
import DAO.DAOMesero;
import DAO.DAOPlatillos;
import com.mycompany.hibernate_karina.Bebida;
import com.mycompany.hibernate_karina.Cliente;
import com.mycompany.hibernate_karina.Factura;
import com.mycompany.hibernate_karina.Mesa;
import com.mycompany.hibernate_karina.Mesero;
import com.mycompany.hibernate_karina.Platillos;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        crear();
        read();
        update();
        delete();
    }

    public static void crear() {
        DAOFactura daoFactura = new DAOFactura();
        DAOBebida daoBebida = new DAOBebida();
        DAOCliente daoCliente = new DAOCliente();
        DAOMesa daoMesa = new DAOMesa();
        DAOMesero daoMesero = new DAOMesero();
        DAOPlatillos daoPlatillos = new DAOPlatillos();
        
        Factura factura = new Factura(1, "10/01/2019", 1, 1, 1, 1, 1);
        daoFactura.setup();
        daoFactura.crear(factura);
        
        Bebida bebida = new Bebida(1, "Coca Cola", 1, true);
        daoBebida.setup();
        daoBebida.crear(bebida);
        
        Cliente cliente = new Cliente(1, "Karina", "Jimenez", "Quinto", "11/10/1997", true, "Casada", "Ninguna");
        daoCliente.setup();
        daoCliente.crear(cliente);
        
        Mesa mesa = new Mesa(1, 4, "Central", true);
        daoMesa.setup();
        daoMesa.crear(mesa);
        
        Mesero mesero = new Mesero(1, "Javier", "Gonzales", "Paredes", "10/02/1988", true, "Soltero");
        daoMesero.setup();
        daoMesero.crear(mesero);
        
        Platillos platillos =new Platillos(1, "Arroz con Huevo", 2, true);
        daoPlatillos.setup();
        daoPlatillos.crear(platillos);

    }

    public static void read() {
        DAOFactura daoFactura = new DAOFactura();
        daoFactura.setup();
        Factura factura = daoFactura.read(1);
        factura.imprimir();
    }

    public static void update() {

        DAOFactura daoFactura = new DAOFactura();
        daoFactura.setup();
        Factura factura = daoFactura.read(1);
        factura.setIdFactura(1);
        daoFactura.update(factura);
    }

    public static void delete() {
        DAOFactura daoFactura = new DAOFactura();
        daoFactura.setup();
        daoFactura.delete(1);
        daoFactura.delete(2);
    }
}
