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

import de.griefed.serverpackcreatoraddonexample.configuration.ConfigurationModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class ConfigurationModelTest {

    private final ConfigurationModel configurationModel;

    ConfigurationModelTest() {
        configurationModel = new ConfigurationModel();
    }

    @Test
    void getsetClientModsTest() {
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
        configurationModel.setClientMods(clientMods);
        Assertions.assertNotNull(configurationModel.getClientMods());
        Assertions.assertEquals(clientMods, configurationModel.getClientMods());
    }

    @Test
    void getsetCopyDirsTest() {
        List<String> copyDirs = new ArrayList<>(Arrays.asList(
                "config",
                "mods",
                "scripts",
                "seeds",
                "defaultconfigs"
        ));
        configurationModel.setCopyDirs(copyDirs);
        Assertions.assertNotNull(configurationModel.getCopyDirs());
        Assertions.assertEquals(copyDirs, configurationModel.getCopyDirs());
    }

    @Test
    void getsetModpackDirTest() {
        String modpackDir = "/some/path/to/a/dir";
        configurationModel.setModpackDir(modpackDir);
        Assertions.assertNotNull(configurationModel.getModpackDir());
        Assertions.assertEquals(modpackDir, configurationModel.getModpackDir());
    }

    @Test
    void getsetJavaPathTest() {
        String javaPath = "/path/to/some/java/installation/bin/java";
        configurationModel.setJavaPath(javaPath);
        Assertions.assertNotNull(configurationModel.getJavaPath());
        Assertions.assertEquals(javaPath, configurationModel.getJavaPath());
    }

    @Test
    void getsetMinecraftVersionTest() {
        String minecraftVersion = "1.16.5";
        configurationModel.setMinecraftVersion(minecraftVersion);
        Assertions.assertNotNull(configurationModel.getMinecraftVersion());
        Assertions.assertEquals(minecraftVersion, configurationModel.getMinecraftVersion());
    }

    @Test
    void getsetModLoaderTest() {
        String modLoader = "Forge";
        configurationModel.setModLoader(modLoader);
        Assertions.assertNotNull(configurationModel.getModLoader());
        Assertions.assertEquals(modLoader, configurationModel.getModLoader());
    }

    @Test
    void getsetModLoaderVersionTest() {
        String modLoaderVersion = "36.2.2";
        configurationModel.setModLoaderVersion(modLoaderVersion);
        Assertions.assertNotNull(configurationModel.getModLoaderVersion());
        Assertions.assertEquals(modLoaderVersion, configurationModel.getModLoaderVersion());
    }

    @Test
    void getsetIncludeServerInstallationTest() {
        boolean includeServerInstallation = true;
        boolean includeServerInstallationFalse = false;
        configurationModel.setIncludeServerInstallation(includeServerInstallation);
        Assertions.assertNotNull(configurationModel.getIncludeServerInstallation());
        Assertions.assertTrue(configurationModel.getIncludeServerInstallation());
        configurationModel.setIncludeServerInstallation(includeServerInstallationFalse);
        Assertions.assertNotNull(configurationModel.getIncludeServerInstallation());
        Assertions.assertFalse(configurationModel.getIncludeServerInstallation());
    }

    @Test
    void getsetIncludeServerIconTest() {
        boolean includeServerIcon = true;
        boolean includeServerIconFalse = false;
        configurationModel.setIncludeServerIcon(includeServerIcon);
        Assertions.assertNotNull(configurationModel.getIncludeServerIcon());
        Assertions.assertTrue(configurationModel.getIncludeServerIcon());
        configurationModel.setIncludeServerIcon(includeServerIconFalse);
        Assertions.assertNotNull(configurationModel.getIncludeServerIcon());
        Assertions.assertFalse(configurationModel.getIncludeServerIcon());
    }

    @Test
    void getsetIncludeServerPropertiesTest() {
        boolean includeServerProperties = true;
        boolean includeServerPropertiesFalse = false;
        configurationModel.setIncludeServerProperties(includeServerProperties);
        Assertions.assertNotNull(configurationModel.getIncludeServerProperties());
        Assertions.assertTrue(configurationModel.getIncludeServerProperties());
        configurationModel.setIncludeServerProperties(includeServerPropertiesFalse);
        Assertions.assertNotNull(configurationModel.getIncludeServerProperties());
        Assertions.assertFalse(configurationModel.getIncludeServerProperties());
    }

    @Test
    void getsetIncludeZipCreationTest() {
        boolean includeZipCreation = true;
        boolean includeZipCreationFalse = false;
        configurationModel.setIncludeZipCreation(includeZipCreation);
        Assertions.assertNotNull(configurationModel.getIncludeZipCreation());
        Assertions.assertTrue(configurationModel.getIncludeZipCreation());
        configurationModel.setIncludeZipCreation(includeZipCreationFalse);
        Assertions.assertNotNull(configurationModel.getIncludeZipCreation());
        Assertions.assertFalse(configurationModel.getIncludeZipCreation());
    }

    @Test
    void toStringTest() {
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
        boolean includeServerInstallationFalse = false;
        boolean includeServerIcon = true;
        boolean includeServerIconFalse = false;
        boolean includeServerProperties = true;
        boolean includeServerPropertiesFalse = false;
        boolean includeStartScripts = true;
        boolean includeStartScriptsFalse = false;
        boolean includeZipCreation = true;
        boolean includeZipCreationFalse = false;
        configurationModel.setClientMods(clientMods);
        configurationModel.setCopyDirs(copyDirs);
        configurationModel.setModpackDir(modpackDir);
        configurationModel.setJavaPath(javaPath);
        configurationModel.setMinecraftVersion(minecraftVersion);
        configurationModel.setModLoader(modLoader);
        configurationModel.setModLoaderVersion(modLoaderVersion);
        configurationModel.setIncludeServerInstallation(includeServerInstallation);
        configurationModel.setIncludeServerIcon(includeServerIcon);
        configurationModel.setIncludeServerProperties(includeServerProperties);
        configurationModel.setIncludeZipCreation(includeZipCreation);
        String toString = "ConfigurationModel{" +
                "clientMods=" + clientMods +
                ", copyDirs=" + copyDirs +
                ", modpackDir='" + modpackDir + '\'' +
                ", javaPath='" + javaPath + '\'' +
                ", minecraftVersion='" + minecraftVersion + '\'' +
                ", modLoader='" + modLoader + '\'' +
                ", modLoaderVersion='" + modLoaderVersion + '\'' +
                ", includeServerInstallation=" + includeServerInstallation +
                ", includeServerIcon=" + includeServerIcon +
                ", includeServerProperties=" + includeServerProperties +
                ", includeZipcreation=" + includeZipCreation +
                '}';
        Assertions.assertNotNull(configurationModel.toString());
        Assertions.assertEquals(toString, configurationModel.toString());
        configurationModel.setIncludeServerInstallation(includeServerInstallationFalse);
        configurationModel.setIncludeServerIcon(includeServerIconFalse);
        configurationModel.setIncludeServerProperties(includeServerPropertiesFalse);
        configurationModel.setIncludeZipCreation(includeZipCreationFalse);
        String toStringFalse = "ConfigurationModel{" +
                "clientMods=" + clientMods +
                ", copyDirs=" + copyDirs +
                ", modpackDir='" + modpackDir + '\'' +
                ", javaPath='" + javaPath + '\'' +
                ", minecraftVersion='" + minecraftVersion + '\'' +
                ", modLoader='" + modLoader + '\'' +
                ", modLoaderVersion='" + modLoaderVersion + '\'' +
                ", includeServerInstallation=" + includeServerInstallationFalse +
                ", includeServerIcon=" + includeServerIconFalse +
                ", includeServerProperties=" + includeServerPropertiesFalse +
                ", includeZipcreation=" + includeZipCreationFalse +
                '}';
        Assertions.assertNotNull(configurationModel.toString());
        Assertions.assertEquals(toStringFalse, configurationModel.toString());
    }
}
