package fireshredder24.breachingcharges.util;

import fireshredder24.breachingcharges.Reference;
import fireshredder24.breachingcharges.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // For ITEMS ONLY
    public static final RegistryObject<Item> ITEM_ASH = ITEMS.register("ash", ItemBase::new);
}
