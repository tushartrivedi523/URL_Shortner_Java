package main;

import java.util.*;
import java.util.Map.Entry;

class URLShortnerClass {
	
	HashMap<String,String> hm = new HashMap<>();
	  static String getAlphaNumericString(int n)
	    {
	  
	        // chose a Character random from this String
	        String AlphaNumericString =  "abcdefghijklmnopqrstuvxyz"
	        							+"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "0123456789";
	                                
	        StringBuilder sb = new StringBuilder(n);
	  
	        for (int i = 0; i < n; i++) {
	            int index
	                = (int)(AlphaNumericString.length()
	                        * Math.random());
	  	            sb.append(AlphaNumericString
	                          .charAt(index));
	        }
	  
	        return sb.toString();
	    }
	public String convertToShortURL(String url)
	{
		String shortUrl = "https://www.tstnr.com/";
		
		if(!hm.containsKey(url))
		{
			Random rand = new Random();
			int n = rand.nextInt(url.length() - 4) + 4;
			shortUrl += getAlphaNumericString(n);
			hm.put(url, shortUrl);
			return shortUrl;
		}
		else
		{
			return hm.get(url);
		}
		
	}
	public String convertToOriginalURL(String url)
	{
		if(!hm.containsValue(url))
		{
			return null;
		}
		else
		{
			for(Entry<String, String> entry: hm.entrySet()) {
				if(entry.getValue().equals(url))
				return entry.getKey();
			}

		}
		return null;
	}

}
