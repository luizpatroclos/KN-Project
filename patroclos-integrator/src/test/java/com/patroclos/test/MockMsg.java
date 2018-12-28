package com.patroclos.test;

import org.springframework.stereotype.Component;

@Component
public class MockMsg {
	
	
	 public String getMsgExpectIn() {
	    	
		 String xmlStr = 
   			  "<UC_STOCK_LEVEL_IFD>"
   			+ "  <CTRL_SEG>"
   			+ "    <TRNNAM>UC_STOCK_LEVEL</TRNNAM>"
   			+ "      <TRNVER>20180100</TRNVER>"
   			+ "      <UUID>0de01919-81eb-4cc7-a51d-15f6085fc1a4</UUID>"
   			+ "      <WH_ID>WHS01</WH_ID>"
   			+ "      <CLIENT_ID>CLIE01</CLIENT_ID>"
   			+ "      <ISO_2_CTRY_NAME>GB</ISO_2_CTRY_NAME>"
   			+ "      <REQUEST_ID>bc2a55e8-5a07-4af6-85fd-8290d3ccfb51</REQUEST_ID>"
   			+ "      <ROUTE_ID>186</ROUTE_ID>"
   			+ "  </CTRL_SEG>"
   			+ "</UC_STOCK_LEVEL_IFD>";
    	 
    	return xmlStr.replaceAll("\\s+","");
    }
	 
	 
	 
	 public String getMsgExpectOut() {
	    	
    	 String xmlStr = 
    			  "<UC_STOCK_LEVEL_IFD>"
    			+ "  <CTRL_SEG>"
    			+ "      <TRNVER>20180100</TRNVER>"
    			+ "      <CLIENT_ID>CLIE01</CLIENT_ID>"
    			+ "      <ROUTE_ID>186</ROUTE_ID>"
    			+ "  </CTRL_SEG>"
    			+ "</UC_STOCK_LEVEL_IFD>";
    	 
    	return xmlStr.replaceAll("\\s+","");
    }


}