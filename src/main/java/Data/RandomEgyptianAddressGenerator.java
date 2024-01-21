package Data;
import org.testng.annotations.Test;
import java.util.Random;

public class RandomEgyptianAddressGenerator {
    private static final String[] CITIES = {
            "القاهرة", "الجيزة", "الإسكندرية", "المنصورة", "الإسماعيلية", "السويس", "بنها", "طنطا", "الفيوم", "المنيا"
            // Add more city names in Egypt as needed
    };

    private static final String[] NEIGHBORHOODS = {
            "حي الدقي", "حي المهندسين", "حي المنتزه", "حي سموحة", "حي الزيتون", "حي المنشية", "حي الجيزة", "حي الحضرة"
            // Add more neighborhood names in Egypt as needed
    };

    private static final String[] STREET_TYPES = {
            "شارع", "ميدان",
            // Add more street types in Egypt as needed
    };
    @Test
    public static String generateAddress() {
        Random random = new Random();
        String randomCity = CITIES[random.nextInt(CITIES.length)];
        String randomNeighborhood = NEIGHBORHOODS[random.nextInt(NEIGHBORHOODS.length)];
        String randomStreetType = STREET_TYPES[random.nextInt(STREET_TYPES.length)];
        String randomStreetName = generateRandomStreetName();

        int randomBuildingNumber = random.nextInt(100) + 1;

        String address = randomBuildingNumber + "، " + randomStreetType + " " + randomStreetName + "، " + randomNeighborhood + "، " + randomCity;
        return address;

    }

    public static String generateRandomStreetName() {
        Random random = new Random();
        String[] streetNames = {
                "التحرير", "القصر العيني", "رمسيس", "محمد فريد", "العروبة", "طلعت حرب", "كورنيش النيل", "سعد زغلول", "العباسية"
                // Add more street names in Egypt as needed
        };

        return streetNames[random.nextInt(streetNames.length)];
    }
}
