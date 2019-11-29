package com.idogftw.ac;

import com.idogftw.cmds.AdminChatCommands;
import net.md_5.bungee.api.plugin.Plugin;

public class AdminChat extends Plugin {
		
	@Override
	public void onEnable()	{
		getLogger().info("Starting AdminChat");
		getProxy().getPluginManager().registerCommand(this, new AdminChatCommands());
		//Couldn't get server to work so right now only way to talk in admin chat is well to use /ac command
		//getProxy().getPluginManager().registerListener(this, new MessageListener());
	}

	@Override
	public void onDisable() {
		getLogger().info("Stopping AdminChat");
	}
	
}
