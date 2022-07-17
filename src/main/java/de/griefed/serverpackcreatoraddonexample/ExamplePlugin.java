package de.griefed.serverpackcreatoraddonexample;

import java.io.InputStream;
import java.net.URL;
import java.util.jar.Manifest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class ExamplePlugin extends Plugin {

  private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");
  private static final Logger LOG = LogManager.getLogger(ExamplePlugin.class);

  private final Manifest MANIFEST;
  public static String NAME;
  public static String PROVIDER;
  public static String AUTHOR;
  public static String VERSION;

  public ExamplePlugin(PluginWrapper wrapper) {
    super(wrapper);

    MANIFEST = getPluginManifest();

    if (MANIFEST != null) {

      NAME = MANIFEST.getMainAttributes().getValue("Plugin-Name");
      PROVIDER = MANIFEST.getMainAttributes().getValue("Plugin-Description");
      AUTHOR = MANIFEST.getMainAttributes().getValue("Plugin-Provider");
      VERSION = MANIFEST.getMainAttributes().getValue("Plugin-Version");
    }
  }
  
  private Manifest getPluginManifest() {
    Manifest manifest = null;

    String classPath =
        this.getClass().getResource(this.getClass().getSimpleName() + ".class").toString();

    try (InputStream inputStream =
        new URL(classPath.substring(0, classPath.lastIndexOf("!") + 1) + "/META-INF/MANIFEST.MF")
            .openStream()) {

      manifest = new Manifest(inputStream);

    } catch (Exception ex) {
      LOG_ADDONS.error("Couldn't read manifest", ex);
    }
    
    return manifest;
  }

  @Override
  public void start() {

    // Log to serverpackcreator.log
    LOG.info("Plugin-Name:        " + NAME);
    LOG.info("Plugin-Description: " + PROVIDER);
    LOG.info("Plugin-Provider:    " + AUTHOR);
    LOG.info("Plugin-Version:     " + VERSION);

    // Log to addons.log
    LOG_ADDONS.info("Starting ExamplePlugin...");
    LOG_ADDONS.info(
        "This methods should prepare the environment for anything you want to do with it.");
    LOG_ADDONS.info(
        "You could download some files. Create or replace some files. Basically you can do whatever you want.");
    /*
    Write all your preparation code here..
                                            */
  }
}
