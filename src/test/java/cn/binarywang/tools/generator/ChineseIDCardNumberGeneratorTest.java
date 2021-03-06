package cn.binarywang.tools.generator;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

public class ChineseIDCardNumberGeneratorTest {

    @Test
    public void generateRandomDate() {
        Date randomDate = ChineseIDCardNumberGenerator.randomDate();
        System.err.println(randomDate);
        assertNotNull(randomDate);
    }

    @Test
    public void testGenerate() {
        String idCard = ChineseIDCardNumberGenerator.getInstance().generate();
        System.err.println(idCard);
        assertNotNull(idCard);
    }

    @Test
    public void testGenerateIssueOrg() {
        String issueOrg = ChineseIDCardNumberGenerator.generateIssueOrg();
        System.err.println(issueOrg);
        assertNotNull(issueOrg);
    }

    @Test
    public void testGenerateValidPeriod() {
        String result = ChineseIDCardNumberGenerator.generateValidPeriod();
        System.err.println(result);
        assertNotNull(result);
    }

}
