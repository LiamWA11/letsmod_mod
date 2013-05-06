package com.liamwa11.letsmod;

import com.liamwa11.letsmod.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



@Mod( modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
public class LetsMod {

    @PreInit
    public void PreInit(FMLPreInitializationEvent event) {
        
    }

    @Init
    public void init(FMLInitializationEvent event) {
        
    }
    
    @cpw.mods.fml.common.Mod.PostInit
    public void PostInit(FMLPostInitializationEvent event) {
        
    }
    
}