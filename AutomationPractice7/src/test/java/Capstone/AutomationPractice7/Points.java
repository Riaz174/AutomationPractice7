package Capstone.AutomationPractice7;

import org.testng.annotations.Test;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.Username(n);
	  home.Psswd(s);
	  home.login();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "abcdef" },
      new Object[] { "Saleem", "ghijkl" },
      new Object[] {"Rabia", "mnopqrst"},
    };
  }
}
