package String.LeetCode;


import java.util.HashMap;

/*
  Given a string, find the first non-repeating unique character in it and return its index,
  if it does not exist return -1
 */
class Solution{
    public int firstUniqueCharacter(String s ){
        /*we have to keep track of things when they occured
          beacuse unique character occurs only once.
          so I think HashMap is useful here

       */

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        //This hashmap is goin to map a alphabitcal characters to its index within a string

        //so we are iterating through a string using for loop.

        for(int i=0; i<=s.length(); i++){
            char current = s.charAt(i);
            //now we are checking to conditions here
            if(!map.containsKey(current)){
                map.put(current,i);
            }else {
                map.put(current,-1);
            }
        }
   return -1;
    }
}
