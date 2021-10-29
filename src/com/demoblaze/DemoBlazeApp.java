package com.demoblaze;


import com.demoblaze.aboutus_test.TestCase1;
import com.demoblaze.caruosal_tests.TestCase3;
import com.demoblaze.caruosal_tests.TestCase5;
import com.demoblaze.footer_tests.TestCase_Footer;
import com.demoblaze.shopping_carttests.TestCase_ShoppingCartAdds;

public class DemoBlazeApp {

    //This is a  Demo blaze mother class , we can call all method from this class.
    //main and test case1 test method is static no need create object. we can use class name
    // direct call the method
    public static void main(String[] args) throws InterruptedException {
        /*
        TestCase1.appLoadTest();
        TestCase2.headerLinksDisplayedTest();
        TestCase3.loginModalWindowDisplayedTest();
        TestCase4.loginModalWindowDisappearsTest();
        TestCase9.loginWithValidCredential();

        TestCase1.aboutUsTest();
        TestCase2.contactTest();
        TestCase5.rightArrowTest();

         */
       // TestCase_Footer.footerVerificationTest();
        TestCase_ShoppingCartAdds.shoppingCartAddItemTest();


    }


}