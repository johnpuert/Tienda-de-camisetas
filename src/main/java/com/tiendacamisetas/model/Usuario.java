package com.tiendacamisetas.model;

public class Usuario {

	private Integer idUsuario;
	private String nombre;
	private String userName;
	private String email;
	private String direccion;
	private String telefono;
	private String tipousuario;
	private String password;
	
	public Usuario() {
		super();
	}
	
	public Usuario(Integer idUsuario, String nombre, String userName, String email, String direccion, String telefono,
			String tipousuario, String password) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.userName = userName;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipousuario = tipousuario;
		this.password = password;
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipousuario() {
		return tipousuario;
	}
	public void setTipousuario(String tipousuario) {
		this.tipousuario = tipousuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", userName=" + userName + ", email=" + email
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", tipousuario=" + tipousuario + ", password="
				+ password + "]";
	}
	
}
