package jp.ac.aiit.pbl.format.sep2020;

import jp.ac.aiit.pbl.format.CommonEWSMessage;
import org.junit.Test;

import static org.junit.Assert.*;

public class EWSSeptember2020ParserTest {

    @Test
    public void caseOfSignalA(){
        EWSSeptember2020Parser parser = new EWSSeptember2020Parser();
        CommonEWSMessage message = parser.parse("100110101011000001100010000000011000100010110001000000100000000010110010101000101110001101100000001010101000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000000000000000000000100");
        System.out.println(message.toString());
    }

}