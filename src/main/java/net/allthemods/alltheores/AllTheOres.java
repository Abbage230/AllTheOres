package net.allthemods.alltheores;


import net.allthemods.alltheores.registry.ATORegistry;
import net.allthemods.alltheores.infos.Reference;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class AllTheOres {
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    public AllTheOres(IEventBus modEventBus, ModContainer modContainer) {
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.COMMON_SPEC);
        ATORegistry.FLUID_TYPES.register(modEventBus);
        ATORegistry.FLUIDS.register(modEventBus);
        ATORegistry.BLOCKS.register(modEventBus);
        ATORegistry.ITEMS.register(modEventBus);
        if (ModList.get().isLoaded("mekanism")) {
            ATORegistry.SLURRYS.register(modEventBus);
        }
        Reference.CREATIVE_TABS.register(modEventBus);
        setupLogFilter();
    }


    private static void setupLogFilter() {
        var rootLogger = LogManager.getRootLogger();
        if (rootLogger instanceof org.apache.logging.log4j.core.Logger logger) {
            logger.addFilter(new SetBlockMessageFilter());
        } else {
            LOGGER.error("Registration failed with unexpected class: {}", rootLogger.getClass());
        }
    }

}
