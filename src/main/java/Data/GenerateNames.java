package Data;

import org.testng.annotations.Test;

import java.util.Random;

public class GenerateNames {


    public static String generateArabicName() {
        final String[] firstNames = {"فاطمة", "زينب", "مريم", "خديجة", "نور", "لمى", "سارة", "عبدالله"
                , "محمد"
                , "أحمد"
                , "علي"
                , "مصطفى"
                , "يوسف"
                , "خالد"
                , "عمر"
                , "محمود"
                , "سعيد"
                , "حسين"
                , "ناصر"
                , "عبدالرحمن"
                , "طارق"
                , "عبدالعزيز"
                , "عبدالكريم"
                , "فارس"
                , "رامي"
                , "مجدي"
                , "سليمان"
                , "جمال"
                , "عبداللطيف"
                , "محسن"
                , "صالح"
                , "رضا"
                , "زكريا"
                , "نورالدين"
                , "جلال"
                , "عبدالملك"
                , "قاسم"};

        final String[] middleNames = {"عزيز", "محمد", "أحمد", "علي", "حسين", "محمود", "عبدالله"
                , "محمد"
                , "أحمد"
                , "علي"
                , "مصطفى"
                , "يوسف"
                , "خالد"
                , "عمر"
                , "محمود"
                , "سعيد"
                , "حسين"
                , "ناصر"
                , "عبدالرحمن"
                , "طارق"
                , "عبدالعزيز"
                , "عبدالكريم"
                , "فارس"
                , "رامي"
                , "مجدي"
                , "سليمان"
                , "جمال"
                , "عبداللطيف"
                , "محسن"
                , "صالح"
                , "رضا"
                , "زكريا"
                , "نورالدين"
                , "جلال"
                , "عبدالملك"
                , "قاسم"
                , "عمر"};

        final String[] lastNames = {"عبد العال"
                , "عبد الرحيم"
                , "عبد الرحمن"
                , "عبد الجبار"
                , "عبد الصبور"
                , "عبد المهيمن"
                , "عبد العزيز"
                , "عبد الملك"
                , "عبد السلام",
                "عبد المؤمن",
                "عبد الخالق",
                "عبدالله",
                "عبد الرشيد",
                "الملواني"
                , "يسري",
                "جمعة",
                "خميس"

        };
        Random random = new Random();
        String firstName = middleNames[random.nextInt(firstNames.length)];
        String middleName = middleNames[random.nextInt(middleNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        System.out.println(firstName + " " + middleName + " " + lastName);
        return firstName + " " + middleName + " " + lastName;
    }

}
