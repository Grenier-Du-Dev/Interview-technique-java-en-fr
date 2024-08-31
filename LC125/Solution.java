class Solution{


    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase(); 
        
        StringBuilder builder = new StringBuilder();
        
        for(int i=0; i!=s1.length(); i++){
            if(Character.isLetter(s1.charAt(i))){
                builder.append(s1.charAt(i));
            }

            if(Character.isDigit(s1.charAt(i))){
                builder.append(s1.charAt(i));
            }
        }

        String s2 = builder.toString();
        String s3 = builder.reverse().toString();
        
        if(s2.equals(s3)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}