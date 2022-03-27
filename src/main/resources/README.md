# Example Addon for ServerPackCreator

[![Homepage](https://img.shields.io/badge/Griefed.de-Homepage-c0ffee?style=for-the-badge&labelColor=325358&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAMAAACdt4HsAAACylBMVEUAAAD////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////9/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f39/f3+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v7+/v6OsnIvAAAA7XRSTlMAAQIDBAUGBwgJCgsMDQ4PEBESExQVFhcYGRobHB0eHyAhIiQlJicoKSorLC0uLzAxMjU2Nzg5Ojs8Pj9AQUJERUZHSElLTE9QUVJTVFVWV1hZXF1eX2BhYmNkZWZnaGlqa2xtbm9wcXJzdHV2d3h5ent8fX5/gIGCg4SGh4iJiouMjY6P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)](https://www.griefed.de)
[![Blog](https://img.shields.io/badge/Griefed.de-Blog-c0ffee?style=for-the-badge&labelColor=325358&logo=wordpress)](https://blog.griefed.de)
[![Fleet](https://img.shields.io/badge/Griefed.de-Fleet-c0ffee?style=for-the-badge&labelColor=325358&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAMAAABEpIrGAAABiVBMVEUAAAD///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////8XJWL///8gNCTuAAAAgXRSTlMAAgMEBQYHCAkLDA4PEBESFhgZGh0eISIlKC8zNDU3OT0+P0BBQkhKS01QU1RVVltcXWJjZGlrbG1wcnN0eHl6e4CBhYyOkJWWmZ6foaKkqaqsrrKztLe8vsHExcbHy8zNz9DT1NXX2Nna293e3+Tm5+nq7O3u7/Hy9fb4+fr7/f4zgtRAAAABWklEQVR42mKgHhCFMbg0dHW1xNGlBcw5wTS7tkcJoNV5UJItBoMA3GPjcm3btm3btq1+8s1JxijuV0p+X5NzVcfNRoT4O26ClEZykdydI5ddCHDt+EfqthiwYoXfRH++yb9r8IZ+o/CpeB1hE/zMtXf0KYKkP9p8ZSaCfq1S2ddDU84zrsuXYXZjYy0VcBxQKYVmgQ9slS8HhUbxSP+kNAPB+kIyO1ggr5mn9GoX70wKydA4/RNQQSVPvGspZEHQ5ZKHK5lu8UymUi/enRQuxYjcN5LPH+RTQfcVlQ4AbfJ1n4JKRusG0ErpzCn3vjFMe8g9/eUU2himHEAilc+Vq6XJ4Zyx6eXTk3f6/IOww7i2oOliXNXQ/H5kHBcWSO2MowyKJc4VU/BLOGcMm04EJF3FyHsQImkvMj/tQBhrz0to+rwSUf70XvjT23VWxKLLaBkYGuqr+Y8f9Q3q0fzzGED8cgAAAABJRU5ErkJggg==)](https://fleet.griefed.de)
[![GitHub](https://img.shields.io/badge/Griefed.de-Github-c0ffee?style=for-the-badge&labelColor=325358&logo=github)](https://github.com/Griefed)
[![DockerHub](https://img.shields.io/badge/Griefed.de-DockerHub-c0ffee?style=for-the-badge&labelColor=325358&logo=docker&logoColor=white)](https://hub.docker.com/u/griefed)
[![Discord](https://img.shields.io/badge/Griefed.de-Discord-c0ffee?style=for-the-badge&labelColor=325358&logo=discord&logoColor=white)](https://discord.griefed.de)

---

# Sources, GitHub, GitLab and Mirroring and all that good stuff

Repositories on GitHub are now for issues only. I've set up my own installation of GitLab and moved all my repositories over to [Git.Griefed.de](https://git.griefed.de/users/Griefed/projects). Make sure to check there first for the latest code before opening an issue on GitHub.

For questions, you can always join my [Discord server](https://discord.griefed.de) and talk to me there.

###### This repository is available at:

- Source: https://git.griefed.de/Griefed/ServerPackCreatorExampleAddon
- Mirror: https://gitlab.com/Griefed/ServerPackCreatorExampleAddon
- Mirror: https://github.com/Griefed/ServerPackCreatorExampleAddon
- Mirror: https://gitea.com/Griefed/ServerPackCreatorExampleAddon

---

[![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/Griefed/ServerPackCreatorExampleAddon?include_prereleases&label=Latest%20Release&logo=Github&style=for-the-badge&color=c0ffee&labelColor=325358)](https://github.com/Griefed/ServerPackCreatorExampleAddon/releases/latest)
[![GitHub](https://img.shields.io/github/license/Griefed/ServerPackCreatorExampleAddon?logo=GitHub&style=for-the-badge&color=c0ffee&labelColor=325358)](https://github.com/Griefed/ServerPackCreatorExampleAddon/blob/main/LICENSE)

[![GitHub Repo stars](https://img.shields.io/github/stars/Griefed/ServerPackCreatorExampleAddon?label=GitHub%20Stars&style=for-the-badge&logo=Github&labelColor=325358&color=c0ffee)](https://github.com/Griefed/ServerPackCreatorExampleAddon)
[![GitHub forks](https://img.shields.io/github/forks/Griefed/ServerPackCreatorExampleAddon?label=GitHub%20Forks&style=for-the-badge&logo=Github&labelColor=325358&color=c0ffee)](https://github.com/Griefed/ServerPackCreatorExampleAddon)
[![GitHub contributors](https://img.shields.io/github/contributors/Griefed/ServerPackCreatorExampleAddon?color=c0ffee&label=Contributors&logo=GitHub&logoColor=white&style=for-the-badge&labelColor=325358)](https://github.com/Griefed/ServerPackCreatorExampleAddon/graphs/contributors)
[![GitHub all releases](https://img.shields.io/github/downloads/Griefed/ServerPackCreatorExampleAddon/total?color=c0ffee&logo=GitHub&logoColor=white&labelColor=325358&style=for-the-badge)](https://github.com/Griefed/ServerPackCreatorExampleAddon/releases)

---


This is an example server pack addon for [ServerPackCreator](https://github.com/Griefed/ServerPackCreator)

The following endpoints are available in ServerPackCreator to add you extra functionality with a plugin. This example plugin provides examples for all four of them:

- TabExtension: Allows you to add your own JComponent in the form of an additional tab to the GUI. You can run whatever code you want in that tab.

- PreGenExtension: Will allow you to run your code before generation of a server pack starts

- PreZipExtension: Will allow you to run your code after a server pack was generated, but before the ZIP-archive is created

- PostGenExtension: Will allow you to run your code after the server pack ZIP-archive was generated, so right at the on of the SPC process, basically.

Using this example plugin would result in the following or similar output in ServerPackCreator itself:

serverpackcreator.log:
```
INFO [main] (AbstractPluginManager.java:814) - Plugin 'example-plugin@0.0.1' resolved
INFO [main] (AbstractPluginManager.java:357) - Start plugin 'example-plugin@0.0.1'
INFO [main] (ApplicationPlugins.java:74) - Available PreGenExtension plugins:
INFO [main] (ApplicationPlugins.java:76) - Name:       ServerPackCreatorExampleAddon
INFO [main] (ApplicationPlugins.java:77) - Description:This is an example addon for ServerPackCreator showcasing all, currently 4, aspects ofServerPackCreators addon functionality. In this example you see code which gets executed before a server pack is generated,code that gets executed after a server pack was generated but before the ZIP-archive is created, code that gets executedafter this ZIP-archive was created, as well as code adding a new tabbed pane to the GUI.
INFO [main] (ApplicationPlugins.java:78) - Version:    0.0.1
INFO [main] (ApplicationPlugins.java:79) - Author:     Griefed
INFO [main] (ApplicationPlugins.java:83) - Available PreZipExtension plugins:
INFO [main] (ApplicationPlugins.java:85) - Name:       ServerPackCreatorExampleAddon
INFO [main] (ApplicationPlugins.java:86) - Description:This is an example addon for ServerPackCreator showcasing all, currently 4, aspects ofServerPackCreators addon functionality. In this example you see code which gets executed before a server pack is generated,code that gets executed after a server pack was generated but before the ZIP-archive is created, code that gets executedafter this ZIP-archive was created, as well as code adding a new tabbed pane to the GUI.
INFO [main] (ApplicationPlugins.java:87) - Version:    0.0.1
INFO [main] (ApplicationPlugins.java:88) - Author:     Griefed
INFO [main] (ApplicationPlugins.java:92) - Available PostGenExtension plugins:
INFO [main] (ApplicationPlugins.java:94) - Name:       ServerPackCreatorExampleAddon
INFO [main] (ApplicationPlugins.java:95) - Description:This is an example addon for ServerPackCreator showcasing all, currently 4, aspects ofServerPackCreators addon functionality. In this example you see code which gets executed before a server pack is generated,code that gets executed after a server pack was generated but before the ZIP-archive is created, code that gets executedafter this ZIP-archive was created, as well as code adding a new tabbed pane to the GUI.
INFO [main] (ApplicationPlugins.java:96) - Version:    0.0.1
INFO [main] (ApplicationPlugins.java:97) - Author:     Griefed
INFO [main] (ApplicationPlugins.java:101) - Available TabExtension plugins:
INFO [main] (ApplicationPlugins.java:103) - Name:       ServerPackCreatorExampleAddon
INFO [main] (ApplicationPlugins.java:104) - Description:This is an example addon for ServerPackCreator showcasing all, currently 4, aspects ofServerPackCreators addon functionality. In this example you see code which gets executed before a server pack is generated,code that gets executed after a server pack was generated but before the ZIP-archive is created, code that gets executedafter this ZIP-archive was created, as well as code adding a new tabbed pane to the GUI.
INFO [main] (ApplicationPlugins.java:105) - Version:    0.0.1
INFO [main] (ApplicationPlugins.java:106) - Author:     Griefed
```

addons.log:
```
2022-01-26T18:20:45,896  INFO [main] (ExamplePlugin.java:45) - Starting ExamplePlugin...
2022-01-26T18:20:45,897  INFO [main] (ExamplePlugin.java:46) - This methods should prepare the environment for anything you want to do with it.
2022-01-26T18:20:45,897  INFO [main] (ExamplePlugin.java:47) - You could download some files. Create or replace some files. Basically you can do whatever you want.
2022-01-26T18:21:55,874  INFO [pool-2-thread-1] (ServerPackHandler.java:253) - Executing PreGenExtension addons
2022-01-26T18:21:55,874  INFO [pool-2-thread-1] (ServerPackHandler.java:255) - Executing plugin ServerPackCreatorExampleAddon
2022-01-26T18:21:55,874  INFO [pool-2-thread-1] (ExamplePlugin.java:58) - This would run before a server pack generation.
2022-01-26T18:21:55,875  INFO [pool-2-thread-1] (ExamplePlugin.java:59) - Received destination: G:/GitLab/ServerPackCreator/testruns/server-packs/Deathdusk
2022-01-26T18:21:55,875  INFO [pool-2-thread-1] (ExamplePlugin.java:60) - We recieved the following configurationModel: ConfigurationModel{clientMods=[AdvancementPlaques-, AmbientSounds_, backtools-, BetterAdvancements-, BetterAnimationsCollection-, BetterDarkMode-, betterf3-, BetterF3-, BetterFoliage-, BetterPingDisplay-, BetterPlacement-, Blur-, catalogue-, cherishedworlds-, classicbar-, clickadv-, ClientTweaks_, configured-, Controlling-, CraftPresence-, CTM-, customdiscordrpc-, CustomMainMenu-, defaultoptions-, DefaultOptions_, desiredservers-, Ding-, drippyloadingscreen-, drippyloadingscreen_, Durability101-, dynmus-, dynamic-music-, DynamicSurroundings-, DynamicSurroundingsHuds-, eiramoticons-, EiraMoticons_, EnchantmentDescriptions-, EquipmentCompare-, extremesoundmuffler-, extremeSoundMuffler-, Fallingleaves-, fallingleaves-, fancymenu_, findme-, flickerfix-, FpsReducer-, FullscreenWindowed-, WindowedFullscreen-, InventoryEssentials_, InventorySpam-, invtweaks-, InventoryTweaks-, ItemBorders-, itemzoom, itlt-, jeed-, jeiintegration_, JustEnoughProfessions-, JEITweaker-, justenoughbeacons-, JustEnoughCalculation-, jehc-, just-enough-harvestcraft-, JustEnoughProfessions-, JustEnoughResources-, keywizard-, konkrete_, lazydfu-, LegendaryTooltips-, LightOverlay-, light-overlay-, LLOverlayReloaded-, loadmyresources_, lootbeams-, mcbindtype-, modnametooltip_, modnametooltip-, moreoverlays-, MouseTweaks-, multihotbar-, MyServerIsCompatible-, Neat, NotifMod-, OldJavaWarning-, ornaments-, overloadedarmorbar-, PackMenu-, PickUpNotifier-, Ping-, preciseblockplacing-, presencefootsteps-, PresenceFootsteps-, ReAuth-, ResourceLoader-, shutupexperimentalsettings-, SimpleDiscordRichPresence-, smoothboot-, sounddeviceoptions-, SpawnerFix-, spoticraft-, tconplanner-, timestamps-, Tips-, TipTheScales-, Toast Control-, Toast-Control-, torohealth-, toughnessbar-, TravelersTitles-, WorldNameRandomizer-], copyDirs=[config, mods], modpackDir='C:/Minecraft/Game/Instances/Deathdusk', javaPath='C:/Program Files/Java/jdk1.8.0_291/jre/bin/java.exe', minecraftVersion='1.18.1', modLoader='Fabric', modLoaderVersion='0.12.12', javaArgs='empty', serverPackSuffix='', serverIconPath='', serverPropertiesPath='', includeServerInstallation=true, includeServerIcon=true, includeServerProperties=true, includeZipCreation=true, curseModpack=null, projectName='null', fileName='null', fileDiskName='null', projectID=0, fileID=0}
2022-01-26T18:21:55,875  INFO [pool-2-thread-1] (ExamplePlugin.java:61) - We received the following applicationProperties: {de.griefed.serverpackcreator.serverpack.autodiscoverenabled=true, de.griefed.serverpackcreator.spring.schedules.database.cleanup=0 0 24 * *, de.griefed.serverpackcreator.configuration.hastebinserver=https://haste.zneix.eu/documents, de.griefed.serverpackcreator.spring.artemis.queue.max_disk_usage=90, de.griefed.serverpackcreator.serverpack.overwrite.enabled=true, de.griefed.serverpackcreator.configuration.saveloadedconfig=false, de.griefed.serverpackcreator.gui.darkmode=true, de.griefed.serverpackcreator.configuration.directories.shouldexclude=overrides,packmenu,resourcepacks,server_pack,fancymenu, de.griefed.serverpackcreator.language=en_us, de.griefed.serverpackcreator.configuration.directories.serverpacks=server-packs, homeDir=G:/GitLab/ServerPackCreator/build/classes/java, de.griefed.serverpackcreator.curseforge.cleanup.enabled=true, de.griefed.serverpackcreator.plugins.directory=./plugins, de.griefed.serverpackcreator.versioncheck.prerelease=true, de.griefed.serverpackcreator.configuration.directories.mustinclude=mods,config,defaultconfigs,scripts,saves,seeds,libraries, de.griefed.serverpackcreator.serverpack.cleanup.enabled=true, de.griefed.serverpackcreator.spring.cursecontroller.regenerate.enabled=false, de.griefed.serverpackcreator.configuration.fallbackmodslist=AdvancementPlaques-,AmbientSounds_,backtools-,BetterAdvancements-,BetterAnimationsCollection-,BetterDarkMode-,betterf3-,BetterF3-,BetterFoliage-,BetterPingDisplay-,BetterPlacement-,Blur-,catalogue-,cherishedworlds-,classicbar-,clickadv-,ClientTweaks_,configured-,Controlling-,CraftPresence-,CTM-,customdiscordrpc-,CustomMainMenu-,defaultoptions-,DefaultOptions_,desiredservers-,Ding-,drippyloadingscreen-,drippyloadingscreen_,Durability101-,dynmus-,dynamic-music-,DynamicSurroundings-,DynamicSurroundingsHuds-,eiramoticons-,EiraMoticons_,EnchantmentDescriptions-,EquipmentCompare-,extremesoundmuffler-,extremeSoundMuffler-,Fallingleaves-,fallingleaves-,fancymenu_,findme-,flickerfix-,FpsReducer-,FullscreenWindowed-,WindowedFullscreen-,InventoryEssentials_,InventorySpam-,invtweaks-,InventoryTweaks-,ItemBorders-,itemzoom,itlt-,jeed-,jeiintegration_,JustEnoughProfessions-,JEITweaker-,justenoughbeacons-,JustEnoughCalculation-,jehc-,just-enough-harvestcraft-,JustEnoughProfessions-,JustEnoughResources-,keywizard-,konkrete_,lazydfu-,LegendaryTooltips-,LightOverlay-,light-overlay-,LLOverlayReloaded-,loadmyresources_,lootbeams-,mcbindtype-,modnametooltip_,modnametooltip-,moreoverlays-,MouseTweaks-,multihotbar-,MyServerIsCompatible-,Neat,NotifMod-,OldJavaWarning-,ornaments-,overloadedarmorbar-,PackMenu-,PickUpNotifier-,Ping-,preciseblockplacing-,presencefootsteps-,PresenceFootsteps-,ReAuth-,ResourceLoader-,shutupexperimentalsettings-,SimpleDiscordRichPresence-,smoothboot-,sounddeviceoptions-,SpawnerFix-,spoticraft-,tconplanner-,timestamps-,Tips-,TipTheScales-,Toast Control-,Toast-Control-,torohealth-,toughnessbar-,TravelersTitles-,WorldNameRandomizer-}
2022-01-26T18:22:06,414  INFO [pool-2-thread-1] (ServerPackHandler.java:303) - Executing PreZipExtension addons
2022-01-26T18:22:06,414  INFO [pool-2-thread-1] (ServerPackHandler.java:305) - Executing plugin ServerPackCreatorExampleAddon
2022-01-26T18:22:06,414  INFO [pool-2-thread-1] (ExamplePlugin.java:98) - This would run after a server pack was generated, but BEFORE the ZIP-archive would be generated.
2022-01-26T18:22:06,414  INFO [pool-2-thread-1] (ExamplePlugin.java:99) - Received destination: G:/GitLab/ServerPackCreator/testruns/server-packs/Deathdusk
2022-01-26T18:22:06,414  INFO [pool-2-thread-1] (ExamplePlugin.java:100) - We recieved the following configurationModel: ConfigurationModel{clientMods=[AdvancementPlaques-, AmbientSounds_, backtools-, BetterAdvancements-, BetterAnimationsCollection-, BetterDarkMode-, betterf3-, BetterF3-, BetterFoliage-, BetterPingDisplay-, BetterPlacement-, Blur-, catalogue-, cherishedworlds-, classicbar-, clickadv-, ClientTweaks_, configured-, Controlling-, CraftPresence-, CTM-, customdiscordrpc-, CustomMainMenu-, defaultoptions-, DefaultOptions_, desiredservers-, Ding-, drippyloadingscreen-, drippyloadingscreen_, Durability101-, dynmus-, dynamic-music-, DynamicSurroundings-, DynamicSurroundingsHuds-, eiramoticons-, EiraMoticons_, EnchantmentDescriptions-, EquipmentCompare-, extremesoundmuffler-, extremeSoundMuffler-, Fallingleaves-, fallingleaves-, fancymenu_, findme-, flickerfix-, FpsReducer-, FullscreenWindowed-, WindowedFullscreen-, InventoryEssentials_, InventorySpam-, invtweaks-, InventoryTweaks-, ItemBorders-, itemzoom, itlt-, jeed-, jeiintegration_, JustEnoughProfessions-, JEITweaker-, justenoughbeacons-, JustEnoughCalculation-, jehc-, just-enough-harvestcraft-, JustEnoughProfessions-, JustEnoughResources-, keywizard-, konkrete_, lazydfu-, LegendaryTooltips-, LightOverlay-, light-overlay-, LLOverlayReloaded-, loadmyresources_, lootbeams-, mcbindtype-, modnametooltip_, modnametooltip-, moreoverlays-, MouseTweaks-, multihotbar-, MyServerIsCompatible-, Neat, NotifMod-, OldJavaWarning-, ornaments-, overloadedarmorbar-, PackMenu-, PickUpNotifier-, Ping-, preciseblockplacing-, presencefootsteps-, PresenceFootsteps-, ReAuth-, ResourceLoader-, shutupexperimentalsettings-, SimpleDiscordRichPresence-, smoothboot-, sounddeviceoptions-, SpawnerFix-, spoticraft-, tconplanner-, timestamps-, Tips-, TipTheScales-, Toast Control-, Toast-Control-, torohealth-, toughnessbar-, TravelersTitles-, WorldNameRandomizer-], copyDirs=[config, mods], modpackDir='C:/Minecraft/Game/Instances/Deathdusk', javaPath='C:/Program Files/Java/jdk1.8.0_291/jre/bin/java.exe', minecraftVersion='1.18.1', modLoader='Fabric', modLoaderVersion='0.12.12', javaArgs='empty', serverPackSuffix='', serverIconPath='', serverPropertiesPath='', includeServerInstallation=true, includeServerIcon=true, includeServerProperties=true, includeZipCreation=true, curseModpack=null, projectName='null', fileName='null', fileDiskName='null', projectID=0, fileID=0}
2022-01-26T18:22:06,414  INFO [pool-2-thread-1] (ExamplePlugin.java:101) - We received the following applicationProperties: {de.griefed.serverpackcreator.serverpack.autodiscoverenabled=true, de.griefed.serverpackcreator.spring.schedules.database.cleanup=0 0 24 * *, de.griefed.serverpackcreator.configuration.hastebinserver=https://haste.zneix.eu/documents, de.griefed.serverpackcreator.spring.artemis.queue.max_disk_usage=90, de.griefed.serverpackcreator.serverpack.overwrite.enabled=true, de.griefed.serverpackcreator.configuration.saveloadedconfig=false, de.griefed.serverpackcreator.gui.darkmode=true, de.griefed.serverpackcreator.configuration.directories.shouldexclude=overrides,packmenu,resourcepacks,server_pack,fancymenu, de.griefed.serverpackcreator.language=en_us, de.griefed.serverpackcreator.configuration.directories.serverpacks=server-packs, homeDir=G:/GitLab/ServerPackCreator/build/classes/java, de.griefed.serverpackcreator.curseforge.cleanup.enabled=true, de.griefed.serverpackcreator.plugins.directory=./plugins, de.griefed.serverpackcreator.versioncheck.prerelease=true, de.griefed.serverpackcreator.configuration.directories.mustinclude=mods,config,defaultconfigs,scripts,saves,seeds,libraries, de.griefed.serverpackcreator.serverpack.cleanup.enabled=true, de.griefed.serverpackcreator.spring.cursecontroller.regenerate.enabled=false, de.griefed.serverpackcreator.configuration.fallbackmodslist=AdvancementPlaques-,AmbientSounds_,backtools-,BetterAdvancements-,BetterAnimationsCollection-,BetterDarkMode-,betterf3-,BetterF3-,BetterFoliage-,BetterPingDisplay-,BetterPlacement-,Blur-,catalogue-,cherishedworlds-,classicbar-,clickadv-,ClientTweaks_,configured-,Controlling-,CraftPresence-,CTM-,customdiscordrpc-,CustomMainMenu-,defaultoptions-,DefaultOptions_,desiredservers-,Ding-,drippyloadingscreen-,drippyloadingscreen_,Durability101-,dynmus-,dynamic-music-,DynamicSurroundings-,DynamicSurroundingsHuds-,eiramoticons-,EiraMoticons_,EnchantmentDescriptions-,EquipmentCompare-,extremesoundmuffler-,extremeSoundMuffler-,Fallingleaves-,fallingleaves-,fancymenu_,findme-,flickerfix-,FpsReducer-,FullscreenWindowed-,WindowedFullscreen-,InventoryEssentials_,InventorySpam-,invtweaks-,InventoryTweaks-,ItemBorders-,itemzoom,itlt-,jeed-,jeiintegration_,JustEnoughProfessions-,JEITweaker-,justenoughbeacons-,JustEnoughCalculation-,jehc-,just-enough-harvestcraft-,JustEnoughProfessions-,JustEnoughResources-,keywizard-,konkrete_,lazydfu-,LegendaryTooltips-,LightOverlay-,light-overlay-,LLOverlayReloaded-,loadmyresources_,lootbeams-,mcbindtype-,modnametooltip_,modnametooltip-,moreoverlays-,MouseTweaks-,multihotbar-,MyServerIsCompatible-,Neat,NotifMod-,OldJavaWarning-,ornaments-,overloadedarmorbar-,PackMenu-,PickUpNotifier-,Ping-,preciseblockplacing-,presencefootsteps-,PresenceFootsteps-,ReAuth-,ResourceLoader-,shutupexperimentalsettings-,SimpleDiscordRichPresence-,smoothboot-,sounddeviceoptions-,SpawnerFix-,spoticraft-,tconplanner-,timestamps-,Tips-,TipTheScales-,Toast Control-,Toast-Control-,torohealth-,toughnessbar-,TravelersTitles-,WorldNameRandomizer-}
2022-01-26T18:22:45,053  INFO [pool-2-thread-1] (ServerPackHandler.java:333) - Executing PostGenExtension addons
2022-01-26T18:22:45,053  INFO [pool-2-thread-1] (ServerPackHandler.java:335) - Executing plugin ServerPackCreatorExampleAddon
2022-01-26T18:22:45,053  INFO [pool-2-thread-1] (ExamplePlugin.java:143) - This would run after the server pack ZIP-archive was created.
2022-01-26T18:22:45,053  INFO [pool-2-thread-1] (ExamplePlugin.java:144) - Received destination: G:/GitLab/ServerPackCreator/testruns/server-packs/Deathdusk
2022-01-26T18:22:45,053  INFO [pool-2-thread-1] (ExamplePlugin.java:145) - We recieved the following configurationModel: ConfigurationModel{clientMods=[AdvancementPlaques-, AmbientSounds_, backtools-, BetterAdvancements-, BetterAnimationsCollection-, BetterDarkMode-, betterf3-, BetterF3-, BetterFoliage-, BetterPingDisplay-, BetterPlacement-, Blur-, catalogue-, cherishedworlds-, classicbar-, clickadv-, ClientTweaks_, configured-, Controlling-, CraftPresence-, CTM-, customdiscordrpc-, CustomMainMenu-, defaultoptions-, DefaultOptions_, desiredservers-, Ding-, drippyloadingscreen-, drippyloadingscreen_, Durability101-, dynmus-, dynamic-music-, DynamicSurroundings-, DynamicSurroundingsHuds-, eiramoticons-, EiraMoticons_, EnchantmentDescriptions-, EquipmentCompare-, extremesoundmuffler-, extremeSoundMuffler-, Fallingleaves-, fallingleaves-, fancymenu_, findme-, flickerfix-, FpsReducer-, FullscreenWindowed-, WindowedFullscreen-, InventoryEssentials_, InventorySpam-, invtweaks-, InventoryTweaks-, ItemBorders-, itemzoom, itlt-, jeed-, jeiintegration_, JustEnoughProfessions-, JEITweaker-, justenoughbeacons-, JustEnoughCalculation-, jehc-, just-enough-harvestcraft-, JustEnoughProfessions-, JustEnoughResources-, keywizard-, konkrete_, lazydfu-, LegendaryTooltips-, LightOverlay-, light-overlay-, LLOverlayReloaded-, loadmyresources_, lootbeams-, mcbindtype-, modnametooltip_, modnametooltip-, moreoverlays-, MouseTweaks-, multihotbar-, MyServerIsCompatible-, Neat, NotifMod-, OldJavaWarning-, ornaments-, overloadedarmorbar-, PackMenu-, PickUpNotifier-, Ping-, preciseblockplacing-, presencefootsteps-, PresenceFootsteps-, ReAuth-, ResourceLoader-, shutupexperimentalsettings-, SimpleDiscordRichPresence-, smoothboot-, sounddeviceoptions-, SpawnerFix-, spoticraft-, tconplanner-, timestamps-, Tips-, TipTheScales-, Toast Control-, Toast-Control-, torohealth-, toughnessbar-, TravelersTitles-, WorldNameRandomizer-], copyDirs=[config, mods], modpackDir='C:/Minecraft/Game/Instances/Deathdusk', javaPath='C:/Program Files/Java/jdk1.8.0_291/jre/bin/java.exe', minecraftVersion='1.18.1', modLoader='Fabric', modLoaderVersion='0.12.12', javaArgs='empty', serverPackSuffix='', serverIconPath='', serverPropertiesPath='', includeServerInstallation=true, includeServerIcon=true, includeServerProperties=true, includeZipCreation=true, curseModpack=null, projectName='null', fileName='null', fileDiskName='null', projectID=0, fileID=0}
2022-01-26T18:22:45,053  INFO [pool-2-thread-1] (ExamplePlugin.java:146) - We received the following applicationProperties: {de.griefed.serverpackcreator.serverpack.autodiscoverenabled=true, de.griefed.serverpackcreator.spring.schedules.database.cleanup=0 0 24 * *, de.griefed.serverpackcreator.configuration.hastebinserver=https://haste.zneix.eu/documents, de.griefed.serverpackcreator.spring.artemis.queue.max_disk_usage=90, de.griefed.serverpackcreator.serverpack.overwrite.enabled=true, de.griefed.serverpackcreator.configuration.saveloadedconfig=false, de.griefed.serverpackcreator.gui.darkmode=true, de.griefed.serverpackcreator.configuration.directories.shouldexclude=overrides,packmenu,resourcepacks,server_pack,fancymenu, de.griefed.serverpackcreator.language=en_us, de.griefed.serverpackcreator.configuration.directories.serverpacks=server-packs, homeDir=G:/GitLab/ServerPackCreator/build/classes/java, de.griefed.serverpackcreator.curseforge.cleanup.enabled=true, de.griefed.serverpackcreator.plugins.directory=./plugins, de.griefed.serverpackcreator.versioncheck.prerelease=true, de.griefed.serverpackcreator.configuration.directories.mustinclude=mods,config,defaultconfigs,scripts,saves,seeds,libraries, de.griefed.serverpackcreator.serverpack.cleanup.enabled=true, de.griefed.serverpackcreator.spring.cursecontroller.regenerate.enabled=false, de.griefed.serverpackcreator.configuration.fallbackmodslist=AdvancementPlaques-,AmbientSounds_,backtools-,BetterAdvancements-,BetterAnimationsCollection-,BetterDarkMode-,betterf3-,BetterF3-,BetterFoliage-,BetterPingDisplay-,BetterPlacement-,Blur-,catalogue-,cherishedworlds-,classicbar-,clickadv-,ClientTweaks_,configured-,Controlling-,CraftPresence-,CTM-,customdiscordrpc-,CustomMainMenu-,defaultoptions-,DefaultOptions_,desiredservers-,Ding-,drippyloadingscreen-,drippyloadingscreen_,Durability101-,dynmus-,dynamic-music-,DynamicSurroundings-,DynamicSurroundingsHuds-,eiramoticons-,EiraMoticons_,EnchantmentDescriptions-,EquipmentCompare-,extremesoundmuffler-,extremeSoundMuffler-,Fallingleaves-,fallingleaves-,fancymenu_,findme-,flickerfix-,FpsReducer-,FullscreenWindowed-,WindowedFullscreen-,InventoryEssentials_,InventorySpam-,invtweaks-,InventoryTweaks-,ItemBorders-,itemzoom,itlt-,jeed-,jeiintegration_,JustEnoughProfessions-,JEITweaker-,justenoughbeacons-,JustEnoughCalculation-,jehc-,just-enough-harvestcraft-,JustEnoughProfessions-,JustEnoughResources-,keywizard-,konkrete_,lazydfu-,LegendaryTooltips-,LightOverlay-,light-overlay-,LLOverlayReloaded-,loadmyresources_,lootbeams-,mcbindtype-,modnametooltip_,modnametooltip-,moreoverlays-,MouseTweaks-,multihotbar-,MyServerIsCompatible-,Neat,NotifMod-,OldJavaWarning-,ornaments-,overloadedarmorbar-,PackMenu-,PickUpNotifier-,Ping-,preciseblockplacing-,presencefootsteps-,PresenceFootsteps-,ReAuth-,ResourceLoader-,shutupexperimentalsettings-,SimpleDiscordRichPresence-,smoothboot-,sounddeviceoptions-,SpawnerFix-,spoticraft-,tconplanner-,timestamps-,Tips-,TipTheScales-,Toast Control-,Toast-Control-,torohealth-,toughnessbar-,TravelersTitles-,WorldNameRandomizer-}
```

Additionally, the following files/directories would be created in the server pack-directory:

- `./ExampleStartExtension`
- `./ExampleArchiveExtension`
- `serverpackcreator.conf` as it was used to generate the server pack
- `./some/folder/with/a/name`

| Example at boot time       | Example after generation finished |
|----------------------------|-----------------------------------|
| ![boot](img/boot.png)      | ![preGen](img/afterGen.png)       |

**Example tab**

![tab](img/exampleTab.png)

# 1. Addons

## 1.1 Why

There are things which people want to do with their server packs which could most certainly be automated. Some of those
things so special, or maybe out of place, that they would not warrant a separate feature for ServerPackCreator itself.

It may also be that it is such a niche feature, that I either don't have the time to code it in, or simply don't want to.
Maybe it doesn't fit into the overall design of ServerPackCreator, too. Who knows, it could be any of those reasons or another.

**Hence, the addon functionality!**

This allows people to write their own addons to expand the functionality of ServerPackCreator with their own features as
they see fit or want.

For documentation about Pf4j, visit the [Pf4j documentation](https://pf4j.org/)

## 1.2 Adding your own

How to get your own addon into this list:

If you have written your own addon or plugin for ServerPackCreator and you would like to see it added here, please open an issue over at ServerPackCreatoron GitHub, using the Documentation template.

For an addon to be accepted, you must at least provide:
- The name of the repository, and therefore the addon.
- The owner of the repository, and therefore the addon.
- The branch of the repository where the main code resides in.
- A description of the plugin or addon.

A curated list of officially acknowledged addons/plugins can be found at [addons.griefed.de](https://addons.griefed.de) (redirects to [GitHub Pages](https://griefed.github.io/ServerPackCreator-Addons-Overview/#/))

## 1.3 Examples for potential addons

Some examples for potential addons can be found [in this discussion thread](https://github.com/Griefed/ServerPackCreator/discussions/201).

Some excerpts:
1. Changelog generator, by @TheButterbrotMan at [Feature request]: Changelog generator #198
   - A changelog generator that checks the differences to the previous version and generates a changelog.

2. Bundle Adoptium Java with server packs, by @kreezxil at [Feature request]: Bundle Adoptium Java #199
   - Because modpacks need one of the either Java 8, 16, or 17, it would be nice to have the corresponding https://adoptium.net java prebundled with the server pack.

3. Automatic setup of a server pack for [BlueMap](https://www.curseforge.com/minecraft/mc-mods/bluemap)
   - Check all mods in the specified modpacks mods-directory for textures, and if any are found, add the mod to
     BlueMap's resourcepack folder `config/bluemap/resourcepacks`, install BlueMap for the specified Minecraft and Forge/Fabric
     version and voilà!

# 2. How

During the start of ServerPackCreator, all plugins are loaded and started. If you have anything you need to run then and there,
use `public void start() {...}` and do your thing.

For documentation about Pf4j, visit https://pf4j.org/

If you have ideas and/or suggestions for improvements to the addon-system in ServerPackCreator, open an improvement-issue over at the ServerPackCreator [issues page](https://github.com/Griefed/ServerPackCreator/issues/new?assignees=Griefed&labels=enhancement&template=improvement.yml&title=%5BImprovement+request%5D%3A+)

## 2.1 Extensions

One plugin can have multiple extensions.

ServerPackCreator passes the `ConfigurationModel` and `ApplicationProperties`, used to create a server pack, to all `PreGenExtension`, `PreZipExtension` and `PostGenExtension` extensions.

If you have a plugin with multiple extensions of the same type, you can set the priority in which they are executed by specifiying and ordinal for your extension: `@Extension(ordinal = 1)`
The higher the ordinal, the lower the priority. See [pf4j documentation](https://pf4j.org/doc/extensions) on extensions.

## 2.2 Logs

If you want to print log messages, then use the `LOG_ADDONS` logger as shown in this example. This will result in ServerPackCreator writing any and all log entries from this logger to the `addons.log`-file.

# 3. Building

1. Fork and clone this repository
2. Make your changes and additions.
3. Build with `gradlew about build --info`.
4. Copy the JAR-file from `build/libs` to the plugins-directory created by ServerPackCreator.
5. Run ServerPackCreator!

## 4. Contributing

If you have written an addon, let me know by creating an issue in this repository. Provide a short description of what your
addon does and a link to the GitHub repository as well. I will add it to a list in the README of ServerPackCreator.

**NOTE: I only add addons which are open source. I will NOT add any direct download links to any file. People must be able
to check your code before they download and install your addon, and as such, I will only add a link to your addon-respository
along with a small description, if you provided one.

Example:

| Addon                                                                                                                                           | Creator | Description                                                                                                                                                                                         |
|:------------------------------------------------------------------------------------------------------------------------------------------------|:--------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [ExampleAddon](https://github.com/Griefed/ServerPackCreatorExampleAddon)                                                                        | Griefed | An example addon providing a starting point for addon development.                                                                                                                                  |
| [ExampleAddon Alternative Extension Declaration](https://github.com/Griefed/ServerPackCreatorExampleAddon/tree/alternativeExtensionDeclaration) | Griefed | An example addon providing a starting point for addon development. This addon provides an example for a different way of declaring extensions as well as reading entries from the plugins manifest. |
| [Example MiniGame](https://github.com/Griefed/ServerPackCreatorExampleAddon/tree/tetris)                                                        | Griefed | Play Tetris in a new window whilst your server packs generate!                                                                                                                                      |
