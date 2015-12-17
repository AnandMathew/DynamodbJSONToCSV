package com.peekapak.platform.core;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Iterator;

import com.gcs.json.JSONArray;
import com.gcs.json.JSONException;
import com.gcs.json.JSONObject;
import com.gcs.json.JSONTokener;

public class JSONtoCSV {
	 
	public static void main(String[] args){
	       
	   JSONTOCSV("what", "when","key","who","unit","lessonName","lessonNumber","grade","sentHome", "test", "test", "test");
	             	
	}
	
	public static void JSONTOCSV(String col1, String col2, String col3, String col4) {
		 try {
				InputStream inputstream = new FileInputStream("c:\\tester\\jsonToCSV.txt");
				PrintWriter writer = new PrintWriter("c:\\tester\\jsonToCSV2.txt");
				writer.println(col1 + "," + col2 + "," + col3 + "," + col4);
				System.out.println(col1 + "," + col2 + "," + col3 + "," + col4);
				
				JSONTokener parser = new JSONTokener(inputstream);
				int data = inputstream.read();
				
				
				while (data != -1) {
					
			        JSONObject jsonObject = new JSONObject(parser);
			        
			        //GlobalVariable.appender = "";
			        
			        String a = DepthTraversal((JSONObject) jsonObject.opt(col1));
			        GlobalVariable.appender = "";
			        String b = DepthTraversal((JSONObject) jsonObject.opt(col2));
			        GlobalVariable.appender = "";
			        String c = DepthTraversal((JSONObject) jsonObject.opt(col3));
			        GlobalVariable.appender = "";
			        String d = DepthTraversal((JSONObject) jsonObject.opt(col4));
			        GlobalVariable.appender = "";
			        
			        writer.println(a+b+c+d);
			        System.out.println(a+b+c+d);
			        writer.flush();
			        
			       
				}
			       
			        
				 data = inputstream.read();
				 writer.close();
				 
		        
			} 
	        catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void JSONTOCSV(String col1, String col2, String col3, String col4, String col5) {
		 try {
				InputStream inputstream = new FileInputStream("c:\\tester\\jsonToCSV1A.txt");
				PrintWriter writer = new PrintWriter("c:\\tester\\jsonToCSV2.txt");
				writer.println(col1 + "," + col2 + "," + col3 + "," +col4 + "," +col5);
				System.out.println(col1 + "," + col2 + "," + col3 + "," +col4 + "," +col5);
				
				JSONTokener parser = new JSONTokener(inputstream);
				int data = inputstream.read();
				
				
				while (data != -1) {
					
			        JSONObject jsonObject = new JSONObject(parser);
			        
			        String a = DepthTraversal((JSONObject) jsonObject.opt(col1));
			        GlobalVariable.appender = "";
			        String b = DepthTraversal((JSONObject) jsonObject.opt(col2));
			        GlobalVariable.appender = "";
			        String c = DepthTraversal((JSONObject) jsonObject.opt(col3));
			        GlobalVariable.appender = "";
			        String d = DepthTraversal((JSONObject) jsonObject.opt(col4));
			        GlobalVariable.appender = "";
			        String e = DepthTraversal((JSONObject) jsonObject.opt(col5));
			        GlobalVariable.appender = "";
			        
			        writer.println(a+b+c+d+e);
			        System.out.println(a+b+c+d+e);
			        writer.flush();
			        
			       
				}
			       
			        
				 data = inputstream.read();
				 writer.close();
				 
		        
			} 
	        catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void JSONTOCSV(String col1, String col2, String col3, String col4, String col5, String col6){
		
		PrintWriter writer = null;
		try {
				InputStream inputstream = new FileInputStream("c:\\tester\\jsonToCSV1A.txt");
				writer = new PrintWriter("c:\\tester\\jsonToCSV2.txt");
				writer.println(col1 + "," + col2 + "," + col3 + "," +col4 + "," +col5 +"," + col6);
				System.out.println(col1 + "," + col2 + "," + col3 + "," +col4 + "," +col5 +"," + col6);
				
				JSONTokener parser = new JSONTokener(inputstream);
				int data = inputstream.read();
				
				while (data != -1) {
					
			        JSONObject jsonObject = new JSONObject(parser);
			        
			        String a = DepthTraversal((JSONObject) jsonObject.opt(col1));
			        GlobalVariable.appender = "";
			        String b = DepthTraversal((JSONObject) jsonObject.opt(col2));
			        GlobalVariable.appender = "";
			        String c = DepthTraversal((JSONObject) jsonObject.opt(col3));
			        GlobalVariable.appender = "";
			        String d = DepthTraversal((JSONObject) jsonObject.opt(col4));
			        GlobalVariable.appender = "";
			        String e = DepthTraversal((JSONObject) jsonObject.opt(col5));
			        GlobalVariable.appender = "";
			        String f =  DepthTraversal((JSONObject) jsonObject.opt(col6));
			        GlobalVariable.appender = "";
			       
			        
			        writer.println(a+b+c+d+e+f);
			        System.out.println(a+b+c+d+e);
			        writer.flush();
			        
			       
				}
			       
			       
			        
				 data = inputstream.read();
				 writer.close();
				 
		        
			} 
	        catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JSONException e) {
				writer.println("null");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void JSONTOCSV(String col1, String col2, String col3, String col4, String col5, String col6, 
			String col7) {
		
		try {
				InputStream inputstream = new FileInputStream("c:\\tester\\jsonToCSV.txt");
				PrintWriter writer = new PrintWriter("c:\\tester\\jsonToCSV2.txt");
				writer.println(col1 + "," + col2 + "," + col3 + "," +col4 + "," +col5 +"," + col6 + "," + col7);
				System.out.println(col1 + "," + col2 + "," + col3 + "," +col4 + "," +col5 +"," + col6 + "," + col7);
				
				JSONTokener parser = new JSONTokener(inputstream);
				int data = inputstream.read();
				
				
				while (data != -1) {
					
			        JSONObject jsonObject = new JSONObject(parser);
			        
			        String a = DepthTraversal((JSONObject) jsonObject.opt(col1));
			        GlobalVariable.appender = "";
			        String b = DepthTraversal((JSONObject) jsonObject.opt(col2));
			        GlobalVariable.appender = "";
			        String c = DepthTraversal((JSONObject) jsonObject.opt(col3));
			        GlobalVariable.appender = "";
			        String d = DepthTraversal((JSONObject) jsonObject.opt(col4));
			        GlobalVariable.appender = "";
			        String e = DepthTraversal((JSONObject) jsonObject.opt(col5));
			        GlobalVariable.appender = "";
			        String f =  DepthTraversal((JSONObject) jsonObject.opt(col6));
			        GlobalVariable.appender = "";
			        String h =  DepthTraversal((JSONObject) jsonObject.opt(col7));
			        GlobalVariable.appender = "";
			       
			        
			        writer.println(a+b+c+d+e+f+h);
			        System.out.println(a+b+c+d+e+f+h);
			        writer.flush();
			        
			        
			       
				}
			       
			       
			        
				 data = inputstream.read();
				 writer.close();
				 
		        
			} 
	        catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
	
	public static void JSONTOCSV(String col1, String col2, String col3, String col4, String col5, String col6, 
			String col7, String col8) {
		
		try {
				InputStream inputstream = new FileInputStream("c:\\tester\\jsonToCSV.txt");
				PrintWriter writer = new PrintWriter("c:\\tester\\jsonToCSV2.txt");
				writer.println(col1 + "," + col2+ "," + col3+ "," + col4+ "," + col5 + "," + col6
						+ "," + col7 + "," + col8);
				System.out.println(col1 + "," + col2+ "," + col3+ "," + col4+ "," + col5 + "," + col6
						+ "," + col7 + "," + col8);
				
				JSONTokener parser = new JSONTokener(inputstream);
				int data = inputstream.read();
				
				
				while (data != -1) {
					
			        JSONObject jsonObject = new JSONObject(parser);
			        
			        String a = DepthTraversal((JSONObject) jsonObject.opt(col1));
			        GlobalVariable.appender = "";
			        String b = DepthTraversal((JSONObject) jsonObject.opt(col2));
			        GlobalVariable.appender = "";
			        String c = DepthTraversal((JSONObject) jsonObject.opt(col3));
			        GlobalVariable.appender = "";
			        String d = DepthTraversal((JSONObject) jsonObject.opt(col4));
			        GlobalVariable.appender = "";
			        String e = DepthTraversal((JSONObject) jsonObject.opt(col5));
			        GlobalVariable.appender = "";
			        String f =  DepthTraversal((JSONObject) jsonObject.opt(col6));
			        GlobalVariable.appender = "";
			        String h =  DepthTraversal((JSONObject) jsonObject.opt(col7));
			        GlobalVariable.appender = "";
			        String i =  DepthTraversal((JSONObject) jsonObject.opt(col8));
			        GlobalVariable.appender = "";
			       
			        
			        writer.println(a+b+c+d+e+f+h+i);
			       System.out.println(a+b+c+d+e+f+h+i);
			       writer.flush();
			        
			        
			       
				}
			       
			       
			        
				 data = inputstream.read();
				 writer.close();
				 
		        
			} 
	        catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void JSONTOCSV(String col1, String col2, String col3, String col4, String col5, String col6, 
			String col7, String col8, String col9, String col10, String col11, String col12) {
		
		try {
				InputStream inputstream = new FileInputStream("c:\\tester\\jsonToCSV.txt");
				PrintWriter writer = new PrintWriter("c:\\tester\\jsonToCSV2.txt");
				writer.println(col1 + "," + col2+ "," + col3+ "," + col4+ "," + col5 + "," + col6
						+ "," + col7 + "," + col8+ "," + col9+ "," + col10+ "," + col11+ "," + col12);
				System.out.println(col1 + "," + col2+ "," + col3+ "," + col4+ "," + col5 + "," + col6
						+ "," + col7 + "," + col8+ "," + col9+ "," + col10+ "," + col11+ "," + col12);
				
				JSONTokener parser = new JSONTokener(inputstream);
				int data = inputstream.read();
				
				
				while (data != -1) {
					
			        JSONObject jsonObject = new JSONObject(parser);
			        
			        String a = DepthTraversal((JSONObject) jsonObject.opt(col1));
			        GlobalVariable.appender = "";
			        String b = DepthTraversal((JSONObject) jsonObject.opt(col2));
			        GlobalVariable.appender = "";
			        String c = DepthTraversal((JSONObject) jsonObject.opt(col3));
			        GlobalVariable.appender = "";
			        String d = DepthTraversal((JSONObject) jsonObject.opt(col4));
			        GlobalVariable.appender = "";
			        String e = DepthTraversal((JSONObject) jsonObject.opt(col5));
			        GlobalVariable.appender = "";
			        String f =  DepthTraversal((JSONObject) jsonObject.opt(col6));
			        GlobalVariable.appender = "";
			        String h =  DepthTraversal((JSONObject) jsonObject.opt(col7));
			        GlobalVariable.appender = "";
			        String i =  DepthTraversal((JSONObject) jsonObject.opt(col8));
			        GlobalVariable.appender = "";
			        String j = DepthTraversal((JSONObject) jsonObject.opt(col9));
			        GlobalVariable.appender = "";	
			        String k = DepthTraversal((JSONObject) jsonObject.opt(col10));
			        GlobalVariable.appender = "";
			        String l = DepthTraversal((JSONObject) jsonObject.opt(col11));
			        GlobalVariable.appender = "";
			        String m = DepthTraversal((JSONObject) jsonObject.opt(col12));
			        GlobalVariable.appender = "";
			       
			        
			        writer.println(a+b+c+d+e+f+h+i+j+k+l+m);
			       System.out.println(a+b+c+d+e+f+h+i+j+k+l+m);
			       writer.flush();
			        
			       
				}
			       
			       
			        
				 data = inputstream.read();
				 writer.close();
				 
		        
			} 
	        catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static String DepthTraversal (JSONObject jobj) {
		
		if (jobj == null) {
			return "Not Available,";
		}
		
		Iterator<?> keys = jobj.keys();
			while (keys.hasNext()) {
				
				String key = (String) keys.next();
				/*if (key!= "m" || key!= "s") {
					GlobalVariable.appender = key + ",";
				}*/
				if (jobj.opt(key) instanceof JSONObject ) {
					
					DepthTraversal((JSONObject) jobj.opt(key));	
				}
				else if (jobj.opt(key) instanceof JSONArray ) {
					JSONArray jarr = (JSONArray) jobj.opt(key);
					for (int i = 0; i< jarr.length(); i++) {
						try {
							DepthTraversal((JSONObject) jarr.getJSONObject(i));
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				else {
					GlobalVariable.appender = GlobalVariable.appender + (jobj.opt(key) + ",").toString();
				}
				
			}
			return GlobalVariable.appender;
	}
	
	public static class GlobalVariable {
		public static String appender = "";
	}
	
}
