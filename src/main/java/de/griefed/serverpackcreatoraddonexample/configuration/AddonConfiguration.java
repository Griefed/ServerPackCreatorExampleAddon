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

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import de.griefed.serverpackcreatoraddonexample.Main;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Example class for reading the addon.conf-file and getting values from it.
 * @author Griefed
 */
public class AddonConfiguration {

    private final Config ADDONCONFIGURATION;

    /**
     * Constructor for the AddonConfiguration.class which automatically parses the addon.conf-file in the JAR-file.
     * @author Griefed
     */
    public AddonConfiguration() {

        URL urlToConfig = null;

        String addonLocation = null;

        try {
            addonLocation = Main.class.getProtectionDomain().getCodeSource().getLocation().getFile();
            urlToConfig = new URL(String.format("jar:file:%s!/addon.conf", addonLocation));
        } catch (MalformedURLException  ex) {
            ex.printStackTrace();
        }

        assert urlToConfig != null;
        this.ADDONCONFIGURATION = ConfigFactory.parseURL(urlToConfig);

    }

    /**
     * Getter for the addon configuration.
     * @author Griefed
     * @return Config. Returns the {@link Config} object which was initiated in the constructor of this class.
     */
    public Config getAddonConfiguration() {
        return ADDONCONFIGURATION;
    }

    /**
     * Uses {@link #getAddonConfiguration()} to retrieve the string from a config parameter in the addon.conf-file.
     * @author Griefed
     * @return String. Returns the value of <code>serverpackcreator.addon.someconfig</code> giving an example on how to
     * work with the addon.conf-file.
     */
    public String exampleConfig() {
        return getAddonConfiguration().getString("someconfig");
    }

}
