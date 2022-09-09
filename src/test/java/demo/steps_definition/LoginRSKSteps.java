package demo.steps_definition;
import demo.pages.base.page_object.RSK;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginRSKSteps {

    RSK rsk = new RSK();

    @Given("user skip preference")
    public void userSkipPreference() {
        rsk.ClosePreference();
    }

    @And("user click Masuk Button")
    public void userClickMasukButton() {
        rsk.ClickMasukBtn();
    }

    @And("user at the login Page")
    public void userAtTheLoginPage() {
        rsk.AtTheLoginPage();
    }

    @And("user input email {string} and password {string}")
    public void userInputUsernameAndPassword(String email, String password) {
        rsk.InputUsername(email);
        rsk.InputPassword(password);
    }

    @And("user click Button Masuk")
    public void userClickButtonMasuk() {
        rsk.ClickLoginButton();
    }

    @Then("user succesfully loggedin")
    public void userSuccesfullyLoggedin() {
        rsk.SuccesfulLoggedin();
    }
}
