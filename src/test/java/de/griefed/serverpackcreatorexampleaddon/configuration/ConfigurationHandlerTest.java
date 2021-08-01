/*
 * The MIT License (MIT)
 *
 * Copyright (C) 2021  Griefed
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.griefed.serverpackcreatorexampleaddon.configuration;

import de.griefed.serverpackcreatoraddonexample.configuration.ConfigurationHandler;
import de.griefed.serverpackcreatoraddonexample.configuration.ConfigurationModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConfigurationHandlerTest {

    private final ConfigurationHandler configurationHandler;
    private final ConfigurationModel configurationModel;

    ConfigurationHandlerTest() {
        List<String> clientMods = new ArrayList<>(Arrays.asList(
                "AmbientSounds",
                "BackTools",
                "BetterAdvancement",
                "BetterPing",
                "cherished",
                "ClientTweaks",
                "Controlling",
                "DefaultOptions",
                "durability",
                "DynamicSurroundings",
                "itemzoom",
                "jei-professions",
                "jeiintegration",
                "JustEnoughResources",
                "MouseTweaks",
                "Neat",
                "OldJavaWarning",
                "PackMenu",
                "preciseblockplacing",
                "SimpleDiscordRichPresence",
                "SpawnerFix",
                "TipTheScales",
                "WorldNameRandomizer"
        ));
        List<String> copyDirs = new ArrayList<>(Arrays.asList(
                "config",
                "mods",
                "scripts",
                "seeds",
                "defaultconfigs"
        ));
        String modpackDir = "/some/path/to/a/dir";
        String javaPath = "/path/to/some/java/installation/bin/java";
        String minecraftVersion = "1.16.5";
        String modLoader = "Forge";
        String modLoaderVersion = "36.2.2";
        boolean includeServerInstallation = true;
        boolean includeServerIcon = true;
        boolean includeServerProperties = true;
        boolean includeStartScripts = true;
        boolean includeZipCreation = true;
        String[] args = new String[12];
        args[0] = clientMods.toString();
        args[1] = copyDirs.toString();
        args[2] = modpackDir;
        args[3] = javaPath;
        args[4] = minecraftVersion;
        args[5] = modLoader;
        args[6] = modLoaderVersion;
        args[7] = String.valueOf(includeServerInstallation);
        args[8] = String.valueOf(includeServerIcon);
        args[9] = String.valueOf(includeServerProperties);
        args[10] = String.valueOf(includeStartScripts);
        args[11] = String.valueOf(includeZipCreation);
        this.configurationModel = new ConfigurationModel();
        this.configurationHandler = new ConfigurationHandler(args, configurationModel);
    }

    @Test
    void configurationHandlerTest() {
        Assertions.assertNotNull(configurationModel);
    }
}
