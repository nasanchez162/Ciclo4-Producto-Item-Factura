
package co.edu.uniandes.csw.item.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _ItemDTO {

	private Long id;
	private Integer cantidadItem;
	private Date fechaExpiracion;
	private String name;
	private Double precio;
	private String bodega;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCantidadItem() {
		return cantidadItem;
	}
 
	public void setCantidadItem(Integer cantidaditem) {
		this.cantidadItem = cantidaditem;
	}
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
 
	public void setFechaExpiracion(Date fechaexpiracion) {
		this.fechaExpiracion = fechaexpiracion;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrecio() {
		return precio;
	}
 
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getBodega() {
		return bodega;
	}
 
	public void setBodega(String bodega) {
		this.bodega = bodega;
	}
	
}