package OAuthTests;

import api.actions.OAuthApi;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.GetCourses;
import pojo.WebAutomation;

import java.util.ArrayList;
import java.util.List;


public class OAuthTest {

    @Test
    public void shouldGetCoursesDetailsUsingOAuth() {
        List<String> expectedCourseTitles = List.of("Selenium Webdriver Java", "Cypress", "Protractor");
        OAuthApi oAuthApi = new OAuthApi();

        GetCourses getCourses = oAuthApi.getCoursesDetails();
        List<String> actualCourseTitles = new ArrayList<>();;
        for (WebAutomation webAutomationCourse : getCourses.getCourses().getWebAutomation()) {
            actualCourseTitles.add(webAutomationCourse.getCourseTitle());
        }
        Assert.assertEquals(actualCourseTitles, expectedCourseTitles);
    }
}
