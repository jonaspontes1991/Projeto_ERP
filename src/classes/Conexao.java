package classes;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexao {
    
 
    Connection conn;
    Statement stmt;
    ResultSet rs;
 

    public void Conectar(String Sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbEnterprise", "root", "");
            PreparedStatement banco = (PreparedStatement) conn.prepareStatement(Sql);
            banco.execute(Sql);
            //para o código ser executado com parametros atribuido em uma clsse em de outro pacote tem que ser usado o preparedStatment
            // no lugar de CreatStatement
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    


}
 