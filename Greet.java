public class Greet {
    public String getGreeting(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            return "I am male, nice to meet you";
        } else if (gender.equalsIgnoreCase("female")) {
            return "I am female, nice to meet you";
        }
        return "Nice to meet you";
    }
}