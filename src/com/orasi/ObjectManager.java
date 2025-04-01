
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32505.188", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32505.190", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32505.192", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32505.194", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32505.196", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32505.198", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32505.200", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32505.202", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32505.204", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32505.206", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32505.208", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32505.210", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32505.212", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32505.214", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32505.216", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32505.218", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32505.220", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32505.222", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32505.224", "" ) );


objectMap.put( "32505.188", bC );


bC = new ByFactoryCollection("pass", "32505.228", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "32505.230", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "32505.232", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32505.234", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32505.236", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-pass']", "AttributeRule", "32505.238", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-pass']", "AttributeRule", "32505.240", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Password']", "AttributeRule", "32505.242", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Password']", "AttributeRule", "32505.244", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Password']", "AttributeRule", "32505.246", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Password']", "AttributeRule", "32505.248", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"pass\"]", "IDRule", "32505.250", "" ) );
bC.add( new ByFactory( ById.class, "pass", "IDRule", "32505.252", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"pass\"]", "IDRule", "32505.254", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"pass\"]", "NameRule", "32505.256", "" ) );
bC.add( new ByFactory( ByName.class, "pass", "NameRule", "32505.258", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"pass\"]", "NameRule", "32505.260", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32505.262", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32505.264", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32505.266", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32505.268", "" ) );


objectMap.put( "32505.228", bC );


bC = new ByFactoryCollection("login", "32505.272", "");
bC.add( new ByFactory( ByXPath.class, "//button[@type='submit']", "AttributeRule", "32505.274", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "32505.276", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']", "AttributeRule", "32505.278", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']", "AttributeRule", "32505.280", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@data-testid='royal-login-button']", "AttributeRule", "32505.282", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-login-button']", "AttributeRule", "32505.284", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@value='1']", "AttributeRule", "32505.286", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='1']", "AttributeRule", "32505.288", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"u_0_5_T3\"]", "IDRule", "32505.290", "" ) );
bC.add( new ByFactory( ById.class, "u_0_5_T3", "IDRule", "32505.292", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"u_0_5_T3\"]", "IDRule", "32505.294", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@name=\"login\"]", "NameRule", "32505.296", "" ) );
bC.add( new ByFactory( ByName.class, "login", "NameRule", "32505.298", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"login\"]", "NameRule", "32505.300", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@class='_9vtf']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.302", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_9vtf']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.304", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@data-testid='royal_login_form']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.306", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal_login_form']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.308", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@action='/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQzNTA3NTU0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.310", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQzNTA3NTU0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.312", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@method='post']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.314", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@method='post']/div[2]/button[1]", "ParentRule[AttributeRule]", "32505.316", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form[@id=\"u_0_2_EP\"]/div[2]/button[1]", "ParentRule[IDRule]", "32505.318", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"u_0_2_EP\"]/div[2]/button[1]", "ParentRule[IDRule]", "32505.320", "" ) );
bC.add( new ByFactory( ByXPath.class, "//form/div[2]/button[1]", "ParentRule[TagRule]", "32505.322", "" ) );


objectMap.put( "32505.272", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
