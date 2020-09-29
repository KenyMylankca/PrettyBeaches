package net.blay09.mods.prettybeaches;

import net.minecraftforge.common.config.Config;

@Config(modid = PrettyBeaches.MOD_ID)
public class PrettyBeachesConfig {
	
	@Config.Name("Water Lake Check Radius")
    @Config.Comment("The range in blocks to check the water blocks amount in 3 dimensions. Larger numbers mean more realistic but lower performance. Minimum 3 and maximum 10.")
    public static int waterCheckRadius = 5;

    @Config.Name("Animated Flooding")
    @Config.Comment("Whether the flooding of adjacent air blocks should be animated or instant.")
    public static boolean animatedFlooding = true;

    public static void onConfigReload() {
    	if(waterCheckRadius < 3)
    		waterCheckRadius=3;
    	if(waterCheckRadius > 10)
    		waterCheckRadius=10;
    }
}