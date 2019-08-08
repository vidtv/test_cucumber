import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "src/main/java",
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)

public class Tests {

}
