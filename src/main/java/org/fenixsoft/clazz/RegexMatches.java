package org.fenixsoft.clazz;

/**
 * Created by 蓝兵 on 2020/4/3.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String[] args) {
        //String regex = "\\{([^}]*)\\}";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher("{@小明}{@小红}春天来了{@小青}....{@小蓝}666");
        //while (matcher.find()) {
        //    System.out.println(matcher.group() + " " + matcher.group(1));
        //}

        // 将大括号去掉
        //String regex = "\\{([^}]*)\\}";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher("{@小明}{@小红}春天来了{@小青}....{@小蓝}666");
        //StringBuffer sb = new StringBuffer();
        //while (matcher.find()) {
        //    matcher.appendReplacement(sb, matcher.group(1));
        //    System.out.println(matcher.group() + " " + matcher.group(1));
        //    System.out.println(sb.toString());
        //}
        //matcher.appendTail(sb);
        //System.out.println(sb.toString());

        //取出第一个字符
        String regex = "^.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("User");
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}