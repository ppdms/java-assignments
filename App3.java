// Vasileios Papadimas 3220150

import java.io.IOException;

public class App3 {
        public static void main(String[] args) {
                int words = 0;
                boolean state = false;
                try {
                        for (int c = 0; c != 42; c = (int) System.in.read()) {
                                if ((65 <= c && c <= 90) || (97 <= c && c <= 122)) {
                                        if (state) continue;
                                        else {
                                                state = true;
                                                words++;
                                        }
                                } else {
                                        if (state) state = false;
                                }
                        }
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
                System.out.println(words);
        }
}
