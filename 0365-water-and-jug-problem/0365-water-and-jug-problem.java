class Solution {
    Set<Long> s=new HashSet<>();

    int x,y,target;
    public boolean dfs(int a,int b){
        if((a+b)==target){
            return true;
        }
        long key = (long) a * (y + 1L) + b;

        if(s.contains(key)){
            return false;
        }
        s.add(key);

        int pourAB=Math.min(a,y-b);
        int pourBA=Math.min(b,x-a);
         return dfs(x, b)
            || dfs(a, y)
            || dfs(0, b)
            || dfs(a, 0)
            || dfs(a - pourAB, b + pourAB)
            || dfs(a + pourBA, b - pourBA);

    }
    public boolean canMeasureWater(int x, int y, int target) {

        this.x=x;
        this.y=y;
        this.target=target;

        s.clear();

        if(target==0){
            return true;
        }
        if(target>x+y){
            return false;
        }

        return dfs(0,0);
        
    }
}