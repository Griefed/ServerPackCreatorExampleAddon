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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

        // Create an instance of ConfigurationModel for later use.
        ConfigurationModel configurationModel = new ConfigurationModel();

        /*
         * Creates an instance of ConfigurationHandler, passes the args received from ServerPackCreator and the newly created
         * instance of ConfigurationModel. ConfigurationHandler writes the contents of args to our ConfigurationModel, so
         * we can then start working with it.
         */
        ConfigurationHandler configurationHandler = new ConfigurationHandler(args, configurationModel);

        /*
         * Create an instance of AddonConfiguration. This parses the addon.conf-file in the JAR-file. This allows us to
         * access all configurations inside the configuration-file by either calling addonConfiguration.getString("config-key")
         * or by writing dedicated methods, such as getAddonConfiguration(), which returns the String
         * "This is an example for working with the addon.conf-file." from the key "someconfig" in the config-file.
         */
        AddonConfiguration addonConfiguration = new AddonConfiguration();

        try {
            //Create an example in the work/temp/<addon_name> directory
            Files.createFile(Paths.get("This_is_an_example_file"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Print the entire configuration, after parsing, to the console to see that everything works as intended.
        System.out.println("We have recieved the following configuration: " + Arrays.toString(args));
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
        // Print the example config "someconfig" from our addon.conf file to see that everything works as intended.
        System.out.println("Example addon configuration for someconfig:        " + addonConfiguration.exampleConfig());
        System.out.println("");
        // Print the location of ServerPackCreator, so we know how to access server packs and the like.
        System.out.println("Base path for ServerPackCreator:                   " + args[12]);
    }

}
