@echo off

set BUILD_TARGET=..\KinectWrapper.pde
cd /D %~dp0

del %BUILD_TARGET%

echo class KinectWrapper extends KinectSoni { > %BUILD_TARGET%

type KinectWrapper.java >> %BUILD_TARGET%
type KinectSoni.java >> %BUILD_TARGET%

@pause