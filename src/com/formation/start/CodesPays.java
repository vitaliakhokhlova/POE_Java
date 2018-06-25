package com.formation.start;

public enum CodesPays {
UK("United Kindom"), FR("France"), RU("Russia");
	 private String name = "";
	   
	  
	  CodesPays(String name){
	    this.name = name;
	  }
	   
	  public String toString(){
	    return name;
	  }
}
