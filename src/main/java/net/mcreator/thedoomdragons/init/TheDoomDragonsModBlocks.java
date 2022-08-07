
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedoomdragons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thedoomdragons.block.SuslogBlock;
import net.mcreator.thedoomdragons.block.SusleafBlock;
import net.mcreator.thedoomdragons.block.OpblockBlock;
import net.mcreator.thedoomdragons.block.AmogusoreBlock;
import net.mcreator.thedoomdragons.block.AmogusdirtBlock;
import net.mcreator.thedoomdragons.TheDoomDragonsMod;

public class TheDoomDragonsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheDoomDragonsMod.MODID);
	public static final RegistryObject<Block> AMOGUSDIRT = REGISTRY.register("amogusdirt", () -> new AmogusdirtBlock());
	public static final RegistryObject<Block> AMOGUSORE = REGISTRY.register("amogusore", () -> new AmogusoreBlock());
	public static final RegistryObject<Block> SUSLEAF = REGISTRY.register("susleaf", () -> new SusleafBlock());
	public static final RegistryObject<Block> SUSLOG = REGISTRY.register("suslog", () -> new SuslogBlock());
	public static final RegistryObject<Block> OPBLOCK = REGISTRY.register("opblock", () -> new OpblockBlock());
}
