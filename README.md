Jshell with External Libraries
@see https://github.com/mrsarm/jshell-plugin

## Install
```bash
$ git clone git@github.com:appkr/jsh
$ cd jsh
```

## Run
```bash
~/jsh $ ./gradlew --console plain classes jshell 
```

## Add dependencies and make it usable
```groovy
// build.gradle
dependencies {
    implementation 'org.apache.commons:commons-lang3:3.11'
    // ...
}
```

```java
// startup.jsh
import org.apache.commons.lang3.*;
// ...
```
