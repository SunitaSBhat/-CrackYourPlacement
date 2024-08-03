class sameCharactersInTwoStrings
{ 
    int sameChar(String A, String B) 
    {
        int i=0; 
       int count=0;
       String C=A.toLowerCase();
       String D=B.toLowerCase();
       while(i<A.length()){
           if(C.charAt(i)==D.charAt(i)){
               count++;
           }
           i++;
       }
       return count;
        // code here
    }
} 