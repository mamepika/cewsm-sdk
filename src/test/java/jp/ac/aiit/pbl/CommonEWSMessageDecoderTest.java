package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.format.CommonEWSMessageFormat;
import org.junit.Test;

public class CommonEWSMessageDecoderTest {

    @Test
    public void test(){
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        System.out.println();
        System.out.println(decoder.decode("9AB0620188B10200B2A2E3602A8000004000000000000000000000004000004"));
    }

    @Test
    public void test2(){
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        System.out.println();
        System.out.println(decoder.decode("C6B0620000B18200B2BDE363198000004000000000000000000000004000004"));
    }
}
