@echo off

set DEVICE_TARGET=Soni
cd /D %~dp0
cd ..\..

set BUILD_TARGET=KinectWrapper.hpp
del %BUILD_TARGET%

echo class KinectWrapper extends Kinect%DEVICE_TARGET% { > %BUILD_TARGET%

type KinectWrapper.hpp >> %BUILD_TARGET%
type Kinect%DEVICE_TARGET%.hpp >> %BUILD_TARGET%

@pause