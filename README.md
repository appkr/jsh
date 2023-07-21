## Jshell with External Libraries
@see https://github.com/mrsarm/jshell-plugin

## Install

```bash
$ git clone git@github.com:appkr/jsh
```

## Run

```bash
$ cd jsh
~/jsh $ ./gradlew --no-daemon --console plain jshell
```

## Example

```bash
$ jsh
jshell> var om = new ObjectMapper()
var om = new ObjectMapper()om ==> com.fasterxml.jackson.databind.ObjectMapper@6f815e7f

jshell> var list = List.of("foo", "bar") 
var list = List.of("foo", "bar")list ==> [foo, bar]

jshell> om.writeValueAsString(list)
om.writeValueAsString(list)$3 ==> "[\"foo\",\"bar\"]"

jshell> RandomStringUtils.randomAlphanumeric(11)
RandomStringUtils.randomAlphanumeric(11)$4 ==> "GM4yMT7kKr7"
```

## Add dependency and make it runnable in jshell

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
```
