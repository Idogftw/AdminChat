package com.idogftw.ac;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class MessageListener implements Listener {

	public MessageListener() {
		
	}
	
	@EventHandler
	public void onChatEvent(ChatEvent event)
	{
		/*ProxiedPlayer player = ProxyServer.getInstance().getPlayer(event.getSender().toString());
		if(!event.isCommand())
			player.sendMessage(new TextComponent("Yo!"));*/
	}

}
