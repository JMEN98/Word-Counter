import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("readwords.txt");
        Scanner flieInput = new Scanner(fin);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        while (flieInput.hasNext()){
            String nextWord = flieInput.next();
            if (words.contains(nextWord)){
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index) +1);
            }
            else {
                words.add(nextWord);
                count.add(1);
            }

        }

       flieInput.close();
        fin.close();

        for(int i =0; i < words.size();i++){
            System.out.println(words.get(i)+"occurred"+ count.get(i)+"times(s");

        }
    }
}