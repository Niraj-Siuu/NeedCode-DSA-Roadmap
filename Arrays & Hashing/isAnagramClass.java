import java.util.HashMap;
 
class isAnagramClass {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<>();
        char[] s1= s.toCharArray();
        HashMap<Character, Integer> hmt = new HashMap<>();
        char[] t1= t.toCharArray();
        
        if(s1.length==t1.length){
            System.out.println("if out");
            for(int i=0;i<s1.length;i++){
                if(hms.containsKey(s1[i])){
                    hms.put(s1[i],(hms.get(s1[i]))+1);
                }else{
                    hms.put(s1[i],1);
                }
                    }
            for(int i=0;i<t1.length;i++){
                if(hmt.containsKey(t1[i])){
                    hmt.put(t1[i],(hmt.get(t1[i]))+1);
                }else{
                    hmt.put(t1[i],1);
                }
            }
            
            if(hms.equals(hmt)){
                            System.out.println("if in");

                return true;
            }
            else{
                            System.out.println("else in");

                return false;
            }
        }
        else{

                        System.out.println("else out");

            return false;
        }
    }
}