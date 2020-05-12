package fireshredder24.breachingcharges.util;

import fireshredder24.breachingcharges.Reference;
import fireshredder24.breachingcharges.blocks.BlockItemBase;
import fireshredder24.breachingcharges.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // For ITEMS ONLY
    public static final RegistryObject<Item> ITEM_ASH = ITEMS.register("ash", ItemBase::new);
    public static final RegistryObject<Item> ITEM_LYE = ITEMS.register("lye", ItemBase::new);
    public static final RegistryObject<Item> ITEM_FAT = ITEMS.register("fat", ItemBase::new); // TODO make texture
    public static final RegistryObject<Item> ITEM_POT = ITEMS.register("pot", ItemBase::new);
    public static final RegistryObject<Item> ITEM_GLYCEROL = ITEMS.register("glycerol", ItemBase::new);
    public static final RegistryObject<Item> ITEM_NITRIC_ACID = ITEMS.register("nitric_acid", ItemBase::new);
    public static final RegistryObject<Item> ITEM_SULFUR = ITEMS.register("sulfur", ItemBase::new);
    public static final RegistryObject<Item> ITEM_SULFURIC_ACID = ITEMS.register("sulfuric_acid", ItemBase::new);
    public static final RegistryObject<Item> ITEM_WAVESHAPER = ITEMS.register("waveshaper", ItemBase::new);
    public static final RegistryObject<Item> ITEM_BLASTING_CAP = ITEMS.register("blasting_cap", ItemBase::new); // TODO Make texture
    public static final RegistryObject<Item> ITEM_OLEUM = ITEMS.register("oleum", ItemBase::new);
    public static final RegistryObject<Item> ITEM_CATALYST = ITEMS.register("catalyst", ItemBase::new);
    public static final RegistryObject<Item> ITEM_NITROGLYCERIN = ITEMS.register("nitroglycerin", ItemBase::new);

    // Block Items
    public static final RegistryObject<Item> BLOCK_ITEM_MIXER = ITEMS.register("mixer", () -> new BlockItemBase(BlockInit.BLOCK_MIXER.get()));
}
