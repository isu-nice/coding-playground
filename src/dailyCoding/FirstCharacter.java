package dailyCoding;

public class FirstCharacter {
    public String firstCharacter(String str) {
        if (str.isEmpty()) {
            return "";
        }

        String[] texts = str.split(" ");

        StringBuilder result = new StringBuilder();
        for (String text : texts) {
            result.append(text.charAt(0));
        }

        return result.toString();
    }
}