package runner;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(features = "src/test/resources/features", /*tags = "@BusquedaErronea",*/ glue = "stepdefinitions")
public class Runner {

}
