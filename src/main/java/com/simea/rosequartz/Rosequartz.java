package com.simea.rosequartz;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.simea.rosequartz.init.BlockInit;
import com.simea.rosequartz.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Rosequartz.MODID)
public class Rosequartz
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "rosequartz";

    public Rosequartz()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        
        modEventBus.addListener(this::commonSetup);
        
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }
    
    private void commonSetup(final FMLCommonSetupEvent event)
    {
    	
    }
    
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    	
    }
}
