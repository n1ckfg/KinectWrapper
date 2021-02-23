// OPENKINECT
// OS: Mac / SDK: OpenNI / Devices: Kinect v1

import org.openkinect.freenect.*;
import org.openkinect.processing.*;

class KinectOpen {
  
  PApplet parent;
  Kinect device;
  boolean isOffline = false;
  PImage depthImg, contourImg;

  KinectOpen(PApplet _parent) {
    parent = _parent;
    device = new Kinect(parent);

    setMirror(false);
    enableDepth();
    enableRGB();
    //enableIR();
    //enableUser();
    enableRGB();
  }
  
  void setMirror(boolean b) {
    device.enableMirror(b);
  }

  void enableDepth() {
    device.initDepth();
  }

  void enableRGB() {
    device.initVideo();
  }

  void enableIR() {
    device.enableIR();
  }

  void enableUser() {
    device.enableUser();
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
    return device.getVideoImage();
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
