// задание: записать слово TEST в файл 10 раз

import java.io.File;
import java.io.FileWriter;

public class Task_10 {
    public static void main(String[] args) {
        Integer n = 10;
        String text = "TEST";
        String file_name = "1.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,true);
            for (int i = 0; i < n; i++){
                writer.write(text);
                writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось!)");
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }
}