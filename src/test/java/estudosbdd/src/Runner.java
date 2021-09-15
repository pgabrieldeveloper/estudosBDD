package estudosbdd.src;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = "pretty", monochrome = true,snippets = CucumberOptions.SnippetType.CAMELCASE ,publish = true
                )
public class Runner {

}
