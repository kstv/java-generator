package cn.binarywang.tools.generator;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import cn.binarywang.tools.generator.base.GenericGenerator;

public class ChineseMobileNumberGenerator extends GenericGenerator {
    private static final int[] MOBILE_PREFIX = new int[] { 133, 153, 177, 180,
        181, 189, 134, 135, 136, 137, 138, 139, 150, 151, 152, 157, 158, 159,
        178, 182, 183, 184, 187, 188, 130, 131, 132, 155, 156, 176, 185, 186,
        145, 147, 170 };
    private static GenericGenerator instance = new ChineseMobileNumberGenerator();

    private ChineseMobileNumberGenerator() {
    }

    public static GenericGenerator getInstance() {
        return instance;
    }

    @Override
    public String generate() {
        return genMobilePre() + StringUtils
            .leftPad("" + RandomUtils.nextInt(0, 99999999 + 1), 8, "0");
    }

    private static String genMobilePre() {
        return "" + MOBILE_PREFIX[RandomUtils.nextInt(0, MOBILE_PREFIX.length)];
    }
}
