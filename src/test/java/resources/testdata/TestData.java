package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "JobSearch")
    public static Object[][] objectTestData() {
        return new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum","Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Scientist", "Harrow", "up to 15 miles", "30000", "50000", "Per annum","Contract", "Contract Scientist jobs in Harrow on the Hill"},
                {"Pharmaceutical", "Cambridgeshire", "up to 7 miles", "30000", "60000", "Per annum","Any", "Pharmaceutical jobs in Cambridgeshire"},
                {"Retail Manager", "West London", "up to 25 miles", "30000", "50000", "Per annum","Permanent", "Permanent Retail Manager jobs in West London"},
                {"Automation Tester", "HA1 1AB", "up to 10 miles", "300", "400", "Per day","Contract", "Contract Automation Tester jobs in HA1 1AB"},
                {"Research Scientist", "Newcastle upon Tyne", "up to 10 miles", "400", "500", "Per day","Contract", "Contract Research Scientist jobs in Newcastle upon Tyne"},
                {"Tester", "Watford, Hertfordshire", "up to 5 miles", "40000", "60000", "Per annum","Contract", "Contract Tester jobs in Watford"},
        };
    }
}
