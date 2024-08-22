/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.Controles;

import escuelaDTO.AlumnoDTO;
import escuelaFacade.Facade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class AlumnoControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Facade facade;

    public AlumnoControl() {
        this.facade = new Facade();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println(request.getParameter("a"));
            switch (request.getParameter("a")) {
                case "lista":
                    listarAlumno(request, response);
                    break;
                case "registrar":
                    registrar(request,response); 
                    response.sendRedirect("index.jsp");
                    break;
                case "eliminar":
                    eliminarAlumno(request,response);
                    listarAlumno(request, response);
                    break;
                case "editar":
                    consultarAlumno(request,response);
                    break;
                case "modificar":
                    modificarAlumno(request, response);
                    break;
                default:
                    response.sendRedirect("index.jsp");
                    break;
            }

          
        }
    }
    private void registrar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dp = request.getRequestDispatcher("Registrar.jsp");
        dp.forward(request, response);
        String codigo = request.getParameter("clave");
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String curso = request.getParameter("cursoactual");
        String email = request.getParameter("email");
        AlumnoDTO alumno = new AlumnoDTO(Integer.parseInt(codigo), nombre, Integer.parseInt(edad),Integer.parseInt(curso),email);
        String respuesta = facade.crearAlumno(alumno);
        request.setAttribute("msg", respuesta);
        dp = request.getRequestDispatcher("Registrar.jsp");
        dp.forward(request, response);
    }
    private void listarAlumno(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<AlumnoDTO> lista = facade.listarAlumnos();
        request.setAttribute("listaalumno", lista);
        RequestDispatcher dp = request.getRequestDispatcher("/Lista.jsp");
        dp.forward(request, response);
    }
    
    private void eliminarAlumno(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("id");
        AlumnoDTO alumno = new AlumnoDTO(Integer.parseInt(codigo));
        String res = facade.eliminarAlumnos(alumno); 
        request.setAttribute("msgEl", res);
    }
    private void consultarAlumno (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("id");
        AlumnoDTO alumno = facade.buscarAlumno(Integer.parseInt(codigo));
        request.setAttribute("claveM", alumno.getClaveAlumno());
        request.setAttribute("nombreM",alumno.getNombre());
        request.setAttribute("edadM", alumno.getEdad());
        request.setAttribute("cursoactualM", alumno.getCursoActual());
        request.setAttribute("emailM", alumno.getEmail());
        RequestDispatcher dp = request.getRequestDispatcher("/ModificarEstudiante.jsp");
        dp.forward(request, response);
    }
    
    private void modificarAlumno(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String codigo = request.getParameter("claveM");
        String nombre = request.getParameter("nombreM");
        String edad = request.getParameter("edadM");
        String curso = request.getParameter("cursoactualM");
        String email = request.getParameter("emailM");
        AlumnoDTO alumno = new AlumnoDTO(Integer.parseInt(codigo), nombre, Integer.parseInt(edad),Integer.parseInt(curso),email);
        facade.cambiarDatos(alumno);
        listarAlumno(request, response);
    }
    
    
    
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
