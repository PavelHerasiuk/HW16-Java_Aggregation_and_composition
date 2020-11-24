package by.epam.text.main;

// 1. Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Main {

    public static void main(String[] args) {
        Word heading = new Word("         The story of a simple days");
        String line1 = "This is a simple text with no meaning. This is the second sentence." +
                " We continue our story without meaning.\n";
        Sentence sentence = new Sentence(line1);
        Text story = new Text(heading, sentence);

        String line2 = "The weather is good today, but there is no sun. After lunch, " +
                "it may rain as black clouds are coming from the West.\n";
        String line3 = "It didn't rain, but there was a strong wind. Several trees were broken." +
                "In the evening, the sun was shining. End of history.\n";

        story.addSentence(new Sentence(line2));
        story.addSentence(new Sentence(line3));

        story.printHeading();
        story.printText();
    }
}