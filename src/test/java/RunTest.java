import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"html:target/html-output","json:target/cucumber.json","pretty:target/cucumber-pretty.txt"},
            features = "." ,
            //classpath:featurefiles",
            tags="@signin")

    public class RunTest {


}
