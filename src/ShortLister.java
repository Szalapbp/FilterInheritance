import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShortLister
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Choose a text file");
        int result = chooser.showOpenDialog(null);

        if(result == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            List<String> list = new ArrayList<String>();
            ShortWordFilter filter = new ShortWordFilter();

            try(BufferedReader reader = new BufferedReader(new FileReader(file)))
            {
                String line;
                while((line = reader.readLine()) != null)
                {
                    String[] words = line.split(" ");
                    for(String word : words)
                    {
                        if(filter.accept(word))
                        {
                            list.add(word);
                        }
                    }
                }

            }catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("Short Words:");
            for (String word : list){
                System.out.println(word);
            }

        }
    }
}
