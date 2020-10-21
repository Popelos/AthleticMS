
package popelos.dao;


public class ConnectionDao extends SuperDao{
    
    
    

    public void openManagerFactoryConnection() {
        openEMF();
    }

    public void closeManagerFactoryConnection() {
        closeEMF();
    }
    
    
    
}
