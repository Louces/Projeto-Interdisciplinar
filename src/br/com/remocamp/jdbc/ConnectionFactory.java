package br.com.remocamp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public Connection getConnection() {
        String host = null;
        try {
             host= br.com.remocamp.view.Login.argumentos[0];
            return DriverManager.getConnection("jdbc:mysql://"+host+"/remocampdb", "root", "padtec");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Não foi possivel conectar ao banco de dados em "+host);
            throw new RuntimeException(e);
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            if(host == null){
                JOptionPane.showMessageDialog(null,"O argumento de configuração do banco não foi passado...");
            }else{
                JOptionPane.showMessageDialog(null,"Não foi possivel conectar ao banco de dados em "+host);
            }
            throw new RuntimeException(e);
        }
    }
}
