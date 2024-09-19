package com.fran.curso.springboot.webapp.models;

/**
 * Clase User
 */
public class User {

	private String name;
	private String lastname;
	private String email;

	/**
	 * Constructor vacío
	 */
	public User() {
	}

	/**
	 * Constructor por parámetros
	 * 
	 * @param name
	 * @param lastname
	 * @param email
	 */
	public User(String name, String lastname, String email) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}

	/**
	 * @param name
	 * @param lastname
	 */
	public User(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
