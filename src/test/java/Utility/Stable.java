package Utility;
//
//public class Stable {
//    public static String FilePath = System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
//    public static String UploadFilePath = System.getProperty("user.dir")+"\\TestData\\sample.pdf";
//    public static double p2pRevenue = -1.76;
//    public static double receiveCashOutOffUs = 2;
//}

public class Stable {

    private String name;
    private int age;
    private String address;
    public Stable() {
    }

    public Stable setName(String name) {
        this.name = name;
        return this;
    }

    public Stable setAge(int age) {
        this.age = age;
        return this;
    }

    public Stable setAddress(String address) {
        this.address = address;
        return this;
    }


}