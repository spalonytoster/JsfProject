package com.spalonytoster.jsfproject;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6240526454072504361L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
