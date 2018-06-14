[![Build Status](https://travis-ci.org/Typhon0/AnimateFX.svg?branch=master)](https://travis-ci.org/Typhon0/AnimateFX)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Bintray](https://api.bintray.com/packages/typhon0/AnimateFX/animatefx/images/download.svg)](https://bintray.com/typhon0/AnimateFX/animatefx)
[![HitCount](http://hits.dwyl.io/Typhon0/AnimateFX.svg)](http://hits.dwyl.io/Typhon0/AnimateFX)

# AnimateFX
A library of ready-to-use animations for JavaFX

Features:

* Custom animations
* Custom interpolator
* Play/Stop animation (In progress)
* More to come

# How to use

### Gradle
```
dependencies {

compile 'animatefx:animatefx:1.1.0'

}
```
### Maven

```
<dependency>
    <groupId>animatefx</groupId>
    <artifactId>animatefx</artifactId>
    <version>1.1.0</version>
    <type>pom</type>
</dependency>
```

# Quick start

#### Basic

```
Text text = new Text();
new Bounce(text);
```

#### Handler

```
    @FXML
    Text text;

    @FXML
    public void HandleAnimation(ActionEvent actionEvent) {
      new Bounce(text);
    }
```
