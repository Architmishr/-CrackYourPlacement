class Solution {
    public boolean isValid(String s) {
        char[] temp = new char[s.length()];
        int j=-1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                j++;
                temp[j] = s.charAt(i);
            }else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(j==-1){
                    return false;
                }else if(temp[j] == '(' && s.charAt(i) == ')'){
                    j--;
                }else if(temp[j] == '{' && s.charAt(i) == '}'){
                    j--;
                }else if(temp[j] == '[' && s.charAt(i) == ']'){
                    j--;
                }else{
                    return false;
                }
            }
        }
        if(j == -1){
            return true;
        }else{
            return false;
        }
    }
}
