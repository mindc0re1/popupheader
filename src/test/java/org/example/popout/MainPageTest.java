package org.example.popout;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {

    @Test
    void successfulMainPageTest() {

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize="1920x1080";

        open ("https://www.daxtra.com");
        //Check daxtra products tabs are working and correspond to the hyperlinks
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/resume-matching-software/']").click();
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/resume-analysis-software/']").click();
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/candidate-engagement-software/']").click();
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/clean-candidate-data-plugin/']").click();
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/resume-formatting-anonymizing-software/']").click();
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/resume-parsing-software/']").click();
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/application-experience-software/']").click();
        $("a[href='https://www.daxtra.com/products/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/products/resume-management-software/']").click();
        //Check the tabs - "solutions for" has all the tabs links
        $("a[href='https://www.daxtra.com/solutions-for/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/solutions-for/agencies/']").click();
        $("a[href='https://www.daxtra.com/solutions-for/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/solutions-for/corporates/']").click();
        $("a[href='https://www.daxtra.com/solutions-for/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/solutions-for/vendors-crm-ats-providers/']").click();
        $("a[href='https://www.daxtra.com/solutions-for/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/solutions-for/vendors-job-boards-social-media/']").click();
        $("a[href='https://www.daxtra.com/partners/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/about-daxtra/']").shouldBe(visible).hover();
        $("a[href='https://www.daxtra.com/resources/']").shouldBe(visible).hover();
        $("a[href='https://info.daxtra.com/recruiting-management-software/']").shouldBe(visible).hover();
        $$("a.nav__link").findBy(text("Language")).shouldBe(visible).hover();

        //https://www.daxtra.com/solutions-for/vendors-job-boards-social-media/

    }
}