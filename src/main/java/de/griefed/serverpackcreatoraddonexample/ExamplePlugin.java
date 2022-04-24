package de.griefed.serverpackcreatoraddonexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;
import org.springframework.boot.system.ApplicationHome;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class ExamplePlugin extends Plugin {

    private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");
    private static final Logger LOG = LogManager.getLogger(ExamplePlugin.class);

    public static String NAME;
    public static String PROVIDER;
    public static String AUTHOR;
    public static String VERSION;

    public ExamplePlugin(PluginWrapper wrapper) {
        super(wrapper);

        JarFile jarFile = null;
        Manifest manifest = null;

        try {
            jarFile = new JarFile(new File(new ApplicationHome(this.getClass()).getSource().toString().replace("\\","/")));
        } catch (IOException ex) {
            LOG_ADDONS.error("Couldn't acquire JarFile.",ex);
        }

        if (jarFile != null) {
            for (Enumeration<JarEntry> entries = jarFile.entries(); entries.hasMoreElements();) {

                JarEntry jarEntry = entries.nextElement();
                String entryName = jarEntry.getName();

                if (entryName.equals("META-INF/MANIFEST.MF")) {

                    try (InputStream inputStream = jarFile.getInputStream(jarEntry)) {
                        manifest = new Manifest(inputStream);
                        break;
                    } catch (Exception ex) {
                        LOG_ADDONS.error("Couldn't read inputstream for Manifest.",ex);
                    }
                }
            }
        }

        if (manifest != null) {

            NAME = manifest.getMainAttributes().getValue("Plugin-Name");
            PROVIDER = manifest.getMainAttributes().getValue("Plugin-Description");
            AUTHOR = manifest.getMainAttributes().getValue("Plugin-Provider");
            VERSION = manifest.getMainAttributes().getValue("Plugin-Version");

        }
    }

    @Override
    public void start() {

        //Log to serverpackcreator.log
        LOG.info("Plugin-Name:        " + NAME);
        LOG.info("Plugin-Description: " + PROVIDER);
        LOG.info("Plugin-Provider:    " + AUTHOR);
        LOG.info("Plugin-Version:     " + VERSION);

        //Log to addons.log
        LOG_ADDONS.info("Starting ExamplePlugin...");
        LOG_ADDONS.info("This methods should prepare the environment for anything you want to do with it.");
        LOG_ADDONS.info("You could download some files. Create or replace some files. Basically you can do whatever you want.");
        /*
            Write all your preparation code here..
                                                    */
    }
}
