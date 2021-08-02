# Example Addon for ServerPackCreator

This is an example server pack addon for [ServerPackCreator](https://github.com/Griefed/ServerPackCreator)

Server pack addons for ServerPackCreator are executed right after a server pack was generated, allowing for additional
operations and more customization of server packs. Users are free to write their own addons, distribute and share them.

This example provides JavaDocs and tests.

Using this example with a [dev-build of ServerPackCreator](https://git.griefed.de/Griefed/ServerPackCreator/-/pipelines?page=1&scope=all&ref=webservice) would result in the following output to the addons.log file:

```
2021-08-02T20:53:28,077 DEBUG [pool-2-thread-1] (AddonsHandler.java:240) - Addon work-directory is: work\temp\serverpackcreatorexampleaddon
2021-08-02T20:53:28,077 DEBUG [pool-2-thread-1] (AddonsHandler.java:254) - ProcessBuilder command is: [C:/Program Files/Java/jdk1.8.0_291/bin/java.exe, -jar, C:/Minecraft/ServerPackCreator/addons/serverpackcreatorexampleaddon.jar, C:/Minecraft/Game/Instances/Survive Create Prosper 4 1.16.5, AmbientSounds, BackTools, BetterAdvancement, BetterFoliage, BetterPing, BetterPlacement, Blur, cherished, ClientTweaks, Controlling, customdiscordrpc, CustomMainMenu, DefaultOptions, durability, DynamicSurroundings, FullscreenWindowed, iemzoom, jeiintegration, jei-professions, JustEnoughResources, keywizard, modnametooltip, MouseTweaks, multihotbar-, Neat, OldJavaWarning, PackMenu, prciseblockplacing, ResourceLoader, SimpleDiscordRichPresence, SpawnerFix, timestamps, TipTheScales, WorldNameRandomizer, config, defaultconfigs, mods, scripts, seeds, C:/Program Files/Java/jdk1.8.0_291/bin/java.exe, 1.16.5, Forge, 36.2.2, true, true, true, true, true, C:/Minecraft/ServerPackCreator]
2021-08-02T20:53:28,255  INFO [pool-2-thread-1] (AddonsHandler.java:272) - We have recieved the following configuration: [C:/Minecraft/Game/Instances/Survive Create Prosper 4 1.16.5, AmbientSounds, BackTools, BetterAdvancement, BetterFoliage, BetterPing, BetterPlacement, Blur, cherished, ClientTweaks, Controlling, customdiscordrpc, CustomMainMenu, DefaultOptions, durability, DynamicSurroundings, FullscreenWindowed, iemzoom, jeiintegration, jei-professions, JustEnoughResources, keywizard, modnametooltip, MouseTweaks, multihotbar-, Neat, OldJavaWarning, PackMenu, prciseblockplacing, ResourceLoader, SimpleDiscordRichPresence, SpawnerFix, timestamps, TipTheScales, WorldNameRandomizer, config, defaultconfigs, mods, scripts, seeds, C:/Program Files/Java/jdk1.8.0_291/bin/java.exe, 1.16.5, Forge, 36.2.2, true, true, true, true, true, C:/Minecraft/ServerPackCreator]
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - 
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Configuration passed from ServerPackCreator, processed and now usable however we wish.
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - 
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Modpack directory:                                 C:/Minecraft/Game/Instances/Survive Create Prosper 4 1.16.5
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Clientside-only mods:                              [AmbientSounds, BackTools, BetterAdvancement, BetterFoliage, BetterPing, BetterPlacement, Blur, cherished, ClientTweaks, Controlling, customdiscordrpc, CustomMainMenu, DefaultOptions, durability, DynamicSurroundings, FullscreenWindowed, iemzoom, jeiintegration, jei-professions, JustEnoughResources, keywizard, modnametooltip, MouseTweaks, multihotbar-, Neat, OldJavaWarning, PackMenu, prciseblockplacing, ResourceLoader, SimpleDiscordRichPresence, SpawnerFix, timestamps, TipTheScales, WorldNameRandomizer]
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Directories to copy to server pack:                [config, defaultconfigs, mods, scripts, seeds]
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Path to Java installation:                         C:/Program Files/Java/jdk1.8.0_291/bin/java.exe
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Minecraft version:                                 1.16.5
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Specified modloader:                               Forge
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Specified modloader version:                       36.2.2
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Whether to install the modloader server:           true
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Whether to copy the server-icon.png:               true
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Whether to copy the server.properties:             true
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Whether to copy the start scripts:                 true
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Whether to create a ZIP-archive of the server pack:true
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - 
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Example addon configuration for someconfig:        This is an example for working with the addon.conf-file.
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - 
2021-08-02T20:53:28,256  INFO [pool-2-thread-1] (AddonsHandler.java:272) - Base path for ServerPackCreator:                   C:/Minecraft/ServerPackCreator
2021-08-02T20:53:28,259  INFO [pool-2-thread-1] (AddonsHandler.java:284) - All addons executed. Returning to ServerPackCreator.

```

# 1. The reason for allowing ServerPackCreator to run addons:

There are things which people want to do with their server packs which could most certainly be automated. Some of those
things so special, or maybe out of place, that they would not warrant a separate feature for ServerPackCreator itself.

It may also be that it is such a niche feature, that I either don't have the time to code it in, or simply don't want to.
Maybe it doesn't fit into the overall design of ServerPackCreator, too. Who knows, it could be any of those reasons or another.

**Hence, the addon functionality.**

This allows people to write their own addons to expand the functionality of ServerPackCreator with their own features as
they see fit or want.

One example would be: Automatic setup of a server pack for [BlueMap](https://www.curseforge.com/minecraft/mc-mods/bluemap).
An addon could check all mods in the specified modpacks mods-directory for textures, and if any are found, add them to
BlueMap's resourcepack folder `config/bluemap/resourcepacks`, install BlueMap for the specified Minecraft and Forge/Fabric
version and voilà! ServerPackCreator has BlueMap Support Automation functionality, thanks to an addon, without having to wait
for me to write it and add it to ServerPackCreators core-functionality for you!

# 2. How

## 2.1 Values to work with

ServerPackCreator passes the configuration used to create a server pack to all addons configured as `serverpack`-addons.
That list consists of:
* modpackDir
* clientMods
* copyDirs
* javaPath
* minecraftVersion
* modLoader
* modLoaderVersion
* includeServerInstallation
* includeServerIcon
* includeServerProperties
* includeStartScripts
* includeZipCreation

That list is parsed in `ConfigurationHandler` and written into an instance of `ConfigurationModel`, allowing you to make use
of the whole configuration with which the server pack, which was generated before the addon gets executed, got made.

## 2.2 Where to get values from

Working with this example, you can simply call any `get`-method in the `ConfigurationModel`-class and use it to do your
operations.

## 2.3 Working directory

All addons are run in the <code>work/temp</code>-directory. Be aware of that when creating your addons! This also means
that you should be wary of trying to cleanup the temp-directory yourself, as it could potentially interfere with any other
addon running after yours! 

## 2.4 Logs

Any and all message you would normally let log4j write to a log-file need to be printed using `System.out.println("Some message.")`
or similar methods. These are caught by ServerPacKCreator and added to the addons.log.

# 3. Building

1. Fork and clone this repository
2. Make your changes and additions.
3. Build with `gradlew about build --info`.
4. Copy the JAR-file from `build/libs` to the addons-directory created by ServerPackCreator.
5. Run ServerPackCreator!

**NOTE: Please be aware that you might need to change the tests I've provided as an example for this addon. If you change the
base behaviour of this example, the chance that you will have to make changes to tests, too, is quite high.**

## 4. Contributing

If you have written an addon, let me know by creating an issue in this repository. Provide a short description of what your
addon does and a link to the GitHub repository as well. I will add it to a list in the README of ServerPackCreator.

**NOTE: I only add addons which are open source. I will NOT add any direct download links to any file. People must be able
to check your code before they download and install your addon, and as such, I will only add a link to your addon-respository
along with a small description, if you provided one.

Example:

| Addon | Creator | Description |
| :---- | :------ | :---------- |
| [ExampleAddon](https://github.com/Griefed/ServerPackCreatorExampleAddon) | Griefed | An example addon providing a starting point for addon development. |