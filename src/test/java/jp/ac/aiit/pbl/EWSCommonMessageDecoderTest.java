package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.format.EWSCommonMessageFormat;
import org.junit.Test;

public class EWSCommonMessageDecoderTest {

    @Test
    public void test(){
        EWSCommonMessageDecoder decoder = new EWSCommonMessageDecoder(EWSCommonMessageFormat.SEPTEMBER2020);

        System.out.println(decoder.decode("9AB3F800000000223AE553D1C01200170807DE00000000000000000"));
    }
}
