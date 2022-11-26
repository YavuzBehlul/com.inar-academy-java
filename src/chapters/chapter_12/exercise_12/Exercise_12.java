package chapters.chapter_12.exercise_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the path of file: ");
        String path = new Scanner(System.in).nextLine();

        File file = new File(path);

        if (!file.exists())
        {
            System.out.println(file.getName() + " doesn't exist!");
            System.exit(1);
        }

        endOfLineBraceStyle(file);
    }

    public static void endOfLineBraceStyle(File file) throws IOException
    {
        String str = "";

        try (Scanner input = new Scanner(file);)
        {
            while (input.hasNext())
            {
                str += input.nextLine() + "\n";
            }
        }

        str = str.replaceAll("\n\\s*\\{", " {");

        try (PrintWriter output = new PrintWriter(file);)
        {
            output.print(str);
        }
    }
}
