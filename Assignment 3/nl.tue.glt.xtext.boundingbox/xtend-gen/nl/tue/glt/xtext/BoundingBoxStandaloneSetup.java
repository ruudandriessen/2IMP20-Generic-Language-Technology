/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.xtext;

import nl.tue.glt.xtext.BoundingBoxStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BoundingBoxStandaloneSetup extends BoundingBoxStandaloneSetupGenerated {
  public static void doSetup() {
    BoundingBoxStandaloneSetup _boundingBoxStandaloneSetup = new BoundingBoxStandaloneSetup();
    _boundingBoxStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
