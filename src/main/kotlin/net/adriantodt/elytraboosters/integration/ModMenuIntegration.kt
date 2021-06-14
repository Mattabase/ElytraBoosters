package net.adriantodt.elytraboosters.integration

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import me.shedaniel.autoconfig.AutoConfig
import net.adriantodt.elytraboosters.data.ElytraBoostersConfig
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment

@Environment(EnvType.CLIENT)
class ModMenuIntegration : ModMenuApi {
    override fun getModConfigScreenFactory() = ConfigScreenFactory {
        AutoConfig.getConfigScreen(ElytraBoostersConfig::class.java, it).get()
    }
}