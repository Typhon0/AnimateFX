[![Build Status](https://travis-ci.org/Typhon0/AnimateFX.svg?branch=master)](https://travis-ci.org/Typhon0/AnimateFX)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Bintray](https://api.bintray.com/packages/typhon0/AnimateFX/animatefx/images/download.svg)](https://bintray.com/typhon0/AnimateFX/animatefx)
[![HitCount](http://hits.dwyl.io/Typhon0/AnimateFX.svg)](http://hits.dwyl.io/Typhon0/AnimateFX)

# AnimateFX
A library of ready-to-use animations for JavaFX

Features:

* Custom animations
* Custom interpolators
* Play/Stop animation
* Play an animation after another 
* More to come

# Installation

### Gradle
```
dependencies {

compile 'animatefx:animatefx:1.2.0'

}
```
### Maven

```
<dependency>
    <groupId>animatefx</groupId>
    <artifactId>animatefx</artifactId>
    <version>1.2.0</version>
    <type>pom</type>
</dependency>
```
## Snapshot

### Gradle
```
repositories {
	maven { url 'https://oss.jfrog.org/artifactory/oss-snapshot-local' }
}

dependencies {
    compile('group.id:animatefx:1.2.0-SNAPSHOT')
}
```
# Quick start

#### Basic

```
Text text = new Text("AnimateFX");
new Bounce(text).play();
```

#### Play an animation after another

```
    Text text = new Text("AnimateFX");
    public void HandleAnimation(ActionEvent actionEvent) {
      new Bounce(text).setPlayOnFinished(new BounceIn(text)).play();
      }
```
