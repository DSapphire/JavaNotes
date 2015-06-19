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
public class TransferDeal extends Deal{
	private Account inputAccount;
	private Account outputAccount;
	public Deal parseString(String dealString){//
            return new Deal();
	}
	public String toPlainText(){
		return "";
	}
	public void setInputAccount(Account inputAccount){
		this.inputAccount=inputAccount;
	}
	public Account getInputAccount(){
		return this.inputAccount;
	}
	public void setOutputAccount(Account outputAccount){
		this.outputAccount=outputAccount;
	}
	public Account getOutputAccount(){
		return this.outputAccount;
	}
    
}
