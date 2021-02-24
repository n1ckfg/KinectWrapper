// KINECTPV2
// OS: Win / SDK: MS 2.0 / Devices: Kinect v2

import KinectPV2.*;

class KinectPV2 {
  
  PApplet parent;
  KinectPV2 device;
  boolean isOffline = false;

  KinectPV2(PApplet _parent) {
    parent = _parent;
    device = new KinectPV2(parent);

    //setMirror(false);
    enableDepth();
    //enableIR();
    //enableUser();
    enableRGB();
    //alternativeViewPointDepthToImage();
    
    device.init();
  }
  
  void setMirror(boolean b) {
    device.setMirror(b);
  }

  void enableDepth() {
    device.enableDepthImg(true);
  }

  void enableIR() {
    device.enableIRImg(true);
  }

  void enableRGB() {
    device.enableColorImg(true);
  }

  void enableUser() {
    //device.enableUser();
  }
  
  void alternativeViewPointDepthToImage() {
    device.alternativeViewPointDepthToImage();
  }
  
  int depthWidth() {
    return device.depthWidth();
  }
  
  int depthHeight() {
    return device.depthHeight();  
  }
  
  void update() {
    //device.update();
  }
  
  PImage rgbImage() {
    return device.getColorImage();
  }
  
  PImage depthImage() {
    return device.getDepthImage();
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
