
import java.util.*;

public class Main {

    public static void main(String[] args){
        System.out.println(isAnagram("car", "arc"));
    }

    public static boolean isAnagram(String a, String b){
        if(a == null || b == null || a.length() != b.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        //First loop to populate the map
        for(char keyCharacter : a.toCharArray()) {

            if(map.containsKey(keyCharacter) == false){
                map.put(keyCharacter, 1);
            }else{
                map.put(keyCharacter, map.get(keyCharacter) + 1);
            }
        }

        //get: gets the value of the key
        for(char keyCharacter : b.toCharArray()){

            //edge case if the hashmap does not contain the key
            if(map.containsKey(keyCharacter) == false){
                return false;
            }else{
                //update the key, value pair
                map.put(keyCharacter, map.get(keyCharacter) - 1);

                //if the key's value equals 0 then remove it
                if(map.get(keyCharacter) == 0){
                    map.remove(keyCharacter);
                }
            }
        }
        // removed all key and value pairs after checking the second string
        return map.isEmpty();
    }
}
