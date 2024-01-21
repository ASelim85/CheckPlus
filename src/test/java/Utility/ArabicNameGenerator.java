package Utility;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Random;

public class ArabicNameGenerator {
    private static final String[] lastName = {"عبد", "محمد", "أحمد", "علي", "حسين", "محمود", "عبدالله"
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
            , "ناصر "
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
    private static final String[] firstName = {"فاطمة", "زينب", "مريم", "خديجة", "نور", "لمى", "سارة", "عبدالله"
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
            , "ناصر "
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
//    private static final String[] maleSuffixes = {"م", "ي", "ا", "و", "ان", "ين"};
//    private static final String[] femaleSuffixes = {"ة", "ي", "ا", "و", "ات", "يات"};

    public static void main(String[] args) {
        Random random = new Random();
        String randomCity = CITIES[random.nextInt(CITIES.length)];
        String randomNeighborhood = NEIGHBORHOODS[random.nextInt(NEIGHBORHOODS.length)];
        String randomStreet = STREETS[random.nextInt(STREETS.length)];
        int randomBuildingNumber = random.nextInt(100) + 1; // Generate a random building number from 1 to 100

        String address = randomCity + "، " + randomNeighborhood + "، " + randomStreet + "، " + randomBuildingNumber;

        System.out.println(address);
    }

    public static String generateArabicMaleName() {
        final String[] lastName = {"عبد", "محمد", "أحمد", "علي", "حسين", "محمود", "عبدالله"
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
                , "ناصر "
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
        final String[] firstName = {"فاطمة", "زينب", "مريم", "خديجة", "نور", "لمى", "سارة", "عبدالله"
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
                , "ناصر "
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
        Random random = new Random();
        return firstName[random.nextInt(firstName.length)];
    }

    public static String generateArabicFemaleName() {
        Random random = new Random();
        return lastName[random.nextInt(lastName.length)];
    }

    protected static Faker faker = new Faker();

    public static int generateRNumber() {
        return Integer.parseInt(String.valueOf(faker.number().numberBetween(10, 99)));
    }

    private static final String[] CITIES = {
            "الرياض", "جدة", "مكة", "المدينة المنورة", "الدمام", "الطائف", "بريدة", "تبوك", "القطيف", "خميس مشيط"
            // Add more city names as needed
    };

    private static final String[] NEIGHBORHOODS = {
            "حي العليا", "حي النسيم", "حي الصحافة", "حي الروضة", "حي العزيزية", "حي الفيصلية", "حي العقيق", "حي العمرة"
            // Add more neighborhood names as needed
    };

    private static final String[] STREETS = {
            "شارع الملك عبدالله", "شارع التحلية", "شارع الأمير محمد بن سلمان", "شارع الملك فهد", "شارع الأمير سلطان"
            // Add more street names as needed
    };

    @Test
    public static void create(String[] args) {
        Random random = new Random();
        String randomCity = CITIES[random.nextInt(CITIES.length)];
        String randomNeighborhood = NEIGHBORHOODS[random.nextInt(NEIGHBORHOODS.length)];
        String randomStreet = STREETS[random.nextInt(STREETS.length)];
        int randomBuildingNumber = random.nextInt(100) + 1; // Generate a random building number from 1 to 100

        String address = randomCity + "، " + randomNeighborhood + "، " + randomStreet + "، " + randomBuildingNumber;

        System.out.println(address);
    }
}

