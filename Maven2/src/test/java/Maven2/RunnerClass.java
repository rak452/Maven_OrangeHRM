package Maven2;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@login,@noLogin", format = {"pretty", "html:target/cucumber-reports"})


public class RunnerClass {
}
