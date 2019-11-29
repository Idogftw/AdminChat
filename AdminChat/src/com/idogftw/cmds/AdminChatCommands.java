package com.idogftw.cmds;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class AdminChatCommands extends Command {
	
	String adminPrefix = ChatColor.GRAY + "[" + ChatColor.RED + "AdminChat" + ChatColor.GRAY + "]"+ ChatColor.RESET + " ";
	String noPermission = ChatColor.RED + "You don't have permission to use this command.";
	String msgPrefix;
	//static boolean adminChat;
	
	
	public AdminChatCommands() {
		super("ac", "kc.ac.use");
		//adminChat = false;
	}		

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(!(sender instanceof ProxiedPlayer)) {
			sender.sendMessage(new TextComponent(ChatColor.RED + "Only players are allowed to access this command."));
			return;
		}

		ProxiedPlayer player = ProxyServer.getInstance().getPlayer(sender.toString());

		if(!(player.hasPermission("kc.ac.use")))
		{
			sender.sendMessage(new TextComponent(noPermission));
			return;
		}

		if(args.length == 0)
		{
			//adminChat = !adminChat;
			//sender.sendMessage(new TextComponent(ChatColor.GREEN + "AdminChat " + (adminChat ? "Activated" : "Disabled")));
			return;
		}

		if(args.length >= 1) {
			String message = "";
	
			for(int i = 0; i < args.length; i++){
			    String arg = args[i] + " ";
			    message = message + arg;
			}

			msgPrefix = ChatColor.GRAY + "[" + ChatColor.YELLOW + player.getServer().getInfo().getName().toUpperCase() + ChatColor.GRAY + "]" + ChatColor.RESET + " ";

			for(ProxiedPlayer staff : ProxyServer.getInstance().getPlayers()) {
				staff.sendMessage(new TextComponent(adminPrefix + msgPrefix + ChatColor.DARK_GREEN + sender.getName() + ChatColor.RED + " >> " + ChatColor.GREEN + message));
			}
		}
	}

}
