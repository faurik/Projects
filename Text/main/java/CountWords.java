import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountWords {
    public static int countUniqueWords(String in) {
        //return new HashSet<>(Arrays.asList(in.split("\\s+"))).size();
        Set<String> uniqueWords = new HashSet<>();
        for (String word : in.split("\\s+")) uniqueWords.add(word.toLowerCase());
        return uniqueWords.size();
    }

    public static int countUniqueWords(File in) {
        int count;
        try (BufferedReader reader = new BufferedReader(new FileReader(in))) {
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null)
                contentBuilder.append(line).append(" ");
            count = countUniqueWords(contentBuilder.toString());
        } catch (IOException ex) {
            count = -1;
        }
        return count;
    }
}
