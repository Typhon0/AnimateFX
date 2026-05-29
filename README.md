[![AnimateFX CI](https://github.com/Typhon0/AnimateFX/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/Typhon0/AnimateFX/actions/workflows/ci.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.typhon0/AnimateFX/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.typhon0/AnimateFX)
[![javadoc](https://javadoc.io/badge2/io.github.typhon0/AnimateFX/javadoc.svg)](https://javadoc.io/doc/io.github.typhon0/AnimateFX)
[![JFXCentral](https://img.shields.io/badge/Find_me_on-JFXCentral-blue?logo=googlechrome&logoColor=white)](https://www.jfx-central.com/libraries/animatefx)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# AnimateFX

A library of ready-to-use animations for JavaFX

Features:

- Custom animations
- Custom interpolators
- Play/Stop animation
- Play an animation after another
- More to come

# Installation

### Gradle (8.x / 7.x)

```groovy
plugins {
    id 'java'
    id 'java-library'
}

dependencies {
    implementation 'io.github.typhon0:AnimateFX:1.3.1'
}
```

### Maven

```xml
<dependency>
  <groupId>io.github.typhon0</groupId>
  <artifactId>AnimateFX</artifactId>
  <version>1.3.1</version>
</dependency>
```

## Snapshots

### Gradle

```groovy
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots/' }
}

dependencies {
    implementation 'io.github.typhon0:AnimateFX:1.3.1-SNAPSHOT'
}
```

### Maven

```xml
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
        <version>1.3.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```

---

# Compatibility & Environment Support

AnimateFX has been modernized for the latest environments:
- **Build System**: Built and compiled using **Gradle 8.7** under modern **JDK 21** environments.
- **Java Compatibility**: Compiled targeting **Java 11** (LTS). It is **100% backward compatible** and fully supported to run on all modern Java/JavaFX versions, including **Java 11, 17, 21, and 25+ LTS**.
- **Headless Environments**: Completely safe to compile and build on headless or JRE-only runtimes (e.g. Docker containers) lacking native display interfaces.

---

# Quick start

#### Basic animation play

```java
Text text = new Text("AnimateFX");
new Bounce(text).play();
```

#### Chained animations (play one after another)

```java
Text text = new Text("AnimateFX");

// When Bounce finishes naturally, BounceIn will play
new Bounce(text).playOnFinished(new BounceIn(text)).play();
```

> [!NOTE]
> **Safety Guarantee**: Chained animations are fully manual-stop safe. If you call `.stop()` on the parent animation (e.g. `animation.stop()`), the chain will halt completely rather than incorrectly launching subsequent animations.

#### Lazy initialization and Builders

Ready-to-use animations (including visual modifiers like `GlowBackground` and `GlowText`) can be safely instantiated using alternate/parameterless constructors and configured lazily using builder-friendly setters before binding a `Node`:

```java
GlowBackground glow = new GlowBackground(myRegion.getBackground())
    .setColorA(Color.WHITE)
    .setColorB(Color.YELLOW)
    .setColorSteps(20);

// Set the node later in the UI lifecycle
glow.setNode(myRegion);
glow.play();
```

---

# Contributing

Please see [CONTRIBUTING.md](https://github.com/Typhon0/AnimateFX/blob/master/CONTRIBUTING.md) for more information.

# Credits

Animations are inspired by the awesome [Animate.css](https://github.com/daneden/animate.css) project.
