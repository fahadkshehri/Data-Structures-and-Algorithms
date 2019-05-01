public class Main {

    public static void main(String[] args){

        String[] strs = new String[6];
        strs[0] = ("eat");
        strs[1] = ("tea");
        strs[2] =("tan");
        strs[3] = ("ate");
        strs[4] = ("nat");
        strs[5] = ("bat");
        

        groupAnagrams(strs);
        
    }

    /**
     * Group an array of strings to its mapped list of anagrams
     * @param strs array of words
     * @return the mapped list of lists where each list contains the anagrams
     */
    public static List<List<String>> groupAnagrams(String[] strs){

        if(strs == null || strs.length == 0){
            return null;
        }

        //List of List of strings to return
        List<List<String>> groupedAnagrams = new ArrayList<>();
        //Map string as a key to the list that it belongs to
        HashMap<String, List<String>> map = new HashMap<>();
        //loop through each word
        //covert each word to characters array
        //Sort the characters array of each word
        //Convert the character word back to string
        //Add the word into its list if it exists by using get (key).add
        //Add the string as a new key with a new list
        for(String word: strs){
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedWord = charArr.toString();

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());

            }
                map.get(sortedWord).add(word);
        }

        groupedAnagrams.addAll(map.values());
        System.out.println(map.values());

        return groupedAnagrams;
    }