package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Duan
 */
public class Bank extends Person{
    protected String homepage;

    public String getHomepage(){
	   return this.homepage;
    }
    public void setHomepage(String homepage){
	   this.homepage=homepage;
    }
}
