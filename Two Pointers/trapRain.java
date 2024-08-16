public class trapRain {
    public int trapRainWater(int[] ht){
        if (ht == null || ht.length == 0) {
            return 0;
        }
        int res=0;
        int l=0,r=ht.length-1;
        int maxl =0;
        int maxr = 0;

        while (l<r) {
            if(ht[l]<ht[r]){
                if(ht[l]>=maxl){
                    maxl = ht[l];
                }else{
                    res+= maxl-ht[l];
                }
                l++;
            }else{
                if(ht[r]>=maxr){
                    maxr=ht[r];
                }else{
                    res+= maxr - ht[r];
                }
                r--;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        trapRain obj = new trapRain();
        int[] heights = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(obj.trapRainWater(heights));
    }
}
