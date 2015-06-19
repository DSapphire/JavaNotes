/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author Duan
 */
public class CreditAccount extends Account{
	private int loanLimit=0;
	
	public int getLoanLimit(){
		return loanLimit;
	}
    public void setLoanLimit(int loanLimit){
    	this.loanLimit=loanLimit;
    }
}
