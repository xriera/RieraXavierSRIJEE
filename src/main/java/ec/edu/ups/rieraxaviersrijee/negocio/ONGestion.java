package ec.edu.ups.rieraxaviersrijee.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.rieraxaviersrijee.dao.DaoGestion;
import ec.edu.ups.rieraxaviersrijee.modelo.RecargaFactura;

@Stateless
public class ONGestion {
    @Inject
    private DaoGestion daog;
    
     public void crearRecarga(RecargaFactura rfac){
         daog.crearRecarga(rfac);
     }
     
     

}
