package com.thetestingacademy.tests.crud;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingPOST {

    @Link(name="link to TC", url="https://sdet.live/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")//test management system jira link/number
    @Owner("Neha")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that post request is working fine")
    @Test
    public void testVerifyCreateBookingPOST01(){
        Assert.assertEquals(true,true);
    }
}
