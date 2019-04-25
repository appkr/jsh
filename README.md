Jshell with External Libraries
Forked from [https://github.com/johnpoth/jshell-maven-plugin](https://github.com/johnpoth/jshell-maven-plugin)


This is my jshell configuration. Like dotfiles, to make my jshell to be updated at any place.

## Install

```bash
$ git clone git@github.com:appkr/jsh
$ cd jsh
~/jsh $ mvn package
```

## Run

```bash
~/jsh $ mvn jshell:run
```

With a bash alias, you can just type `jsh`

```bash
# in your shell profile
alias j11="export JAVA_HOME=`/usr/libexec/java_home -v 11`; java -version"
alias jsh="j11 && sleep 1 && cd $HOME/jsh && mvn jshell:run"
```

## Example

```bash
$ jsh
jshell> import com.fasterxml.jackson.databind.*;

jshell> ObjectMapper om = new ObjectMapper();
om ==> com.fasterxml.jackson.databind.ObjectMapper@479d31f3

jshell> public class Foo {
   ...>     public String key;
   ...>     public String value;
   ...> }
|  created class Foo

jshell> Foo f = new Foo() {
   ...>     public String key = "foo";
   ...>     public String value = "bar";
   ...> }
f ==> 1@795cd85e

jshell> om.writeValueAsString(f);
$6 ==> "{\"key\":\"foo\",\"value\":\"bar\"}"
```

## Example

Like any java project, you can add additional libraries in `pom.xml`.
