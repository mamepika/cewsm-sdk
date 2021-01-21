package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.format.CommonEWSMessage;
import jp.ac.aiit.pbl.format.CommonEWSMessageFormat;
import jp.ac.aiit.pbl.format.prefix.MessageType;
import jp.ac.aiit.pbl.format.prefix.Preamble;
import org.junit.Test;
import jp.ac.aiit.pbl.CommonEWSMessageDecoder;

import java.time.DateTimeException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CommonEWSMessageDecoderTest {

    @Test
    public void decodeTestWithSignalA() {
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        CommonEWSMessage message = decoder.decode("9AB0620188B10200B2A2E3602A8000004000000000000000000000004000004");
        assertThat(message.getPrefix().getPreamble(),is(Preamble.PATTERN_B));
        assertThat(message.getPrefix().getMessageType(),is(MessageType.MT44));
        //System.out.println(decoder.decode("9AB0620188B10200B2A2E3602A8000004000000000000000000000004000004"));
    }

    @Test
    public void decodeTestWithSignalB() {
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        CommonEWSMessage message = decoder.decode("C6B0620000B18200B2BDE363198000004000000000000000000000004000004");
        assertThat(message.getPrefix().getPreamble(),is(Preamble.PATTERN_C));
        assertThat(message.getPrefix().getMessageType(),is(MessageType.MT44));
    }

    @Test(expected = NumberFormatException.class)
    public void FromHexToBinaryException() {
        CommonEWSMessageDecoder decoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        decoder.decode("C6Bあ620あ00B18200B2BDE363198000004000000000000000000000004000004");
    }
}