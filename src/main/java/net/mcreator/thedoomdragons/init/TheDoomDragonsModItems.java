
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedoomdragons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thedoomdragons.item.ImposternifeItem;
import net.mcreator.thedoomdragons.TheDoomDragonsMod;

public class TheDoomDragonsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheDoomDragonsMod.MODID);
	public static final RegistryObject<Item> AMOGUSDIRT = block(TheDoomDragonsModBlocks.AMOGUSDIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AMOGUSORE = block(TheDoomDragonsModBlocks.AMOGUSORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SUSLEAF = block(TheDoomDragonsModBlocks.SUSLEAF, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SUSLOG = block(TheDoomDragonsModBlocks.SUSLOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OPBLOCK = block(TheDoomDragonsModBlocks.OPBLOCK, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> IMPOSTERNIFE = REGISTRY.register("imposternife", () -> new ImposternifeItem());
	public static final RegistryObject<Item> IMPOSTR = REGISTRY.register("impostr_spawn_egg",
			() -> new ForgeSpawnEggItem(TheDoomDragonsModEntities.IMPOSTR, -3407872, -13369345, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
