class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list = new ArrayList<>();
        int rem = 0;
        while(n>0)
        {
            rem = n % 10;
            list.add(rem);
            n = n/10;
        }
        Collections.sort(list);
        int a = list.size();
        int a1 = list.get(a-1);
        int a2 = list.get(a-2);
        return a1*a2;
    }
}