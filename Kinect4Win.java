// KINECT4WIN
// OS: Win / SDK: MS 1.8 / Devices: Kinect v1

import kinect4WinSDK.Kinect;
import kinect4WinSDK.SkeletonData;

class Kinect4Win {
  
  PApplet parent;
  Kinect device;
  boolean isOffline = false;
  PImage depthImg, contourImg;

  Kinect4Win(PApplet _parent) {
    parent = _parent;
    device = new Kinect(parent);

    //device.setMirror(false);
    //device.enableDepth();
    //device.enableIR();
    //device.enableUser();
    //device.enableRGB();
    //device.alternativeViewPointDepthToImage();
    //device.setDepthColorSyncEnabled(true);
  }
  
  void enableDepth() {
    //device.enableDepth();
  }

  void enableRGB() {
    //device.enableDepth();
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
    device.update();
  }
  
  PImage rgbImage() {
    return device.GetImage();
  }
  
  PImage depthImage() {
    return device.GetDepth();
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
