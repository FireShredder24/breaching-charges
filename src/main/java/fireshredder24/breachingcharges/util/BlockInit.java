package fireshredder24.breachingcharges.util;

import fireshredder24.breachingcharges.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // For BLOCKS ONLY
    public static final RegistryObject<Block> BLOCK_MIXER = BLOCKS.register("mixer", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(1.5f, 6f).sound(SoundType.METAL)));
}
