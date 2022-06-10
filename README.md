[![AnimateFX CI](https://github.com/Typhon0/AnimateFX/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/Typhon0/AnimateFX/actions/workflows/ci.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.typhon0/AnimateFX/badge.svg)](https://maven-badges.herokuapp.com/maven-central/cz.jirutka.rsql/rsql-parser)
[![javadoc](https://javadoc.io/badge2/io.github.typhon0/AnimateFX/javadoc.svg)](https://javadoc.io/doc/io.github.typhon0/AnimateFX)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
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

### Gradle (7.x)

```
plugins {
    ...
    id 'java-library'
}

dependencies {
    api 'io.github.typhon0:AnimateFX:1.2.3'
}
```

### Maven

```
<dependency>
  <groupId>io.github.typhon0</groupId>
  <artifactId>AnimateFX</artifactId>
  <version>1.2.3</version>
  <type>pom</type>
</dependency>
```

## Snapshot

### Gradle (7.x)

```
plugins {
    ...
    id 'java-library'
}

repositories {
	maven { url 'https://oss.sonatype.org/content/repositories/snapshots/' }
}

dependencies {
    api 'io.github.typhon0:AnimateFX:1.2.3-SNAPSHOT'
}
```

### Maven

```
 <repositories>
 	<repository>
            <id>snapshots</id>
            <name>libs-snapshot</name>
            <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
        </repository>
    </repositories>

 <dependencies>
        <dependency>
            <groupId>io.github.typhon0</groupId>
            <artifactId>AnimateFX</artifactId>
            <version>1.2.3-SNAPSHOT</version>
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
