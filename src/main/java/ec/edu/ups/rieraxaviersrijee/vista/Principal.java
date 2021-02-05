package ec.edu.ups.rieraxaviersrijee.vista;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.rieraxaviersrijee.modelo.ClienteFactura;
import ec.edu.ups.rieraxaviersrijee.modelo.Factura;
import ec.edu.ups.rieraxaviersrijee.modelo.RecargaFactura;
import ec.edu.ups.rieraxaviersrijee.negocio.ONGestion;

@WebServlet("/principal")
public class Principal extends HttpServlet{
    @Inject
    private ONGestion on;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>Hola mundo</h1>");
        try {
            ClienteFactura cl = new ClienteFactura();
            cl.setCedula("0104839451");
            cl.setNombre("vinnycio");
            cl.setNumeroCeular("0992802686");
            cl.setSaldo(5);

            Factura f = new Factura();

            RecargaFactura recarga = new RecargaFactura();
            recarga.setClientefactura(cl);
            recarga.setFactura(f);
            recarga.setValor(2);

            f.setValor(recarga.getValor());
            
            cl.setSaldo(cl.getSaldo()+f.getValor());
            
            on.crearRecarga(recarga);
        
        } catch (Exception e) {
            response.getWriter().println("<h1>" + e.getMessage() + "</h1>");
        }
    }


}

    
    