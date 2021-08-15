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

public class Consulta2_79Dao {
    public ArrayList<Consulta2VO_79> consulta2DAO() throws SQLException {
        ArrayList<Consulta2VO_79> result = new ArrayList<Consulta2VO_79>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT l.Nombre, l.Salario, l.Salario * 0.08 as deducible, l.Primer_Apellido || "+ " \"-\" " +" || l.Segundo_Apellido as apellidos FROM Lider l WHERE l.Salario BETWEEN 500000 and 650000";
            conn = JDBCUtilities.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
              Consulta2VO_79 Consulta1 = new Consulta2VO_79();
              Consulta1.setFechaCompra(rs.getString("Nombre"));
              Consulta1.setNombreProveedor(rs.getString("Salario"));
              Consulta1.setCodigoCompra(rs.getString("deducible"));
              Consulta1.setValorPagado(rs.getString("apellidos"));
      
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
