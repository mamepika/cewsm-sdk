package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.format.CommonEWSMessageFormat;
import org.junit.Test;

public class CommonEWSMessageDecoderTest {

    @Test
    public void test(){
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);

        System.out.println(decoder.decode("9AB3F800000000223AE553D1C01200170807DE00000000000000000"));
    }
}
