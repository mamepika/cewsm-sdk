package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.format.CommonEWSMessageFormat;
import org.junit.Test;
import jp.ac.aiit.pbl.CommonEWSMessageDecoder;

import java.time.DateTimeException;

public class CommonEWSMessageDecoderTest {

    @Test
    public void decodeTestWithSignalA() {
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        System.out.println(decoder.decode("9AB0620188B10200B2A2E3602A8000004000000000000000000000004000004"));
    }

    @Test
    public void decodeTestWithSignalB() {
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        System.out.println(decoder.decode("C6B0620000B18200B2BDE363198000004000000000000000000000004000004"));
    }

    @Test(expected = NumberFormatException.class)
    public void FromHexToBinaryException() {
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        decoder.decode("C6Bあ620あ00B18200B2BDE363198000004000000000000000000000004000004");
    }
}