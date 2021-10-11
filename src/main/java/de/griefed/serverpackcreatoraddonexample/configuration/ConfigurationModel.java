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
package de.griefed.serverpackcreatoraddonexample.configuration;

import java.util.List;

/**
 * The model for the configuration which is passed to us by ServerPackCreator. It is filled by {@link ConfigurationHandler}
 * during the beginning of {@link de.griefed.serverpackcreatoraddonexample.Main} and from then on available for use.
 * @author Griefed
 */
public class ConfigurationModel {

    private List<String> clientMods;
    private List<String> copyDirs;

    private String modpackDir;
    private String javaPath;
    private String minecraftVersion;
    private String modLoader;
    private String modLoaderVersion;

    private Boolean includeServerInstallation;
    private Boolean includeServerIcon;
    private Boolean includeServerProperties;
    private Boolean includeZipCreation;

    /**
     * Getter for the list of clientside-only mods.
     * @author Griefed
     * @return String List. Returns the list of clientside-only mods.
     */
    public List<String> getClientMods() {
        return clientMods;
    }

    /**
     * Setter for the list of clientside-only mods.
     * @author Griefed
     * @param clientMods String List. The list of clientside-only mods to store.
     */
    public void setClientMods(List<String> clientMods) {
        this.clientMods = clientMods;
    }

    /**
     * Getter for the list of directories to copy to the server pack.
     * @author Griefed
     * @return String List. Returns the list of directories to copy to server pack.
     */
    public List<String> getCopyDirs() {
        return copyDirs;
    }

    /**
     * Setter for the direcories to copy to the server pack.
     * @author Griefed
     * @param copyDirs String List. The list of directories to copy to the server pack to store.
     */
    public void setCopyDirs(List<String> copyDirs) {
        this.copyDirs = copyDirs;
    }

    /**
     * Getter for the modpack directory.
     * @author Griefed
     * @return String. The directory where the modpack resides.
     */
    public String getModpackDir() {
        return modpackDir;
    }

    /**
     * Setter for the modpack directory.
     * @author Griefed
     * @param modpackDir String. The path of the modpack directory to store.
     */
    public void setModpackDir(String modpackDir) {
        this.modpackDir = modpackDir;
    }

    /**
     * Getter for the path to the Java installation.
     * @author Griefed
     * @return String. The path to the Java installation.
     */
    public String getJavaPath() {
        return javaPath;
    }

    /**
     * Setter for the path to the Java installation.
     * @author Griefed
     * @param javaPath String. The path to the Java installation to store.
     */
    public void setJavaPath(String javaPath) {
        this.javaPath = javaPath;
    }

    /**
     * Getter for the Minecraft version the modpack uses.
     * @author Griefed
     * @return String. The Minecraft version to store.
     */
    public String getMinecraftVersion() {
        return minecraftVersion;
    }

    /**
     * Setter for the Minecraft version the modpack uses.
     * @author Griefed
     * @param minecraftVersion String. The Minecraft version to store.
     */
    public void setMinecraftVersion(String minecraftVersion) {
        this.minecraftVersion = minecraftVersion;
    }

    /**
     * Getter for the modloader the modpack uses.
     * @author Griefed
     * @return String. The modloader the modpack uses.
     */
    public String getModLoader() {
        return modLoader;
    }

    /**
     * Setter for the modloader the modpack uses.
     * @author Griefed
     * @param modLoader String. The modloader the modpack uses to store.
     */
    public void setModLoader(String modLoader) {
        this.modLoader = modLoader;
    }

    /**
     * Getter for the modloader version the modpack uses.
     * @author Griefed
     * @return String. The modloader version the modpack uses.
     */
    public String getModLoaderVersion() {
        return modLoaderVersion;
    }

    /**
     * Setter for the modloader version the modpack uses.
     * @author Griefed
     * @param modLoaderVersion String. The version of the modloader the modpack uses.
     */
    public void setModLoaderVersion(String modLoaderVersion) {
        this.modLoaderVersion = modLoaderVersion;
    }

    /**
     * Getter for whether the modloader server should be installed.
     * @author Griefed
     * @return Boolean. Whether the modloader server should be installed in the server pack.
     */
    public Boolean getIncludeServerInstallation() {
        return includeServerInstallation;
    }

    /**
     * Setter for whether the modloader server should be installed.
     * @author Griefed
     * @param includeServerInstallation Boolean. Value of whether the modloader server should be installed to store.
     */
    public void setIncludeServerInstallation(Boolean includeServerInstallation) {
        this.includeServerInstallation = includeServerInstallation;
    }

    /**
     * Getter for whether the server-icon.png should be copied to the server pack.
     * @author Griefed
     * @return Boolean. Whether the server-icon.png should be copied to the server pack.
     */
    public Boolean getIncludeServerIcon() {
        return includeServerIcon;
    }

    /**
     * Setter for whether the server-icon.png should be copied to the server pack.
     * @author Griefed
     * @param includeServerIcon Boolean. Value of whether the server-icon.png should be copied to the server pack.
     */
    public void setIncludeServerIcon(Boolean includeServerIcon) {
        this.includeServerIcon = includeServerIcon;
    }

    /**
     * Getter for whether the server.properties should be copied to the server pack.
     * @author Griefed
     * @return Boolean. Whether the server.properties should be copied to the server pack.
     */
    public Boolean getIncludeServerProperties() {
        return includeServerProperties;
    }

    /**
     * Setter for whether the server.properties should be copied to the server pack.
     * @author Griefed
     * @param includeServerProperties Boolean. Value of whether the server.properties should be copied to the server pack to store.
     */
    public void setIncludeServerProperties(Boolean includeServerProperties) {
        this.includeServerProperties = includeServerProperties;
    }

    /**
     * Getter for whether a ZIP-archive of the server pack should be created.
     * @author Griefed
     * @return Boolean. Whether a ZIP-archive of the server pack should be created.
     */
    public Boolean getIncludeZipCreation() {
        return includeZipCreation;
    }

    /**
     * Setter for whether a ZIP-archive of the server pack should be created.
     * @author Griefed
     * @param includeZipCreation Boolean. Value of whether a ZIP-archive of the server pack should created to store.
     */
    public void setIncludeZipCreation(Boolean includeZipCreation) {
        this.includeZipCreation = includeZipCreation;
    }

    /**
     * Override of toString to get a list of all configuration values as a concatenated string.
     * @author Griefed
     * @return A concatenated string of the full configuration.
     */
    @Override
    public String toString() {
        return "ConfigurationModel{" +
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
    }
}
