package org.example.automation.testng.approach;

import org.example.automation.base.BaseTestNG;
import io.qameta.allure.Feature;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

@Feature("High-level feature") // Epic
public class SomeFeatureTest extends BaseTestNG
{
    // DO something common for each test
    @BeforeMethod(alwaysRun = true)
    public void beforeFeature(Method method, Object[] testArgs) {
        // Authorize and prepare data
    }

    @AfterMethod(alwaysRun = true)
    public void afterFeature(Method method) {
        // Delete data
    }
}