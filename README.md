[![Build Status](https://travis-ci.org/Typhon0/AnimateFX.svg?branch=master)](https://travis-ci.org/Typhon0/AnimateFX)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Bintray](https://api.bintray.com/packages/typhon0/AnimateFX/animatefx/images/download.svg)](https://bintray.com/typhon0/AnimateFX/animatefx)
[![javadoc](https://javadoc.io/badge2/io.github.typhon0/AnimateFX/javadoc.svg)](https://javadoc.io/doc/io.github.typhon0/AnimateFX)
[![Join the chat at https://gitter.im/AnimateFX/Lobby](https://badges.gitter.im/AnimateFX/Lobby.svg)](https://gitter.im/AnimateFX/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

# AnimateFX

A library of ready-to-use animations for JavaFX

Features:

- Custom animations
- Custom interpolators
- Play/Stop animation
- Play an animation after another
- More to come

# Installation

### Gradle

```
dependencies {
compile 'io.github.typhon0:AnimateFX:1.2.2'
}
```

### Maven

```
<dependency>
  <groupId>io.github.typhon0</groupId>
  <artifactId>AnimateFX</artifactId>
  <version>1.2.2</version>
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
    compile('group.id:animatefx:1.2.2-SNAPSHOT')
}
```

### Maven

```
 <repositories>
 	<repository>
            <id>snapshots</id>
            <name>libs-snapshot</name>
            <url>https://oss.jfrog.org/artifactory/libs-snapshot</url>
        </repository>
    </repositories>

 <dependencies>
        <dependency>
            <groupId>io.github.typhon0</groupId>
            <artifactId>AnimateFX</artifactId>
            <version>1.2.2-SNAPSHOT</version>
        </dependency>
 </dependencies>
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

# Contributing

Please see [CONTRIBUTING.md](https://github.com/Typhon0/AnimateFX/blob/master/CONTRIBUTING.md) for more information.

# Credits

Animations are inspired from the awesome project [Animate.css](https://github.com/daneden/animate.css)
