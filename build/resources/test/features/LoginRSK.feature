@Login @Web
  Feature: Login

    @RSK
    Scenario: Login
      Given user skip preference
      And user click Masuk Button
      And user at the login Page
     # And user input email "mutiarasarikusuma@gmail.com" and password "Dummy123"
      And user click Button Masuk
     # Then user succesfully loggedin
