package com.aurionpro.model;

public interface Internet {
	
	public void connectTo(String Server) throws SiteAccessDeniedException;

}
