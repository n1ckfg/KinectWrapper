@echo off

set DEVICE_TARGET=Offline
cd /D %~dp0

set BUILD_TARGET=KinectWrapper.pde
del %BUILD_TARGET%

echo class KinectWrapper extends Kinect%DEVICE_TARGET% { > %BUILD_TARGET%

type KinectWrapper.java >> %BUILD_TARGET%
type Kinect%DEVICE_TARGET%.java >> %BUILD_TARGET%

@pause