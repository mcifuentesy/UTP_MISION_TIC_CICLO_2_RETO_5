package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta1_79Dao {
    public ArrayList<Consulta1VO_79> consulta1DAO() throws SQLException {
        ArrayList<Consulta1VO_79> result = new ArrayList<Consulta1VO_79>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String sql =
            "SELECT ID_Proyecto, Fecha_Inicio, Banco_Vinculado, Serial FROM Proyecto p WHERE ID_Proyecto > 4 AND  ID_Proyecto < 12";
            conn = JDBCUtilities.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
              Consulta1VO_79 Consulta1 = new Consulta1VO_79();
              Consulta1.setFechaCompra(rs.getString("ID_Proyecto"));
              Consulta1.setNombreProveedor(rs.getString("Fecha_Inicio"));
              Consulta1.setCodigoCompra(rs.getString("Banco_Vinculado"));
              Consulta1.setValorPagado(rs.getString("Serial"));
      
              result.add(Consulta1);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(
              "Error en la consulta del requerimiento 1 " + ex.getMessage()
            );
          } finally {
            if (conn != null) {
              conn.close();
            }
        }
        return result;
      }
    }
    
