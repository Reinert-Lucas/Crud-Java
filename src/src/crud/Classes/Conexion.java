/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class Conexion {
    // Clase para Realizar la Conexion a la Base de Datos MySQL
    // Parametros de Conexion
    private static final String URL = "jdbc:mysql://localhost:3306/vtv-argentina";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";
    // Metodo para Conectarse
    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
