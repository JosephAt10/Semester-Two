import java.util.Stack;

public class ExcuseLetterStack17 {
    Stack stack = new Stack();

    void submitLetter(ExcuseLetter17 letter) {
        stack.push(letter);
    }

    ExcuseLetter17 processLetter() {
        if (!stack.isEmpty()) {
            return (ExcuseLetter17) stack.pop();
        }
        return null;
    }

    ExcuseLetter17 viewLatestLetter() {
        if (!stack.isEmpty()) {
            return (ExcuseLetter17) stack.peek();
        }
        return null;
    }

    boolean searchLetter(String name) {
        for (Object obj : stack) {
            ExcuseLetter17 letter = (ExcuseLetter17) obj;
            if (letter.name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
