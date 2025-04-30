/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.Classes;

/**
 *
 * @author Lucas
 */
public class ContenedorDatos {
    // Singleton usada para Almacenar Datos que se usan en varias partes del Programa
    private static ContenedorDatos instancia;

    private int idUser;
    private int idTurno;
    private int idInspeccion;

    private ContenedorDatos() {} //Constructor Privado - Inaccesible fuera de la Clase
    // Solo se instancia una vez - Evita Perdida de Datos
    public static ContenedorDatos getInstance() {
        if (instancia == null) {
            instancia = new ContenedorDatos();
        }
        return instancia;
    }

    // Getters y setters
    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public void setIdInspeccion(int idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdInspeccion() {
        return idInspeccion;
    }
}
