package ru.nik66.practices.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

   public static final String POPULAR_BABY_NAME_REGEX = "<td>(?<rang>\\d+)<\\/td> <td>(?<male>\\w+)<\\/td> <td>(?<female>\\w+)<\\/td>";
   public static final String NOTEBOOK_REGEX = "<p class=\"name\"><a href=\".+\">Ноутбук (?<model>.+)<\\/a><\\/p><p class=\"description\">(?<description>[\\s\\S]+?)<\\/p>.+<span class=\"price cost\">(?<price>\\d+)&.+<\\/span>";

   public static List<PopularBabyName> popularBabyNamesParser(String fileName, String charset) {
       List<PopularBabyName> popularBabyNameList = new ArrayList<>();
       String string = FileUtils.readResources(fileName, charset);

       Pattern pattern = Pattern.compile(POPULAR_BABY_NAME_REGEX);
       Matcher matcher = pattern.matcher(string);
       while (matcher.find()) {
           popularBabyNameList.add(new PopularBabyName(
                   Integer.parseInt(matcher.group("rang")),
                   matcher.group("male"),
                   matcher.group("female")));
       }

       return popularBabyNameList;
   }

   public static List<Notebook> notebooksParser(String fileName, String charset) {
       List<Notebook> notebooks = new ArrayList<>();
       String string = FileUtils.readResources(fileName, charset);

       Pattern pattern = Pattern.compile(NOTEBOOK_REGEX);
       Matcher matcher = pattern.matcher(string);
       while (matcher.find()) {
           notebooks.add(new Notebook(
                   matcher.group("model"),
                   matcher.group("description"),
                   Integer.parseInt(matcher.group("price"))
           ));
       }

       return notebooks;
   }

}
