# AnimateFX Library

**A library of more than 70 ready to use animations for JavaFX**

**Features:**
- Custom _animations_, and _interpolators_
- Successive animations
- Animations on actions
**More features are comming soon**

## Installation
### Gradle

```gradle
dependencies {
  compile 'io.github.typhon0:AnimateFX:1.2.1'
}
```
### Maven
```xml
<dependency>
  <groupId>io.github.typhon0</groupId>
  <artifactId>AnimateFX</artifactId>
  <version>1.2.1</version>
  <type>pom</type>
</dependency>
```

## Snapshot
### Gradle
```gradle
repositories {
	maven { url 'https://oss.jfrog.org/artifactory/oss-snapshot-local' }
}

dependencies {
    compile('group.id:animatefx:1.2.1-SNAPSHOT')
}
```

### Maven
```xml
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
            <version>1.2.1-SNAPSHOT</version>
        </dependency>
 </dependencies>
```

## Quick Start
### Basic
The basic usage of AnimationFX
```java
Text text = new Text("AnimateFX");
new Bounce(text).play();
```

### Successive animations
```java
Text text = new Text("AnimateFX");
public void HandleAnimation(ActionEvent actionEvent) {
    new Bounce(text).setPlayOnFinished(new BounceIn(text)).play();
}
```

## Credits
Animations are inspired from the awesome project [Animate.css](https://github.com/daneden/animate.css)
