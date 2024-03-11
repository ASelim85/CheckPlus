package Pages;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    // create a method that display an error message if the age is less than 18 and greater than 40
    public void displayErrorMessage(int age) {
        if (age < 18 || age > 40) {
            System.out.println(STR."You are not eligible to apply as your age is \{age}");
        }
    }
    // create a unit test to test the displayErrorMessage method with different ages
    @org.testng.annotations.Test
    public void testDisplayErrorMessage() {
        displayErrorMessage(17);
        displayErrorMessage(18);
        displayErrorMessage(40);
        displayErrorMessage(41);
    }

    // create a test case for valid login solution from login page including methods from the LoginPage class with setting user name as check7 and password as P@ssw0rd
    @org.testng.annotations.Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.setUsername("check7")
                .setPassword("P@ssw0rd")
                .clickSignIn()
                .assertDashboardTitle();
    }
}
