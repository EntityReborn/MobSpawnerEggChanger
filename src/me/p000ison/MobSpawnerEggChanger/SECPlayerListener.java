package me.p000ison.MobSpawnerEggChanger;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SECPlayerListener implements Listener {
    
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteract(PlayerInteractEvent event) {
    	Action action = event.getAction();
    	Player player = event.getPlayer();
    	ItemStack iih = event.getItem();
    	Material blocktype = event.getClickedBlock().getType();
    	Block block = event.getClickedBlock();
    	MobSpawnerEggChanger main = new MobSpawnerEggChanger();
    	
    	if (player.isSneaking()) {
	    	if (player.hasPermission("sec.spawnerchange")) {
		        if (event.getItem() == null) {
		            return;
		        }
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 50) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.CREEPER);
		    		main.sendSpawnerMessage(player, "Creeper");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 51) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.SKELETON);
		    		main.sendSpawnerMessage(player, "Skeleton");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 52) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.SPIDER);
		    		main.sendSpawnerMessage(player, "Spider");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 54) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.ZOMBIE);
		    		main.sendSpawnerMessage(player, "Zombie");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 55) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.SLIME);
		    		main.sendSpawnerMessage(player, "Slime");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 56) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.GHAST);
		    		main.sendSpawnerMessage(player, "Ghast");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 57) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.PIG_ZOMBIE);
		    		main.sendSpawnerMessage(player, "Pig Zombie");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 58) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.ENDERMAN);
		    		main.sendSpawnerMessage(player, "Enderman");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 59) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.CAVE_SPIDER);
		    		main.sendSpawnerMessage(player, "Cave Spider");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 60) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.SILVERFISH);
		    		main.sendSpawnerMessage(player, "Silverfish");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 61) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.BLAZE);
		    		main.sendSpawnerMessage(player, "Blaze");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 62) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.MAGMA_CUBE);
		    		main.sendSpawnerMessage(player, "Magma Cube");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 90) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.PIG);
		    		main.sendSpawnerMessage(player, "Pig");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 91) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.SHEEP);
		    		main.sendSpawnerMessage(player, "Sheep");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 92) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.COW);
		    		main.sendSpawnerMessage(player, "Cow");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 93) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.CHICKEN);
		    		main.sendSpawnerMessage(player, "Chicken");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 94) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.SQUID);
		    		main.sendSpawnerMessage(player, "Squid");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 95) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.WOLF);
		    		main.sendSpawnerMessage(player, "Wolf");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 96) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.MUSHROOM_COW);
		    		main.sendSpawnerMessage(player, "Mushroom Cow");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 98) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.OCELOT);
		    		main.sendSpawnerMessage(player, "Ocelot");
		    	}
		    	if (blocktype == Material.MOB_SPAWNER && action.equals(Action.LEFT_CLICK_BLOCK) && iih.getType() == Material.MONSTER_EGG && iih.getDurability() == 120) {
		    		((CreatureSpawner)block.getState()).setSpawnedType(EntityType.VILLAGER);
		    		main.sendSpawnerMessage(player, "Villager");
		    	}
		    	
		    	block.getState().update();
		    	
	    	}
    	}
    }
}