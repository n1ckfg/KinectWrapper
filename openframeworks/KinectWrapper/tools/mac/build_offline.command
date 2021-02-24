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
cd ../..

BUILD_TARGET="KinectWrapper.hpp"
rm $BUILD_TARGET
touch $BUILD_TARGET

cat "KinectWrapper.hpp" "Kinect$DEVICE_TARGET.hpp" > $BUILD_TARGET

HEADER="class KinectWrapper extends Kinect$DEVICE_TARGET {"

echo -e "$HEADER\n$(cat $BUILD_TARGET)" > $BUILD_TARGET
