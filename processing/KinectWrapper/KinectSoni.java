// SIMPLEOPENNI 
// OS: Win, Mac, Linux / SDK: OpenNI, MS 1.8 / Devices: Kinect v1, clones

import SimpleOpenNI.*;

class KinectSoni {
  
  PApplet parent;
  SimpleOpenNI device;
  boolean isOffline = false;

  KinectSoni(PApplet _parent) {
    parent = _parent;
    //device = new SimpleOpenNI(parent);
    device = new SimpleOpenNI(parent, SimpleOpenNI.RUN_MODE_MULTI_THREADED);

    setMirror(false);
    enableDepth();
    //enableIR();
    //enableUser();
    enableRGB();
    alternativeViewPointDepthToImage();
  }
  
  void setMirror(boolean b) {
    device.setMirror(b);
  }

  void enableDepth() {
    device.enableDepth();
  }

  void enableRGB() {
    device.enableRGB();
  }

  void enableIR() {
    device.enableIR();
  }

  void enableUser() {
    device.enableUser();
  }
  
  void alternativeViewPointDepthToImage() {
    device.alternativeViewPointDepthToImage();
    device.setDepthColorSyncEnabled(true);
  }
  
  int depthWidth() {
    return device.depthWidth();
  }
  
  int depthHeight() {
    return device.depthHeight();  
  }
  
  void update() {
    device.update();
  }
  
  PImage rgbImage() {
    return device.rgbImage();
  }
  
  PImage depthImage() {
    return device.depthImage();
  }
  
  PImage userImage() {
    return device.userImage();
  }
  
  PImage irImage() {
    return device.irImage();
  }
  
  PVector[] depthMapRealWorld() {
    return device.depthMapRealWorld();
  }
  
  int[] depthMap() {
    return device.depthMap();
  }
  
  int[] getRawDepth() {
    return depthMap();
  }
 
  // dummy update methods for offline 
  void update(String[] _depthText, PImage _depthImg, PImage _contourImg) { }
  void update(String[] _depthText, PImage _depthImg, float _threshold) { }
  void update(float _threshold) { }
  
}
