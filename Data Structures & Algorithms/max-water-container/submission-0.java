class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int h=heights.length-1;
        int max=0;
        while(l<h){
            int height=Math.min(heights[l],heights[h]);
            int width=h-l;
            max=Math.max(max,height*width);
            if(heights[l]>heights[h])
            h--;
            else 
            l++;
        }
        return max;
    }
}
