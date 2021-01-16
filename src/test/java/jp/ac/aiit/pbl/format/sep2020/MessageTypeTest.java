package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import jp.ac.aiit.pbl.format.sep2020.MessageType;

public class MessageTypeTest {
    @Test
    public void canGetMessageType00() { Assert.assertThat(MessageType.ALERT,is(MessageType.getById("00")));}
    @Test
    public void canGetMessageType01() { Assert.assertThat(MessageType.UPDATE,is(MessageType.getById("01")));}
    @Test
    public void canGetMessageType10() { Assert.assertThat(MessageType.TEST,is(MessageType.getById("10")));}
    @Test
    public void canGetMessageType11() { Assert.assertThat(MessageType.CANCEL,is(MessageType.getById("11")));}
}