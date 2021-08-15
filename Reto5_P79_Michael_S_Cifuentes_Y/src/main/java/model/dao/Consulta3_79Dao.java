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

public class Consulta3_79Dao {
    public ArrayList<Consulta3VO_79> consulta3DAO() throws SQLException {
        ArrayList<Consulta3VO_79> result = new ArrayList<Consulta3VO_79>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String sql =
            "SELECT p.ID_Proyecto , l.Nombre ||"+ " \" \" "+"|| l.Primer_Apellido as nom_ape FROM Lider l INNER JOIN Proyecto p on p.ID_Lider = l.ID_Lider WHERE p.Banco_Vinculado = 'Colpatria'";
            conn = JDBCUtilities.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
              Consulta3VO_79 Consulta1 = new Consulta3VO_79();
              Consulta1.setFechaCompra(rs.getString("ID_Proyecto"));
              Consulta1.setNombreProveedor(rs.getString("nom_ape"));
              //Consulta1.setCodigoCompra(rs.getString("Codigo Compra"));
              //Consulta1.setValorPagado(rs.getString("Pagado"));
      
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
