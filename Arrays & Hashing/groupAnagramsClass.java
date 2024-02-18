public class groupAnagramsClass {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray); 
            String sortedWord = new String(charArray);
            
            if (anagramGroups.containsKey(sortedWord)) {
                anagramGroups.get(sortedWord).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                anagramGroups.put(sortedWord, group);
            }
        }
        
        return new ArrayList<>(anagramGroups.values());
    }
}
 {
    
}
