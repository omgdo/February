package top.omgdo.omgrobot.listener;

import love.forte.simbot.annotation.Filter;
import love.forte.simbot.annotation.OnGroup;
import love.forte.simbot.api.message.events.GroupMsg;
import love.forte.simbot.api.sender.MsgSender;
import org.springframework.stereotype.Component;

@Component
public class CommandListener {

    @OnGroup
    @Filter(atBot = true,trim = true)
    public void groupChatCommand(GroupMsg groupMsg, MsgSender sender){

    }
}
