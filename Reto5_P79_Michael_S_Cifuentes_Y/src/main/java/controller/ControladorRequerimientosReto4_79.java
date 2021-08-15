package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4_79 {       

    private final Consulta1_79Dao requerimientoDao_1 = new Consulta1_79Dao();
    private final Consulta2_79Dao requerimientoDao_2 = new Consulta2_79Dao();
    private final Consulta3_79Dao requerimientoDao_3 = new Consulta3_79Dao();

    public ArrayList<Consulta1VO_79> consultarRequerimiento1()
    throws SQLException {

    return this.requerimientoDao_1.consulta1DAO();
    }

    public ArrayList<Consulta2VO_79> consultarRequerimiento2()
    throws SQLException {
    return this.requerimientoDao_2.consulta2DAO();
    }
    
    public ArrayList<Consulta3VO_79> consultarRequerimiento3()
    throws SQLException {
    return this.requerimientoDao_3.consulta3DAO();
    }
}
