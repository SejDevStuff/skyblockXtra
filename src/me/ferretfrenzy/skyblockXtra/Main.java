package me.ferretfrenzy.SkyblockXtra;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		// start
	}
	@Override
	public void onDisable() {
		// end
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("sbX_status")) {
			if (sender instanceof Player) {
				//player
				Player player = (Player) sender;
				if (player.hasPermission("sbx.status")) {
					player.sendMessage(ChatColor.GREEN + "I seem to be working fine!");
					return true;
				}
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lYou cannot use that command!"));
				return true;
			} else {
				//console
				sender.sendMessage("I don't seem to have any issues");
			}
		}
		return false;
	}
}