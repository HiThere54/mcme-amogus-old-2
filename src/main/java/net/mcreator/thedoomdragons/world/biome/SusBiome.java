
package net.mcreator.thedoomdragons.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thedoomdragons.world.features.treedecorators.SusFruitDecorator;
import net.mcreator.thedoomdragons.init.TheDoomDragonsModBlocks;
import net.mcreator.thedoomdragons.init.TheDoomDragonsModBiomes;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class SusBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.142857142857f, 0.142857142857f),
			Climate.Parameter.span(-0.142857142857f, 0.142857142857f), Climate.Parameter.span(0.367142857143f, 0.652857142857f),
			Climate.Parameter.span(0.657142857143f, 0.942857142857f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.46101724231f, -0.175302956596f), 0);
	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(-0.49f, 1.51f), Climate.Parameter.span(-0.2f, 1.8f),
			Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1.318160099453f, 0.681839900547f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-3407872).waterColor(-6749953).waterFogColor(329011)
				.skyColor(-3407872).foliageColorOverride(10387789).grassColorOverride(9470285)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("the_doom_dragons:com.meme.rickroll"))).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_doom_dragons:tree_sus", FeatureUtils.register("the_doom_dragons:tree_sus", Feature.TREE,
						new TreeConfiguration.TreeConfigurationBuilder(
								BlockStateProvider.simple(TheDoomDragonsModBlocks.SUSLOG.get().defaultBlockState()), new StraightTrunkPlacer(7, 2, 0),
								BlockStateProvider.simple(TheDoomDragonsModBlocks.SUSLEAF.get().defaultBlockState()),
								new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
								.decorators(ImmutableList.of(

										SusFruitDecorator.INSTANCE))
								.build()),
						List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_doom_dragons:grass_sus", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_doom_dragons:patch_cactus_sus", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.THEEND).temperature(0.5f)
				.downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(TheDoomDragonsModBiomes.SUS.get())),
				BiomeDictionary.Type.WASTELAND);
	}
}
