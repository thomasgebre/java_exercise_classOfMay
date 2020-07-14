package com.classofmay;

public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		public class StringHandlerClasss {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				String name= "James";
				name.concat(" Bond"); // name= James Bond
				System.out.println(name.concat(" Bond"));
				System.out.println(name);
				
				String str1 = new String("Hello world");
				
				  String strnew = "I" + " Like" + " Java" + " Language";
				  
				  System.out.println(strnew);
				  
				  String strnew2 = "hel lo";
				  System.out.println(strnew2.length());
				  
				  String  str2 = "This is Hanif";
				  System.out.println(str2.charAt(4));
				  
				  
				  String str3 = "Ismail";
				  String str4 = "ismail";
				
				  if(str3.equalsIgnoreCase(str4)){
				   System.out.println("The two strings are EQUAL");
				}
				else { 
				System.out.println("The two strings are NOT equal");
				}

				  
				  String str5 = "q567867A56";
				  char ch;  
				  for(int i = 0;i<str5.length();i++){
				       ch = str5.charAt(i);
				       System.out.println(ch);
				       if(Character.isLetter(ch)){
				          continue;
				          }
				        else{
				          System.out.println("String contains NON letters");
				         }
				}
				  
				  
				  String str7  =  "Today is holiday Tomorrow is working day";
				  int loc = str7.indexOf("holiday");
				  System.out.println("Position of holiday:" + loc);
				  String sub1 = str7.substring(9,16); 
				  System.out.println(sub1);

				   String[] ar1 = str7.split(" ");
			    	 for(int i=0;i<ar1.length;i++){
			    		  System.out.println(ar1[i]); 
			    	 }
			    	 
			    	 
			    	   String str8 ="abdu";
			    	   String str9 ="abdi";

			    	    int  b1 = str8.compareToIgnoreCase(str9);
			    	    System.out.println(b1); 
			    	    
			    	    String str10  =  "Hellollllllllllllllllllllllllllllllllllllll.                   ";
			    	    String str11  = str10.replace('l','w');
			    	    System.out.println(str11); 
			    	    
			    	    String str12 = str10.trim();
			    	    System.out.println(str10.length()); 
			    	    System.out.println(str12.length()); 
			}

		}

	}

}
