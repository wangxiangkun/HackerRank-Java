/*
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

@Output Format
Return true if a and b are case-insensitive anagrams of each other; otherwise, return false instead.
*/

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arryA = a.toLowerCase().toCharArray();
        char[] arryB = b.toLowerCase().toCharArray();
        Arrays.sort(arryA);
        Arrays.sort(arryB);

        return Arrays.equals(arryA, arryB);
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


//The right way:
static boolean isAnagram(String a, String b) {
    // Complete the funciton
        if(null == a || null == b || a.equals("") || b.equals("")) {
            return false;
        }

        if(a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            if(map.containsKey(letter)) {
                Integer frequency = map.get(letter);
                map.put(letter, ++frequency);
            } else {
                map.put(letter, 1);
            }
        }

        for(int j = 0; j < b.length(); j++) {
            char letter = b.charAt(j);
            if(!map.containsKey(letter)) {
                return false;
            }
            Integer frequency = map.get(letter);
            if(frequency == 0) {
                return false;
            } else {
                map.put(letter, --frequency);
            }
        }

        return true;
}