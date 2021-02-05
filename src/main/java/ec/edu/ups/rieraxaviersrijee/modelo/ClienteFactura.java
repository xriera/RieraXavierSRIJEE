package ec.edu.ups.rieraxaviersrijee.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ClienteFactura {
	   @Id
	    private String cedula;

	    private String nombre;
	    private String numeroCeular;
	    private double saldo;
	    
	    @JsonIgnore
	    @OneToMany( mappedBy = "clientefactura")
	    private List<RecargaFactura> recarga;

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getNumeroCeular() {
			return numeroCeular;
		}

		public void setNumeroCeular(String numeroCeular) {
			this.numeroCeular = numeroCeular;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public List<RecargaFactura> getRecarga() {
			return recarga;
		}

		public void setRecarga(List<RecargaFactura> recarga) {
			this.recarga = recarga;
		}
	    
	    
}
