package dailyCoding;

public class LetterCapitalize {
    public String letterCapitalize(String str) {

        String[] sentence = str.split(" ");

        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].isEmpty()) {
                continue;
            }
            String first = String.valueOf(sentence[i].charAt(0))
                    .toUpperCase();
            sentence[i] = first + sentence[i].substring(1);
        }

        return String.join(" ", sentence);
    }
}
