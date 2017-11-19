package ru.nik66.practices.practice2;

import java.io.*;

public class FileUtils {

    public static String readResources(String filename, String charset) {

        StringBuilder stringBuilder = new StringBuilder();
        String s;

        // Доступ к ресурсам:
        // Берем наш класс из метаспейса, получаем его загрузчик класса, который знает
        // где лежит сам класс, от него мы получаем инпут стрим этого ресурса и
        // указываем название нужного файла
        InputStream inputStream = FileUtils.class.getClassLoader().getResourceAsStream(filename);
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset))) {
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s).append("\n");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

}
