#!/bin/bash

DEVICE_TARGET="Offline"

SOURCE="${BASH_SOURCE[0]}"
while [ -h "$SOURCE" ]; do # resolve $SOURCE until the file is no longer a symlink
  DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"
  SOURCE="$(readlink "$SOURCE")"
  [[ $SOURCE != /* ]] && SOURCE="$DIR/$SOURCE" # if $SOURCE was a relative symlink, we need to resolve it relative to the path where the symlink file was located
done
DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"

cd $DIR

BUILD_TARGET="KinectWrapper.pde"
rm $BUILD_TARGET
touch $BUILD_TARGET

cat "KinectWrapper.java" "Kinect$DEVICE_TARGET.java" > $BUILD_TARGET

HEADER="class KinectWrapper extends Kinect$DEVICE_TARGET {"

echo -e "$HEADER\n$(cat $BUILD_TARGET)" > $BUILD_TARGET
