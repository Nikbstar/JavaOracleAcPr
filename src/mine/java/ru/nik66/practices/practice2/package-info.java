package ru.nik66.practices.practice2;
/**
        Практическое занятие 2
        Регулярныу выражения. Обработка строк.

        Задание
    Используя регулярные выражения создать программу для парсинга (синтаксического анализа)
 текстовой информации из HTML документа.
    Программа должна считывать текст из файла, находить необходимые данные, создавать
 соответствующий объект класса описывающего структуру данных и добавлять эти объекты в
 ArrayList. Вывести все значения в консоль.

    1. Облегченный выриант задания.
    Ежегодно на сайте Social Security Online состфаляют на основании статистических данных
 рейтинг самых популярных мужских и женских имен, которыми родители называют своих детей в США.
 Данные рейтинга за 2008 год представлены в виде таблицы и находятся в файле PopularBabyNamesTop100.htm.
    Необходимо изучить структуру HTML документа и составить регулярное выражение для парсинга
 данных рейтинга.
    Создать класс, описывающий позицию рейтинга и класс описывающий парсер, в котором будет
 метод обработки html документа.

    2. Усложненный вариант задания.
    Есть файл с прайс-листом ноутбуков. Изучить структуру HTML документа и составить регулярное
 выражение для парсинга данных об ассортименте продаваемых ноутбуков (название модели, описание,
 цена и т.п.).
    Сздать класс, описывающий ноутбук и класс для парсера, в котором бодет метод обработки html
 документа.

 Комментарий:
    Класс описывающий рейтинг три поля: порядковый номер в рейтинге, имя мужское, имя женское.
    Класс парсер (общий для двух заданий), содержащий две константы с регулярными выражениями для
 задания 1 и 2, метод чтение из файла (принимает имя файла, возвращает строку), статическим
 методом парсинга имен и статический метод для парсинга компьютеров, которые принимают путь к
 файлу и возвращает лист объектов рейтингов.

 Перекодирование текста при чтении из афйла
 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("source.html"), "windows-1251"));
 String s = null;
 StringBuilder bs = new StringBuilder();
 while ((s = br.readLine()) != null) {
    sb.append(s).append(System.getProperty("line.separator"));
 }




 */