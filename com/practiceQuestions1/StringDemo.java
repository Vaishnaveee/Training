package com.practiceQuestions1;

class TransactionParty {
    String seller;
    String buyer;
    public TransactionParty(String seller, String buyer){
      this.seller = seller;
      this.buyer = buyer;
    }
}

class Receipt{
    TransactionParty transactionParty;
    String productsQR;

    public Receipt(TransactionParty transactionParty, String productsQR){
      this.transactionParty = transactionParty;
      this.productsQR = productsQR;
    }
}


class GenerateReceipt{
    public int verifyParty(Receipt r){
    	String buyer = r.transactionParty.buyer; 
    	buyer.matches("^[a-zA-Z]\\s?^'-[a-zA-Z]$");
    	/*
    	 * should start and end with alphabets (uppercase/lowercase)
			can have white-spaces in between alphabets
			can have a single quote symbol OR a hyphen symbol in between alphabets
			e.g: Daniel D'Cruz, Giselle Dawn-Wright and Giselle Dawn are valid names.
    	 */
    	//r.TransactionParty.seller
      return 0; 
    }

    public String calcGST(Receipt r){
      return "";
    }
}
 
public class StringDemo {
	public static void main(String[] args) {

	}
}
