package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RSK extends BasePageObject{
    public void ClosePreference(){
        By element = By.xpath("//button[contains(text(),'Lewati')]");
        if (isPresent(element)){
            clickOn(element);
        }
    }

    public void ClickMasukBtn(){
        By element = By.xpath("//a[contains(text(),'Masuk')]");
        clickOn(element);
    }
    public boolean AtTheLoginPage(){
        By element = By.xpath("//div[contains(text(),'Hai, RSKawan!')]");
        return isPresent(element);
    }
    public void InputUsername(String username){
        By element = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[2]/div[1]/div[2]/div[2]/input");
        typeOn(element,username);
    }
    public void InputPassword(String password){
        By element = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/div[2]/input");
        typeOn(element,password);
    }
    public void ClickLoginButton(){
        By element = By.tagName("button");
        clickOn(element);
    }
    public boolean SuccesfulLoggedin(){
        By element = By.xpath("//header/div[1]/div[1]/div[3]/div[2]/button[1]/img[1]");
        return isPresent(element);

    }
}
