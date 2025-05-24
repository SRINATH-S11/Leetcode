class Solution {
    public int countSegments(String s) {
        int count = 0;
        int a = s.length();
        for(int i = 0 ; i<a ; i++)
        {
            if((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ')
            {
                count++;
            }
        }
        return count;
    }
}