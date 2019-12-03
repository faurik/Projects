public class PigLatin {
    private static final String PIG = "ay";
    private static final String VOWEL = "^[aeiou].*";

    public static String convertToPigLatin(String in) {
        String[] words = in.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            // if word starts with vowel letter, then just add PIG at the end
            if (words[i].matches(VOWEL)) {
                result.append(words[i].concat(PIG));
            } else {
                StringBuilder consonants = new StringBuilder();
                for (int j = 0; j < words[i].length(); j++) {
                    if (!VOWEL.contains(words[i].substring(j, j + 1)))
                        consonants.append(words[i].charAt(j));
                    else
                        break;
                }
                result.append(words[i]
                                .substring(consonants.length())
                                .concat(consonants.toString())
                                .concat(PIG));
            }
            if ((i + 1) < words.length)
                result.append(" ");
        }
        return result.toString();
    }
}
