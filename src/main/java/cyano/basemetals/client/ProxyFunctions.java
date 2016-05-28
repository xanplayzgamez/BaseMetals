package cyano.basemetals.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ProxyFunctions {

	public static IRenderFactory entityVillagerRenderer() {
		return new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				return new net.minecraft.client.renderer.entity.RenderVillager(manager);
			}
		};
	}
}
