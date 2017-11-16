package ru.nik66.lessons.lesson3.strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        String s1 = "mama mila ramu";

        // сравнить начало или конец строки
        String suffix = "ramu";
        System.out.println(s1.endsWith(suffix));
        String prefix = "ma";
        System.out.println(s1.startsWith(prefix));
        // Сравнить начало со смещением
        s1.startsWith(prefix, 2);

        // Сравнить s1 начиная с 5 символа с s2 начиная с 6 символа, сравнить 3 символа.
        String s2 = "Vasya mil mashinu";
        System.out.println(s1.regionMatches(5, s2, 6, 3));

        // Поиск в строке
        System.out.println(s1.indexOf("mi"));
        // s1.indexOf("mi", 3);
        // s1.lastIndexOf("mi");

        // Разделене по символу пробел (в кавычках список разделителей)
        // !Устарело!
        StringTokenizer st = new StringTokenizer(s1, " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Разделение строки на лексемы (в кавычках регулярное выражение)
        String s3 = "3 4 7 2, 44 5";
        Scanner sc = new Scanner(s3).useDelimiter(" ");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt() + 2);
        }

        // Разбить строку в массив по регулярному выражению
        String[] strings = s3.split("[ ,]+");
        System.out.println(Arrays.toString(strings));

        String s4 = "mama and papa mili ramu";

        Pattern pattern = Pattern.compile("[mp]a[mp]a");

        // найти все теги в хтмл странице
        // Жадный квантификатор - берет по максимуму, останавливается на последнем ">"
        //findRegexInText(htmlText, "<.*>").forEach(aa -> System.out.println("0)" + aa));
        // Ленивый квантификатор - останавливается при первом попавшемся ">"
        findRegexInText(htmlText, "<.*?>").forEach(aa -> System.out.println("0)" + aa));

        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, " +
                "Hugo-city 56010, Ph: 9876543210, Email: ldan_ny@myworld.com. " +
                "Maggi Myer, Post bag no 52, Big bank post office, " +
                "Big bank city 56000, ph: 9876501234, Email: m._a2.-g.gi@my_universe.ua.12345";
        // Найти все постовые индексы из 5-ти цифр (каряво)
        findRegexInText(str, "\\b\\d{5}\\b").forEach(aa -> System.out.println("1)" + aa));
        // Найти все email'ы (каряво)
        findRegexInText(str, "[\\w\\.]+@[\\w\\.]+\\b").forEach(aa -> System.out.println("2)" + aa));

        // Группы
        Pattern pattern1 = Pattern.compile("\\b(\\d{3})(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern1.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }

    static String htmlText = "<html lang=\"en\">" +
            "<head>" +
            "  <meta charset=\"UTF-8\">" +
            "  <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">" +
            "  <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"default\">" +
            "  <meta name=\"mobile-web-app-capable\" content=\"yes\">" +
            "  <meta name=\"HandheldFriendly\" content=\"True\">" +
            "  <meta name=\"MobileOptimized\" content=\"320\">" +
            "  <meta name=\"format-detection\" content=\"telephone=no\">" +
            "  <meta name=\"title\" content=\"Regex101\">" +
            "  <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />" +
            "  <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"/apple-icon-57x57.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"/apple-icon-60x60.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"/apple-icon-72x72.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"/apple-icon-76x76.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"/apple-icon-114x114.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"/apple-icon-120x120.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"/apple-icon-144x144.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"/apple-icon-152x152.png\">" +
            "  <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"/apple-icon-180x180.png\">" +
            "  <link rel=\"icon\" type=\"image/png\" href=\"/favicon-16x16.png\" sizes=\"16x16\">" +
            "  <link rel=\"icon\" type=\"image/png\" href=\"/favicon-32x32.png\" sizes=\"32x32\">" +
            "  <link rel=\"icon\" type=\"image/png\" href=\"/favicon-96x96.png\" sizes=\"96x96\">" +
            "  <link rel=\"icon\" type=\"image/png\" href=\"/android-icon-192x192.png\" sizes=\"192x192\">" +
            "  <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">" +
            "  <meta name=\"keywords\" content=\"javascript,regex,regular expression,debugger,explainer,helper,tester,match,pcre,php,golang,python,editor\">" +
            "  <meta name=\"description\" content=\"Online regex tester, debugger with highlighting for PHP, PCRE, Python, Golang and JavaScript.\">" +
            "  <meta name=\"author\" content=\"Firas Dib\">" +
            "  <meta property=\"twitter:card\" content=\"summary\">" +
            "  <meta property=\"twitter:site\" content=\"@regex101\">" +
            "  <meta property=\"twitter:title\" content=\"Regex101 - online regex editor and debugger\">" +
            "  <meta property=\"twitter:description\" content=\"Regex101 allows you to create, debug, test and have your expressions explained for PHP, PCRE, Python, Golang and JavaScript. The website also features a community where you can share useful expressions.\">" +
            "  <meta property=\"twitter:creator\" content=\"@regex101\">" +
            "  <meta property=\"twitter:image\" content=\"//regex101.com/preview.png\">" +
            "  <meta property=\"twitter:domain\" content=\"regex101.com\">" +
            "  <title>Online regex tester and debugger: PHP, PCRE, Python, Golang and JavaScript</title>" +
            "  <link rel=\"stylesheet\" type=\"text/css\" href=\"/main.css\">" +
            "  <script>" +
            "    window.__INITIAL_STATE__ = '%7B%22rightSidebar%22%3A%7B%22subsection%22%3A%22EXPLANATION%22%2C%22EXPLANATION%22%3Atrue%2C%22MATCH_INFO%22%3Atrue%2C%22QUICKREF%22%3Atrue%7D%2C%22regexEditor%22%3A%7B%22showSubstitution%22%3Afalse%2C%22flavor%22%3A%22pcre%22%2C%22delimiter%22%3A%22%2F%22%2C%22flags%22%3A%22g%22%2C%22regex%22%3A%22%22%2C%22testString%22%3A%22%22%2C%22matchResult%22%3A%7B%22data%22%3A%5B%5D%2C%22time%22%3A0%7D%2C%22error%22%3Anull%2C%22substString%22%3A%22%22%2C%22hasUnsavedData%22%3Atrue%2C%22unitTestsActive%22%3Afalse%7D%2C%22settings%22%3A%7B%22maxExecutionTime%22%3A2000%2C%22theme%22%3A%22light%22%2C%22nonParticipatingGroups%22%3Afalse%2C%22displayWhitespace%22%3Afalse%2C%22colorizeSyntax%22%3Atrue%2C%22autoComplete%22%3Afalse%2C%22wrapLines%22%3Atrue%2C%22testAreaLineNumbers%22%3Afalse%2C%22regexAreaLineNumbers%22%3Afalse%2C%22language%22%3A%22English%22%2C%22storageSaved%22%3Anull%2C%22storageLoaded%22%3Anull%2C%22editorTooltips%22%3Atrue%2C%22alwaysCollapseLeftSidebar%22%3Afalse%2C%22alwaysCollapseRightSidebar%22%3Afalse%2C%22defaultFlavor%22%3A%22pcre%22%7D%2C%22unitTests%22%3A%7B%22tests%22%3A%5B%5D%2C%22editTest%22%3A%7B%22test%22%3A%7B%7D%2C%22id%22%3A-1%7D%2C%22testsRunning%22%3Afalse%7D%2C%22general%22%3A%7B%22permalinkFragment%22%3Anull%2C%22version%22%3Anull%2C%22deleteCode%22%3Anull%2C%22userId%22%3Anull%2C%22email%22%3Anull%2C%22profilePicture%22%3Anull%2C%22serviceProvider%22%3Anull%2C%22isFavorite%22%3Afalse%2C%22isLibraryEntry%22%3Afalse%2C%22title%22%3Anull%2C%22cookie%22%3A%22%22%7D%2C%22account%22%3A%7B%22data%22%3A%5B%5D%2C%22pages%22%3A0%2C%22allTags%22%3A%5B%5D%2C%22staleData%22%3Atrue%7D%2C%22regexLibrary%22%3A%7B%22libraryData%22%3A%5B%5D%2C%22pages%22%3A0%2C%22details%22%3Anull%7D%2C%22libraryEntry%22%3A%7B%22title%22%3Anull%2C%22description%22%3Anull%2C%22author%22%3Anull%7D%7D';" +
            "  </script>" +
            "  <script src=\"/main.js\" async></script>" +
            "</head>" +
            "<body class=\"light\">" +
            "<div id=\"regex-app\"><div class=\"_2ITh2\"><header class=\"qTp7n _3PpQj _1UQZC\"><a href=\"/\" class=\"_1sfyy _2sp9O _13Cpk _198Rl\"><span class=\"_1Dpdr\"><span class=\"_3Wriv\">Regular</span><span class=\"_3Z8iV\">Reg</span></span><span class=\"pJLAE\"><span class=\"_3Wriv\">Expressions</span><span class=\"_3Z8iV\">Ex</span></span><span class=\"_1UZVO\">101</span></a><div class=\"HFUvg\"><a href=\"https://twitter.com/regex101\" class=\"_1sfyy\"><div class=\"_3LSQH _2ipRT _2sYhi _2PLNZ\" style=\"height:28px;width:28px\"><div class=\"kztpV t6LQ_ _2l_ud\"></div></div></a><a href=\"https://www.paypal.com/cgi-bin/webscr?cmd=_donations&amp;business=firas%2edib%40gmail%2ecom&amp;lc=US&amp;item_name=Regex101&amp;no_note=0&amp;currency_code=USD&amp;bn=PP%2dDonationsBF%3abtn_donate_SM%2egif%3aNonHostedGuest\" class=\"_1sfyy\"><div class=\"_3LSQH _2ipRT _1aDRh _2PLNZ\" style=\"height:28px;width:28px\"><div class=\"kztpV _2pWui _2l_ud\"></div></div></a><a href=\"mailto:contact@regex101.com\" class=\"_1sfyy\"><div class=\"_3LSQH _2ipRT _3azOt _2PLNZ\" style=\"height:28px;width:28px\"><div class=\"kztpV Km9ZA _2l_ud\"></div></div></a><a href=\"https://github.com/firasdib/Regex101/issues\" class=\"_1sfyy\"><div class=\"_3LSQH _2ipRT _3N0Hg _2PLNZ\" style=\"height:28px;width:28px\"><div class=\"kztpV _3zkKr _2l_ud\"></div></div></a><a href=\"https://github.com/firasdib/Regex101/wiki\" class=\"_1sfyy\"><div class=\"_3LSQH _2ipRT _1Q8NC _2PLNZ\" style=\"height:28px;width:28px\"><div class=\"kztpV _2-Op2 _2l_ud\"></div></div></a></div></header><div><div style=\"display:none\"><div class=\"_3LSQH _3tCML\" style=\"height:28px;width:28px\"><div class=\"kztpV _30BBK _2l_ud\"></div></div></div><div style=\"display:none\"><div class=\"_3Y3zU\"></div></div></div><div class=\"fy8Gb\"><div class=\"sYX_B\"><div><div style=\"display:none\"><div class=\"_3LSQH _39veZ\" style=\"height:28px;width:28px\"><div class=\"kztpV _30BBK _2l_ud\"></div></div></div><div style=\"display:none\"><div class=\"zEZfA\"></div></div></div><div class=\"_1q2k8\"><div class=\"RV9T4\"><div class=\"_2t_G5\"><div class=\"_2pcE6 _2tmCK\"><span class=\"\">Regular Expression</span><div style=\"display:none\"><div></div></div><div class=\"_2owEq _2ZM28\">No Match</div></div></div><div class=\"_153v9\"><div class=\"oW_T9\"><div class=\"_3bjf5\"><div class=\"kztpV -jCun _3ZHnv\"></div>/</div><div style=\"display:none\"><div></div></div></div><div class=\"_3kj4K\"><div class=\"\"><textarea autoComplete=\"off\"></textarea></div><div style=\"display:none\"><div><div class=\"_2_8ld\" style=\"visibility:hidden;left:0;top:0\"><div class=\"_2eQcR\"></div><div class=\"_2yrbM\"></div></div></div></div></div><div class=\"_3gUKC\" tabIndex=\"2\"><div class=\"_22YEW\"><div class=\"_3s7QJ\">/</div><div class=\"_3odKe\">g</div><div class=\"kztpV MyHSu _16HX4\"></div></div><div style=\"display:none\"><div></div></div></div></div></div><div class=\"_3933o\"><div class=\"vUWkC\"><div class=\"_3KtAM\"><div class=\"_2pcE6 _1XK4v _2tmCK _3EU8D\"><span class=\"_1XK4v\">Test String</span><div class=\"_3Teag\"><a class=\"_1sfyy _3h_QS\" href=\"/tests\">Switch to Unit Tests <div class=\"kztpV ryfpM _2-xT8\"></div></a></div></div><div class=\"_137ys\"><div class=\"_3o7og\"><textarea autoComplete=\"off\"></textarea></div><div style=\"display:none\"><div><div class=\"_2_8ld\" style=\"visibility:hidden;left:0;top:0\"><div class=\"_2eQcR\"></div><div class=\"_2yrbM\"></div></div></div></div></div></div><div class=\"_3nOf6\"><div class=\"_2pcE6 _1XK4v _2tmCK _2YMI3\"><span class=\"_1XK4v\">Substitution</span><div class=\"kztpV Yb_kX _3v_zA\"></div></div></div></div></div><div style=\"display:none\"><div class=\"_8tzUw\"></div></div><div style=\"display:none\"><div class=\"_8tzUw\"></div></div></div></div></div><div class=\"_1fiJD\"><div class=\"_13Yxk\"><div class=\"qTp7n\"><a href=\"/\" class=\"_1sfyy _2sp9O _13Cpk _3NyyL\"><span class=\"_1Dpdr\"><span class=\"_3Wriv\">Regular</span><span class=\"_3Z8iV\">Reg</span></span><span class=\"pJLAE\"><span class=\"_3Wriv\">Expressions</span><span class=\"_3Z8iV\">Ex</span></span><span class=\"_1UZVO\">101</span></a></div><div class=\"_18h7i\"><div class=\"_26B6q\">Please wait while the app is loading...</div><div class=\"_3nhlt _16SPx\" aria-label=\"Loading...\"></div></div><noscript><a href=\"http://enable-javascript.com/\" class=\"_1sfyy _2sp9O\">Please enable JavaScript to use this web application.</a></noscript></div></div></div></div>" +
            "</body>" +
            "</html>";

    // Поиск по регулярному выражению в тексте и запись в список
    public static List<String> findRegexInText(String text, String regex) {
        List<String> stringList = new ArrayList<>();
        // Получаем регулярное выражение
        Pattern pattern = Pattern.compile(regex);
        // Ищем регулярное выражение в тексте
        Matcher matcher = pattern.matcher(text);
        // Созраняем найденное в список
        while (matcher.find()) {
            stringList.add(matcher.group());
        }
        return stringList;
    }

}
