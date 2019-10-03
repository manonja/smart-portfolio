# Building
To support JavaScript and Scala in the same repo we leverage the [pants build](https://www.pantsbuild.org) system.

## Server
To build the server,

```
./pants compile ./server:smartportfolio-server
```

to run,

```
./pants run ./server:smartportfolio-server
```

to lint the server,

```
./pants lint ./server:smartportfolio-server
```

and to format

```
./pants fmt ./server:smartportfolio-server
```


