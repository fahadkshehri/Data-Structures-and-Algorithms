public static void main(String[] args){

        String paragraph = "Suppose we have a set of English text documents and wish to rank which document is most relevant to the query, " +
                "the brown cow. A simple way to start out is by document eliminating documents that do not contain all three words the,brown, and cow, " +
                "but this still leaves many documents. To further distinguish document them, we might count the number of times each term occurs in each document; " +
                "the number of times a term occurs in a document is called its term frequency";

        ArrayList<String> wordToExclude = new ArrayList<>();
        wordToExclude.add("a");
        wordToExclude.add("of");
        wordToExclude.add("is");
        wordToExclude.add("to");
        wordToExclude.add("and");
        wordToExclude.add("by");
        wordToExclude.add("the");

        System.out.println(findMostCommonWords(paragraph, wordToExclude));

    }


    public static String findMostCommonWords(String paragraph, ArrayList<String> wordToExclude){

        String lower = paragraph.toLowerCase();
        String[] words = lower.split(" ");

        // populating the map while ignoring the banned words
        HashMap<String, Integer> map = new HashMap<>();
        for (String word: words) {
            if(word.trim().length() == 0 ){
                continue;
            }
            if(wordToExclude.contains(word.trim().toLowerCase())) continue;
            if(map.containsKey(word) == false){
                map.put(word, 1);
            }else{
                map.put(word, map.get(word) +1);
            }
        }
        //finding the max word
        String maxWord = null;
        for(String word : map.keySet())
            if(maxWord == null || map.get(word) > map.get(maxWord))
                maxWord = word;
        return maxWord;

    }
