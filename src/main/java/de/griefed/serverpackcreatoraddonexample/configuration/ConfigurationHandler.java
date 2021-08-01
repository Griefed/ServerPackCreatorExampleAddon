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

import java.util.Arrays;

/**
 * Handler for the configuration which got passed to us from ServerPackCreator.
 * @author Griefed
 */
public class ConfigurationHandler {

    private ConfigurationModel CONFIGURATIONMODEL;

    /**
     * Constructor for our class. Parses the configuration passed by ServerPackCreator and writes it into a new instance
     * of {@link ConfigurationModel}.
     * @author Griefed
     * @param args Configuration list passed by ServerPackCreator.
     * @param injectedConfigurationModel An instance of {@link ConfigurationModel}.
     */
    public ConfigurationHandler(String[] args, ConfigurationModel injectedConfigurationModel) {

        if (injectedConfigurationModel == null) {
            this.CONFIGURATIONMODEL = new ConfigurationModel();
        } else {
            this.CONFIGURATIONMODEL = injectedConfigurationModel;
        }

        CONFIGURATIONMODEL.setModpackDir(args[0]);
        CONFIGURATIONMODEL.setClientMods(Arrays.asList(args[1].split(", ")));
        CONFIGURATIONMODEL.setCopyDirs(Arrays.asList(args[2].split(", ")));
        CONFIGURATIONMODEL.setJavaPath(args[3]);
        CONFIGURATIONMODEL.setMinecraftVersion(args[4]);
        CONFIGURATIONMODEL.setModLoader(args[5]);
        CONFIGURATIONMODEL.setModLoaderVersion(args[6]);
        CONFIGURATIONMODEL.setIncludeServerInstallation(Boolean.valueOf(args[7]));
        CONFIGURATIONMODEL.setIncludeServerIcon(Boolean.valueOf(args[8]));
        CONFIGURATIONMODEL.setIncludeServerProperties(Boolean.valueOf(args[9]));
        CONFIGURATIONMODEL.setIncludeStartScripts(Boolean.valueOf(args[10]));
        CONFIGURATIONMODEL.setIncludeZipCreation(Boolean.valueOf(args[11]));
    }
}
