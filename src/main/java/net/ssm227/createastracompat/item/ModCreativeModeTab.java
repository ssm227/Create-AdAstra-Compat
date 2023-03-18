package net.ssm227.createastracompat.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("createastracompattab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CRUSHED_DESH_ORE.get());
        };
    };
}
