package com.fran.curso.springboot.webapp.models.dto;

import com.fran.curso.springboot.webapp.models.User;

/**
 * UserDto representa los datos de un usuario
 * 
 * @author fvasqueb
 */
public class UserDto {

	private String title;
	private User user;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
