
package services;

import popelos.dao.ConnectionDao;

public class ConnectionService {

    
    ConnectionDao conn = new ConnectionDao();
      
    public void openManagerFactoryConnection(){
        conn.openManagerFactoryConnection();
    }
    public void closeManagerFactoryConnection(){
        conn.closeManagerFactoryConnection();
    }
    
}
