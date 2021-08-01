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
package de.griefed.serverpackcreatoraddonexample;

import de.griefed.serverpackcreatoraddonexample.configuration.AddonConfiguration;
import de.griefed.serverpackcreatoraddonexample.configuration.ConfigurationHandler;
import de.griefed.serverpackcreatoraddonexample.configuration.ConfigurationModel;

import java.util.Arrays;

/**
 * Main class of this example. We create our instances of {@link ConfigurationHandler}, {@link ConfigurationModel} and
 * {@link AddonConfiguration} so we can do with them whatever we want.<br>
 * The creation of an instance of {@link ConfigurationHandler} writes the values passed from ServerPackCreator into an
 * instance of {@link ConfigurationModel} so we can work with said configuration however we want to.<br>
 * The creation of an instance of {@link AddonConfiguration} reads the example config from the <code>addon.conf</code>-file
 * to demonstrate how to work with addon-specific configurations, independant from the configuration passed by ServerPackCreator.
 * @author Griefed
 */
public class Main {

    /**
     * Main method which instantiates {@link ConfigurationModel} and {@link ConfigurationHandler}.<br>
     * Passes the passed configuration from ServerPackCreator to {@link ConfigurationHandler#ConfigurationHandler(String[], ConfigurationModel)}
     * which sets {@link ConfigurationModel} to the respective values.
     * @author Griefed
     * @param args Array of arguments passed from ServerPackCreator containing the configuration with which a server pack
     *             was generated.
     */
    public static void main(String[] args) {

        String configurationWeReceived = Arrays.toString(args);

        ConfigurationModel configurationModel = new ConfigurationModel();
        ConfigurationHandler configurationHandler = new ConfigurationHandler(args, configurationModel);
        AddonConfiguration addonConfiguration = new AddonConfiguration(null);


        System.out.println("We have recieved the following configuration: " + configurationWeReceived);
        System.out.println("");
        System.out.println("Configuration passed from ServerPackCreator, processed and now usable however we wish.");
        System.out.println("");
        System.out.println("Modpack directory:                                 " + configurationModel.getModpackDir());
        System.out.println("Clientside-only mods:                              " + configurationModel.getClientMods());
        System.out.println("Directories to copy to server pack:                " + configurationModel.getCopyDirs());
        System.out.println("Path to Java installation:                         " + configurationModel.getJavaPath());
        System.out.println("Minecraft version:                                 " + configurationModel.getMinecraftVersion());
        System.out.println("Specified modloader:                               " + configurationModel.getModLoader());
        System.out.println("Specified modloader version:                       " + configurationModel.getModLoaderVersion());
        System.out.println("Whether to install the modloader server:           " + configurationModel.getIncludeServerInstallation());
        System.out.println("Whether to copy the server-icon.png:               " + configurationModel.getIncludeServerIcon());
        System.out.println("Whether to copy the server.properties:             " + configurationModel.getIncludeServerProperties());
        System.out.println("Whether to copy the start scripts:                 " + configurationModel.getIncludeStartScripts());
        System.out.println("Whether to create a ZIP-archive of the server pack:" + configurationModel.getIncludeZipCreation());
        System.out.println("");
        System.out.println("Example addon configuration for serverpackcreator.addon.someconfig: " + addonConfiguration.exampleConfig());

    }

}
