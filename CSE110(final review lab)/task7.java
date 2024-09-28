//Strings + Arrays
//Task 3
public class task7 {
    public static void main(String[] args) {
        String[] email_list = {"abc@gmail.com", "!@cv.bd", "123cse@bracu.ac.bd"};
        int count = 0;

        for (int i = 0; i < email_list.length; i++) {
            String fs = email_list[i];
            boolean isValid = true;
            boolean atFound = false;

            if (!((fs.charAt(0) >= 'a' && fs.charAt(0) <= 'z') || (fs.charAt(0) >= 'A' && fs.charAt(0) <= 'Z'))) {
                // First character must be a letter
                isValid = false;
            }

            for (int j = 0; j < fs.length(); j++) {
                char c = fs.charAt(j);

                if (c == '@') {
                    if (j == 0 || j == fs.length() - 1) {
                        // '@' cannot be the first or last character
                        isValid = false;
                        break;
                    }

                    char cb = fs.charAt(j - 1); // Character before '@'
                    char ca = fs.charAt(j + 1); // Character after '@'

                    if (!((cb >= 'a' && cb <= 'z') || (cb >= 'A' && cb <= 'Z'))) {
                        // Check if the character before '@' is a letter
                        isValid = false;
                        break;
                    }

                    if (!(ca >= 'a' && ca <= 'z')) {
                        // Check if the character after '@' is a valid letter
                        isValid = false;
                        break;
                    }

                    atFound = true;
                    boolean dotFound = false;
                    for (int k = j + 2; k < fs.length(); k++) {
                        char ch = fs.charAt(k);
                        if (ch == '.') {
                            if (k == fs.length() - 1) {
                                // '.' cannot be the last character
                                isValid = false;
                                break;
                            }
                            dotFound = true;
                            break;
                        }
                    }

                    if (!dotFound) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && atFound) {
                count++;
            }
        }

        System.out.println(count); // Output the number of valid emails
    }
}
