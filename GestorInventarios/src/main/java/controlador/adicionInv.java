package controlador;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author sebac
 */
@WebServlet(name = "adicionInv", urlPatterns = {"/adicionInv"})
public class adicionInv extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String delet = request.getParameter("eliminar");
        String producto = request.getParameter("tInventario");
        String nombre = request.getParameter("pNombre");
        String cantidad = request.getParameter("cantidad");
        String vencimiento = request.getParameter("Vencimiento");
        String codigo = request.getParameter("cBarras");
        
        Articulos ar = new Articulos(producto, nombre, cantidad, vencimiento, codigo);
        
        Connection conn = null;
        PreparedStatement ps;
        ResultSet rs = null;
        String infor = "";
        String dato = "";
        String todDatos = "";
            

            if (delet != null){
                try {
                    
                    String sql2 = "DELETE FROM articulos WHERE codigo = ?";
                    String sql3 = "SELECT * FROM articulos";
                     
                    conn = conexion.establecerConexion();
                    ps = conn.prepareStatement(sql2);
                    ps.setString(1, delet);
                    ps.executeUpdate();
                    
                    ps = conn.prepareStatement(sql3);
                    rs = ps.executeQuery();
                    
                    while (rs.next()){
                        
                        ar.setProducto(rs.getString(1));
                        ar.setNombreProducto(rs.getString(2));
                        ar.setCantidad(rs.getString(3));
                        ar.setVencimiento(rs.getString(4));
                        ar.setCodigo(rs.getString(5));
                        dato = ar.datos();
                        todDatos += dato;
                    }
                    
                } catch (ClassNotFoundException e) {
                    infor = "mensaje 5 " + e.getMessage();
                } catch (SQLException ex) {
                    infor = "mensaje 6 " + ex.getMessage();
                }
            
            }else{
                
                try {
                                        
                    conn = conexion.establecerConexion();
                    
                    String sql1 = "INSERT INTO articulos(tipo_producto, nombre, cantidad, vencimiento, codigo) VALUES (?, ?, ?, ?, ?)";
                    
                    ps = conn.prepareStatement(sql1);
                    ps.setString(1, ar.getProducto());
                    ps.setString(2, ar.getNombreProducto());
                    ps.setString(3, ar.getCantidad());
                    ps.setString(4, ar.getVencimiento());
                    ps.setString(5, ar.getCodigo());

                    ps.executeUpdate();
            
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    infor  = "Mensaje 1 " + e.getMessage();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(regis.class.getName()).log(Level.SEVERE, null, ex);
                    infor = "mensaje 2 " + ex.getMessage();
                }
                //------------------------------------------------------------------------------
                
                
                
                
                try {
                    
                    String sql2 = "SELECT * FROM articulos";
                    
                    conn = conexion.establecerConexion();
                    ps = conn.prepareStatement(sql2);
                    rs = ps.executeQuery();
                    
                    while (rs.next()){
                        
                        ar.setProducto(rs.getString(1));
                        ar.setNombreProducto(rs.getString(2));
                        ar.setCantidad(rs.getString(3));
                        ar.setVencimiento(rs.getString(4));
                        ar.setCodigo(rs.getString(5));
                        dato = ar.datos();
                        todDatos += dato;
                    }
                    
                } catch (ClassNotFoundException e) {
                    infor = "mensaje 3 " + e.getMessage();
                } catch (SQLException ex) {
                    infor = "mensaje 4 " + ex.getMessage();
                }
            }    
        
            request.getSession().setAttribute("datos", todDatos);      
        
            //---------------------------------------------------------------------------------
            request.getSession().setAttribute("infor", infor);
            RequestDispatcher rd = request.getRequestDispatcher("datos.jsp");
            rd.forward(request, response);
        
            
            try {
                    
                String sql3 = "SELECT * FROM articulos";
                     
                conn = conexion.establecerConexion();
                ps = conn.prepareStatement(sql3);
                rs = ps.executeQuery();
                    
                while (rs.next()){
                        
                    ar.setProducto(rs.getString(1));
                    ar.setNombreProducto(rs.getString(2));
                    ar.setCantidad(rs.getString(3));
                    ar.setVencimiento(rs.getString(4));
                    ar.setCodigo(rs.getString(5));
                    dato = ar.datos();
                    todDatos += dato;
                }
                    
            } catch (ClassNotFoundException e) {
                infor = "mensaje 7 " + e.getMessage();
            } catch (SQLException ex) {
                infor = "mensaje 8 " + ex.getMessage();
            }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
