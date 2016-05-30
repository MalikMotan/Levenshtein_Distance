/**
 **  Java Program to implement Wagner Fischer Algorithm; in order to find the Edit(levenshtein) distance.
 **/ 
public class Distance
{
    /** Function to get Levenshtein distance between 2 strings **/

   
    public int getLevenshteinDistance(String target, String source)
    {    
		//calculating the length of each one of the two strings- source and target strings.
        int len1 = target.length();
        int len2 = source.length();
     
        // defining the two initial cases where E(i,0)=i amd E(0,j)=j-------------
        int[][] arr = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++)
            arr[i][0] = i;
        for (int i = 1; i <= len2; i++)
            arr[0][i] = i;
      // End of initial cases difinition------------------------------------------
        
        /**
         * Here, the two loops iterate to implement the Wagner-Fischer dynamic programming algorithm in order to 
         * find Levenshtein distance with a O(n^2) time.
         */
        for (int i = 1; i <= len1; i++)
        {
            for (int j = 1; j <= len2; j++)
            {
                int m = (target.charAt(i - 1) == source.charAt(j - 1)) ? 0:1;                        
                arr[i][j] = Math.min(Math.min(arr[i - 1][j] + 1, arr[i][j - 1] + 1), arr[i - 1][j - 1] + m);
               
              }
            }          
        //================================================================================================
   
        /**Checking to see if the characters at this position match, so the substitution cost will be 0; therefore no
         * substitution will be done and we will check insertion and deletion 
         */

           //i=t= target , j=s=source
            int t = target.length(), s = source.length();

            //-----cases start here----------------------------------------------------
            while (t>-1 && s>-1)
            {
         // both strings are empty
                if (t == 0 && s == 0)
                {
         
                    break;
             
                }
                // target string is empty(nothig) and there is a source string
                 if (t == 0 && s > 0)
                {
                	   
                	 GUI.add("\n The whole source string was deleted");
           
               	break;
              }
                 //source string is empty and there is a target string
                else if (t > 0 && s == 0)
                {
              	 	 GUI.add("\n The whole target string was inserted");
               
               break;
              }
                else
                {
                	// here the two strings exist(none is empty), so either one of three cases:
                    if (arr[t - 1][ s - 1] <= arr[t - 1][ s] && arr[t - 1][ s - 1] <= arr[t][ s - 1])
                    {
                    // either there is a match a that character, or no match
                    	if (arr[t - 1][ s - 1] == arr[t][s])
                   	 	 GUI.add("\n There was a match at character "+"("+target.charAt(t-1)+")"+", index of "+target.indexOf(target.charAt(t-1))+"(Target)");
                    		
                        else
                        	 GUI.add("\n There was a substitutiom at character "+"("+target.charAt(t-1)+")"+", index of "+target.indexOf(target.charAt(t-1))+"(Target)");
                        t--;
                        s--;
                    }
                    // insertion case, where the target string is longer than source
                    else if (arr[t - 1][ s] <arr[t][ s - 1])
                    {
                    	 GUI.add("\n The character "+"("+ target.charAt(t-1)+")"+" was inserted"+" at index of "+target.indexOf(target.charAt(t-1))+"(Source)");
                   
                        t--;

                    }
                 // deletion case, where the source string is longer than target
                    else if (arr[t][ s - 1] < arr[t - 1][ s])
                    {
                    	 GUI.add("\n The character "+"("+source.charAt(s-1)+")"+" was deleted"+" at index of "+source.indexOf(source.charAt(s-1))+"(Source)");
                         
                        s--;
                    }
    //cases end here--------------------------------------------------------------------------------------------
                }
            }
            GUI.add5("                ");
            GUI.add6("\n");
            
            for (int i=0; i <= len1-1; i++)
            {
            	GUI.add5(target.charAt(i)+"          ");
             
            }
     
            for (int j=0; j <= len2-1; j++)
            {
                GUI.add6("\n"+source.charAt(j)+"\n");
              	  
            }
            
            //-------------- now printing the alignment path---------------------------
            for (int i=0; i <= len1; i++)
            {
            
                for (int j=0; j<= len2; j++)
                {
               
                	GUI.add2((int)arr[i][j]+"          ");
                }
                GUI.add2("\n\n");
            }
           	
    
  return arr[len1][len2];
        
        }
}