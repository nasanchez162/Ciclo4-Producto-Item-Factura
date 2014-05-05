
package co.edu.uniandes.csw.factura.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class _FacturaEntity {

	@Id
	@GeneratedValue(generator = "Factura")
	private Long id;
	private Double fecha;
	private Double costoTotal;
	private Long itemId;

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public Double getFecha(){
		return fecha;
	}
	
	public void setFecha(Double fecha){
		this.fecha = fecha;
	}
	public Double getCostoTotal(){
		return costoTotal;
	}
	
	public void setCostoTotal(Double costoTotal){
		this.costoTotal = costoTotal;
	}
	public Long getItemId(){
		return itemId;
	}
	
	public void setItemId(Long itemId){
		this.itemId = itemId;
	}
}