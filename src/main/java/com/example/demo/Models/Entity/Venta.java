package com.example.demo.Models.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="venta")
public class Venta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="producto_id")
	private Producto producto;
	@NotEmpty 
	private String nombres;
	@NotEmpty 
	private String apellidos;
	@NotEmpty 
	@Email
	private String correo;
	@NotEmpty
	@Pattern(regexp="[0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4}")
	private String numtarjeta;
	@NotEmpty
	@Pattern(regexp="[0-9]{2}/[0-9]{2}")
	private String fecha;
	@NotNull
	
	private int cuotas;
	
	private String estado= "APROBADA";
	@Column(name="fecha_venta")
	private Date fechaVenta;
	
	
	
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getNumtarjeta() {
		return numtarjeta;
	}
	public void setNumtarjeta(String numtarjeta) {
		this.numtarjeta = numtarjeta;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCuotas() {
		return cuotas;
	}
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Venta [id=" + id + ", producto=" + producto + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", correo=" + correo + ", numtarjeta=" + numtarjeta + ", fecha=" + fecha + ", cuotas="
				+ cuotas + ", estado=" + estado + "]";
	}
	
	
	
	
}