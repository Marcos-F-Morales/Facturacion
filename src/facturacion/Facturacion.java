package facturacion;

/**
 *
 * @author f3rma
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection obj=new DBConnection();
        obj.establecerConexion();
        Clientes clas1=new Clientes();
        clas1.createTable();
    }
    
}
