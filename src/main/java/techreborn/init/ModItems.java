package techreborn.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import reborncore.common.util.BucketHandler;
import techreborn.Core;
import techreborn.items.*;
import techreborn.items.armor.ItemLapotronPack;
import techreborn.items.armor.ItemLithiumBatpack;
import techreborn.items.tools.*;

public class ModItems {


    //This are deprected to stop people using them in the recipes.
    @Deprecated
    public static Item gems;
    @Deprecated
    public static Item ingots;
    @Deprecated
    public static Item nuggets;
    @Deprecated
    public static Item dusts;
    @Deprecated
    public static Item smallDusts;
    @Deprecated
    public static Item parts;
    @Deprecated
    public static Item cells;
    public static Item rockCutter;
    public static Item lithiumBatpack;
    public static Item lapotronpack;
    public static Item omniTool;
    public static Item advancedDrill;
    public static Item lapotronicOrb;
    public static Item manuel;
    public static Item uuMatter;
    public static Item plate;
    public static Item crushedOre;
    public static Item purifiedCrushedOre;
    public static Item cloakingDevice;

    public static Item bucketBerylium;
    public static Item bucketcalcium;
    public static Item bucketcalciumcarbonate;
    public static Item bucketChlorite;
    public static Item bucketDeuterium;
    public static Item bucketGlyceryl;
    public static Item bucketHelium;
    public static Item bucketHelium3;
    public static Item bucketHeliumplasma;
    public static Item bucketHydrogen;
    public static Item bucketLithium;
    public static Item bucketMercury;
    public static Item bucketMethane;
    public static Item bucketNitrocoalfuel;
    public static Item bucketNitrofuel;
    public static Item bucketNitrogen;
    public static Item bucketNitrogendioxide;
    public static Item bucketPotassium;
    public static Item bucketSilicon;
    public static Item bucketSodium;
    public static Item bucketSodiumpersulfate;
    public static Item bucketTritium;
    public static Item bucketWolframium;

    public static Item upgrades;


    public static void init() {
        gems = new ItemGems();
        GameRegistry.registerItem(gems, "gem");
        ingots = new ItemIngots();
        GameRegistry.registerItem(ingots, "ingot");
        dusts = new ItemDusts();
        GameRegistry.registerItem(dusts, "dust");
        smallDusts = new ItemDustsSmall();
        GameRegistry.registerItem(smallDusts, "smallDust");
        plate = new ItemPlates();
        GameRegistry.registerItem(plate, "plates");
        nuggets = new ItemNuggets();
        GameRegistry.registerItem(nuggets, "nuggets");
        crushedOre = new ItemCrushedOre();
        GameRegistry.registerItem(crushedOre, "crushedore");
        purifiedCrushedOre = new ItemPurifiedCrushedOre();
        GameRegistry.registerItem(purifiedCrushedOre, "purifiedCrushedOre");
        parts = new ItemParts();
        GameRegistry.registerItem(parts, "part");
        cells = new ItemCells();
        GameRegistry.registerItem(cells, "cell");
        rockCutter = new ItemRockCutter(ToolMaterial.EMERALD);
        GameRegistry.registerItem(rockCutter, "rockCutter");
        lithiumBatpack = new ItemLithiumBatpack(ArmorMaterial.DIAMOND, 7, 1);
        GameRegistry.registerItem(lithiumBatpack, "lithiumBatpack");
        lapotronpack = new ItemLapotronPack(ArmorMaterial.DIAMOND, 7, 1);
        GameRegistry.registerItem(lapotronpack, "lapotronPack");
        lapotronicOrb = new ItemLapotronicOrb();
        GameRegistry.registerItem(lapotronicOrb, "lapotronicOrb");
        omniTool = new ItemOmniTool(ToolMaterial.EMERALD);
        GameRegistry.registerItem(omniTool, "omniTool");
        advancedDrill = new ItemAdvancedDrill();
        GameRegistry.registerItem(advancedDrill, "advancedDrill");
        manuel = new ItemTechPda();
        GameRegistry.registerItem(manuel, "techmanuel");
        uuMatter = new ItemUUmatter();
        GameRegistry.registerItem(uuMatter, "uumatter");

        upgrades = new ItemUpgrade();
        GameRegistry.registerItem(upgrades, "upgrades");

        cloakingDevice = new ItemCloakingDevice();
        GameRegistry.registerItem(cloakingDevice, "cloakingdevice");

        // buckets
        bucketBerylium = new ItemFluidbucket(ModFluids.BlockFluidBerylium);
        bucketBerylium.setUnlocalizedName("bucketberylium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketBerylium, "bucketberylium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidberylium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketBerylium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidBerylium, bucketBerylium);

        bucketcalcium = new ItemFluidbucket(ModFluids.BlockFluidCalcium);
        bucketcalcium.setUnlocalizedName("bucketcalcium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketcalcium, "bucketcalcium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidcalcium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketcalcium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidCalcium, bucketcalcium);

        bucketcalciumcarbonate = new ItemFluidbucket(ModFluids.BlockFluidCalciumCarbonate);
        bucketcalciumcarbonate.setUnlocalizedName("bucketcalciumcarbonate").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketcalciumcarbonate, "bucketcalciumcarbonate");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidcalciumcarbonate", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketcalciumcarbonate), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidCalciumCarbonate, bucketcalciumcarbonate);

        bucketChlorite = new ItemFluidbucket(ModFluids.BlockFluidChlorite);
        bucketChlorite.setUnlocalizedName("bucketchlorite").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketChlorite, "bucketcalchlorite");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidchlorite", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketcalciumcarbonate), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidChlorite, bucketChlorite);

        bucketDeuterium = new ItemFluidbucket(ModFluids.BlockFluidDeuterium);
        bucketDeuterium.setUnlocalizedName("bucketdeuterium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketDeuterium, "bucketdeuterium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluiddeuterium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketDeuterium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidDeuterium, bucketDeuterium);

        bucketGlyceryl = new ItemFluidbucket(ModFluids.BlockFluidGlyceryl);
        bucketGlyceryl.setUnlocalizedName("bucketglyceryl").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketGlyceryl, "bucketglyceryl");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidglyceryl", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketGlyceryl), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidGlyceryl, bucketGlyceryl);

        bucketHelium = new ItemFluidbucket(ModFluids.BlockFluidHelium);
        bucketHelium.setUnlocalizedName("buckethelium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketHelium, "buckethelium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidhelium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketHelium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidHelium, bucketHelium);

        bucketHelium3 = new ItemFluidbucket(ModFluids.BlockFluidHelium3);
        bucketHelium3.setUnlocalizedName("buckethelium3").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketHelium3, "buckethelium3");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidhelium3", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketHelium3), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidHelium3, bucketHelium3);

        bucketHeliumplasma = new ItemFluidbucket(ModFluids.BlockFluidHeliumplasma);
        bucketHeliumplasma.setUnlocalizedName("bucketheliumplasma").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketHeliumplasma, "bucketheliumplasma");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidheliumplasma", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketHeliumplasma), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidHeliumplasma, bucketHeliumplasma);

        bucketHydrogen = new ItemFluidbucket(ModFluids.BlockFluidHydrogen);
        bucketHydrogen.setUnlocalizedName("buckethydrogen").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketHydrogen, "buckethydrogen");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidhydrogen", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketHydrogen), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidHydrogen, bucketHydrogen);

        bucketLithium = new ItemFluidbucket(ModFluids.BlockFluidLithium);
        bucketLithium.setUnlocalizedName("bucketlithium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketLithium, "bucketlithium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidlithium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketLithium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidLithium, bucketLithium);

        bucketMercury = new ItemFluidbucket(ModFluids.BlockFluidMercury);
        bucketMercury.setUnlocalizedName("bucketmercury").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketMercury, "bucketmercury");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidmercury", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketMercury), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidMercury, bucketMercury);

        bucketMethane = new ItemFluidbucket(ModFluids.BlockFluidMethane);
        bucketMethane.setUnlocalizedName("bucketmethane").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketMethane, "bucketmethane");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidmethane", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketMethane), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidMethane, bucketMethane);

        bucketNitrocoalfuel = new ItemFluidbucket(ModFluids.BlockFluidNitrocoalfuel);
        bucketNitrocoalfuel.setUnlocalizedName("bucketnitrocoalfuel").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketNitrocoalfuel, "bucketnitrocoalfuel");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidnitrocoalfuel", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketNitrocoalfuel), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidNitrocoalfuel, bucketNitrocoalfuel);

        bucketNitrofuel = new ItemFluidbucket(ModFluids.BlockFluidNitrofuel);
        bucketNitrofuel.setUnlocalizedName("bucketnitrofuel").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketNitrofuel, "bucketnitrofuel");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidnitrofuel", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketNitrofuel), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidNitrofuel, bucketNitrofuel);

        bucketNitrogen = new ItemFluidbucket(ModFluids.BlockFluidNitrogen);
        bucketNitrogen.setUnlocalizedName("bucketnitrogen").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketNitrogen, "bucketnitrogen");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidnitrogen", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketNitrogen), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidNitrogen, bucketNitrogen);

        bucketNitrogendioxide = new ItemFluidbucket(ModFluids.BlockFluidNitrogendioxide);
        bucketNitrogendioxide.setUnlocalizedName("bucketnitrogendioxide").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketNitrogendioxide, "bucketnitrogendioxide");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidnitrogendioxide", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketNitrogendioxide), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidNitrogendioxide, bucketNitrogendioxide);

        bucketPotassium = new ItemFluidbucket(ModFluids.BlockFluidPotassium);
        bucketPotassium.setUnlocalizedName("bucketpotassium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketPotassium, "bucketpotassium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidpotassium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketPotassium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidPotassium, bucketPotassium);

        bucketSilicon = new ItemFluidbucket(ModFluids.BlockFluidSilicon);
        bucketSilicon.setUnlocalizedName("bucketsilicon").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketSilicon, "bucketsilicon");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidsilicon", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketSilicon), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidSilicon, bucketSilicon);

        bucketSodium = new ItemFluidbucket(ModFluids.BlockFluidSodium);
        bucketSodium.setUnlocalizedName("bucketsodium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketSodium, "bucketsodium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidsodium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketSodium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidSodium, bucketSodium);

        bucketSodiumpersulfate = new ItemFluidbucket(ModFluids.BlockFluidSodiumpersulfate);
        bucketSodiumpersulfate.setUnlocalizedName("bucketsodiumpersulfate").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketSodiumpersulfate, "bucketsodiumpersulfate");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidsodiumpersulfate", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketSodiumpersulfate), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidSodiumpersulfate, bucketSodiumpersulfate);

        bucketTritium = new ItemFluidbucket(ModFluids.BlockFluidTritium);
        bucketTritium.setUnlocalizedName("buckettritium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketTritium, "buckettritium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidtritium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketTritium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidTritium, bucketTritium);

        bucketWolframium = new ItemFluidbucket(ModFluids.BlockFluidWolframium);
        bucketWolframium.setUnlocalizedName("bucketwolframium").setContainerItem(Items.bucket);
        GameRegistry.registerItem(bucketWolframium, "bucketwolframium");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidwolframium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketWolframium), new ItemStack(Items.bucket));
        BucketHandler.INSTANCE.buckets.put(ModFluids.BlockFluidWolframium, bucketWolframium);

        MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);


        Core.logHelper.info("TechReborns Items Loaded");

        registerOreDict();
    }

    public static void registerOreDict() {

        OreDictionary.registerOre("gemRuby", ItemGems.getGemByName("ruby"));
        OreDictionary.registerOre("gemSapphire", ItemGems.getGemByName("sapphire"));
        OreDictionary.registerOre("gemPeridot", ItemGems.getGemByName("peridot"));
        OreDictionary.registerOre("gemRedGarnet", ItemGems.getGemByName("redGarnet"));
        OreDictionary.registerOre("gemYellowGarnet", ItemGems.getGemByName("yellowGarnet"));

        // Dusts
        OreDictionary.registerOre("dustAlmandine", ItemDusts.getDustByName("almandine"));
        OreDictionary.registerOre("dustAluminumBrass", ItemDusts.getDustByName("aluminumBrass"));
        OreDictionary.registerOre("dustAluminum", ItemDusts.getDustByName("aluminum"));
        OreDictionary.registerOre("dustAluminium", ItemDusts.getDustByName("aluminum"));
        OreDictionary.registerOre("dustAlumite", ItemDusts.getDustByName("alumite"));
        OreDictionary.registerOre("dustAndradite", ItemDusts.getDustByName("andradite"));
        OreDictionary.registerOre("dustAntimony", ItemDusts.getDustByName("antimony"));
        OreDictionary.registerOre("dustArdite", ItemDusts.getDustByName("ardite"));
        OreDictionary.registerOre("dustAsh", ItemDusts.getDustByName("ashes"));
        OreDictionary.registerOre("dustBasalt", ItemDusts.getDustByName("basalt"));
        OreDictionary.registerOre("dustBauxite", ItemDusts.getDustByName("bauxite"));
        OreDictionary.registerOre("dustBiotite", ItemDusts.getDustByName("biotite"));
        OreDictionary.registerOre("dustBrass", ItemDusts.getDustByName("brass"));
        OreDictionary.registerOre("dustBronze", ItemDusts.getDustByName("bronze"));
        OreDictionary.registerOre("dustCadmium", ItemDusts.getDustByName("cadmium"));
        OreDictionary.registerOre("dustCalcite", ItemDusts.getDustByName("calcite"));
        OreDictionary.registerOre("dustCharcoal", ItemDusts.getDustByName("charcoal"));
        OreDictionary.registerOre("dustChrome", ItemDusts.getDustByName("chrome"));
        OreDictionary.registerOre("dustCinnabar", ItemDusts.getDustByName("cinnabar"));
        OreDictionary.registerOre("dustClay", ItemDusts.getDustByName("clay"));
        OreDictionary.registerOre("dustCoal", ItemDusts.getDustByName("coal"));
        OreDictionary.registerOre("dustCobalt", ItemDusts.getDustByName("cobalt"));
        OreDictionary.registerOre("dustCopper", ItemDusts.getDustByName("copper"));
        OreDictionary.registerOre("dustCupronickel", ItemDusts.getDustByName("cupronickel"));
        OreDictionary.registerOre("dustDarkAsh", ItemDusts.getDustByName("darkAshes"));
        OreDictionary.registerOre("dustDarkIron", ItemDusts.getDustByName("darkIron"));
        OreDictionary.registerOre("dustDiamond", ItemDusts.getDustByName("diamond"));
        OreDictionary.registerOre("dustElectrum", ItemDusts.getDustByName("electrum"));
        OreDictionary.registerOre("dustEmerald", ItemDusts.getDustByName("emerald"));
        OreDictionary.registerOre("dustEnderEye", ItemDusts.getDustByName("enderEye"));
        OreDictionary.registerOre("dustEnderPearl", ItemDusts.getDustByName("enderPearl"));
        OreDictionary.registerOre("dustEndstone", ItemDusts.getDustByName("endstone"));
        OreDictionary.registerOre("dustFlint", ItemDusts.getDustByName("flint"));
        OreDictionary.registerOre("dustGalena", ItemDusts.getDustByName("galena"));
        OreDictionary.registerOre("dustGold", ItemDusts.getDustByName("gold"));
        OreDictionary.registerOre("dustGraphite", ItemDusts.getDustByName("graphite"));
        OreDictionary.registerOre("dustGrossular", ItemDusts.getDustByName("grossular"));
        OreDictionary.registerOre("dustIndium", ItemDusts.getDustByName("indium"));
        OreDictionary.registerOre("dustInvar", ItemDusts.getDustByName("invar"));
        OreDictionary.registerOre("dustIridium", ItemDusts.getDustByName("iridium"));
        OreDictionary.registerOre("dustIron", ItemDusts.getDustByName("iron"));
        OreDictionary.registerOre("dustKanthal", ItemDusts.getDustByName("kanthal"));
        OreDictionary.registerOre("dustLapis", ItemDusts.getDustByName("lapis"));
        OreDictionary.registerOre("dustLazurite", ItemDusts.getDustByName("lazurite"));
        OreDictionary.registerOre("dustLead", ItemDusts.getDustByName("lead"));
        OreDictionary.registerOre("dustLimestone", ItemDusts.getDustByName("limestone"));
        OreDictionary.registerOre("dustLodestone", ItemDusts.getDustByName("lodestone"));
        OreDictionary.registerOre("dustMagnesium", ItemDusts.getDustByName("magnesium"));
        OreDictionary.registerOre("dustMagnetite", ItemDusts.getDustByName("magnetite"));
        OreDictionary.registerOre("dustManganese", ItemDusts.getDustByName("manganese"));
        OreDictionary.registerOre("dustManyullyn", ItemDusts.getDustByName("manyullyn"));
        OreDictionary.registerOre("dustMarble", ItemDusts.getDustByName("marble"));
        OreDictionary.registerOre("dustMithril", ItemDusts.getDustByName("mithril"));
        OreDictionary.registerOre("dustNetherrack", ItemDusts.getDustByName("netherrack"));
        OreDictionary.registerOre("dustNichrome", ItemDusts.getDustByName("nichrome"));
        OreDictionary.registerOre("dustNickel", ItemDusts.getDustByName("nickel"));
        OreDictionary.registerOre("dustObsidian", ItemDusts.getDustByName("obsidian"));
        OreDictionary.registerOre("dustOsmium", ItemDusts.getDustByName("osmium"));
        OreDictionary.registerOre("dustPeridot", ItemDusts.getDustByName("peridot"));
        OreDictionary.registerOre("dustPhosphorous", ItemDusts.getDustByName("phosphorous"));
        OreDictionary.registerOre("dustPlatinum", ItemDusts.getDustByName("platinum"));
        OreDictionary.registerOre("dustPotassiumFeldspar", ItemDusts.getDustByName("potassiumFeldspar"));
        OreDictionary.registerOre("dustPyrite", ItemDusts.getDustByName("pyrite"));
        OreDictionary.registerOre("dustPyrope", ItemDusts.getDustByName("pyrope"));
        OreDictionary.registerOre("dustRedGarnet", ItemDusts.getDustByName("redGarnet"));
        OreDictionary.registerOre("dustRedrock", ItemDusts.getDustByName("redrock"));
        OreDictionary.registerOre("dustRuby", ItemDusts.getDustByName("ruby"));
        OreDictionary.registerOre("dustSaltpeter", ItemDusts.getDustByName("saltpeter"));
        OreDictionary.registerOre("dustSapphire", ItemDusts.getDustByName("sapphire"));
        OreDictionary.registerOre("dustSilver", ItemDusts.getDustByName("silver"));
        OreDictionary.registerOre("dustSilicon", ItemDusts.getDustByName("silicon"));
        OreDictionary.registerOre("dustSodalite", ItemDusts.getDustByName("sodalite"));
        OreDictionary.registerOre("dustSpessartine", ItemDusts.getDustByName("spessartine"));
        OreDictionary.registerOre("dustSphalerite", ItemDusts.getDustByName("sphalerite"));
        OreDictionary.registerOre("dustSteel", ItemDusts.getDustByName("steel"));
        OreDictionary.registerOre("dustSulfur", ItemDusts.getDustByName("sulfur"));
        OreDictionary.registerOre("dustTellurium", ItemDusts.getDustByName("tellurium"));
        OreDictionary.registerOre("dustTeslatite", ItemDusts.getDustByName("teslatite"));
        OreDictionary.registerOre("dustTetrahedrite", ItemDusts.getDustByName("tetrahedrite"));
        OreDictionary.registerOre("dustCopper", ItemDusts.getDustByName("copper"));
        OreDictionary.registerOre("dustTin", ItemDusts.getDustByName("tin"));
        OreDictionary.registerOre("dustTitanium", ItemDusts.getDustByName("titanium"));
        OreDictionary.registerOre("dustTungsten", ItemDusts.getDustByName("tungsten"));
        OreDictionary.registerOre("dustUvarovite", ItemDusts.getDustByName("uvarovite"));
        OreDictionary.registerOre("dustVinteum", ItemDusts.getDustByName("vinteum"));
        OreDictionary.registerOre("dustVoidstone", ItemDusts.getDustByName("voidstone"));
        OreDictionary.registerOre("dustYellowGarnet", ItemDusts.getDustByName("yellowGarnet"));
        OreDictionary.registerOre("dustZinc", ItemDusts.getDustByName("zinc"));
        OreDictionary.registerOre("pulpWood", ItemDusts.getDustByName("sawDust"));


        // Small Dusts
        OreDictionary.registerOre("dustSmallAlmandine", ItemDustsSmall.getSmallDustByName("Almandine"));
        OreDictionary.registerOre("dustSmallAluminumBrass", ItemDustsSmall.getSmallDustByName("AluminumBrass"));
        OreDictionary.registerOre("dustSmallAluminum", ItemDustsSmall.getSmallDustByName("Aluminum"));
        OreDictionary.registerOre("dustSmallAluminium", ItemDustsSmall.getSmallDustByName("Aluminum"));
        OreDictionary.registerOre("dustSmallAlumite", ItemDustsSmall.getSmallDustByName("Alumite"));
        OreDictionary.registerOre("dustSmallAndradite", ItemDustsSmall.getSmallDustByName("Andradite"));
        OreDictionary.registerOre("dustSmallAntimony", ItemDustsSmall.getSmallDustByName("Antimony"));
        OreDictionary.registerOre("dustSmallArdite", ItemDustsSmall.getSmallDustByName("Ardite"));
        OreDictionary.registerOre("dustSmallAsh", ItemDustsSmall.getSmallDustByName("Ashes"));
        OreDictionary.registerOre("dustSmallBasalt", ItemDustsSmall.getSmallDustByName("Basalt"));
        OreDictionary.registerOre("dustSmallBauxite", ItemDustsSmall.getSmallDustByName("Bauxite"));
        OreDictionary.registerOre("dustSmallBiotite", ItemDustsSmall.getSmallDustByName("Biotite"));
        OreDictionary.registerOre("dustSmallBrass", ItemDustsSmall.getSmallDustByName("Brass"));
        OreDictionary.registerOre("dustSmallBronze", ItemDustsSmall.getSmallDustByName("Bronze"));
        OreDictionary.registerOre("dustSmallCadmium", ItemDustsSmall.getSmallDustByName("Cadmium"));
        OreDictionary.registerOre("dustSmallCalcite", ItemDustsSmall.getSmallDustByName("Calcite"));
        OreDictionary.registerOre("dustSmallCharcoal", ItemDustsSmall.getSmallDustByName("Charcoal"));
        OreDictionary.registerOre("dustSmallChrome", ItemDustsSmall.getSmallDustByName("Chrome"));
        OreDictionary.registerOre("dustSmallCinnabar", ItemDustsSmall.getSmallDustByName("Cinnabar"));
        OreDictionary.registerOre("dustSmallClay", ItemDustsSmall.getSmallDustByName("Clay"));
        OreDictionary.registerOre("dustSmallCoal", ItemDustsSmall.getSmallDustByName("Coal"));
        OreDictionary.registerOre("dustSmallCobalt", ItemDustsSmall.getSmallDustByName("Cobalt"));
        OreDictionary.registerOre("dustSmallCopper", ItemDustsSmall.getSmallDustByName("Copper"));
        OreDictionary.registerOre("dustSmallCupronickel", ItemDustsSmall.getSmallDustByName("Cupronickel"));
        OreDictionary.registerOre("dustSmallDarkAsh", ItemDustsSmall.getSmallDustByName("DarkAshes"));
        OreDictionary.registerOre("dustSmallDarkIron", ItemDustsSmall.getSmallDustByName("DarkIron"));
        OreDictionary.registerOre("dustSmallDiamond", ItemDustsSmall.getSmallDustByName("Diamond"));
        OreDictionary.registerOre("dustSmallElectrum", ItemDustsSmall.getSmallDustByName("Electrum"));
        OreDictionary.registerOre("dustSmallEmerald", ItemDustsSmall.getSmallDustByName("Emerald"));
        OreDictionary.registerOre("dustSmallEnderEye", ItemDustsSmall.getSmallDustByName("EnderEye"));
        OreDictionary.registerOre("dustSmallEnderPearl", ItemDustsSmall.getSmallDustByName("EnderPearl"));
        OreDictionary.registerOre("dustSmallEndstone", ItemDustsSmall.getSmallDustByName("Endstone"));
        OreDictionary.registerOre("dustSmallFlint", ItemDustsSmall.getSmallDustByName("Flint"));
        OreDictionary.registerOre("dustSmallGalena", ItemDustsSmall.getSmallDustByName("Galena"));
        OreDictionary.registerOre("dustSmallGlowstone", ItemDustsSmall.getSmallDustByName("Glowstone"));
        OreDictionary.registerOre("dustSmallGold", ItemDustsSmall.getSmallDustByName("Gold"));
        OreDictionary.registerOre("dustSmallGraphite", ItemDustsSmall.getSmallDustByName("Graphite"));
        OreDictionary.registerOre("dustSmallGrossular", ItemDustsSmall.getSmallDustByName("Grossular"));
        OreDictionary.registerOre("dustSmallGunpowder", ItemDustsSmall.getSmallDustByName("Gunpowder"));
        OreDictionary.registerOre("dustSmallIndium", ItemDustsSmall.getSmallDustByName("Indium"));
        OreDictionary.registerOre("dustSmallInvar", ItemDustsSmall.getSmallDustByName("Invar"));
        OreDictionary.registerOre("dustSmallIridium", ItemDustsSmall.getSmallDustByName("Iridium"));
        OreDictionary.registerOre("dustSmallIron", ItemDustsSmall.getSmallDustByName("Iron"));
        OreDictionary.registerOre("dustSmallKanthal", ItemDustsSmall.getSmallDustByName("Kanthal"));
        OreDictionary.registerOre("dustSmallLapis", ItemDustsSmall.getSmallDustByName("Lapis"));
        OreDictionary.registerOre("dustSmallLazurite", ItemDustsSmall.getSmallDustByName("Lazurite"));
        OreDictionary.registerOre("dustSmallLead", ItemDustsSmall.getSmallDustByName("Lead"));
        OreDictionary.registerOre("dustSmallLimestone", ItemDustsSmall.getSmallDustByName("Limestone"));
        OreDictionary.registerOre("dustSmallLodestone", ItemDustsSmall.getSmallDustByName("Lodestone"));
        OreDictionary.registerOre("dustSmallMagnesium", ItemDustsSmall.getSmallDustByName("Magnesium"));
        OreDictionary.registerOre("dustSmallMagnetite", ItemDustsSmall.getSmallDustByName("Magnetite"));
        OreDictionary.registerOre("dustSmallManganese", ItemDustsSmall.getSmallDustByName("Manganese"));
        OreDictionary.registerOre("dustSmallManyullyn", ItemDustsSmall.getSmallDustByName("Manyullyn"));
        OreDictionary.registerOre("dustSmallMarble", ItemDustsSmall.getSmallDustByName("Marble"));
        OreDictionary.registerOre("dustSmallMithril", ItemDustsSmall.getSmallDustByName("Mithril"));
        OreDictionary.registerOre("dustSmallNetherrack", ItemDustsSmall.getSmallDustByName("Netherrack"));
        OreDictionary.registerOre("dustSmallNichrome", ItemDustsSmall.getSmallDustByName("Nichrome"));
        OreDictionary.registerOre("dustSmallNickel", ItemDustsSmall.getSmallDustByName("Nickel"));
        OreDictionary.registerOre("dustSmallObsidian", ItemDustsSmall.getSmallDustByName("Obsidian"));
        OreDictionary.registerOre("dustSmallOsmium", ItemDustsSmall.getSmallDustByName("Osmium"));
        OreDictionary.registerOre("dustSmallPeridot", ItemDustsSmall.getSmallDustByName("Peridot"));
        OreDictionary.registerOre("dustSmallPhosphorous", ItemDustsSmall.getSmallDustByName("Phosphorous"));
        OreDictionary.registerOre("dustSmallPlatinum", ItemDustsSmall.getSmallDustByName("Platinum"));
        OreDictionary.registerOre("dustSmallPotassiumFeldspar", ItemDustsSmall.getSmallDustByName("PotassiumFeldspar"));
        OreDictionary.registerOre("dustSmallPyrite", ItemDustsSmall.getSmallDustByName("Pyrite"));
        OreDictionary.registerOre("dustSmallPyrope", ItemDustsSmall.getSmallDustByName("Pyrope"));
        OreDictionary.registerOre("dustSmallRedGarnet", ItemDustsSmall.getSmallDustByName("RedGarnet"));
        OreDictionary.registerOre("dustSmallRedrock", ItemDustsSmall.getSmallDustByName("Redrock"));
        OreDictionary.registerOre("dustSmallRedstone", ItemDustsSmall.getSmallDustByName("Redstone"));
        OreDictionary.registerOre("dustSmallRuby", ItemDustsSmall.getSmallDustByName("Ruby"));
        OreDictionary.registerOre("dustSmallSaltpeter", ItemDustsSmall.getSmallDustByName("Saltpeter"));
        OreDictionary.registerOre("dustSmallSapphire", ItemDustsSmall.getSmallDustByName("Sapphire"));
        OreDictionary.registerOre("dustSmallSilver", ItemDustsSmall.getSmallDustByName("Silver"));
        OreDictionary.registerOre("dustSmallSilicon", ItemDustsSmall.getSmallDustByName("Silicon"));
        OreDictionary.registerOre("dustSmallSodalite", ItemDustsSmall.getSmallDustByName("Sodalite"));
        OreDictionary.registerOre("dustSmallSpessartine", ItemDustsSmall.getSmallDustByName("Spessartine"));
        OreDictionary.registerOre("dustSmallSphalerite", ItemDustsSmall.getSmallDustByName("Sphalerite"));
        OreDictionary.registerOre("dustSmallSteel", ItemDustsSmall.getSmallDustByName("Steel"));
        OreDictionary.registerOre("dustSmallSulfur", ItemDustsSmall.getSmallDustByName("Sulfur"));
        OreDictionary.registerOre("dustSmallTellurium", ItemDustsSmall.getSmallDustByName("Tellurium"));
        OreDictionary.registerOre("dustSmallTeslatite", ItemDustsSmall.getSmallDustByName("Teslatite"));
        OreDictionary.registerOre("dustSmallTetrahedrite", ItemDustsSmall.getSmallDustByName("Tetrahedrite"));
        OreDictionary.registerOre("dustSmallCopper", ItemDustsSmall.getSmallDustByName("Copper"));
        OreDictionary.registerOre("dustSmallTin", ItemDustsSmall.getSmallDustByName("Tin"));
        OreDictionary.registerOre("dustSmallTitanium", ItemDustsSmall.getSmallDustByName("Titanium"));
        OreDictionary.registerOre("dustSmallTungsten", ItemDustsSmall.getSmallDustByName("Tungsten"));
        OreDictionary.registerOre("dustSmallUvarovite", ItemDustsSmall.getSmallDustByName("Uvarovite"));
        OreDictionary.registerOre("dustSmallVinteum", ItemDustsSmall.getSmallDustByName("Vinteum"));
        OreDictionary.registerOre("dustSmallVoidstone", ItemDustsSmall.getSmallDustByName("Voidstone"));
        OreDictionary.registerOre("dustSmallYellowGarnet", ItemDustsSmall.getSmallDustByName("YellowGarnet"));
        OreDictionary.registerOre("dustSmallZinc", ItemDustsSmall.getSmallDustByName("Zinc"));

        // Ingots
        OreDictionary.registerOre("ingotAluminum", ItemIngots.getIngotByName("aluminum"));
        OreDictionary.registerOre("ingotAluminium", ItemIngots.getIngotByName("aluminum"));
        OreDictionary.registerOre("ingotAntimony", ItemIngots.getIngotByName("antimony"));
        OreDictionary.registerOre("ingotBatteryAlloy", ItemIngots.getIngotByName("batteryAlloy"));
        OreDictionary.registerOre("ingotBlueAlloy", ItemIngots.getIngotByName("blueAlloy"));
        OreDictionary.registerOre("ingotBrass", ItemIngots.getIngotByName("brass"));
        OreDictionary.registerOre("ingotBronze", ItemIngots.getIngotByName("bronze"));
        OreDictionary.registerOre("ingotCadmium", ItemIngots.getIngotByName("cadmium"));
        OreDictionary.registerOre("ingotChrome", ItemIngots.getIngotByName("chrome"));
        OreDictionary.registerOre("ingotCopper", ItemIngots.getIngotByName("copper"));
        OreDictionary.registerOre("ingotCupronickel", ItemIngots.getIngotByName("cupronickel"));
        OreDictionary.registerOre("ingotElectrum", ItemIngots.getIngotByName("electrum"));
        OreDictionary.registerOre("ingotIndium", ItemIngots.getIngotByName("indium"));
        OreDictionary.registerOre("ingotInvar", ItemIngots.getIngotByName("invar"));
        OreDictionary.registerOre("ingotIridium", ItemIngots.getIngotByName("iridium"));
        OreDictionary.registerOre("ingotKanthal", ItemIngots.getIngotByName("kanthal"));
        OreDictionary.registerOre("ingotLead", ItemIngots.getIngotByName("lead"));
        OreDictionary.registerOre("ingotLodestone", ItemIngots.getIngotByName("lodestone"));
        OreDictionary.registerOre("ingotMagnalium", ItemIngots.getIngotByName("magnalium"));
        OreDictionary.registerOre("ingotNichrome", ItemIngots.getIngotByName("nichrome"));
        OreDictionary.registerOre("ingotNickel", ItemIngots.getIngotByName("nickel"));
        OreDictionary.registerOre("ingotOsmium", ItemIngots.getIngotByName("osmium"));
        OreDictionary.registerOre("ingotPlatinum", ItemIngots.getIngotByName("platinum"));
        OreDictionary.registerOre("ingotRedAlloy", ItemIngots.getIngotByName("redAlloy"));
        OreDictionary.registerOre("ingotSilver", ItemIngots.getIngotByName("silver"));
        OreDictionary.registerOre("ingotSteel", ItemIngots.getIngotByName("steel"));
        OreDictionary.registerOre("ingotTellurium", ItemIngots.getIngotByName("tellurium"));
        OreDictionary.registerOre("ingotTin", ItemIngots.getIngotByName("tin"));
        OreDictionary.registerOre("ingotTitanium", ItemIngots.getIngotByName("titanium"));
        OreDictionary.registerOre("ingotTungsten", ItemIngots.getIngotByName("tungsten"));
        OreDictionary.registerOre("ingotTungstensteel", ItemIngots.getIngotByName("tungstensteel"));
        OreDictionary.registerOre("ingotHotTungstenSteel", ItemIngots.getIngotByName("hotTungstensteel"));
        OreDictionary.registerOre("ingotZinc", ItemIngots.getIngotByName("zinc"));

        // Nuggets
        OreDictionary.registerOre("nuggetAluminum", ItemNuggets.getNuggetByName("aluminum"));
        OreDictionary.registerOre("nuggetAluminium", ItemNuggets.getNuggetByName("aluminum"));
        OreDictionary.registerOre("nuggetAntimony", ItemNuggets.getNuggetByName("antimony"));
        OreDictionary.registerOre("nuggetBrass", ItemNuggets.getNuggetByName("brass"));
        OreDictionary.registerOre("nuggetBronze", ItemNuggets.getNuggetByName("bronze"));
        OreDictionary.registerOre("nuggetChrome", ItemNuggets.getNuggetByName("chrome"));
        OreDictionary.registerOre("nuggetCopper", ItemNuggets.getNuggetByName("copper"));
        OreDictionary.registerOre("nuggetElectrum", ItemNuggets.getNuggetByName("electrum"));
        OreDictionary.registerOre("nuggetInvar", ItemNuggets.getNuggetByName("invar"));
        OreDictionary.registerOre("nuggetIridium", ItemNuggets.getNuggetByName("iridium"));
        OreDictionary.registerOre("nuggetIron", ItemNuggets.getNuggetByName("iron"));
        OreDictionary.registerOre("nuggetLead", ItemNuggets.getNuggetByName("lead"));
        OreDictionary.registerOre("nuggetNickel", ItemNuggets.getNuggetByName("nickel"));
        OreDictionary.registerOre("nuggetOsmium", ItemNuggets.getNuggetByName("osmium"));
        OreDictionary.registerOre("nuggetPlatinum", ItemNuggets.getNuggetByName("platinum"));
        OreDictionary.registerOre("nuggetSilver", ItemNuggets.getNuggetByName("silver"));
        OreDictionary.registerOre("nuggetSteel", ItemNuggets.getNuggetByName("steel"));
        OreDictionary.registerOre("nuggetTin", ItemNuggets.getNuggetByName("tin"));
        OreDictionary.registerOre("nuggetTitanium", ItemNuggets.getNuggetByName("titanium"));
        OreDictionary.registerOre("nuggetTungsten", ItemNuggets.getNuggetByName("tungsten"));
        OreDictionary.registerOre("nuggetZinc", ItemNuggets.getNuggetByName("zinc"));

        // Plates
        OreDictionary.registerOre("plateAluminum", ItemPlates.getPlateByName("aluminum"));
        OreDictionary.registerOre("plateAluminium", ItemPlates.getPlateByName("aluminum"));
        OreDictionary.registerOre("plateBatteryAlloy", ItemPlates.getPlateByName("batteryAlloy"));
        OreDictionary.registerOre("plateBrass", ItemPlates.getPlateByName("brass"));
        OreDictionary.registerOre("plateBronze", ItemPlates.getPlateByName("bronze"));
        OreDictionary.registerOre("plateCoal", ItemPlates.getPlateByName("coal"));
        OreDictionary.registerOre("plateChrome", ItemPlates.getPlateByName("chrome"));
        OreDictionary.registerOre("plateCopper", ItemPlates.getPlateByName("copper"));
        OreDictionary.registerOre("plateDiamond", ItemPlates.getPlateByName("diamond"));
        OreDictionary.registerOre("plateElectrum", ItemPlates.getPlateByName("electrum"));
        OreDictionary.registerOre("plateEmerald", ItemPlates.getPlateByName("emerald"));
        OreDictionary.registerOre("plateGold", ItemPlates.getPlateByName("gold"));
        OreDictionary.registerOre("plateInvar", ItemPlates.getPlateByName("invar"));
        OreDictionary.registerOre("plateIridium", ItemPlates.getPlateByName("iridium"));
        OreDictionary.registerOre("plateIron", ItemPlates.getPlateByName("iron"));
        OreDictionary.registerOre("plateLapis", ItemPlates.getPlateByName("lapis"));
        OreDictionary.registerOre("plateLead", ItemPlates.getPlateByName("lead"));
        OreDictionary.registerOre("plateMagnalium", ItemPlates.getPlateByName("magnalium"));
        OreDictionary.registerOre("plateNickel", ItemPlates.getPlateByName("nickel"));
        OreDictionary.registerOre("plateObsidian", ItemPlates.getPlateByName("obsidian"));
        OreDictionary.registerOre("plateOsmium", ItemPlates.getPlateByName("osmium"));
        OreDictionary.registerOre("platePeridot", ItemPlates.getPlateByName("peridot"));
        OreDictionary.registerOre("platePlatinum", ItemPlates.getPlateByName("platinum"));
        OreDictionary.registerOre("plateRedGarnet", ItemPlates.getPlateByName("redGarnet"));
        OreDictionary.registerOre("plateRedstone", ItemPlates.getPlateByName("redstone"));
        OreDictionary.registerOre("plateRedstoneAlloy", ItemPlates.getPlateByName("redstone"));
        OreDictionary.registerOre("plateRuby", ItemPlates.getPlateByName("ruby"));
        OreDictionary.registerOre("plateSapphire", ItemPlates.getPlateByName("sapphire"));
        OreDictionary.registerOre("plateSilicon", ItemPlates.getPlateByName("silicon"));
        OreDictionary.registerOre("plateSilver", ItemPlates.getPlateByName("silver"));
        OreDictionary.registerOre("plateSteel", ItemPlates.getPlateByName("steel"));
        OreDictionary.registerOre("plateTeslatite", ItemPlates.getPlateByName("teslatite"));
        OreDictionary.registerOre("plateTin", ItemPlates.getPlateByName("tin"));
        OreDictionary.registerOre("plateTitanium", ItemPlates.getPlateByName("titanium"));
        OreDictionary.registerOre("plateTungsten", ItemPlates.getPlateByName("tungsten"));
        OreDictionary.registerOre("plateTungstensteel", ItemPlates.getPlateByName("tungstensteel"));
        OreDictionary.registerOre("plateYellowGarnet", ItemPlates.getPlateByName("yellowGarnet"));
        OreDictionary.registerOre("plateZinc", ItemPlates.getPlateByName("zinc"));

        // Crushed Ore
        OreDictionary.registerOre("crushedAluminum", ItemCrushedOre.getCrushedOreByName("Aluminum"));
        OreDictionary.registerOre("crushedAluminium", ItemCrushedOre.getCrushedOreByName("Aluminum"));
        OreDictionary.registerOre("crushedArdite", ItemCrushedOre.getCrushedOreByName("Ardite"));
        OreDictionary.registerOre("crushedBauxite", ItemCrushedOre.getCrushedOreByName("Bauxite"));
        OreDictionary.registerOre("crushedCadmium", ItemCrushedOre.getCrushedOreByName("Cadmium"));
        OreDictionary.registerOre("crushedCinnabar", ItemCrushedOre.getCrushedOreByName("Cinnabar"));
        OreDictionary.registerOre("crushedCobalt", ItemCrushedOre.getCrushedOreByName("Cobalt"));
        OreDictionary.registerOre("crushedDarkIron", ItemCrushedOre.getCrushedOreByName("DarkIron"));
        OreDictionary.registerOre("crushedGalena", ItemCrushedOre.getCrushedOreByName("Galena"));
        OreDictionary.registerOre("crushedIndium", ItemCrushedOre.getCrushedOreByName("Indium"));
        OreDictionary.registerOre("crushedIridium", ItemCrushedOre.getCrushedOreByName("Iridium"));
        OreDictionary.registerOre("crushedNickel", ItemCrushedOre.getCrushedOreByName("Nickel"));
        OreDictionary.registerOre("crushedOsmium", ItemCrushedOre.getCrushedOreByName("Osmium"));
        OreDictionary.registerOre("crushedPlatinum", ItemCrushedOre.getCrushedOreByName("Platinum"));
        OreDictionary.registerOre("crushedPyrite", ItemCrushedOre.getCrushedOreByName("Pyrite"));
        OreDictionary.registerOre("crushedSphalerite", ItemCrushedOre.getCrushedOreByName("Sphalerite"));
        OreDictionary.registerOre("crushedTetrahedrite", ItemCrushedOre.getCrushedOreByName("Tetrahedrite"));
        OreDictionary.registerOre("crushedTungsten", ItemCrushedOre.getCrushedOreByName("Tungsten"));

        // Purified Crushed Ore
        OreDictionary.registerOre("crushedPurifiedAluminum", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Aluminum"));
        OreDictionary.registerOre("crushedPurifiedAluminium", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Aluminum"));
        OreDictionary.registerOre("crushedPurifiedArdite", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Ardite"));
        OreDictionary.registerOre("crushedPurifiedBauxite", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Bauxite"));
        OreDictionary.registerOre("crushedPurifiedCadmium", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Cadmium"));
        OreDictionary.registerOre("crushedPurifiedCinnabar", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Cinnabar"));
        OreDictionary.registerOre("crushedPurifiedCobalt", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Cobalt"));
        OreDictionary.registerOre("crushedPurifiedDarkIron", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("DarkIron"));
        OreDictionary.registerOre("crushedPurifiedGalena", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Galena"));
        OreDictionary.registerOre("crushedPurifiedIndium", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Indium"));
        OreDictionary.registerOre("crushedPurifiedIridium", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Iridium"));
        OreDictionary.registerOre("crushedPurifiedNickel", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Nickel"));
        OreDictionary.registerOre("crushedPurifiedOsmium", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Osmium"));
        OreDictionary.registerOre("crushedPurifiedPlatinum", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Platinum"));
        OreDictionary.registerOre("crushedPurifiedPyrite", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Pyrite"));
        OreDictionary.registerOre("crushedPurifiedSphalerite", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Sphalerite"));
        OreDictionary.registerOre("crushedPurifiedTetrahedrite", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Tetrahedrite"));
        OreDictionary.registerOre("crushedPurifiedTungsten", ItemPurifiedCrushedOre.getPurifiedCrushedOreByName("Tungsten"));

        OreDictionary.registerOre("craftingGrinder", ItemParts.getPartByName("diamondGrindingHead"));
        OreDictionary.registerOre("craftingGrinder", ItemParts.getPartByName("tungstenGrindingHead"));
        OreDictionary.registerOre("circuitMaster", ItemParts.getPartByName("energyFlowCircuit"));
        OreDictionary.registerOre("circuitElite", ItemParts.getPartByName("dataControlCircuit"));
        OreDictionary.registerOre("circuitData", ItemParts.getPartByName("dataStorageCircuit"));
        OreDictionary.registerOre("craftingSuperconductor", ItemParts.getPartByName("superconductor"));
        OreDictionary.registerOre("batteryUltimate", ItemParts.getPartByName("diamondGrindingHead"));
        OreDictionary.registerOre("blockLapis", ItemParts.getPartByName("lazuriteChunk"));

    }

}
