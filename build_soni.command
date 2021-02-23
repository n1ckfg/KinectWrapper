#!/bin/bash

BUILD_TARGET="../KinectWrapper.pde"

SOURCE="${BASH_SOURCE[0]}"
while [ -h "$SOURCE" ]; do # resolve $SOURCE until the file is no longer a symlink
  DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"
  SOURCE="$(readlink "$SOURCE")"
  [[ $SOURCE != /* ]] && SOURCE="$DIR/$SOURCE" # if $SOURCE was a relative symlink, we need to resolve it relative to the path where the symlink file was located
done
DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"

cd $DIR

rm $BUILD_TARGET
touch $BUILD_TARGET

cat "KinectWrapper.java" "KinectSoni.java" > $BUILD_TARGET

HEADER="class KinectWrapper extends KinectSoni {"

echo -e "$HEADER\n$(cat $BUILD_TARGET)" > $BUILD_TARGET
