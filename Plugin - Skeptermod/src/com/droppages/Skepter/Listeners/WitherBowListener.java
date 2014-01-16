package com.droppages.Skepter.Listeners;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

import com.droppages.Skepter.Main.Skeptermod;

// Referenced classes of package com.me.zbruggeman:
//            EnderBow

public class WitherBowListener
    implements Listener
{

    public WitherBowListener(Skeptermod plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    
    @EventHandler
    public void onFireBow(EntityShootBowEvent event)
    {
    if(event.getEntityType() == EntityType.PLAYER)
    {
            Player player = (Player)event.getEntity();
            
            if(player.hasPermission("skeptermod.useitem.witherbow") || (player.isOp()))
            {
            	if(player.getInventory().getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 10)
            	{
            		event.setCancelled(true);
            		((WitherSkull)player.launchProjectile(WitherSkull.class)).setVelocity(event.getProjectile().getVelocity());
            }else{
            	return;
            }
    }   
    }
    }
}

