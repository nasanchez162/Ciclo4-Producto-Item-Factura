
package co.edu.uniandes.csw.factura.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _FacturaDTO {

	private Long id;
	private Double fecha;
	private Double costoTotal;
	private Long itemId;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public Double getFecha() {
		return fecha;
	}
 
	public void setFecha(Double fecha) {
		this.fecha = fecha;
	}
	public Double getCostoTotal() {
		return costoTotal;
	}
 
	public void setCostoTotal(Double costototal) {
		this.costoTotal = costototal;
	}
	public Long getItemId() {
		return itemId;
	}
 
	public void setItemId(Long itemid) {
		this.itemId = itemid;
	}
	
}